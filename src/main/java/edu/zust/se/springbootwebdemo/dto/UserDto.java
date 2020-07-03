package edu.zust.se.springbootwebdemo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("系统用户")
public class UserDto {
    @ApiModelProperty("用户编号")
    private Integer id;
    @ApiModelProperty("用户姓名")
    private String name;
    public UserDto(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
