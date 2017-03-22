package luxoft.zoo;

public abstract class Zoon {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* Methods*/
    public abstract void produceSound();

    public abstract void eat();

}
