package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 * userinfo实体类
 * @author liyouxin
 *
 */
@Table(name="user_info")
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    private Long studentId;


    private Long phoneNumber;
    private String password;
    private String name;
    private Long teamId;


}
