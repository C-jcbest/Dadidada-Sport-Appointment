package com.jc.entity.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class User {


    @TableId(type = IdType.AUTO)
    private Integer userId;


    @NotBlank(message = "用户名不能为空")
    private String userName;

    private String userSex;
    private Integer userHeight;
    private Integer userWeight;
    private Integer userAge;
    private String userSpecialty;
    private String userIntroduction;
    private String userIdentity;

}
