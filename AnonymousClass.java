interface Display{
	void show();
}
abstract class AnonymousClass implements Display{
	
	public static void main(String ... args){
	
	Display d = new Display(){
	public void show(){
	System.out.println("show function is execute sucessfully");
			}
	};
	d.show();
	}
}
