package JavaRush.level04.lesson06;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if ((a > b) && (a > c) && (a > d))
            System.out.println(a);
        else if ((b > a) && (b > c) && (b > d))
            System.out.println(b);
        else if ((c > a) && (c > b) && (c > d))
            System.out.println(c);
        else if ((d > a) && (d > c) && (d > b))
            System.out.println(d);
    }

}
