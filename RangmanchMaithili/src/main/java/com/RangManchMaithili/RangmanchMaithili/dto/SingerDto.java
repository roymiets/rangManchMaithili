package com.RangManchMaithili.RangmanchMaithili.dto;

import com.RangManchMaithili.RangmanchMaithili.entities.Album;
import com.RangManchMaithili.RangmanchMaithili.entities.Song;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SingerDto {
    private Long id;
    private String singerName;
    private Long mobileNo;
    private String emailId;
    private Integer age;
    private String gender;
    private List<Song> songs;
    private List<Album> albums;

}
