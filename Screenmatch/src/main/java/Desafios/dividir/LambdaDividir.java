package Desafios.dividir;

public class LambdaDividir {
    public static void main(String[] args) {
        Dividir divisor = (a,b) -> {
            if (b == 0) {
                throw new ArithmeticException("'Não é assim animal'");
            }
            return a/b;
        };

        try{
            System.out.println(divisor.dividir(6,3));
        } catch (ArithmeticException e) {
            System.out.println("burro: "+ e.getMessage());
        }
    }
    }
