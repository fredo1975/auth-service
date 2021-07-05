package fr.bluechipit.auth.service.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.bluechipit.auth.service.model.object.User;

public interface CredentialsRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.userName = ?1")
    Optional<User> findUserWithName(String username);
}
