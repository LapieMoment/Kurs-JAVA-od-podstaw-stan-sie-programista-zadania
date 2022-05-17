import zadanie1.Math;
import zadanie1.Programista;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//    Programista programistaLuki = new Programista("Łukasz", "Głos", "Poland",1000);
//        System.out.println(programistaLuki.getName());
//        System.out.println(programistaLuki.getSecondName());
//        System.out.println(programistaLuki.getLanguage());
//        System.out.println(programistaLuki.getSalary());

        int[] data = IntStream.range(0,100).toArray();
        Math table = new Math(data);
        System.out.println(table.sumElements());
    }

}
