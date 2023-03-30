package com.SecureHome.main.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.Ledger;
@Repository
public interface LedgerRepositoryI extends JpaRepository<Ledger, Integer>{

}
