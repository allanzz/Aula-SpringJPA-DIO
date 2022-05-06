package r.com.allan.AulaSpringJPA.service;

import java.util.List;

import r.com.allan.AulaSpringJPA.modelo.AvaliacaoFisica;
import r.com.allan.AulaSpringJPA.modelo.form.AvaliacaoFisicaForm;
import r.com.allan.AulaSpringJPA.modelo.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	AvaliacaoFisica get(Long id);
	List<AvaliacaoFisica> getAll();
	AvaliacaoFisica update(Long id,AvaliacaoFisicaUpdateForm formUpdate);
	void delete(Long id);

}
