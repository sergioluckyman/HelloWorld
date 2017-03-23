package luxoft.zoo;


public interface Flyer {
    void fly();
    void land();
    void takeoff();
    void fly(int height); //overloading
    void fly(int height, int weight); //overloading
}
