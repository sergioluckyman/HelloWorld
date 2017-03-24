package luxoft.company;
import luxoft.employee.Developer;
import luxoft.JavaOOP.Hippo;
import luxoft.JavaOOP.Animal;
import luxoft.GarbageCollector.GBExample;
import luxoft.JavaOOP.Transponer;
import luxoft.JavaOOP.CharArray;
import luxoft.zoo.Duck;
import luxoft.zoo.Cat;
import luxoft.zoo.Cell;
import luxoft.zoo.ZooGarden;

public class Main {
    private NewClass newClass = new NewClass();

    public static void main(String[] args)
    {
        //hello();

        //work_with_array();
        /*Animal animal = new Animal("Animal");
        animal.say_name();

        Hippo hippo = new Hippo("Hippo");
        hippo.say_name();
        hippo.eat();
        hippo.roam();
        */
        /*
        GBExample gbexample = new GBExample();
        gbexample.test();
        */
        /*
        Transponer transponer = new Transponer();
        transponer.init(3,7);
        transponer.printarray();
        transponer.transpose();
        transponer.print_tr_array();
        */
        /*
        String s = "aw te*g567 dsfbxhb";
        System.out.println(s);
        CharArray charArray = new CharArray();
        System.out.println(charArray.digitHater(s));
        */
        /*
        Duck  duck = new Duck();
        duck.setAge(10);
        duck.setName("Donald");
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        duck.eat();
        duck.fly();
        duck.land();
        duck.produceSound();
        duck.takeoff();
        */
        /*
        Duck  duck2 = new Duck();
        duck2.setAge(15);
        duck2.setName("Scrudge");
        System.out.println(duck2.getAge());
        System.out.println(duck2.getName());
        duck2.eat();
        duck2.fly();
        duck2.land();
        duck2.produceSound();
        duck2.takeoff();
        System.out.println();
        */
        /*Cell cell = new Cell();
        cell.placeAnimal(duck);
        System.out.println("Animal in the cell is " + cell.getAnimalName());
        cell.empty();
        System.out.println();
        Cat cat = new Cat();
        cat.setAge(15);
        cat.setName("cat Vasya");
        cat.eat();
        cat.produceSound();
        cell.placeAnimal(cat);
        */
        ZooGarden  zooGarden = new ZooGarden();
        for (int i=0; i<5; i++)
        {
            Cell cell = new Cell();
            zooGarden.addCell(cell);
            Duck  duck = new Duck("duck" + i,i);

            cell.placeAnimal(duck);
            //cell.placeAnimal(duck);
            System.out.println();
        }
        zooGarden.printNames();

        /*Duck  duck = new Duck();
        duck.setAge(10);
        duck.setName("Donald");
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        duck.eat();
        duck.fly();
        duck.fly(5);
        duck.fly(8,10);
        duck.land();
        duck.produceSound();
        duck.takeoff();*/

        /*
        Cat cat = new Cat("Vasya");
        System.out.println();
        Cat cat2 = new Cat("Kolya","RED");
        */

    }

    public static void hello() {

        System.out.println("Hello, Main!");

    }
    /*public static void work_with_array() {

        int[] nums = {1, 2,3,4,5};
        System.out.println("nums.length " + nums.length);
        //System.out.println("nums[5] " + nums[5]);
        int[] nums2 = new int[3];
        nums2[0] = 0;
        System.out.println("nums2.length " + nums2.length);
        System.out.println("nums2[0] " + nums2[0]);

        int [] a = {2,3};
        int b = 1;
        a[b] = b = 0;

        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        System.out.println("b " + b);
        a[0] = a[1]++;
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        a[0] = ++a[1];
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        //a[0] = a[0]+++a[1];
        b = 1;
        System.out.println("b " + b);
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        a[0] = b+++a[1];
        //System.out.println("a[0] = a[0]+++a[1]; ");
        System.out.println("a[0] = b+++a[1]; ");
        System.out.println("b " + b);
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        *//*      *//*
        b = 1;
        System.out.println("b " + b);
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);
        a[0] = ++b +a [1];
        System.out.println("a[0] = ++b+a[1] ");
        System.out.println("b " + b);
        System.out.println("a[0] " + a[0]);
        System.out.println("a[1] " + a[1]);

        byte x = 2;
        System.out.println("byte x = " + x);
        x+=258;
        //x=x+258;
        System.out.println("x+=3 ");
        System.out.println("x = " + x);
        for (int xx = 1; xx < 10; xx++)
        {
            System.out.println("xx = " +  xx);
        }

    }*/
    /**
     * Created by red6 on 3/14/2017.
     */
    public class NewClass {

        public void main(String[] args) {
            System.out.println("Hello, New Class!");
            Developer developer = new Developer();
            developer.hello();

        }
    }
}
