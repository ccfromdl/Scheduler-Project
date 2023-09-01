package com.jp.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Schedule {
    private String type;
    private String name;
    private String description;
//    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private Date startTime;
    private Date endTime;
    private Collection<Member> members;
}
