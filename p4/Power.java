import java.util.Scanner;
public class Power {
    public int calc(int a,int b){
        int res;
        if(b==0){
            return 1;
        }
        else{
            res = a *(calc(a,b-1));
            return res;
        }
    }
}
class Main1{
    public static void main(String[] args){
        int a,b;
        Power pow =new Power();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Power of "+a+" raise to "+b+" is "+pow.calc(a,b));
    }
}
