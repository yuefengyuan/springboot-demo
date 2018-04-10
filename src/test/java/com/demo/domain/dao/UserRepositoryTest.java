package com.demo.domain.dao;

import com.demo.Application;
import com.demo.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Alex
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindByUserName() throws Exception {
		userRepository.save(new User("alex","123456","abc@163.com","kak"));

		userRepository.delete(userRepository.findByUserName("alex"));
	}

}
