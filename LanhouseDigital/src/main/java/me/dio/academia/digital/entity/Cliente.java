package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

  private Long id;

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  private List<Computador> utilizacoes = new ArrayList<>();

}
