package com.RangManchMaithili.RangmanchMaithili.service;

import com.RangManchMaithili.RangmanchMaithili.dto.SingerDto;
import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import com.RangManchMaithili.RangmanchMaithili.repository.SingerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SingerService {
    @Autowired
    private final SingerRepo singerRepo;

    public SingerService(SingerRepo singerRepo) {
        this.singerRepo = singerRepo;
    }

    public String addSinger(Singer singer) {
        singerRepo.save(singer);
        return null;
    }

    public List<Singer> getAllSinger() {
        return singerRepo.findAll();
    }

    public Optional<Singer> getBySingerId(Long singerId) {
        return singerRepo.findById(singerId);
    }

    public String updateById(Long updatebyid, SingerDto singerDto) {
         singerRepo.findById(updatebyid);
        Singer s=new Singer();
        s.setSingerName(singerDto.getSingerName());
        s.setEmailId(singerDto.getEmailId());
        s.setMobileNo(singerDto.getMobileNo());
        s.setAge(singerDto.getAge());
        singerRepo.save(s);
        return "updated";
    }

    public String partialUpdateById(Long updatebyid, SingerDto singerDto) {
        singerRepo.findById(updatebyid);
        Singer s1=new Singer();
        s1.setSingerName(singerDto.getSingerName());
       /* s.setEmailId(singerDto.getEmailId());
        s.setMobileNo(singerDto.getMobileNo());
        s.setAge(singerDto.getAge());*/
        singerRepo.save(s1);
        return "updated";
    }

    public String deleteById(Long singerId) {
        Optional<Singer> s2=singerRepo.findById(singerId);
        if(s2!=null) {
          singerRepo.deleteById(singerId);
            return "deleted";
        }
        return "singer id is not exist";
    }

    public void deleteAll() {
        singerRepo.deleteAll();
    }
}
