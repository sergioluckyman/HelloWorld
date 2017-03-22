package luxoft.zoo;

public class Cell
{
    private Zoon animal;
    public void placeAnimal(Zoon animal)
    {
        this.animal = animal;
        System.out.println("Animal " + this.getAnimalName()+ " was plased in the cell");
    }
    public Zoon empty()
    {
        Zoon animal = this.animal;
        this.animal = null;
        System.out.println("Animal " + animal.getName()+ " was got out from the cell");
        return animal;
    }
    public  String getAnimalName()
    {
        if (this.animal != null)
           {    return "Animal in the cell is " + animal.getName();
           }
        else {
            return "Cell is empty!! ";
           }

    }
}
