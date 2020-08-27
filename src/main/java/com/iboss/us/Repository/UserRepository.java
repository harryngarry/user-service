package com.iboss.us.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboss.us.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserId(int userId);
}
