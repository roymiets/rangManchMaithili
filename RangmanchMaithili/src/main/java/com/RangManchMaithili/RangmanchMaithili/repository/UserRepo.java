package com.RangManchMaithili.RangmanchMaithili.repository;

import com.RangManchMaithili.RangmanchMaithili.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
