package Desafios.ordem;

import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> ordem = Arrays.asList("jose", "lucas", "ana");
        ordem.sort((a,b)->a.compareTo(b));
        System.out.println(ordem);
    }
}
