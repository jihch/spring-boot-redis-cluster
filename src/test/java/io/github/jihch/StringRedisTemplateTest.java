package io.github.jihch;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSet() {
        stringRedisTemplate.opsForValue().set("msg", "set from spring boot");
    }


    @Test
    public void testGet() {
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }

}
