package com.RangManchMaithili.RangmanchMaithili.repository;

import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepo extends JpaRepository<Singer,Long> {
}
