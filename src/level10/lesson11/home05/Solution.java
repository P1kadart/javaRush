package level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Количество буквВвести с клавиатуры 10 строчек и подсчитать
в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.Пример вывода:а 5б 8в 3г 7д 0…я 9*/
public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        int[] abcint = new int[abcArray.length];
        abcint[0] = 0;

        ArrayList alphabet = new ArrayList();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (String element : list)
        {
            char[] elementArray = element.toCharArray();
            for (int i=0; i < elementArray.length;i++)
            {
                if (alphabet.indexOf(elementArray[i]) >=0)
                {
                    int b = alphabet.indexOf(elementArray[i]);
                    abcint[b] = abcint[b] + 1;
                }
            }
        }
        for (int n=0; n < abcArray.length;n++)
        {
            System.out.println(abcArray[n]+" "+abcint[n]);
        }



          }

    }