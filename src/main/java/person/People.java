package person;

public abstract class People implements ICreature{

    @Override
    public void run() {
        System.out.println("people running");
    }
    abstract  void speak();
}

//子类一样的method，就在这里实现，"people running"，子类会不一样的method，（因为会说不同的语言），这里只定义abstract method，具体在子类实现
