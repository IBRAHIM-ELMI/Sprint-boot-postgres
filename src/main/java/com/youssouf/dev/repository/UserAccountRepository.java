package com.youssouf.dev.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.youssouf.dev.entity.UserAccount;


public interface UserAccountRepository extends CrudRepository <UserAccount, Long>  {

//	List<UserAccount> findByName(String user_name);

	 

	// public List<UserAccount> findByUsername( String user_name);
	 

	//	public List<UserAccount> findAllUser();
//	public List<UserAccount> findByName(String userName);
//	public List<UserAccount> findByUsernameAndPassword(String userName, String password);
	
}











	


