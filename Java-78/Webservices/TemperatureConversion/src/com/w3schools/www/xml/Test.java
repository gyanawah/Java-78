package com.w3schools.www.xml;

public class Test {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator();
		TempConvertSoap serviceRef = locator.getTempConvertSoap();
		
		String celsius = "108";
		String fah = serviceRef.celsiusToFahrenheit(celsius);
		
		System.out.println(celsius+"C = "+ fah+"F");
	}

}
