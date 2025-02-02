package tdd;

public class Calculator {

    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(String a)
    {
        int numbersAdded = 0;
        int number;
        String [] numbers = a.split(",");

        for(int i = 0; i < numbers.length; i++)
        {
            try
            {
                number = Integer.parseInt(numbers[i]);
            }
            catch(NumberFormatException n)
            {
                number = 1;
                System.out.println("The String format is not compatible with this add function.");
            }
                numbersAdded += number;
        }
        return numbersAdded;
    }

    public int add(int [] a)
    {
        int addedNumbers = 0;
        for(int i : a)
        {
            addedNumbers += i;
        }
        return addedNumbers;
    }

    public int subtract(int c, int d)
    {
        return c - d;
    }

    public int multiply(int e, int f)
    {
        return e * f;
    }

    public int divide(int g, int h)
    {
        return g / h;
    }
}
