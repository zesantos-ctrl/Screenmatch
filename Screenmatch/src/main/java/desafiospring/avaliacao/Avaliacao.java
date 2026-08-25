import java.util.List;

public class Avaliacao<T> {
    private T item;           // O objeto avaliado (Produto, Serviço etc.)
    private double nota;      // Nota da avaliação
    private String comentario; // Comentário do avaliador

    // 🔹 Construtor corrigido: recebe o item, a nota e o comentário
    public Avaliacao(T item, double nota, String comentario) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
        }
        this.item = item;     // ✅ Agora o item é inicializado
        this.nota = nota;
        this.comentario = comentario;
    }

    // 🔹 Getters e setters
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
        }
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    // 🔹 Método estático para calcular a média das notas
    public static <T> double calcularMediaNotas(List<Avaliacao<T>> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A lista de avaliações está vazia.");
        }
        double soma = 0;
        for (Avaliacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.getNota();
        }
        return soma / avaliacoes.size();
    }
}