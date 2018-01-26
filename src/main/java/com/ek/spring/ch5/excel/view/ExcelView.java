package com.ek.spring.ch5.excel.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;


// Excel 支持  使用IE 测试  PDF 用AbstractPdfView
public class ExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HSSFSheet sheet; //Excel sheet
		HSSFRow sheetRow; //Excel 行
		HSSFCell cell; //Excel 单元格
		
		sheet = workbook.createSheet("spring-sheet1"); //生成一个 名称为sheet1的 sheet
		sheet.setDefaultColumnWidth((short)12); //sheet 默认列的宽度
		
		
		// 单独加一个单元格内容到 sheet1
		cell = super.getCell(sheet, 0, 0); //生成一个 单元格  0 0是坐标
		super.setText(cell, "Spring"); //给单元格里 放值
		
		
		// 从map里取一个 list 循环放到 sheet 中
		List<String> words = (List<String>) model.get("wordList");
		for (int i=0; i<words.size() ; i++) {
			cell = super.getCell(sheet, 2+i, 0);
			super.setText(cell, words.get(i));
		}
	}

 

}