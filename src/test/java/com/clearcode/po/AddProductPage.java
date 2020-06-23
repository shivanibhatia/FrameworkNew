package com.clearcode.po;

import org.openqa.selenium.By;

public class AddProductPage {
	//public static By username_ip = By.id("authUse");
	//public static By pwd_ip = By.id("clearPass");
	//public static By login_btn = By.className("fa-sign-in");
	public static By addbutton = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
	public static By productname = By.id("input-name1");
	public static By mtitle = By.id("input-meta-title1");
	public static By data = By.xpath("//*[@id=\"form-product\"]/ul/li[2]/a");
	public static By model = By.id("input-model");
	public static By price = By.id("input-price");
	public static By links = By.xpath("//*[@id=\"form-product\"]/ul/li[3]/a");
	public static By category = By.id("input-category");
	public static By save = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
	
	public static By msg = By.className("alert-success");
	public static By dangermsg = By.className("alert-danger");
	
}
