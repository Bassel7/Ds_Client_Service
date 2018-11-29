package com.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Dao.ClientRepository;
import com.Entity.Client;

@RestController
public class ServiceClient {

	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping(value ="/save", method = RequestMethod.POST )
	public Client saveClient(Client c) {	
		clientRepository.save(c);
		return c ;
}
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	  public List <Client> ListerClients(){			
		return clientRepository.findAll();
		
	}
	@RequestMapping(value ="/delete", method = RequestMethod.DELETE)
    public boolean delete(String id) {
		clientRepository.deleteById(id);
		return true;
	
}	
	@RequestMapping(value ="/update", method = RequestMethod.GET)
	public Client update (Client p){
		clientRepository.save(p);
      return p;
}

	@RequestMapping(value ="/getoneClient", method = RequestMethod.GET)
	public Optional<Client> getoneClientt(String id) {
		return clientRepository.findById(id);	
	}
	
	@RequestMapping(value ="/findbyDate", method = RequestMethod.GET)
	public List<Client> FindByDateNaissance(Date date) {
		return clientRepository.FindByDateNaissance(date);	
	}
}
