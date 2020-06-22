package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 * teaminfo实体类
 * @author liyouxin
 *
 */
@Table(name="team_info")
@Data
public class TeamInfo implements Serializable {

    private static final long serialVersionUID=1L;

    //去势编号
    @Id
    private Long teamId;

    private String password;
    private Long leaderId;
    private String name;
}
