package com.example.MyHouseWithSecurity.service;

import com.example.MyHouseWithSecurity.mapper.MyMapper;
import com.example.MyHouseWithSecurity.model.dto.HomeDto;
import com.example.MyHouseWithSecurity.model.entity.Home;
import com.example.MyHouseWithSecurity.model.view.HomeView;
import com.example.MyHouseWithSecurity.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;

   /* public List<HomeView> findAll() {
        return (List<HomeView>) MyMapper.INSTANCE.mapEntityToView(
                (Home) homeRepository.findAll());
    }*/

    public HomeView getById(Long id) {
        return MyMapper.INSTANCE.mapEntityToView(
                homeRepository.findById(id).orElseThrow(() ->
                        new RuntimeException("Student not found this Id")));
    }

    public HomeView create(HomeDto dto) {
        Home home = MyMapper.INSTANCE.mapDtoToEntity(dto);
        home.setCreatedAt(LocalDateTime.now());
        home.setIsActive(true);
        home.setIsDeleted(false);
        homeRepository.save(home);
        return MyMapper.INSTANCE.mapEntityToView(home);
    }

    public String homePage() {
        return "Wellcome home page";
    }

    public String admin() {
        return "Message for admin";
    }
}
