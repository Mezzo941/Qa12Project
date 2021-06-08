package unit1;

public class Unit1Task1 {
    public static void main(String[] args) {

        double w=10, alldays=w;

        for(int i=1;i<7;i++)
        {
            w=w+(w*0.1);
            alldays+=w;
        }
        String way = String.format("%.2f",alldays);
        System.out.print("Спортсмен за 7 дней пробежит "+way+" км");

    }
}
