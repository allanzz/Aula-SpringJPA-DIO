package r.com.allan.AulaSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import r.com.allan.AulaSpringJPA.modelo.Aluno;
import r.com.allan.AulaSpringJPA.modelo.Matricula;
import r.com.allan.AulaSpringJPA.modelo.form.MatriculaForm;
import r.com.allan.AulaSpringJPA.repository.AlunoRepository;
import r.com.allan.AulaSpringJPA.repository.MatriculaRepository;

@Service
public class MatriculaService implements IMatriculaService {
	@Autowired
	MatriculaRepository repository;
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.getById(form.getAlunoId());
		matricula.setAluno(aluno);
		return repository.save(matricula);
		
	}

	@Override
	public Matricula get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		return repository.findAll();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
