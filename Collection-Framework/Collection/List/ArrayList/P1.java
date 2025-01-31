import java.util.*;
class Demo{
	private int rollNo;
	private String name;
	Demo(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString(){
		return rollNo+" : "+name;
	}
}
class Program1{
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(new Demo(1,"Steve"));
		list.add(new Demo(2,"Woz"));
		list.add(new Demo(3,"Ellison"));
		list.add(new Demo(4,"Jonny"));
		System.out.println(list);
	}
}
