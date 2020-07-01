class InvalidInputException extends Exception{
InvalidInputException(String s){
	super(s);
	}
}

class CustomException{
	
	public static void validate(int age) throws InvalidInputException{
	if(age<18)
		throw new InvalidInputException("Invalid Input exception occure");
	else
		System.out.println("welcome guest");
	}

	 public static void main(String args[]){  
      	try{  
     	 validate(13);  
     	 }catch(Exception m){
		System.out.println("Exception occured: "+m);
		}  
  
      System.out.println("rest of the code...");  
  }  
}