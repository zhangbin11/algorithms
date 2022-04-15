package designPattern.singleton;

public class StaticInnerClassSingleton {

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton staticInnerClassSingleton
                = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getInstance(){
        return SingletonHolder.staticInnerClassSingleton;
    }

}
