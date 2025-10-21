package Desafios.Canverter;

public class LambdaString {
    public static void main(String[] args) {
        Conversor paraMaiuscula = String::toUpperCase;

        String resultado = paraMaiuscula.transformar("aquele que tem um porquê para viver pode suportar quase qualquer como. ~ Lula 2025");
        System.out.println(resultado);
    }
}
