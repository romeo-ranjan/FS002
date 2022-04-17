package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global 
{
	//stdrule:To Provide TestData & Objects for Whole application
	public WebDriver driver;
	//*******TestData
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String FN="White";
	public String LN="Devil";
	//*******Objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String frm_frame="rightMenu";
	public String btn_Add="//input[@value='Add']";
	public String txt_FN="txtEmpFirstName";
	public String txt_LN="txtEmpLastName";
	public String btn_save="btnEdit";
}
