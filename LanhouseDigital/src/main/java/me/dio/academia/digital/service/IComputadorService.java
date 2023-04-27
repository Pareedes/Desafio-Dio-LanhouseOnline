package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Computador;
import me.dio.academia.digital.entity.form.ComputadorForm;
import me.dio.academia.digital.entity.form.ComputadorUpdateForm;

import java.util.List;

public interface IComputadorService {
  Computador create(ComputadorForm form);

  Computador get(Long idComputador);

  List<Computador> getAll();
  
  Computador update(Long idComputador, ComputadorUpdateForm formUpdate);

  void delete(Long idComputador);
}
