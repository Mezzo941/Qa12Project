public class Unit0Task7 {
    public static void main(String[] args) {
        int prog = (int) (Math.random()*100);

        if (prog==1 || prog==21 || prog==31 || prog==41 || prog==51 || prog==61 || prog==71 || prog==81  || prog==91){
            System.out.println(prog+" Программист");
        }
        if (2<=prog && prog<=4 || 22<=prog && prog<=24 || 32<=prog && prog<=34 || 42<=prog && prog<=44 || 52<=prog &&
                prog<=54 || 62<=prog && prog<=64 || 72<=prog && prog<=74 || 82<=prog && prog<=84 || 92<=prog && prog<=94)
            System.out.println(prog+" Программиста");
        if (prog==0 || 5<=prog && prog<=20 || 25<=prog && prog<=30 || 35<=prog && prog<=40 || 45<=prog && prog<=50 || 55<=prog &&
                prog<=60 || 65<=prog && prog<=70 || 75<=prog && prog<=80 || 85<=prog && prog<=90 || 95<=prog && prog<=100){
            System.out.println(prog+" Программистов");
        }

    }
}

