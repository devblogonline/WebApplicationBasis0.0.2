package com.webApplicationBasis.User.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.webApplicationBasis.User.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}