package com.mingxiang.controller;


import com.mingxiang.service.IUserinfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 表注释 前端控制器
 * </p>
 *
 * @author MX
 * @since 2021-12-10
 */
@RestController
@RequestMapping("/userinfo")
@RequiredArgsConstructor
public class UserinfoController {

    private final IUserinfoService userinfoService;


    @GetMapping("/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(userinfoService.list());
    }

}
