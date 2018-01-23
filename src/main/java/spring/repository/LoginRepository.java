package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.models.Cliente;

@Repository
public interface LoginRepository extends JpaRepository<Cliente,Integer>{

	Cliente findByLoginAndSenha(String login,String senha);
	
}
