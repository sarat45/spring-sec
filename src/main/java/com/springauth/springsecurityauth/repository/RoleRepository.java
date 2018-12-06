package com.springauth.springsecurityauth.repository;
import com.springauth.springsecurityauth.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RoleRepository extends MongoRepository<Role, String> {
	  Role findByRole(String role);
}
