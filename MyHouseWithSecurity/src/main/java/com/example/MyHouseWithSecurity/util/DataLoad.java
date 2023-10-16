package com.example.MyHouseWithSecurity.util;

import com.example.MyHouseWithSecurity.model.authmodel.Role;
import com.example.MyHouseWithSecurity.model.authmodel.User;
import com.example.MyHouseWithSecurity.repository.RoleRepository;
import com.example.MyHouseWithSecurity.repository.UseraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.management.relation.RoleUnresolved;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoad implements ApplicationRunner {

    @Autowired
    private UseraRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Role roleAdmin = Role.builder().roleName("ROLE_ADMIN").build();
        Role roleUser = Role.builder().roleName("ROLE_USER").build();

        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);

        List<Role> adminRoleList= new ArrayList<>();
        adminRoleList.add(roleAdmin);

        User admin= User.builder().name("Mahammad").password("1234")
                        .roles(adminRoleList).build();
        userRepository.save(admin);


        List<Role> userRoleList=new ArrayList<>();
        userRoleList.add(roleUser);

        User user= User.builder().name("Ceyhun").password("1234")
                        .roles(userRoleList).build();
        userRepository.save(user);

        System.out.println("-----ROLES-----");
        roleRepository.findAll().forEach(System.out::println);

        System.out.println("----USERS-----");
        userRepository.findAll().forEach(System.out::println);

    }
}
