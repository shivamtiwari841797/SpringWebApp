package com.company.springwebapp.lab12;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<Account, Integer> {

}
