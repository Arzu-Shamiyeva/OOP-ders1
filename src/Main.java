// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Arzu", 10000);
        HRManager hrm = new HRManager(3, "Fidan", 3000);

        emp.work();
        emp.getSalary();
        hrm.work();
        hrm.getSalary();
        hrm.addEmployee();
        System.out.println("Test git commit");
    }
}