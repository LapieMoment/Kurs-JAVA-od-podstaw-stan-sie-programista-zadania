import zadanie1.Math;
import zadanie1.Matma;
import zadanie1.Programista;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //zadanie 1

//    Programista programistaLuki = new Programista("Łukasz", "Głos", "Poland",1000);
//        System.out.println(programistaLuki.getName());
//        System.out.println(programistaLuki.getSecondName());
//        System.out.println(programistaLuki.getLanguage());
//        System.out.println(programistaLuki.getSalary());

        //zadanie 2

//        int[] data = IntStream.range(0,100).toArray();
//        Math table = new Math(data);
//        System.out.println(table.sumElements());
//        System.out.println(table.averageFromElements());
//        System.out.println(table.minValueFromElements());
//        System.out.println(table.maxValueFromElements());

        //zadanie 3

        System.out.println(Matma.AreaeOfWheel(20));
        System.out.println(Matma.circumferenceOfWheel(20));
        System.out.println(Matma.circumferenceOfRectangle(20,20));
        System.out.println(Matma.AreaeOfRectangle(20,20));



    }

}
