import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObj = new ArrayList<Object>();

        copy(myInts,myObj);
        printlist(myObj);
        copy(myDoubles,myObj);
        printlist(myObj);
    }
    public static void copy(List<? extends Number> origem, List<? super Number> destino){
        for(Number number : origem){
            destino.add(number);
        }
    }
    public static void printlist(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}