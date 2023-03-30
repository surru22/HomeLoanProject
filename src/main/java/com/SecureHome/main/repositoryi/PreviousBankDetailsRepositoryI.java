package com.SecureHome.main.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.PreviousBankDetails;
@Repository
public interface PreviousBankDetailsRepositoryI extends JpaRepository<PreviousBankDetails, Integer>{

}
