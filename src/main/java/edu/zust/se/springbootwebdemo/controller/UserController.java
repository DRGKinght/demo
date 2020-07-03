package edu.zust.se.springbootwebdemo.controller;

import edu.zust.se.springbootwebdemo.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "用户管理模块接口")
@RestController
@RequestMapping("user")
public class UserController {
    @ApiOperation("获取单个用户信息")
    @GetMapping("/{id}")
    public UserDto getUser(@ApiParam("用户ID") @PathVariable  Integer id){
        return new UserDto(1,"周");
    }
    @ApiOperation("获取所有用户信息")
    @GetMapping("/all")
    public List<UserDto> allUsers(){
        return null;
    }
    @ApiOperation("新增用户")
    @PostMapping("")
    public UserDto addUser(UserDto user){
        return null;
    }
}
