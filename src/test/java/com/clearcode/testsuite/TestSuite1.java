package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AddProductPage;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{

	//@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
	//@Test
	//public void createPatient() throws InterruptedException {
		//wdu.type(HomePage.username_ip, data[0]);
		//wdu.type(HomePage.pwd_ip, data[1]);
		//wdu.click(HomePage.login_btn);
		//wdu.mouseOver(MenuBar.patient_menu);
		//wdu.click(MenuBar.newPatient_menu);
		//wdu.selectByVisibleText(PatientPage.title_select, data[2]);
		//wdu.type(PatientPage.fname_ip, data[3]);
		//wdu.type(PatientPage.lname_ip, data[4]);
	//	wdu.click(HomePage.signup_link);
		
	//}
	@Test (priority=1,dataProvider="createProduct",dataProviderClass=LoginData.class)
	public void loginAdmin(String pname, String mtitle, String model, String price, String category)
	{
		wdu.type(HomePage.username, "admin");
		wdu.type(HomePage.password, "admin@123");
		wdu.click(HomePage.loginbutt);
		wdu.mouseOver(HomePage.category);
		wdu.click(HomePage.product);
		wdu.click(AddProductPage.addbutton);
		wdu.type(AddProductPage.productname,pname);
		wdu.type(AddProductPage.mtitle, mtitle);
		wdu.click(AddProductPage.data);
		wdu.type(AddProductPage.model, model);
		wdu.type(AddProductPage.price, price);
		wdu.click(AddProductPage.links);
		wdu.type(AddProductPage.category, category);
		wdu.click(AddProductPage.save);
		
		wdu.getTextNode(AddProductPage.msg, "Success: You have modified products!");	
		//wdu.assertText(AddProductPage.msg, "Success: You have modified products!");
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"))., expected);
	}	
	

	
	/*
	 * @Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class) public
	 * void searchPatient(String user, String pwd, String title, String fname,
	 * String lname) throws InterruptedException { wdu.type(HomePage.username_ip,
	 * user); wdu.type(HomePage.pwd_ip, pwd); wdu.click(HomePage.login_btn);
	 * wdu.mouseOver(MenuBar.patient_menu); wdu.click(MenuBar.newPatient_menu);
	 * wdu.selectByVisibleText(PatientPage.title_select, title);
	 * wdu.type(PatientPage.fname_ip, fname); wdu.type(PatientPage.lname_ip, lname);
	 * }
	 */
	
}
