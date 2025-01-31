enum Languages{
	JAVA,
	PYTHON,
	C;
	static{
		Languages lang1 = Languages.JAVA;
		Languages lang2 = Languages.PYTHON;
		Languages lang3 = Languages.C;
		System.out.println(lang1);
		System.out.println(lang2);
		System.out.println(lang3);
	}
	public static void main(String[] args){
		System.out.println("main method");
	}
}
