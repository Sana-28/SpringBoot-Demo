package com.springBootJpa.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  

public interface UserRepository extends CrudRepository<UserData, String>{

}
