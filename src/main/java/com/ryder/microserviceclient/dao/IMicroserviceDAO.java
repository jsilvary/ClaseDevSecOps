package com.ryder.microserviceclient.dao;

import org.springframework.data.repository.CrudRepository;

import com.ryder.microserviceclient.entities.Client;


public interface IMicroserviceDAO extends CrudRepository<Client, Long>{

}