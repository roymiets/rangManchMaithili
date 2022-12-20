package com.RangManchMaithili.RangmanchMaithili.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Setter
@Getter
@Entity
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "name cannot be null")
    private String writerName;
    @NotNull(message="mobile number cannot be null")
    @Max(value =9999999999L,message = "invalid phone number")
    @Min(value =5555555555L,message = "invalid phone number")
    private Long mobileNo;
    private String emailId;
    private Integer age;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;




}
