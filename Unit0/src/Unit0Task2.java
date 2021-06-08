public class Unit0Task2 {
    public static void main(String[] args) {
        int ab = 50, bc = 9, ac = 4;

            if ((ab > (bc + ac)) || (ac > (ab + bc)) || (bc > (ac + ab)))
            {
                System.out.println("Треугольник с такими длинами сторон существовать не может");
            }
            else
            {
                System.out.println("Труегольник существует");
            }
    }
}