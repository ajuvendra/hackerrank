package org.home.string;

class MyRegex {
	String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
public class ValidateIP {
	public static void main(String[] args) {
		String IP = "0.0.0.0";
		
		System.out.println(IP.matches(new MyRegex().pattern));
//		System.out.println(Pattern.matches("\\d{1,3}", "33"));
	}
}
