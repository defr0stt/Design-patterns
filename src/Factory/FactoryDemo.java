package Factory;

import java.util.Scanner;

public class FactoryDemo
{
    public static void main(String[] args) {

        System.out.println("\n    Choose way :\n" +
                "      1 - By road\n" +
                "      2 - By sea\n");
        System.out.print(" -> ");
        Scanner scanner = new Scanner(System.in);
        int way = scanner.nextInt();

        Factory factory;
        FactoryInterface temp = null;
        System.out.println("------------------------" +
                "\n    Choose vehicle :\n");
        if (way == 1) {
            factory = new Road();
            System.out.println(
                    "      1 - By car\n" +
                            "      2 - By bike\n");
            System.out.print(" -> ");
            way = scanner.nextInt();
            switch (way) {
                case 1: temp = new ByShip(); break;
                case 2: temp = new ByBoat(); break;
            }
        } else {
            factory = new Sea();
            System.out.println(
                    "      1 - By ship\n" +
                            "      2 - By boat\n");
            System.out.print(" -> ");
            way = scanner.nextInt();
            switch (way) {
                case 1: temp = new ByShip(); break;
                case 2: temp = new ByBoat(); break;
            }
            System.out.println("So u choose : " + factory.delivering(temp));
        }
    }
}