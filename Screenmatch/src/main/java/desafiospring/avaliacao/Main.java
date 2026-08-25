import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Produtos
        Produto produto1 = new Produto("Notebook");
        Produto produto2 = new Produto("Samsung s25");
        Produto produto3 = new Produto("Iphone 18");

        //Criando avaliações para os produtos
        Avaliacao<Produto> avaliacao1 = new Avaliacao<>(produto1,9.8,"Otimo aparelho! Tem bastante desempenho ");
        Avaliacao<Produto> avaliacao2 = new Avaliacao<>(produto2,10.0,"Otimo aparelho! Tem bastante desempenho ");
        Avaliacao<Produto> avaliacao3 = new Avaliacao<>(produto3,8.9,"Otimo aparelho! Tem bastante desempenho ");

        //Colocando as avaliações em uma lista
        List<Avaliacao<Produto>> lista = new ArrayList<>();
        lista.add(avaliacao1);
        lista.add(avaliacao2);
        lista.add(avaliacao3);

        //Calculando média das notas
        double media = Avaliacao.calcularMediaNotas(lista);

        //Exibindo tudo no console (sout)
        System.out.println("Avaliações: ");
        for (Avaliacao<Produto> sim : lista) {
            System.out.println("- Produto: " + sim.getItem().getNome());
            System.out.println(" Nota: " + sim.getNota());
            System.out.println(" Comentário: " + sim.getComentario());
            System.out.println();
        }

        System.out.println(" Média geral das avaliações: " + media);
    }
}
