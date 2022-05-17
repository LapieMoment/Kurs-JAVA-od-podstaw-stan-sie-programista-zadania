package zadanie1;

public class Math {

    private int[] arrayOfElements;

    public Math(int[] Array){
        this.arrayOfElements = Array;
    }

    public int sumElements(){
        int result = 0;
        for (int i = 0; i < arrayOfElements.length; i++) {
            result = arrayOfElements[i] + result;
        }
        return result;
    }

}
