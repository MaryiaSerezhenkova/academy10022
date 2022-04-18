package by.academyy.homework3;

public class AmericanPhoneValidator implements Validator { 
	
		@Override
		public boolean isValid(String valid) {
			 if (Reg.checkAmerican(valid) == true) {
		            return true;
		        }
		        else {
			return false;
		}
		}
	  
	}


