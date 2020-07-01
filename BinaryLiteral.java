class BinaryLiteral{
	public static void main(String ... args){
	// it will allow byte, short, int, long data type 
	int k = 0b111;
	System.out.println("value of k is: "+k);	//7
	int j= 0B100_00_00_00_00;
	System.out.println("value of j is: "+j);	//1024

	System.out.println("**********shifting**********");
	int i = 8; 	//8
	System.out.println("Binary value of "+ i +": "+ Integer.toBinaryString(i));	//8 1000
	int left = i<<2;
	System.out.println("after 2 left shift of "+ i+" Binary value of "+ left +": "+ Integer.toBinaryString(left)+" it will all two 00 in last");	// 32 100000
	int right = i>>2;
	System.out.println("after 2 right shift of "+i+" Binary value of "+ right+": "+ Integer.toBinaryString(right)+" it will remove last two digits");	//2 10
 
	}
}