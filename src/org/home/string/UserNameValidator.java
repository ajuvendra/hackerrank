package org.home.string;

public class UserNameValidator {

	public static void main(String[] args) {
//		String regex = "\\b([a-zA-Z]{8,30})";
		String regex = "\\b([a-zA-Z][\\p{Alnum}_]{7,29})";
		String userName = "Samantha";
		if(userName.matches(regex)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
