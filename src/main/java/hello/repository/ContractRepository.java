package hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import hello.pojo.Contract;

public interface ContractRepository extends CrudRepository<Contract,Integer>{
	
		
}
