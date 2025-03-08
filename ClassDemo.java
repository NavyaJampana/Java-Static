package Static;
public class ClassDemo {
    // Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static";

    // Instance variables
    int instanceVar1 = 20;
    String instanceVar2 = "Instance";

    // Static method
    static void staticMethod() {
        System.out.println("Inside Static Method");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Inside Instance Method");
    }

    public static void main(String[] args) {
        ClassDemo obj = new ClassDemo();
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);
        staticMethod();
        obj.instanceMethod();
    }
}
