import java.util.Scanner;

    public class Employee2 {
        String name;
        int year;
        String addr;
        public void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name of the Employee:");
            name=sc.next();
            System.out.println("Enter Year of Joining:");
            year=sc.nextInt();
            System.out.println("Enter Adderss:");
            addr=sc.next();
        }public static void main(String[]args){

        }
    }


