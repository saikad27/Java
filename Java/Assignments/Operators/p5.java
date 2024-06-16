//Bitwise- AND,OR,XOR,left shift,right shift

class BitwiseOperator{
	public static void main(String[] args){
		int x = 5;	//0b00000101
		int y = 10;	//0b00001010 
		System.out.println("x : "+x);
		System.out.println("y : "+y);  
		System.out.println("x&y : "+(x&y));	//0b00000000 = 0
		System.out.println("x|y : "+(x|y));        //0b00001111 = 15
		System.out.println("x<<1 : "+(x<<1));        //0b00001010 = 10
		System.out.println("y>>2 : "+(y>>2));        //0b00000010 = 2
		 		
	}
}
