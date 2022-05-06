package r.com.allan.AulaSpringJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import r.com.allan.AulaSpringJPA.modelo.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
	
		  @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
		  List<Matricula> findAlunosMatriculadosBairro(String bairro);

}
