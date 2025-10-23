package Desafios.lista;

import java.util.Arrays;
import java.util.List;

public class ListInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numeros.replaceAll(n -> n *9);
        System.out.println(numeros);
    }
}
