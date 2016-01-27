import java.io.*;
import java.util.*;

/**
 * 10.37.5.110
 * 6382 6383
 */
public class ReadLog {
    private static final String START = "DZP_";
    private static final String END = "_MID_COUNT";

    /**
     * 读取记录
     *
     * @param filePath
     * @return
     */
    public static List<String> readLog(String filePath) {
        List<String> list = new ArrayList<String>();

        try {
            FileInputStream is = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    if (line.equals(""))
                        continue;
                    else
                        list.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("读取一行数据时出错");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件读取路径错误FileNotFoundException");
        }
        return list;
    }

    public static Map<Integer, Integer> handleLog(String src, List<String> ids) {
        List<String> str = readLog(src);
        Optional.of(ids);
        List<String> activityById;
        Set<String> midSet;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (String id : ids) {
             midSet = new HashSet<String>();
             activityById = new ArrayList();

            //根据活动id取出key
            if (str != null && str.size() != 0) {
                for (String string : str) {
                    if (string.startsWith(START + id) && string.endsWith(END)) {
                        activityById.add(string);
                    }
                }
            }
            //分割key,mid去重
            if (activityById != null && activityById.size() != 0) {
                for (String string : activityById) {
                    String[] strings = string.split("_");
                    midSet.add(strings[3]);
                }
            }
            map.put(Integer.valueOf(id), midSet.size());
        }

        return map;
    }


    public static void main(String[] args) {
        List<String> activityIds = new ArrayList<String>();
        activityIds.add("13");
        activityIds.add("14");
        activityIds.add("15");
        activityIds.add("16");
        activityIds.add("17");
        activityIds.add("18");
        activityIds.add("25");
        activityIds.add("32");
        activityIds.add("34");
        activityIds.add("35");
        activityIds.add("36");
        activityIds.add("37");
        activityIds.add("38");
        activityIds.add("39");
        activityIds.add("40");
        activityIds.add("42");
        Map<Integer, Integer> map = handleLog("/Users/wjk/Desktop/activity.log", activityIds);
        Optional.of(activityIds);
        for (String string : activityIds) {
            System.out.println("活动id_" + string + "     UV_" + map.get(Integer.valueOf(string)));
        }
    }
}
