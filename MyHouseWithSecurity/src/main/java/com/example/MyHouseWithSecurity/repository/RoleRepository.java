package com.example.MyHouseWithSecurity.repository;

import com.example.MyHouseWithSecurity.model.authmodel.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
