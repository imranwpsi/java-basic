package local_global_instance;

public class StaticVariable {
    private static double salary;
    int x; //instance/non-static/object variable
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Java Development";

    public double internship() {
        x = 50;
        salary = 500;
        return x + salary;
    }

    public static void main(String args[]) {
        //x=0; static member can't access non-static member
        StaticVariable sv = new StaticVariable();
        int x = sv.x = 100;
        salary = 5000; //static member can access static member
        System.out.println(DEPARTMENT + " average salary: " + (salary+ x) + "$");

        System.out.println(DEPARTMENT + " internship average salary: " + sv.internship() + "$");
    }
}
