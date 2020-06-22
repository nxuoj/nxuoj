package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * submitrecord实体类
 * @author liyouxin
 *
 */
@Table(name="submit_record")
@Data
public class SubmitRecord implements Serializable {

    private static final long serialVersionUID=1L;


    @Id
    private Long recordId;


    private Long teamId;
    private Long studentId;
    private Date recordTime;
    private Long questionId;
    private String url;
}
