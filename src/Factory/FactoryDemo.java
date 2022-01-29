package Factory;

import java.util.Scanner;

public class FactoryDemo
{
    public static void main(String[] args) {

        System.out.println("\n    Choose your way :\n" +
                "      1 - By car\n" +
                "      2 - By ship\n");
        System.out.print(" -> ");

        Scanner scanner = new Scanner(System.in);
        int way = scanner.nextInt();

        Factory factory;
        if(way == 1){
            factory = new Road();
        } else {
            factory = new Sea();
        }
        System.out.println("So u choose : " + factory.delivering());
    }
}