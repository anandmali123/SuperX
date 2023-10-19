class Demo{
	public static void main(String[] args){
		char a=65;
		int count=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i;j++){
				if(i%2==0){
				if(count%2==0){
					System.out.print(a+" ");
					a++;
					count++;
				}
				else{ 
					char d=(char)(32+a);
					System.out.print((d+" "));
					a++;
					count++;
				}
				}else{
					if(count%2==0){
                                        System.out.print(a+" ");
                                        a--;
                                        count++;
                                }
                                else{
					char k=(char)(32+a) ;
                                        System.out.print(k+" ");
                                        a--;
                                        count++;
                                }
				
				}
			}
			System.out.println();
			if(i%2==0)
		        a--;
			else{count++;
				a++;
			}
		}
	}
}




