package com.bitrix24.utilities;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	public BasePage(){PageFactory.initElements(Driver.get(),this);}
	
	@Test
	public void navigationbar(String tab ){
		
		WebElement element = Driver.get().findElement(By.linkText("Driver"));
		
	
	}
	
}
