package r.com.allan.AulaSpringJPA.service;

import java.util.List;

import r.com.allan.AulaSpringJPA.modelo.Aluno;
import r.com.allan.AulaSpringJPA.modelo.AvaliacaoFisica;
import r.com.allan.AulaSpringJPA.modelo.form.AlunoForm;
import r.com.allan.AulaSpringJPA.modelo.form.AlunoUpdateForm;

public interface IAlunoService {
	Aluno create(AlunoForm form);
	Aluno get(Long id);
	List<Aluno> getAll();
	Aluno update(Long id, AlunoUpdateForm formUpdate);
	void delete(Long id);
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
