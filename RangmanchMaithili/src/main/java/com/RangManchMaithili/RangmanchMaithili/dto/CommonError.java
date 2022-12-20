package com.RangManchMaithili.RangmanchMaithili.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonError {
    private String message;
    private String field;
}
