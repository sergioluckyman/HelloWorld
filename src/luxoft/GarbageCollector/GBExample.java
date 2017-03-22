package luxoft.GarbageCollector;

public class GBExample {
    private int maxSize = 1000000;
    public void test() {
        for (int i = 0; i < maxSize; i++)
        {
            GBExampleTest gbexampleTestnew = new GBExampleTest(i);
        }
    }
}
