package Static;
public class PrintInstanceInStatic {
    int instanceVar1 = 50;
    String instanceVar2 = "Instance Data";

    static void staticMethod() {
        PrintInstanceInStatic obj = new PrintInstanceInStatic();
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}

