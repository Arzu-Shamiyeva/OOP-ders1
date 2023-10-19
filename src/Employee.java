public class Employee {
    private int empId;
    private String name;
    private int salary;



    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


    public void getSalary(){
        System.out.println("Salary="+this.salary);
    }

    public void work(){
        System.out.println("Employee is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
