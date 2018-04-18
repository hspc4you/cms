package com.jsz.peini.thread;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;



public class TestThread extends Thread {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	private Integer blockTimeOut;
	private volatile boolean shutdown;
	public TestThread(Integer blockTimeOut){
		this.blockTimeOut = blockTimeOut;
	}
	public void init(){
		this.start();
	}
	@Override
	public void run() {
		while (!shutdown) {
			String data= stringRedisTemplate.opsForList().leftPop("testlist", this.blockTimeOut, TimeUnit.SECONDS);
			System.out.println("testlist新值:"+data);
		}
	}
	
	public void shutdown() {
		this.shutdown = true;
		System.out.println("线程即将停止");
	}
}
