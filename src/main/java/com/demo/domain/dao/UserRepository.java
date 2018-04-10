package com.demo.domain.dao;

import com.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alex
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);
}
