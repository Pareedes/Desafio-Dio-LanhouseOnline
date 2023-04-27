package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

public class Computador {

  private Long idComputador;

  private Cliente cliente;

  private LocalDateTime dataDaUtilizacao = LocalDateTime.now();

  private String marca;

  private Long idCliente;

}
