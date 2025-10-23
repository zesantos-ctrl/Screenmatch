package Desafios;

public class OutroPrimo {
    public static void main(String[] args) {
      LambdaOutro numPrimo = number -> {
          if (number <= 1) {
              return false;
          }
          for (int i = 2; i < number; i++) {
              if (number % i == 0) return false;
          }
          return true;
      };

        System.out.println(numPrimo.primo(90));
        System.out.println(numPrimo.primo(5));
    }
}
