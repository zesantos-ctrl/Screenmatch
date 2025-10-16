package br.com.alura.Screenmatch.principal;

import br.com.alura.Screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
private  ConsumoApi consumo = new ConsumoApi();


    private Scanner leitura = new Scanner(System.in);

    // A palavra-chave 'final' indica que o valor desta variável não pode ser alterado após a inicialização.
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY =  "&apikey=dc83c06";


    public void exibeMenu(){
        System.out.println("Digite o nome da série para a busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados( ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        // "https://www.omdbapi.com/?t=dexter&apikey=dc83c06"
    }
}
