package CodesPractice;
import java.util.Scanner;
public class SumOF {
    int n;
    public int forE(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=in.nextInt();
        int arr[]=new int[n];
        for(int i=1; i<=n; i++){
            arr[i-1]=i;
        }
        int sum =0;
        for (int m :arr){
            sum+=m;
        }
        return sum;
    }



    public static void main(String[] args){
        SumOF s =new SumOF();
        //System.out.println(s.sumF());
        //System.out.println(s.whileL());
        System.out.println(s.forE());

    }
}

