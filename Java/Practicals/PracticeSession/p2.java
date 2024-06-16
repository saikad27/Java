class C2W_CharDemo{
	public static void main(String[] args){
		char ch;
		ch = '97';	// This line gives an error (i.e. unclosed character literal),as we know that a character variable cannot hold more than 1 character constant.
		System.out.println("char = "+ch);
		System.out.println("char = "+ ch+1);
	}
}
