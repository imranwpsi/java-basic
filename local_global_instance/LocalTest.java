package local_global_instance;

public class LocalTest {
    int y;
    public void calAge() {
        int age = 0;
        age = age + 7;
        y = y + 3;
        System.out.println("Age is: " + (age + y));
    }

    public static void main(String args[]) {
        LocalTest test = new LocalTest();
        test.calAge();
    }
}