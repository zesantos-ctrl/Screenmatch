package br.com.alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title") String tittlo,
                             @JsonAlias("Episodio") Integer numero,
                             @JsonAlias("ImdbRating") String avaliacao,
                             @JsonAlias("Released") String dataLancemento) {
}
