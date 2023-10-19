class Pattern{
	public static void main(String[] args){
		int a=1;
		for(int i=0;i<4;i++){
			int x=a+i;
			for(int j=0;j<=i;j++){
                           System.out.print(x+" ");
			   x--;
			}
			System.out.println();
		}
	}
}

