import java.util.Random;
class EnhanceForLoop{
	static public void main(String ... args){
	Random rd = new Random();
	int[] i = {1,2,3,4,5,6,7,8,9};
	int[] j = new int[5];
	for(int k=0; k<j.length;k++)	
		j[k] = rd.nextInt();
	System.out.println("*******Static array*******");
	for(int val : i)
		System.out.println(val);
	System.out.println("*******Random Dynamic array*******");
	for(int val : j)
		System.out.println(val);
	}
}