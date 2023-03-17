package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) throws InvalidPhoneNumberException {
		// TODO Auto-generated method stub
		ExceptionEmp e1 = new ExceptionEmp ("8136917714","finlana@gmail.com","nettikadan",01,"Finla","Trivandrum",23500);
		//ExceptionEmp e2 = new ExceptionEmp ("9400627642","finitana@gmail.com","Pallan",01,"Finita","Kochi",35000);
		//ExceptionEmp e3 = new ExceptionEmp ("9847260793","fionana@gmail.com","Parapully",01,"Fiona","Bombay",40000);
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		e1.setPhoneno(s1);
		
	
		try {
			 if (!e1.getPhoneno().matches("\\d{10}$")) {
			        throw new InvalidPhoneNumberException("Invalid phone number: ");
		} 
			 String s2 = in.next();
			 e1.setEmailid(s2);
			 try {
					if (!e1.getEmailid().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				        throw new InvalidEmailIdException("Invalid email ID: " );
				    }
				}
				catch(InvalidEmailIdException e) {
					System.err.println(e.getMessage());
				}
			 
		}
		catch (InvalidPhoneNumberException e) {
		    System.err.println(e.getMessage());
		}
		
	}
	public static class InvalidPhoneNumberException extends Exception {
	    public InvalidPhoneNumberException(String message) {
	        super(message);
	    }
	}
	public static class InvalidEmailIdException extends Exception {
	    public InvalidEmailIdException(String message) {
	        super(message);
	    }
	}
}
	
	
	

	