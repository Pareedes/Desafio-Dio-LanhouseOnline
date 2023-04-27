package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

public class Inscricao {

  private Long idCliente;

  private Cliente cliente;

  private LocalDateTime dataDaUtilizacao = LocalDateTime.now();
}
