package com.SecureHome.main.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.DocumentRequired;

@Repository
public interface DocumentRequiredRepositoryI extends JpaRepository<DocumentRequired, Integer>{

}
