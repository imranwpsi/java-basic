package local_global_instance;
/*
* Notice main method doesn't appear as the first
* All static fields and blocks are processed in order
*/
public class InstanceVsStatic {
    // a static initialization block, executed once when the class is loaded
    // static variables are called class variables
    static {
        System.out.println("Class is loading...");
    }
    // a constant
    static final long ONE_DAY_IN_MILLISECOND = 24 * 60 * 60 * 1000;
    // a static field
    static int instanceCounter;

    // a second static initialization block
    // static members are processed in the order they appear in the class
    static {
        // we can now access the static fields initialization above
        System.out.println("ONE_DAY_IN_MILLISECOND = " + ONE_DAY_IN_MILLISECOND + " instanceCounter = " + instanceCounter);
    }
    // an instance initialization block
    // instance blocks are executed each time a class instance is created
    {
        instanceCounter++;
        System.out.println("Instance Counter = " + instanceCounter);
    }
    public static void main(String[] args) {
        System.out.println("Starting main method...");
        new InstanceVsStatic();
        new InstanceVsStatic();
        new InstanceVsStatic();
        System.out.println("InstanceVsStatic in main = " + instanceCounter);
    }
    static {
        System.out.println("Class InstanceVsStatic loaded");
    }
}
