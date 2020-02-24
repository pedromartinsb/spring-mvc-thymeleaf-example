package com.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.boot.dao.DepartamentoDao;
import com.curso.boot.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	@Transactional(readOnly = false)
	public void salvar(Departamento departamento) {
		departamentoDao.save(departamento);
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Departamento departamento) {
		departamentoDao.update(departamento);
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		departamentoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		return departamentoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return departamentoDao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if (buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
