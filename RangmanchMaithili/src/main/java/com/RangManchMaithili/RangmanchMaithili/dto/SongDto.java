package com.RangManchMaithili.RangmanchMaithili.dto;

import com.RangManchMaithili.RangmanchMaithili.entities.Album;
import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SongDto {
    private Long id;
    private String title;
    private String tagline;
    private String songCategory;
    private float duration;
    private Singer singer;
    private Album album;
}
