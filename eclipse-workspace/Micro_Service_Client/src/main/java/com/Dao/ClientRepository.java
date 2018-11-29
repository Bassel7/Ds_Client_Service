package com.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Entity.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

	List<Client> FindByDateNaissance(Date date);

}
