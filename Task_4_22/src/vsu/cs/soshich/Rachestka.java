package vsu.cs.soshich;

public class Rachestka
{
    public static void comb(String[] array)
    {
        final double stepConstant = 1.24733095;
        int step = array.length;
        while (step > 1)
        {
            step = (int) (step / stepConstant);
            System.out.println(step);
            for (int i = 0; step + i < array.length; i++)
            {
                if (count(array[i]) < count(array[i + step]))
                {
                    swap(array, i, i + step);
                }
                else if ((count(array[i]) == count(array[i + step])) && array[i].length() < array[i + step].length())
                {
                    swap(array, i, i + step);
                }
            }
        }
    }

    public static void swap(String[] array, int x, int y)
    {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private static int count(String s)
    {
        int counter = 0;
        char[] signs = new char[] {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < signs.length; j++)
            {
                if (s.charAt(i) == signs[j]);
                {
                    counter++;
                }
            }
        }
        return counter;
    }
}
