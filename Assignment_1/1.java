class Pattern{
	public static void main(String[] args){
		char a=65;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
			     if(i%2==0){
				     System.out.print(a+" ");
				     a++;
			     }
			     else{
				     System.out.print(a+" ");
				     a--;
			     }

			}
		        if(i%2==0){
			     a--;
			}
			else
				a++;
			System.out.println();
		}
	}
}



