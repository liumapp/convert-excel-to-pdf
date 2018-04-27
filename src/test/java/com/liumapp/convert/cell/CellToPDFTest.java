package com.liumapp.convert.cell;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @author liumapp
 * @file CellToPDFTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/26/18
 */
public class CellToPDFTest extends TestCase {

    private String pdfPath = "/usr/local/tomcat/project/convert-excel-to-pdf/test.pdf";

    private String excelPath = "/usr/local/tomcat/project/convert-excel-to-pdf/excel/test.xlsx";

    @Test
    public void testConvert () throws FileNotFoundException {
        CellToPDF doc2PDF = new CellToPDF();
        doc2PDF.excel2pdf(pdfPath,excelPath);
    }


}
