package Desafios.primos;

public class LambdaPrimo {
    public static void main(String[] args) {
        Primo numPrimo = number -> {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0)  return false;
            }
            return  true;
        };
        System.out.println(numPrimo.primos(80));
        System.out.println(numPrimo.primos(2));
    }
}
