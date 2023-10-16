package com.example.MyHouseWithSecurity.repository;

import com.example.MyHouseWithSecurity.model.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
}
