import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        //int av=myAvg(8.4,94.1);
        //System.out.println(av);
        //+printt(40);

        //1
        // כתבו פונקציה רקורסיבית שתקבל טקס
        // ותדפיס את הטקסט בצורה הפוכה
        // STRING + NULL
        //  "text".length()

        //String text="the Dog ate my homework";
        //System.out.println(text.substring(0,text.length()-2));

        //reverseString(text);


        // כתבו פונקציה שתדפיס את כל המספרים שמורכבים מ 3 ספרות
        //  שסכום הספרות הוא 6
        //
        //  600  330   303    222   231
        //

        // קיימת שורה של ארנבים
        // לכל ארנב שנמצא במקום זוגי יש 3 אוזניים
        // ולכל ארנב שנמצא במקום אי זוגי יש 2 אוזניים
        //כתבו פונקציה רקורסיבית שתקבל מספר הארנבים
        // בשורה ותחזיר את כמות האוזניים שיש בשורה
        findSum(6, 100);
        Scanner sc1 = new Scanner(System.in);
        System.out.println(countEars(sc1.nextInt()));

    }


    public static int countEars(int rabbits) {
        if (rabbits < 1)
            return 0;
        else if (rabbits % 2 == 0)
            return 3 + countEars(rabbits - 1);
        else
            return 2 + countEars(rabbits - 1);
    }

    public static void findSum(int sum, int number) {
        if (number >= 999 || number < 100)
            return;
        int ahadot, ashrot, maot;
        ahadot = number % 10;
        ashrot = ((number / 10) % 10);
        maot = (number / 100);
        int newSum = ahadot + ashrot + maot;
        if (newSum == sum)
            System.out.println("the number is  : " + number);
        findSum(sum, number + 1);
    }

    public static void findSum2(int number) {
        if (number >= 999 || number < 100)
            return;
        if (number % 10 + ((number / 10) % 10) + (number / 100) == 6)
            System.out.println("the number is  : " + number);
        findSum(6, number + 1);
    }


    public static String reverseString2(String st) {
        if (st.equals(""))
            return "";
        int len = st.length();

        char lastLitter = st.charAt(len - 1);

        String newString = st.substring(0, len - 1);

        return lastLitter + reverseString2(newString);
    }


    public static void reverseString(String st) {

        if (st.equals("") || st.length() < 1)
            return;

        System.out.print(st.charAt(st.length() - 1));
        reverseString(st.substring(0, st.length() - 1));
    }


    public static int myAvg(double d1, double d2) {

        return (int) (Math.round((d1 + d2) / 2));
    }

    public static void printt(int x) {
        if (x < 10)
            return;
        System.out.println(x);
        printt(x - 1);


    }


}
