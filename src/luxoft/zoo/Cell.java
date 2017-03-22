package luxoft.zoo;

public class Cell
{
    private Zoon animal;
    public void placeAnimal(Zoon animal)
    {
        if (this.animal==null) {
            this.animal = animal;
            System.out.println("Animal " + this.getAnimalName() + " was plased in the cell");
        }
        else
        {
            System.out.println("Animal " + animal.getName() + " could not bee plased in the cell. the cell is busy");
        }
    }

    public Zoon empty()
    {
        Zoon animal = this.animal;
        this.animal = null;
        System.out.println("Animal " + animal.getName()+ " was got out from the cell");
        return animal;
    }
    String getAnimalName()
    {
        if (this.animal != null)
           {    return animal.getName();
           }
        else {
            return "Cell is empty!! ";
           }

    }
}
