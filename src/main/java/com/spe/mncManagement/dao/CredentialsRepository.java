package com.spe.mncManagement.dao;

import com.spe.mncManagement.bean.Credentials;
import org.springframework.data.repository.CrudRepository;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {
}
