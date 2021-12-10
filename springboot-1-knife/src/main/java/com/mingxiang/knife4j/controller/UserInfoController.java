package com.mingxiang.knife4j.controller;//package com.dhy.huashan.knife4j.controller;

import com.mingxiang.entity.UserInfo;
import com.mingxiang.knife4j.dto.UserInfoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author mx
 * @date 2021-11-29 16:20
 */

@Api(tags = "首页模块")
@RestController
public class UserInfoController {


    @ApiOperation(value = "获取所有用户信息--无参")
    @GetMapping("/list")
    public ResponseEntity<String> list() {
        return ResponseEntity.ok("获取所有用户信息--无参");
    }


    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "获取用户信息--带Param参")
    @GetMapping("/listbyparam")
    public ResponseEntity<String> listbyparam(@RequestParam("name") String name) {
        return ResponseEntity.ok(String.format("获取用户信息--带Param参: %s", name));
    }


    @ApiOperation(value = "获取用户信息--带pathvariable参")
    @GetMapping("/listbypathvariable/{name}")
    public ResponseEntity<String> listbypathvariable(@PathVariable("name") String name) {
        return ResponseEntity.ok(String.format("获取用户信息--带pathvariable参: %s", name));
    }


    @ApiOperation(value = "添加用户  RequestBody ", notes = "获取用户信息--带pathvariable参")
    @PostMapping(value = "/add")
    public ResponseEntity<String> addUser(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(String.format("添加用户: %s", userInfo.toString()));
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
    })
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Integer id, @RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(String.format("更新用户信息: %s 完成", userInfo.toString()));
    }


    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        return ResponseEntity.ok(String.format("删除用户:%s 完成。", id));
    }


}



