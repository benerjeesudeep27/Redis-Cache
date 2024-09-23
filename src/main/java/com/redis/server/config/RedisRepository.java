package com.redis.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisRepository {

	@Value("${spring.data.redis.url}")
	private String url;
	@Value("${spring.data.redis.port}")
	private int port;
	@Value("${spring.data.redis.username}")
	private String username;
	@Value("${spring.data.redis.password}")
	private String password;
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration rediConfiguration = new RedisStandaloneConfiguration(url, port);
		rediConfiguration.setUsername(url);
		rediConfiguration.setPassword(password);
		
		JedisClientConfiguration clientConfiguration = JedisClientConfiguration.builder().build();
		return new JedisConnectionFactory(rediConfiguration, clientConfiguration);
		
	}
}
