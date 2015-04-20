package wangdong;

/**
 * @author wangdong
 * 启动多线程池抓取页面信息
 */
public class MyThread extends Thread {
  
  public void run(){
	  
	  System.out.println("开始抓取"+Thread.currentThread().getName());
	  
  }
}
