package br.com.DesafioSpring.Desafio01;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	   public void run(String... args) throws Exception {

		//serialização
//		//Cria um objeto tarefa
//		Tarefas tarefa = new Tarefas("Indo ali", false, "Zé");
//
//		//Cria o ObjectMapper (responsável por converter o objeto em JSON)
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		objectMapper.writeValue(new File("terefa.json"), tarefa);
//		System.out.println("Dados salvos no arquivo terefa.json!");


		//desserialização
		ObjectMapper objectMapper = new ObjectMapper();
		Tarefas tarefa = objectMapper.readValue(new File("tarefa.json"), Tarefas.class);
		System.out.println("Tarefa lida: ");
		System.out.println(tarefa);
	}




}