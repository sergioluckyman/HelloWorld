package luxoft.Wrapper;

/**
 * Created by red6 on 3/24/2017.
 */
public class Tests {
    public void test() {
        String s = "abc";
        String s1 = "abc";
        String s3 = new String("abc");

        if (s==s1)
        {
            System.out.println("s = s1");
        }
        if (s3==s1)
        {
            System.out.println("s3 = s1");
        }
        if (s3.intern()==s1.intern())
        {
            System.out.println("s3.intern()==s1.intern()");
        }
        if (s1.equals(s3))
        {
            System.out.println("s1.equals(s3)");
        }
    }
}
