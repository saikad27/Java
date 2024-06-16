import java.util.*;
class p19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player info : ");
		String info = sc.nextLine();
		StringTokenizer st = new StringTokenizer(info,"@#");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
