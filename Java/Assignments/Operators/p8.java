class LogicalCode{
	public static void main(String[] args){
		int x = 10;
		int y = 11;
		System.out.println((++x>=y)&&(x<++y));		//true
		System.out.println(x);		//11
		System.out.println(y);		//12
	}
}

class BitwiseOperator{
	public static void main(String[] args){
		int x = 15;	// 0000 1111
		int y = 35;	// 0010 0011
		System.out.println(x&y);	// 0000 0011 = 3
		System.out.println(x|y);	// 0010 1111 = 47

	}
}
