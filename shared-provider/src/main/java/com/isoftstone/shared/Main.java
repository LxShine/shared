package com.isoftstone.shared;


import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:META-INF/spring/dubbo-event-provider.xml"});
	        context.start();
	  
		System.out.println("aop ...");

		System.in.read();*/
		//redis.clients.jedis.ShardedJedisPool
		//redis.clients.jedis.JedisShardInfo
		com.alibaba.dubbo.container.Main.main(args);
	
	}
	
}
