package r.com.allan.AulaSpringJPA.modelo.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AvaliacaoFisicaForm {
	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Positive(message="O id do aluno precisa ser positivo")
	Long alunoId;
	
	@NotNull(message="Preencha o campo corretamente")
	@Positive(message="O valor precisa ser positivo")
	private double peso;
	
	@NotNull(message= "Preencha o campo corretamente")
	@Positive(message="O valor precisa ser positivo")
	private double altura;	
	

}
