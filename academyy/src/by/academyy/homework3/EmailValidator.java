package by.academyy.homework3;

public class EmailValidator implements Validator {

	@Override
	public boolean isValid(String valid) {
		 if (Reg.checkEmail(valid) == true) {
	            return true;
	        }
	        else {
	            return false;
	}

}
}
