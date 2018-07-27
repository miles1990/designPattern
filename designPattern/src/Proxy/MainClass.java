package Proxy;

import java.lang.reflect.Proxy;

public class MainClass {
    public static void main(String[] args) {
        //被代理人
        RealSubject realSubject=new RealSubject();
        //代理人
        MyHandler myHandler=new MyHandler();
        myHandler.setSubject(realSubject);
        //使用反射进行方法拦截
        Subject proxySubject=(Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),realSubject.getClass().getInterfaces(),myHandler);
        proxySubject.sailBook();
    }
}
