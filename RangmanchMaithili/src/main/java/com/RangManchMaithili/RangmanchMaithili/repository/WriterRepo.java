package com.RangManchMaithili.RangmanchMaithili.repository;

import com.RangManchMaithili.RangmanchMaithili.entities.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepo extends JpaRepository<Writer,Long> {
}
