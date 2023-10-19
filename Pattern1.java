class Demo{
	public static void main(String[] args){
		char a=68;
		char b=69+32;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i%2==0){
                                    System.out.print(a+" ");
				    a--;
				}
				else
				{
					System.out.print(b+" ");
					b++;
				}
			}
			if(i%2==0)
			a=(char)(a+(6));
			else
				b=(char)(b-(2));
			System.out.println();
		}
	}
}


