package dev.sahan.userverification.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.sahan.userverification.models.ERole;
import dev.sahan.userverification.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
