package wangdong;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadTest {

	/**
	 * 直接运行这个方法 不要启动tomcat 不然会包线程泄露的问题 这只是一个单独的小例子啊!
	 * 因为在主线程还没有结束的时候就执行了shutdown的操作所以会报线程泄漏
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	double stime=System.currentTimeMillis() ; 
		ExecutorService exe = Executors.newFixedThreadPool(5);//固定连接的线程池
		//ExecutorService exe=Executors.newCachedThreadPool();//可变大小的线程池
		for (int i = 0; i < 8; i++) {

			exe.submit(new MyThread());
		}
		exe.shutdown();
		double etime=System.currentTimeMillis() ; 
		System.out.println(etime-stime); */
	}

}
