# convert-excel-to-pdf
Using Aspose.Cell to convert excel to pdf

## how to use

update pom.xml

    <repositories>
        <repository>
          <id>liumapp</id>
          <url>http://www.liumapp.com:8081/repository/liumapp/</url>
        </repository>
    </repositories>
    
add dependencies:    
    
    <dependencies>
        <dependency>
          <groupId>com.liumapp.convert.cell</groupId>
          <artifactId>convert-excel-to-pdf</artifactId>
          <version>v1.1.0</version>
        </dependency>
      </dependencies>
      
      
example :       

    CellToPDF doc2PDF = new CellToPDF();
    doc2PDF.excel2pdf(pdfPath,excelPath);
  
   