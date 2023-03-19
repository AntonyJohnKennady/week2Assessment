import java.util.Scanner;
public class EmployeeMain {
    public static void program1() {
        Scanner sc = new Scanner(System.in);
        Employee men = new Employee();
        System.out.println("Enter Employee Name: ");
        men.Name = sc.nextLine();
        System.out.println("Enter Employee Age:");
        men.age = sc.nextInt();
        System.out.println("Enter Employee Phone Number:");
        men.phno = sc.nextInt();
        System.out.println("Enter Employee Address:");
        men.addr = sc.next();
        System.out.println("Enter Employee Salary:");
        men.salary = sc.nextInt();
        System.out.println("Enter Employee Specialization:");
        men.special = sc.next();
        System.out.println("Enter Employee department:");
        men.Dept = sc.next();


        Manager man = new Manager();
        System.out.println("Enter Manager Name: ");
        man.Name = sc.next();
        System.out.println("Enter Manager Age:");
        man.age = sc.nextInt();
        System.out.println("Enter Manager Phone Number:");
        man.phno = sc.nextInt();
        System.out.println("Enter Manager Address:");
        man.addr = sc.next();
        System.out.println("Enter Manager Salary:");
        man.salary = sc.nextInt();
        System.out.println("Enter Manager Specialization:");
        man.special = sc.next();
        System.out.println("Enter Manager department:");
        man.Dept = sc.next();

        System.out.println("EName\tEage\tEphno\tEaddr\tEsal\tEspecial\tEdept");
        System.out.println(men.Name + "\t" + men.age + "\t\t" + men.phno + "\t" + men.addr + "\t\t" + men.printSalary() + "\t\t" + men.printEmployee() + "\t\t" + men.printDep());

        System.out.println("MName\tMage\tMphno\tMaddr\tMsal\tMspecial\tMdept");
        System.out.println(man.Name + "\t" + man.age + "\t\t" + man.phno + "\t" + man.addr + "\t\t" + man.printSalary() + "\t\t" + man.printManager() + "\t\t" + man.printDep());
    }
    public static void main(String[] args){
        program1();
    }
}
