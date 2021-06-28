public class Cosmodrome {
    public void start(Istart object){
        if (object.startCheck()){
            System.out.println("Предстартовая проверка прошла успешно!");
            object.startEngine();
            for (int i=10;i>=0;i--){
                System.out.println(i);
            }
            object.start();

        }
        else {
            System.out.println("Предстартовая проверка провалена. " + object.getName()+ " не взлетит((");
            System.out.println();
        }

    };

    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.start(new Shuttle());
        cosmodrome.start(new RosCosmos());
        cosmodrome.start(new SpaceX());
    }
}
