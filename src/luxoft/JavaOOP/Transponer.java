package luxoft.JavaOOP;

public class Transponer {
   private int i_length;
   private int j_length;
   private int[][]arr;
   private int[][]tr_arr;


   public int[][] init(int i_length, int j_length)
   {
       this.i_length = i_length;
       this.j_length = j_length;

       int[][] arr = new int[i_length][j_length];
       for (int i=0;i<i_length;i++)
       {
           for (int j=0;j<j_length;j++)
           {
               arr[i][j] = (int)((char)i*100 + (char)j);

           }
       }
       this.arr = arr;
       return arr;
   }

    private void printarray(int[][] arr)
    {
        System.out.println();
        int i_length = arr.length;
        int j_length;
        for (int i=0;i<i_length;i++)
        {
            j_length = arr[i].length;
            for (int j=0;j<j_length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printarray()//(int[][] arr)
    {
        this.printarray(this.arr);
    }
    public void print_tr_array()//(int[][] arr)
    {
        this.printarray(this.tr_arr);
    }

   public void transpose()
   {
       int i_length_;
       int j_length_;

       if (this.arr == null) {
           System.out.println("array is empty");

       }
       else
       {

           j_length_ = this.i_length;
           i_length_ = this.j_length;

           tr_arr = new int[i_length_][j_length_];

           for (int i=0;i<i_length_;i++)
           {

               for (int j=0;j<j_length_;j++)
               {
                   tr_arr[i][j]= arr[j][i];
               }
           }
       }

   }
}
