public class Unit0Task1
{
    public static void main(String[] args)
    {
       // int a = (int) (Math.random()*2000-1000);
        int a=-1290;
        String b = Integer.toString(a);//переводим число в строку
        int lennum = b.length();//получаем кол-во чимволов строки



        System.out.println("a = " + a);

        if (a > 0) {
            if (lennum == 1) {
                System.out.println("Число положительное и однозначное");
            }
            if (lennum == 2) {
                System.out.println("Число положительное и двухзначное");
            }
            if (lennum == 3) {
                System.out.println("Число положительное и трехзначное");
            }
            if (lennum == 4) {
                System.out.println("Число положительное и четырехзначное");
            }
        }

        if (a == 0) {
            System.out.print("Число равняется 0 и однозначное");
        }

        if (a < 0)
        {
            lennum -= 1;
            if (lennum == 1) {
                System.out.println("Число отрицательное и однозначное");
            }
            if (lennum == 2) {
                System.out.println("Число отрицательное и двухзначное");
            }
            if (lennum == 3) {
                System.out.println("Число отрицательное и трехзначное");
            }
            if (lennum == 4) {
                System.out.println("Число отрицательное и четырехзначное");
            }


        }
    }
}
