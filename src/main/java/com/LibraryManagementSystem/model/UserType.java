package com.LibraryManagementSystem.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation="usertype")
@TypeAlias("usertype")
public class UserType {

	@Id
	private BigInteger id;
	private String userType;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
