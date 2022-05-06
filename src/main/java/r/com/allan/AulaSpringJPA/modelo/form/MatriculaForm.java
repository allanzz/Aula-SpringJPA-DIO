package r.com.allan.AulaSpringJPA.modelo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MatriculaForm {
	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	@NotNull(message="O campo não pode ser vazio")
	@Positive(message="O campo precisa ser positivo")
	private Long alunoId;
}
