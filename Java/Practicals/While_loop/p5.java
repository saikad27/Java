class p5{

	public static void main(String[] args){
		int row = 4;
		int num = 1;
		int i = 1;
		while(i<=row){
			int j = 1;	
			while(j<=4){
				if(num%2==1){
					System.out.print(num+"  ");
				if(num<10) System.out.print(" ");
				}
				else{
					System.out.print(++num +"  ");
				if(num<10) System.out.print(" ");
				}
			j++;
			num++;
			}System.out.println();
			i++;
		}
	}
}
