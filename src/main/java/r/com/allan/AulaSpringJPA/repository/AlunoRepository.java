package r.com.allan.AulaSpringJPA.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import r.com.allan.AulaSpringJPA.modelo.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
}
