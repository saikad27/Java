import java.io.*;
class p1{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = 1;
		String factor = "";
		while(temp<=num){
			if(num%temp==0){
				factor = factor+temp;
				if(temp!=num){
					factor+=",";
				}
			}
			temp++;
		}
		System.out.println("Factors of "+num+" are "+factor);
}
}
