package csvDemo;

import com.csvreader.CsvReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wjk on 16/2/16.
 */
public class JFCSV {
    /**
     * 获取奖品为积分的中奖信息
     *
     * @throws Exception
     */
    public static void getWinner() throws Exception {
        CsvReader r = new CsvReader("/Users/wjk/Desktop/活动中奖信息.csv", ',', Charset.forName("utf-8"));
        r.readHeaders();
        File csv = new File("/Users/wjk/Desktop/用户中奖积分信息.csv"); // CSV数据文件

        while (r.readRecord()) {

            BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true)); // 附加
            // 添加新的数据行
            if (r.get("prize_name").contains("积分")) {
                bw.write(r.get("activity_id") + "," + r.get("activity_name") + "," + r.get("prize_name") + "," + getPrice(r.get("prize_name")));
            }
            bw.newLine();
            bw.close();
        }
        r.close();
    }


    public static Set<Integer> getIds() throws Exception {
        CsvReader r = new CsvReader("/Users/wjk/Desktop/活动中奖信息.csv", ',', Charset.forName("utf-8"));
        r.readHeaders();
        Set<Integer> idsSet = new HashSet<Integer>();
        while (r.readRecord()) {

            if (r.get("activity_id") != null) {
                idsSet.add(Integer.valueOf(r.get("activity_id")));
            }

        }
        r.close();
        return idsSet;
    }


    /**
     * 获取每个活动积分总数
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static Long getJFCount(Integer id) throws Exception {
        CsvReader r = new CsvReader("/Users/wjk/Desktop/活动中奖信息.csv", ',', Charset.forName("utf-8"));
        r.readHeaders();
        Map map = new HashMap();
        Long total = 0L;

        while (r.readRecord()) {
            if (r.get("prize_name").contains("积分")) {

                    if (r.get("activity_id").equals(id.toString())) {
                        if ((getPrice(r.get("prize_name")) != null) && !(getPrice(r.get("prize_name")).isEmpty())) {
                            total += Long.valueOf(getPrice(r.get("prize_name")));
                        }
                    }

            }

        }
        r.close();
        return total;
    }

    public static String getPrice(String str) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    public static void main(String[] args) throws Exception {
        //getWinner();
        Map<Integer,Long> map = new HashMap<Integer, Long>();
        Set<Integer> set = getIds();
        for(Integer i : set){
            map.put(i,getJFCount(i));
        }
        System.out.println(map);
    }

}
