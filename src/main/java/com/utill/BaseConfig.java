package com.utill;

import java.io.FileInputStream;

import java.util.Properties;

public class BaseConfig {

public static String getconfig(String testData) throws Exception {
		
		
		String Path ="/Users/juibhuiyan/eclipse-workspace/Batch35/batch35_automation_framwork/Environment/dev.properties";
		
		
		FileInputStream fis = new FileInputStream(Path);
	
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		String value = pro.get(testData).toString();
		
		
		
		return value;
			
	}
	public static void main(String[] args) throws Exception {
		
		System.out.println(BaseConfig.getconfig("URL"));
		System.out.println(BaseConfig.getconfig("Username"));
		System.out.println(BaseConfig.getconfig("Password"));
		
	}
	
	
	
}
