package com.example.MyHouseWithSecurity.controller;

import com.example.MyHouseWithSecurity.model.dto.HomeDto;
import com.example.MyHouseWithSecurity.model.view.HomeView;
import com.example.MyHouseWithSecurity.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<HomeView> getHomeById(@PathVariable Long id) {
        return new ResponseEntity(homeService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<HomeView> createEmploye(@RequestBody HomeDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(homeService
                .create(dto));
    }

    @GetMapping("/main")
    public ResponseEntity<String> homePage(){
        return ResponseEntity.status(HttpStatus.OK).body(homeService.homePage());
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        return ResponseEntity.status(HttpStatus.OK).body(homeService.admin());
    }

    @GetMapping("/forauth")
    public ResponseEntity<String> forauth(){
        return ResponseEntity.status(HttpStatus.OK).body("This area for authenticated users");
    }
    /*@GetMapping("/all")
    public ResponseEntity<HomeView> getAll(){
        return (ResponseEntity<HomeView>) ResponseEntity.status(HttpStatus.OK).body(homeService.findAll());
    }*/

}

