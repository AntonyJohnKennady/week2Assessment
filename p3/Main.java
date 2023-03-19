import java.util.Scanner;
    public abstract class Main {
        public static void main(String[]args){
            Employee2 det1= new Employee2();
            det1.input();
            Employee2 det2= new Employee2();
            det2.input();
            Employee2 det3= new Employee2();
            det3.input();
            System.out.println("Name\t\tYear of Joining\t\tAddress");

            System.out.println(det1.name+"\t\t"+det1.year+"\t\t\t\t"+det1.addr);
            System.out.println(det2.name+"\t\t"+det2.year+"\t\t\t\t"+det2.addr);
            System.out.println(det3.name+"\t\t"+det3.year+"\t\t\t\t"+det3.addr);
        }
}
