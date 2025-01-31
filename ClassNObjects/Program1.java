
class Demo{
	private char[] chArr;
	private char[] name;
	Demo(char[] chArr,char[] name){
		this.chArr = chArr;
		this.name = name;
	}
	int fun(){
		int len1 = chArr.length;
		int len2 = name.length;
		return Math.min(len1,len2);
	}

}

class Program1{
	public static void main(String[] args){
		char[] ch1 = {'A','b','C'};
		char[] ch2 = {'p','Q','r','S'};
		Demo obj = new Demo(ch1,ch2);
		System.out.println(obj.fun());
	}
}
