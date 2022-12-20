package com.RangManchMaithili.RangmanchMaithili.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<com.RangManchMaithili.RangmanchMaithili.entities.Album,Long> {
}
