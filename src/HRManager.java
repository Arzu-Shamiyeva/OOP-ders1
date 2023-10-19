public class HRManager extends Employee{


    public HRManager(int empId, String name, int salary) {
        super(empId, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is working");
    }

    public void addEmployee(){
        System.out.println("adding new Employee");
    }
}
