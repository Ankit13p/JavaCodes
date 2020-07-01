class Abstraction{

	public static void main(String ... args){
	System.out.println("abstract class do not allow to create object");
	Iphone i = new Iphone();
	Samsung s = new Samsung();
	show(i);
	show(s);

	}
	public static void show(Phone obj){
	obj.showConfig();
	}
}

abstract class Phone{
	public abstract void showConfig();
}
class Iphone extends Phone{
	public void showConfig(){
	System.out.println("iphone 8, 2gb RAM, 64gb ROM");
	}
}

class Samsung extends Phone{
	public void showConfig(){
	System.out.println("Note 9, 8gb RAM, 128gb ROM");
	}
}