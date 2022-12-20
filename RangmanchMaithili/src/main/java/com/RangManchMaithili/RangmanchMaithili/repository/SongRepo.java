package com.RangManchMaithili.RangmanchMaithili.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<com.RangManchMaithili.RangmanchMaithili.entities.Song,Long> {
}
