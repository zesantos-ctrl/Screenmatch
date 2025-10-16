package br.com.alura.Screenmatch;

import br.com.alura.Screenmatch.model.DadosEpisodios;
import br.com.alura.Screenmatch.model.DadosSerie;
import br.com.alura.Screenmatch.model.DadosTemporadas;
import br.com.alura.Screenmatch.service.ConsumoApi;
import br.com.alura.Screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=dexter&apikey=dc83c06"); // API sobre a serie
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

        //Dados episodios
        json = consumoApi.obterDados("https://www.omdbapi.com/?t=dexter&season=1&episode=2&apikey=dc83c06"); // API sobre o episodio da serie
        DadosEpisodios dadosEpisodios = conversor.obterDados(json, DadosEpisodios.class);
        System.out.println(dadosEpisodios);

        //Modelando temporadas
        List<DadosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) { //For percorre todas as temporadas
            json = consumoApi.obterDados("https://www.omdbapi.com/?t=dexter&season=" + i + "&apikey=dc83c06");
            DadosTemporadas dadosTemporada = conversor.obterDados(json, DadosTemporadas.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
	}
}
