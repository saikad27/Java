class Matrix{
	public static void main(String[] args){
		int matrix[][] = new int[5][];
		matrix[0] = new int[]{1,2,3,4,5};
		matrix[1] = new int[]{6,7,8,9,10};
		matrix[2] = new int[]{11,12,13,14,15};
		matrix[3] = new int[]{16,17,18,19,20};
		matrix[4] = new int[]{21,22,23,24,25};
		int row = matrix.length-1;
		for(int i=0;i<=row;i++){
                        for(int j=0;j<=row;j++){
                                System.out.print(matrix[i][j]+" ");
                        }System.out.println();
                }System.out.println();
		for(int i=0;i<row;i++){
			int x = row-i;
			for(int j=0;j<x;j++){
				int y = row-j;
				int temp = matrix[i][j];
				matrix[i][j] = matrix[y][x];
				matrix[y][x] = temp;
			}
		}
		for(int i=0;i<=row;i++){
			for(int j=0;j<=row;j++){
				System.out.print(matrix[i][j]+" ");
			}System.out.println();
		}System.out.println();
		for(int i=0;i<=row/2;i++){
			int x = row-i;
			for(int j=0;j<=row;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[x][j];
				matrix[x][j] = temp;
			}
		}
		for(int i=0;i<=row;i++){
			for(int j=0;j<=row;j++){
				System.out.print(matrix[i][j]+" ");
			}System.out.println();
		}
	
	}
}
