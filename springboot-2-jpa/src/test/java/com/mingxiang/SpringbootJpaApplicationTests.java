package com.mingxiang;

import cn.hutool.json.JSONUtil;
import com.mingxiang.entity.UserInfo;
import com.mingxiang.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringbootJpaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserInfoRepository userInfoRepository;


    @Test

    public void test() throws Exception {
        for (int i = 0; i < 20; i++) {
            userInfoRepository.save(new UserInfo("AAA" + i, 20 + i));
        }

        log.info(JSONUtil.parse(userInfoRepository.findAll()).toString());

        UserInfo userInfo = userInfoRepository.findById(1L).get();
        userInfo.setAddress("China");
        userInfoRepository.save(userInfo);
        log.info(JSONUtil.toJsonStr(userInfoRepository.findAll()));

        userInfoRepository.deleteById(1L);
        log.info(JSONUtil.toJsonStr(userInfoRepository.findAll()));


    }

}
