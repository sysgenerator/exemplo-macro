package br.com.phabryqqa.exemplomacro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploMacroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploMacroApplication.class, args);

		var userModel = new UserModel("");
		//userModel.setNome("Cristiano");

		// funcionou por causa da anotação @Getter do Lombok
		String nome = userModel.getNome();

		System.out.println("Nome: " + nome);

	}

}
