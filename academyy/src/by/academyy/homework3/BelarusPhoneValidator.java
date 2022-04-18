package by.academyy.homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	
	
	@Override
	public boolean isValid(String valid) {
		 if (Reg.checkBelarus(valid) == true) {
	            return true;
	        }
	        else {
		return false;
	}
	}
  
}
