package com.spring.apicarro.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User_, Long> {

	User_ findByLogin(String login);
}