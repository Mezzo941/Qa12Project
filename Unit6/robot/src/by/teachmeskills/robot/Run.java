package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robotBySony = new Robot(new SonyHead (5),new SonyHand(2),new SonyLeg(3));
        Robot robotBySamsung = new Robot(new SamsungHead(7),new SamsungHand(4),new SamsungLeg(5));
        Robot robotByToshiba = new Robot(new ToshibaHead(10),new ToshibaHand(5),new ToshibaLeg(6));

        robotBySamsung.getLeg().step();
        robotBySony.getHand().upHand();
        robotBySamsung.setHead(robotBySony.getHead());
        System.out.println(robotBySamsung.getHead().getPrice());

        System.out.println(robotBySony.getPrice());
        System.out.println(robotBySamsung.getPrice());
        System.out.println(robotByToshiba.getPrice());




    }
}
