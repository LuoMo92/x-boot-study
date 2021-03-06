package com.luomo.study.xbootstudy;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LiuMei
 * @date 2018-08-21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {

    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void test(){
        System.out.println(stringEncryptor.encrypt("root"));
    }

}
