package r.com.allan.AulaSpringJPA.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import r.com.allan.AulaSpringJPA.modelo.Aluno;
import r.com.allan.AulaSpringJPA.modelo.AvaliacaoFisica;
import r.com.allan.AulaSpringJPA.modelo.form.AlunoForm;
import r.com.allan.AulaSpringJPA.modelo.form.AlunoUpdateForm;
import r.com.allan.AulaSpringJPA.repository.AlunoRepository;
import r.com.allan.AulaSpringJPA.service.IAlunoService;

@Service
public class AlunoServiceImp implements IAlunoService {
	@Autowired
	private AlunoRepository repository;
	
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataNascimento());
		return repository.save(aluno);
	}
	
	
	@Override
	public Aluno get(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Aluno> getAll() {
		 return repository.findAll();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		Aluno aluno = repository.getById(id);
		aluno.setNome(formUpdate.getNome());
		aluno.setDataDeNascimento(formUpdate.getDataNascimento());
		aluno.setBairro(formUpdate.getBairro());
		return repository.save(aluno);
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = repository.getById(id);
		return aluno.getAvaliacoes();				
	}


	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		return;
		
	}

}
