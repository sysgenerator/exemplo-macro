package br.com.phabryqqa.exemplomacro;

import lombok.*;

import java.time.LocalDate;

//@AllArgsConstructor - ter um construtor com todos os parâmetros
//@NoArgsConstructor - ter um construtor sem os parâmetros
//@RequiredArgsConstructor - obrigar ao constructor olhar os campos obrigatórios os notnull abaixo
@RequiredArgsConstructor
@Getter
@Setter
public class UserModel
{
    //@Setter - somente para o atributo nome
    //@NonNull - não aceitar campo vazio, nulo
    @NonNull
    private String nome;
    private String phone;
    private LocalDate birthDate;

}
