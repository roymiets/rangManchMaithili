package com.RangManchMaithili.RangmanchMaithili.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse {
    private  Integer code;
    private String message;
    private Object data;
    private List<CommonError> errors;
    private Boolean error;

    public  static ResponseEntity<CommonResponse> build(Object data, HttpStatus httpStatus){
        return new ResponseEntity<>(CommonResponse.builder()
                .data(data)
                .code(httpStatus.value()).error(httpStatus.isError()).build(),httpStatus);
    }

    public  static ResponseEntity<CommonResponse> buildResponse(String message,Object data, HttpStatus httpStatus){
        return new ResponseEntity<>(CommonResponse.builder()
                .message(message)
                .data(data)
                .code(httpStatus.value()).error(httpStatus.isError()).build(),httpStatus);
    }
}
