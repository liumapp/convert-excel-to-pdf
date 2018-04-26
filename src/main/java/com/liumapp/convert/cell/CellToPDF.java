package com.liumapp.convert.cell;

import com.aspose.cells.License;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @author liumapp
 * @file CellToPDF.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/26/18
 */
public class CellToPDF {

    private static InputStream license;
    private static InputStream cells;

    /**
     * 获取license
     *
     * @return boolean
     */
    public static boolean getLicense() {
        boolean result = false;
        try {
            license = CellToPDF.class.getClassLoader().getResourceAsStream("license.xml");    // license路径
//            cells = TestCells.class.getClassLoader().getResourceAsStream("test.xlsx");    // 原始excel路径
            License aposeLic = new License();
            aposeLic.setLicense(license);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 验证License
        if (!getLicense()) {
            return;
        }
        try {
            long old = System.currentTimeMillis();
            Workbook wb = new Workbook(cells);
            File file = new File("D:\\test.pdf");// 输出路径
            FileOutputStream fileOS = new FileOutputStream(file);

            wb.save(fileOS, SaveFormat.PDF);

            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒\n\n" + "文件保存在:" + file.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
