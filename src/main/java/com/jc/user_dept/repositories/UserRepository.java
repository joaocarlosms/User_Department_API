package com.jc.user_dept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jc.user_dept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
