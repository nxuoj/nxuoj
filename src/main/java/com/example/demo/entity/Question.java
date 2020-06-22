package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 * question实体类
 * @author liyouxin
 *
 */
@Table(name="question")
@Data
public class Question implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    private Long questionId;


    private int year;
    private int semester;
    private int week;
    private Long studentId;
    private String url;

}
