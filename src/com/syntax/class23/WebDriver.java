package com.syntax.class23;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening browser");
	}

}
class FireFoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening FireFox browser");
	}
}
class ChromeDriver extends WebDriver
public static void main(String[] args) {
	WebDriver driver=new WebDriver();
	driver.open();
}
}
