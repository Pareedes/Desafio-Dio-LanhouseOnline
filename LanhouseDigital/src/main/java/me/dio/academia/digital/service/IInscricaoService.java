package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Inscricao;
import me.dio.academia.digital.entity.form.InscricaoForm;

import java.util.List;

public interface IInscricaoService {

  Inscricao create(InscricaoForm form);
  
  Inscricao get(Long idCliente);

  List<Inscricao> getAll();

  void delete(Long idCliente);

}
