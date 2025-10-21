package Desafios.palídromo;

public class LambdaPali {
    public static void main(String[] args) {
        Palindromo Epalindromo = str -> {
            String reverso = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reverso);
        };
        System.out.println(Epalindromo.verificar("ovo"));
        System.out.println(Epalindromo.verificar("carro"));
    }
}
