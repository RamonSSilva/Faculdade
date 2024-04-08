package com.erp.user.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.user.system.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
