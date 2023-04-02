package practice.specialization.app.demos.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	public boolean isEmail(String emailString) {
		Pattern emailValidatorPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailValidatorPattern.matcher(emailString);
		return matcher.matches();
	}
	
	public boolean isPhone(String phoneString) {
		Pattern phoneValidatorPattern = Pattern.compile("\\d{10}");
		Matcher matcher = phoneValidatorPattern.matcher(phoneString);
		return matcher.matches();
	}
	
	public boolean isPasswordValid(String passwordString) {
		Pattern passwordValidatorPattern = Pattern.compile("[a-z0-9]{8}");
		Matcher matcher = passwordValidatorPattern.matcher(passwordString);
		return matcher.matches();
	}
}
