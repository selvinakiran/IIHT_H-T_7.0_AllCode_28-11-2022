package com.admin.utility;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.admin.entity.Compensation;


public class CompensationExcelExporter {
	
	private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    private List<Compensation> Compensation;

    public CompensationExcelExporter(List<Compensation> Compensation) {
        this.Compensation = Compensation;
        workbook = new XSSFWorkbook();
    }

    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Long) {
            cell.setCellValue((Long) value);
        } else if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }  else if (value instanceof String) {
            cell.setCellValue((String) value);
        } 
        else {
            cell.setCellValue((Date) value);
        }
        cell.setCellStyle(style);
    }

    private void writeHeaderLine(){
        sheet=workbook.createSheet("Compensation");
        Row row = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(20);
        style.setFont(font);
        style.setAlignment(HorizontalAlignment.CENTER);
        createCell(row,0,"Compensation details",style);
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,6));
        font.setFontHeight((short)(10));
        row=sheet.createRow(1);
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        createCell(row,0,"planId",style);
        createCell(row,1,"partnername",style);
        createCell(row,2,"compensationplan",style);
        createCell(row,3,"validfrom",style);
        createCell(row,4,"validto",style);
        createCell(row,5,"calculation",style);
        createCell(row,6,"percentage",style);
       
        

    }

    private void writeDataLines(){
        int rowCount = 2;
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        for(Compensation c : Compensation){
            Row row = sheet.createRow(rowCount++);
            int columnCount=0;
            createCell(row,columnCount++,c.getPlanid(),style);
            createCell(row,columnCount++,c.getPartnername(),style);
            createCell(row,columnCount++,c.getCompensationplan(),style);
            createCell(row,columnCount++,dateformat.format(c.getValidfrom()),style);
            createCell(row,columnCount++,dateformat.format(c.getValidto()),style);
            createCell(row,columnCount++,c.getCalculation(),style);
            createCell(row,columnCount++,c.getTranpercentage(),style);
         
        }
    }

    public void export(HttpServletResponse response) throws IOException{
        writeHeaderLine();
        writeDataLines();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}
