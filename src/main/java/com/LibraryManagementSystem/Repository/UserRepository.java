package com.LibraryManagementSystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.LibraryManagementSystem.model.UserBean;

@Repository
public interface UserRepository extends MongoRepository<UserBean, Integer>   {

	
}
