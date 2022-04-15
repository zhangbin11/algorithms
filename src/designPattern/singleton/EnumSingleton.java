package designPattern.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }


}
