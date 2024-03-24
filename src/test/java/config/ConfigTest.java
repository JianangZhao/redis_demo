package config;

import org.example.Main;
import org.example.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Main.class)
public class ConfigTest {

    @Autowired
    @Qualifier(value = "redisTemplate")
    RedisTemplate redisTemplate;

    @Test
    public void testRedisConfig2(){
        redisTemplate.opsForValue().set("key1","value1");
        redisTemplate.opsForHash().put("hash", "file", "hvalue");
    }

}
