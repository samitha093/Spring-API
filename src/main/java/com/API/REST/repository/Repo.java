package com.API.REST.repository;

import com.API.REST.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface Repo extends JpaRepository<Users, Integer> {}
