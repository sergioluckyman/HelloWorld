package luxoft.GarbageCollector;

public class GBExampleTest {
    private int [] weight = new int[1000];
    private int _count;
    GBExampleTest(int count)
        {
            this._count = count;
        }

    //@override
    protected void finalize () throws Throwable
    {
        super.finalize();
        System.out.println("finalize is called "+ this._count);
    }
}