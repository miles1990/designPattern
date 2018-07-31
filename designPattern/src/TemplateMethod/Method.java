package TemplateMethod;

public abstract class Method {
    public abstract void makeHead();
    public abstract void makeBody();
    public abstract void makeTail();
    public void make(){
        this.makeHead();
        this.makeBody();
        this.makeTail();
    }
}
