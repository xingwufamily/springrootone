package cn.com.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Configuration
public class JedisConfiguration {

    //@Autowired
    private JedisProperties jedisProperties;

    //@Bean
    public JedisCluster getJedisCluster(){
        List<String> nodes = jedisProperties.getCluster().getNodes();
        Set<HostAndPort> set = new HashSet<>();
        for(String s:nodes){
            String[] ss = s.split(":");
            set.add(new HostAndPort(ss[0].trim(),Integer.valueOf(ss[1].trim())));
        }
        JedisPoolConfig jp = new JedisPoolConfig();
        jp.setMaxWaitMillis(jedisProperties.getPool().getMaxWait());
        jp.setMaxIdle(jedisProperties.getPool().getMaxIdle());
        jp.setMinIdle(jedisProperties.getPool().getMinIdle());
        return new JedisCluster(set,
                jedisProperties.getTimeout(),
                jedisProperties.getSoTimeOut(),
                jedisProperties.getCluster().getMaxRedirects(),
                jedisProperties.getPassword(),jp);
    }
}
