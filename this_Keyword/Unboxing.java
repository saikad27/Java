class Unboxing{
	public static void main(String[] args){
		Integer obj = new Integer(0);
		obj = null;
		int num = obj;
		System.out.println(obj);
		System.out.println(num);
	}
}
