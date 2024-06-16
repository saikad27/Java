class C2W{
	public static void main(String[] args){
		int num = 100;		//0110 0100
		num--;		//0b 0110 0011 num = 99
		
		System.out.println(num<<1);	//1100 0110 = 128+64+4+2 =198
		num = num>>>1;		// 0011 0001 = 49
		num +=3;	//49+3 =52
		
		System.out.println(num);
		
	}
}

