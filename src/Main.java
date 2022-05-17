import zadanie1.Programista;

public class Main {

    public static void main(String[] args) {
    Programista programistaLuki = new Programista("Łukasz", "Głos", "Poland",1000);
        System.out.println(programistaLuki.getName());
        System.out.println(programistaLuki.getSecondName());
        System.out.println(programistaLuki.getLanguage());
        System.out.println(programistaLuki.getSalary());
    }

}
