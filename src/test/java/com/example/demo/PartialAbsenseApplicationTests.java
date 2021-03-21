package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.util.ExcelUtil;

@SpringBootTest
class PartialAbsenseApplicationTests {


	    @Test
	    public void contextLoads() {
	    }

	    @Test
	    public void TestCreateWorkbook(){
	        ExcelUtil.CreateNewWorkbook();
	    }

	    @Test
	    public void TestCreateSheet(){
	        ExcelUtil.CreateNewSheet();
	    }
	    @Test
	    public void TestCreateCell(){
	        ExcelUtil.CreateNewCell();
	    }

	    @Test
	    public void OpenAndReadExcel(){
	        ExcelUtil.OpenExcelByFile();
	        ExcelUtil.OpenExcelByFileInputStream();
	    }
	}
