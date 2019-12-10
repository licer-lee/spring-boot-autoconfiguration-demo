package com.licerlee.autoconfiguration;

import com.licerlee.autoconfiguration.config.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AutoconfigurationApplicationTests {

    @Autowired
    MyBean myBean;

    @Test
    void contextLoads() {

        String name = myBean.getProperties().getName();
        System.out.println("name = " + name);
    }

}
