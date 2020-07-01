class Break{
	public static void main(String ... args){
	System.out.println("Break will stop execution of perticular loop not parent loop");
	for(int i = 0;i<5;i++){
		ankit:for(int j=0;j<i;j++){ // ankit is labelling
			System.out.println("*");
		//	break;
			break ankit;	// try without and with
		}
	System.out.println("#");
	}
		
	}
}