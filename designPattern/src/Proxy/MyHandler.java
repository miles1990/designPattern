package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    private RealSubject subject;

    public void setSubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        dazhe();
        result=method.invoke(subject,args);
        give();
        return result;
    }

    public void dazhe(){
        System.out.println("打折");
    }

    public void give(){
        System.out.println("送代金券");
    }
}
