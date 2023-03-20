package com.vantung.crudwithspringboot.repository;

import com.vantung.crudwithspringboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public Long countById(Integer id);
}
