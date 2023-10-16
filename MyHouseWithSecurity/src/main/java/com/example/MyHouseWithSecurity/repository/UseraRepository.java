package com.example.MyHouseWithSecurity.repository;

import com.example.MyHouseWithSecurity.model.authmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UseraRepository extends JpaRepository<User, Long> {

    User findByName(String userName);

}
