class p1sample{
	public static void main(String[] args){
		char ch;
		ch = 60+5;
		System.out.println("char = "+ch+1);	/* Due to similar precedence of both the + operators it results in left to right associativity,
							thus string gets concatenated with character which further concatenates with integer. */
		System.out.println(ch+1+ " = char");	/* prints 66 - This is what happens if we swithch the position of above print statement
							,thus explains order of evaluation. */
		System.out.println("char = "+(ch+1));	// Here as parenthesis have higher precedence ,thus at first (ch+1) gets evaluated which gets concatenated with string
	}
}
