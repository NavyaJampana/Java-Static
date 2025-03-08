package Static;
public class PrintAllVariables {
    static int staticVar1 = 500;
    static String staticVar2 = "Static Data";
    int instanceVar1 = 1000;
    String instanceVar2 = "Instance Data";

    public static void main(String[] args) {
        PrintAllVariables obj = new PrintAllVariables();
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);
    }
}
