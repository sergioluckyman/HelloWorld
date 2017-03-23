package luxoft.zoo;

public abstract class Zoon {
    Zoon()
    {
        System.out.println("Zoon constructor");
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* Methods*/
    public abstract void produceSound();

    public abstract void eat();

}
