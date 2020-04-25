package cn.apptec.javainone.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;

@Configuration
@ConditionalOnClass({RedisOperations.class})
public class RedisAutoConfiguration {
    public RedisAutoConfiguration() {
    }

    @Bean(name = "stringObjectRedisTemplate")
    public RedisTemplate<String, Object> stringObjectRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<String, Object> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);

        // Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        // ObjectMapper om = new ObjectMapper();
        // om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        // jackson2JsonRedisSerializer.setObjectMapper(om);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        // key采用String的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        // hash的key也采用String的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);
        // value序列化方式采用jackson
        // template.setValueSerializer(jackson2JsonRedisSerializer);
        // hash的value序列化方式采用jackson
        // template.setHashValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}
//
//     RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
// 27
//         template.setConnectionFactory(factory);
//         28
//         Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//         29
//         ObjectMapper om = new ObjectMapper();
//         30
//         om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//         31
//         om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//         32
//         jackson2JsonRedisSerializer.setObjectMapper(om);
//         33
//         StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//         34
//         // key采用String的序列化方式
//         35
//         template.setKeySerializer(stringRedisSerializer);
//         36
//         // hash的key也采用String的序列化方式
//         37
//         template.setHashKeySerializer(stringRedisSerializer);
//         38
//         // value序列化方式采用jackson
//         39
//         template.setValueSerializer(jackson2JsonRedisSerializer);
//         40
//         // hash的value序列化方式采用jackson
//         41
//         template.setHashValueSerializer(jackson2JsonRedisSerializer);
//         42
//         template.afterPropertiesSet();
//         43
//         return template;
