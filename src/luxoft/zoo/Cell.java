package luxoft.zoo;

public class Cell
{
    private Zoon animal;
    public void placeAnimal(Zoon animal)
    {
        this.animal = animal;
        System.out.println("Animal " + this.getAnimalName()+ " is in the cell");
    }
    public Zoon empty()
    {
        Zoon animal = this.animal;
        this.animal = null;
        System.out.println("Animal " + animal.getName()+ " was get out from the cell");
        return animal;
    }
    public  String getAnimalName()
    {
        return animal.getName();
    }
}
