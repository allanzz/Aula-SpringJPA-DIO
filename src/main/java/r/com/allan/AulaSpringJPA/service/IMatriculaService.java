package r.com.allan.AulaSpringJPA.service;

import java.util.List;

import r.com.allan.AulaSpringJPA.modelo.Aluno;
import r.com.allan.AulaSpringJPA.modelo.AvaliacaoFisica;
import r.com.allan.AulaSpringJPA.modelo.Matricula;
import r.com.allan.AulaSpringJPA.modelo.form.AlunoUpdateForm;
import r.com.allan.AulaSpringJPA.modelo.form.MatriculaForm;

public interface IMatriculaService {
	Matricula create(MatriculaForm form);
	Matricula get(Long id);
	List<Matricula> getAll(String bairro);
	void delete(Long id);
}
