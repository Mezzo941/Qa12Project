public class Unit0Task0 {
    public static void main(String[] args) {
        int mounth = 10, birth = 9;
        double dmounth = mounth;

        /*Арифметические операторы*/
        {
            System.out.println("mounth + birth = " + (mounth + birth));
            System.out.println("mounth - birth = " + (mounth - birth));
            System.out.println("mounth x birth = " + (mounth * birth));
            String num = String.format("%.1f", (dmounth / birth));//Нашел на джавараш код, как округлить число с плав.точкой
            System.out.println("mounth : birth = " + num);
            System.out.println("mounth % birth = " + (mounth % birth));
        }

        /*Логические операторы*/
        {
            boolean t = true, f = false;
            System.out.println("True and false = " + (t && f));
            System.out.println("True or false = " + (t || f));
            System.out.println("True or false with reverse = " + !(t || f));
        }

        /*Операторы присваивания*/
        {
            System.out.println("mounth += birth is mounth = mounth + birth = " + (mounth += birth));
            System.out.println("mounth -= birth is mounth = mounth - birth = " + ((mounth -= birth) - birth));
        }

        /*Операторы сравнения*/
        {
            System.out.println("mounth = birth = " + (mounth == birth));
            System.out.println("mounth not = birth = " + (mounth != birth));
            System.out.println("mounth > birth = " + (mounth > birth));
            System.out.println("mounth < birth = " + (mounth < birth));
        }

        /*Битовые операторы*/
        {
            System.out.println("mounth & birth = " + (mounth & birth) + " because " + Integer.toBinaryString(mounth) +
                    "&" + Integer.toBinaryString(birth) + " = " + (Integer.toBinaryString(mounth & birth)));
            System.out.println("mounth | birth = " + (mounth | birth) + " because " + Integer.toBinaryString(mounth) +
                    "|" + Integer.toBinaryString(birth) + " = " + (Integer.toBinaryString(mounth | birth)));
        }

    }


}
