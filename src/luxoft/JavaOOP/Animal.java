package luxoft.JavaOOP;

public /*abstract*/ class Animal {
     Animal(String animal_name)
    {
        _animal_name = animal_name;
    }
    private String _animal_name;
    public /*abstract*/ void eat()
    {}
    public void say_name()
    {
        System.out.println("I am " + _animal_name);
    }
}
