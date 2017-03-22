package luxoft.JavaOOP;

public class CharArray
{
    private char[] arr_in;
    private char[] arr_out;

    public String digitHater(String s)
    {
        arr_in =  s.toCharArray();
        arr_out = new char[arr_in.length*2];

        for (int i = 0;i<arr_in.length;i++)
        {
            if (!Character.isDigit(arr_in[i]))
            {
                arr_out[i * 2] = arr_in[i];
                arr_out[i * 2 + 1] = arr_in[i];
            }
            else
            {
                arr_out[i * 2] = '!';
                arr_out[i * 2 + 1] = '!';
            }

        }
        s = "";
        for (int i = 0;i<arr_out.length;i++)
        {
        if (arr_out[i] != '!') {
            s = s + arr_out[i];
        }

        }
        return s;
    }
}
