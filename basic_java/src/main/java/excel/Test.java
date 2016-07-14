package excel;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 参考 http://www.yeetrack.com/?p=961
 */
public class Test {
    public static void main(String[] args) throws Exception{

        //数据库获取快递公司详情

        List<Map<String, Object>> list =  JDBC.queryForList();

        File file = new File("/Users/wjk/Desktop/快递100快递公司编码.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        int rowstart = xssfSheet.getFirstRowNum();
        int rowEnd = xssfSheet.getLastRowNum();
        for(int i=rowstart;i<=rowEnd;i++)
        {
            XSSFRow row = xssfSheet.getRow(i);
            if(null == row) continue;
            int cellStart = row.getFirstCellNum();
            int cellEnd = row.getLastCellNum();

            for(int k=cellStart;k<=cellEnd;k++)
            {
                XSSFCell cell = row.getCell(k);
                if(null==cell) continue;

                switch (cell.getCellType())
                {
                    case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                        System.out.print(cell.getNumericCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_STRING: // 字符串
                        System.out.print(cell.getStringCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                        System.out.println(cell.getBooleanCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_FORMULA: // 公式
                        System.out.print(cell.getCellFormula() + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_BLANK: // 空值
                        System.out.println(" ");
                        break;
                    case HSSFCell.CELL_TYPE_ERROR: // 故障
                        System.out.println(" ");
                        break;
                    default:
                        System.out.print("未知类型   ");
                        break;
                }

            }
            System.out.print("\n");
        }
    }
}
