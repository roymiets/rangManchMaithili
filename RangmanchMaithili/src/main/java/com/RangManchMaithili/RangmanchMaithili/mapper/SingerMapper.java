package com.RangManchMaithili.RangmanchMaithili.mapper;

import com.RangManchMaithili.RangmanchMaithili.dto.SingerDto;
import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SingerMapper {
    SingerMapper SINGER_MAPPER= Mappers.getMapper(SingerMapper.class);
    Singer dtoToEntity(SingerDto singerDto);
    SingerDto entityToDto(Singer singer);

}
