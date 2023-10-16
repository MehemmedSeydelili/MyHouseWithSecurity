package com.example.MyHouseWithSecurity.mapper;

import com.example.MyHouseWithSecurity.model.dto.HomeDto;
import com.example.MyHouseWithSecurity.model.entity.Home;
import com.example.MyHouseWithSecurity.model.view.HomeView;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MyMapper {

    MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

    Home mapDtoToEntity(HomeDto homeDto);
    HomeView mapEntityToView(Home home);

}
