package r.com.allan.AulaSpringJPA.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import r.com.allan.AulaSpringJPA.modelo.Aluno;
import r.com.allan.AulaSpringJPA.modelo.AvaliacaoFisica;
import r.com.allan.AulaSpringJPA.modelo.form.AvaliacaoFisicaForm;
import r.com.allan.AulaSpringJPA.modelo.form.AvaliacaoFisicaUpdateForm;
import r.com.allan.AulaSpringJPA.repository.AlunoRepository;
import r.com.allan.AulaSpringJPA.repository.AvaliacaoFisicaRepository;
import r.com.allan.AulaSpringJPA.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{
	@Autowired
	private AvaliacaoFisicaRepository repository;
	@Autowired
	private AlunoRepository alunoRepository;
	

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.getById(form.getAlunoId());
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(form.getPeso());
		avaliacaoFisica.setAltura(form.getAltura());
		return repository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return repository.findAll();
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		avaliacaoFisica.setPeso(formUpdate.getPeso());
		avaliacaoFisica.setAltura(formUpdate.getAltura());
		return repository.save(avaliacaoFisica);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		return;
		
	}

}
