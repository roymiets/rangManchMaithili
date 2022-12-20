package com.RangManchMaithili.RangmanchMaithili.controller;

import com.RangManchMaithili.RangmanchMaithili.dto.CommonResponse;
import com.RangManchMaithili.RangmanchMaithili.dto.SingerDto;
import com.RangManchMaithili.RangmanchMaithili.entities.Singer;
import com.RangManchMaithili.RangmanchMaithili.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/singer")
public class SingerController {
    @Autowired
    private final SingerService singerService;

    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }

   @PostMapping("/add")
    public ResponseEntity<CommonResponse> addSinger(@RequestBody Singer singer){
       return  CommonResponse.buildResponse("singer added successfully",singerService.addSinger(singer), HttpStatus.OK);
    }

    @GetMapping("/getAllSinger")
    public List<Singer> getAllSinger(){
        return singerService.getAllSinger();
    }

    @GetMapping("{singerId}")
    public ResponseEntity<CommonResponse> getBySingerId(@PathVariable Long singerId){
     return CommonResponse.buildResponse("singer fetch by id",singerService.getBySingerId(singerId),HttpStatus.OK);
    }

    @PutMapping("{singerId}")
    public ResponseEntity<CommonResponse> updateById(@PathVariable Long singerId,@RequestBody SingerDto singerDto){
        return CommonResponse.buildResponse("update successfully",singerService.updateById(singerId,singerDto),HttpStatus.OK);
    }

    @PatchMapping ("{singerId}")
    public ResponseEntity<CommonResponse> partialUpdateById(@PathVariable Long singerId,@RequestBody SingerDto singerDto){
        return CommonResponse.buildResponse("update successfully",singerService.partialUpdateById(singerId,singerDto),HttpStatus.OK);
    }

    @DeleteMapping("{singerId}")
    public  ResponseEntity<CommonResponse> deleteById(@PathVariable Long singerId){
        return CommonResponse.buildResponse("singer successfully deleted",singerService.deleteById(singerId),HttpStatus.OK);
    }

    @DeleteMapping("deleteAll")
    public void deleteAll(){
      singerService.deleteAll();
    }
}
