package Static;
public class CallInstanceInStatic {
    void instanceMethod() {
        System.out.println("Instance Method Called from Static Method");
    }

    static void staticMethod() {
        CallInstanceInStatic obj = new CallInstanceInStatic();
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        staticMethod();
    }
}

