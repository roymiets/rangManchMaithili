package com.RangManchMaithili.RangmanchMaithili.dto;

import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import com.RangManchMaithili.RangmanchMaithili.entities.Song;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AlbumDto {
    private Long id;
    private String albumName;
    private Singer singerName;
    private String genre;
    private List<Song> songs;
}
