package wangdong;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double stime=System.currentTimeMillis() ; 
		ExecutorService exe = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {

			exe.submit(new MyThread());
		}
		exe.shutdown();
		double etime=System.currentTimeMillis() ; 
		System.out.println(etime-stime);
	}

}
