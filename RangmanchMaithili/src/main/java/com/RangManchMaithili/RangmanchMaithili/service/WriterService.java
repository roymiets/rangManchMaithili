package com.RangManchMaithili.RangmanchMaithili.service;

import com.RangManchMaithili.RangmanchMaithili.dto.WriterDto;
import com.RangManchMaithili.RangmanchMaithili.entities.Writer;
import com.RangManchMaithili.RangmanchMaithili.repository.WriterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WriterService {
    @Autowired
    private final WriterRepo writerRepo;

    public WriterService(WriterRepo writerRepo) {
        this.writerRepo = writerRepo;
    }

    public String addWriter(Writer writer) {
     writerRepo.save(writer);
        return null;
    }

    public List<Writer> getAllSinger() {
        return writerRepo.findAll();
    }

    public Optional<Writer> getByWriterId(Long writerId) {
        return writerRepo.findById(writerId);
    }

    public String updateById(Long writerId, WriterDto writerDto) {
       writerRepo.findById(writerId);
       Writer w=new Writer();
       w.setWriterName(writerDto.getWriterName());
       w.setMobileNo(writerDto.getMobileNo());
       w.setEmailId(writerDto.getEmailId());
       w.setAge(writerDto.getAge());
       writerRepo.save(w);
        return "updated";
    }

    public String partialUpdateById(Long writerId, WriterDto writerDto) {
        writerRepo.findById(writerId);
        Writer w1=new Writer();
        w1.setWriterName(writerDto.getWriterName());
       /* s.setEmailId(singerDto.getEmailId());
        s.setMobileNo(singerDto.getMobileNo());
        s.setAge(singerDto.getAge());*/
        writerRepo.save(w1);
        return "updated";
    }

    public String deleteById(Long writerId) {
        Optional<Writer> w2=writerRepo.findById(writerId);
        if(w2!=null) {
            writerRepo.deleteById(writerId);
            return "deleted";
        }
       return "writer id is not exist";
    }

    public void deleteAll() {
      writerRepo.deleteAll();
    }
}
