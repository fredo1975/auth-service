package fr.bluechipit.auth.service.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.bluechipit.auth.service.model.object.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.userName = ?1")
    Optional<User> findUserWithName(String username);
	@Query("select u from User u where u.userName = ?1")
	Boolean existsByUsername(String username);
}
