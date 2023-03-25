
public class EvenNumbers {
int num=10;
	public void forL(){
		for(int i=0;i<=num;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public void whileL(){
		int i =1;
		while(i<=num){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}	
	}
	
	
	public void nested(){
		label:{
			if(num>0){
			if(num%2==0){
				System.out.println(num);
			}
			num--;
			
		}
			break label;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbers n= new EvenNumbers();
		//n.nested();
		n.whileL();
		//n.forL();

	}

}
