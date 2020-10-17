package local_global_instance;

public class InstanceVariable {
    // this instance variable is visible for any child class
    public String name;
    // salary variable is visible in InstanceVariable class only
    private double salary;
    //The name variable is assigned in the constructor
    public InstanceVariable(String empName) {
        name = empName;
    }
    //The salary variable is assigned a value
    public void setSalary(double empSal) {
        salary = empSal;
    }
    //This method prints the InstanceVariable details
    public void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary + "$");
    }
    public static void main(String args[]) {
        InstanceVariable empOne = new InstanceVariable("Imran Hossain");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
