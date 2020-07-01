class ExceptionDemo{
	public static void main(String ... args){
	try
	{	
	//variable scope should be noticable
	try{
		int result = 5/0;
	}catch(ArithmeticException e){
		System.err.println("Arithmetic Exception occure" + e);
	}
	
	String str =null;
	//System.out.println(str.length());
	str = "Ankit";
	int i = Integer.parseInt(str);
	System.out.println(i);
	}

	catch(NullPointerException e){
		System.err.println("NullPointer Exception occure" + e);
	}catch(NumberFormatException e){
		System.err.println("NumberFormat Exception occure" + e);
	}finally{	
	System.out.println("This finally block will always execute");
	}
	}
}