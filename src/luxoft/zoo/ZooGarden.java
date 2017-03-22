package luxoft.zoo;

public class ZooGarden
{
    private  Cell [] cells = new Cell[10];
    private int count = 0;
    public void addCell(Cell cell)
    {
        cells[count] = cell;
        count++;
    }
    public void printNames()
    {
        for ( int i=0; i<count; i++)
        {
            System.out.println(cells[i].getAnimalName());
        }
    }
}
