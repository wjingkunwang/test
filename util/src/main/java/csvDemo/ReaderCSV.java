package csvDemo;

import com.csvreader.CsvReader;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wjk on 16/2/2.
 */
public class ReaderCSV {

    public static void getWinner(Set<String> mobileSet) throws Exception {
        CsvReader r = new CsvReader("/Users/wjk/Desktop/大转盘超发统计/中奖用户信息.csv", ',', Charset.forName("utf-8"));
        r.readHeaders();
        File csv = new File("/Users/wjk/Desktop/大转盘/用户中奖千丁券信息.csv"); // CSV数据文件


        while (r.readRecord()) {

//            if (!mobileSet.contains(r.get("mobile"))) {
           // if (r.get("activity_name").contains("上海")) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true)); // 附加
                // 添加新的数据行
                if (r.get("prize_name").contains("千丁券")) {
                    bw.write(r.get("activity_id") + "," + r.get("activity_name") + "," + r.get("prize_name") + "," + getPrice(r.get("prize_name")) + "," + r.get("winners_name")

                            + "," + r.get("mobile") + "," + r.get("prize_status") + "," + r.get("ticket_code"));
                }
                bw.newLine();
                bw.close();
            }
        //}
        r.close();
    }

    public static Set<String> getMobiles() {
        Set<String> mobiles = new HashSet<String>();

        try {
            FileInputStream is = new FileInputStream("/Users/wjk/Desktop/大转盘超发统计/手机号.log");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    if (line.equals(""))
                        continue;
                    else
                        mobiles.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("读取一行数据时出错");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件读取路径错误FileNotFoundException");
        }
        return mobiles;
    }


    public static String getPrice(String str) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    public static void main(String[] args) throws Exception {
        getWinner(getMobiles());
    }

}
