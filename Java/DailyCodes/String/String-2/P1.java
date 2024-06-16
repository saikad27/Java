class P1{
	public static void main(String[] args){
		String str1 = "Shashi";
		String str2 = "Shashi";
		String str3 = "Core2Web";
		System.out.println(System.identityHashCode(str1));	//1000
		System.out.println(System.identityHashCode(str2));	//1000
		System.out.println(System.identityHashCode(str3));	//2000
	}
}
