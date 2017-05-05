package hello;

import org.springframework.web.bind.annotation.RestController;



import hello.pojo.Contract;
import hello.repository.ContractRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    @Autowired
    ContractRepository mContractRepository;
    
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping(value="/find/{id}",method=RequestMethod.GET)
    
    public Contract find(@PathVariable("id") String id) {   
    	
        return mContractRepository.findOne(Integer.valueOf(id)); 
    }
    
 @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    
    public String delete(@PathVariable("id") String id) {   
    	
         mContractRepository.delete(Integer.valueOf(id));
         return "Deleted";
    }
    
@RequestMapping(value="/add",method=RequestMethod.POST,produces = "application/json", consumes = "application/json")
    
    public Contract addContract(@RequestBody Contract cc) { 
		System.out.println(cc.toString());
    
        return mContractRepository.save(cc);
    }

@RequestMapping(value="/all",method=RequestMethod.GET)
	public Iterable<Contract> getAll() { 
	
    	return mContractRepository.findAll();
	}

@RequestMapping(value="/update",method=RequestMethod.PUT,produces = "application/json", consumes = "application/json")
public Contract update(@RequestBody Contract cc) { 

	return mContractRepository.save(cc);
}


    
}
