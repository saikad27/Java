class P8{
	public static void main(String[] args){
		String str1 = "Rohit";	//ref->1000
		String str2 = str1;	//ref->1000
		String str3 = new String("Virat");	//ref->2000
		String str4 = str3;			//ref->2000
		String str5 = new String(str1);	//ref->3000
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
	}
}
