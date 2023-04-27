package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Cliente;
import me.dio.academia.digital.entity.form.ClienteForm;
import me.dio.academia.digital.entity.form.ClienteUpdateForm;

import java.util.List;

public interface IClienteService {
  Cliente create(ClienteForm form);
  
  Cliente get(Long idCliente);

  List<Cliente> getAll();

  Cliente update(Long idCliente, ClienteUpdateForm formUpdate);
  
  void delete(Long idCliente);
}
