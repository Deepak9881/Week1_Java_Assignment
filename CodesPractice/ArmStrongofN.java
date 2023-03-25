package CodesPractice;

import java.util.Scanner;

public class ArmStrongofN {

    int start ,end;

    public void print(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a start: ");
        start=in.nextInt();
        System.out.println("Enter a end: ");
        end=in.nextInt();
        for (int i = start; i <end ; i++) {
            if(arms(i)){
                System.out.println( i+" ");
            }
        }
    }
    public boolean arms(int newnum){
        int temp=newnum;
        double  sum=0;
        while(newnum>0){
            int rem=newnum%10;
//            sum=  (sum+Math.);
            newnum=newnum/10;
        }
        if(sum==temp){
            return true;
        }return false;
    }


    public static void main(String[] args) {
        ArmStrongofN a= new ArmStrongofN();
//        a.arms();

    }
}
