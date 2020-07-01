class A{
	int i =5;
	public void show(){
	System.out.println(" value of i: "+i);
	}
}

class AnonymousObject{
	
	public static void main(String ... args){
	System.out.println("i: "+new A().i);
	//or
	new A().show();

	}
}