package com.jsz.peini.thread;

import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jsz.peini.util.constant.Config;

public class HttpConnectionThread extends Thread {
	private Logger logger = LogManager.getLogger(HttpConnectionThread.class);
	private final PoolingHttpClientConnectionManager poolingHttpClientConnectionManager;
	private Integer waitTime;
	private volatile boolean shutdown;

	public HttpConnectionThread(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager,Integer waitTime) {
        this.poolingHttpClientConnectionManager = poolingHttpClientConnectionManager;
        this.waitTime = waitTime;
        this.start();
    }

	@Override
	public void run() {
		try {
			while (!shutdown) {
				synchronized (this) {
					wait(waitTime);
					// 关闭失效的连接
					poolingHttpClientConnectionManager.closeExpiredConnections();
				}
			}
		} catch (InterruptedException e) {
			logger.debug(e.getMessage());
		}
	}

	public void shutdown() {
		shutdown = true;
		synchronized (this) {
			notifyAll();
		}
		logger.debug("SpringApplication is destroyed,HttpConnectionThread will stop!!!");
	}
}
