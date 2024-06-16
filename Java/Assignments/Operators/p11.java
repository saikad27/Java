class right_left_shift{
	public static void main(String[] args){
		int x = 8;	// 0000 1000
		int y = 2;	// 0000 0001
		System.out.println("8>>2 : "+(x>>y));	// 0000 1000 --> 0000 0010 = 2
		System.out.println("8<<2 : "+(x<<y));	// 0000 1000 --> 0010 0000 = 32
		System.out.println("-8<<2 : "+(-x<<y));	// 1111 1000 --> 1110 0000 = -32
		System.out.println("-8>>2 : "+(-x>>y));	// 1111 1000 --> 1111 1110 = -2
	
	
	}
}
