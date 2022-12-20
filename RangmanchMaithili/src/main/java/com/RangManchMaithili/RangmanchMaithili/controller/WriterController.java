package com.RangManchMaithili.RangmanchMaithili.controller;

import com.RangManchMaithili.RangmanchMaithili.dto.CommonResponse;
import com.RangManchMaithili.RangmanchMaithili.dto.SingerDto;
import com.RangManchMaithili.RangmanchMaithili.dto.WriterDto;
import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import com.RangManchMaithili.RangmanchMaithili.entities.Writer;
import com.RangManchMaithili.RangmanchMaithili.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/writer")
public class WriterController {
    @Autowired
    private final WriterService writerService;

    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }

    @PostMapping("/add")
    public ResponseEntity<CommonResponse> addWriter(@RequestBody Writer writer){
        return  CommonResponse.buildResponse("Writer added successfully",writerService.addWriter(writer), HttpStatus.OK);
    }

    @GetMapping("/getAllWriter")
    public List<Writer> getAllWriter(){
        return writerService.getAllSinger();
    }

    @GetMapping("{writerId}")
    public ResponseEntity<CommonResponse> getByWriterId(@PathVariable Long writerId){
        return CommonResponse.buildResponse("writer fetch by id",writerService.getByWriterId(writerId),HttpStatus.OK);
    }

    @PutMapping("{writerId}")
    public ResponseEntity<CommonResponse> updateById(@PathVariable Long writerId, @RequestBody WriterDto writerDto){
        return CommonResponse.buildResponse("update successfully",writerService.updateById(writerId,writerDto),HttpStatus.OK);
    }

    @PatchMapping ("{writerId}")
    public ResponseEntity<CommonResponse> partialUpdateById(@PathVariable Long writerId,@RequestBody WriterDto writerDto){
        return CommonResponse.buildResponse("update successfully",writerService.partialUpdateById(writerId,writerDto),HttpStatus.OK);
    }

    @DeleteMapping("{writerId}")
    public  ResponseEntity<CommonResponse> deleteById(@PathVariable Long writerId){
        return CommonResponse.buildResponse("writer successfully deleted",writerService.deleteById(writerId),HttpStatus.OK);
    }

    @DeleteMapping("deleteAll")
    public void deleteAll(){
         writerService.deleteAll();
    }
}
