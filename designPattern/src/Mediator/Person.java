package Mediator;

public abstract class Person {
    private String name;
    private int condition;
    private Mediator mediator;

    public Person(String name, int condition, Mediator mediator) {
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getPartner(Person person);
}