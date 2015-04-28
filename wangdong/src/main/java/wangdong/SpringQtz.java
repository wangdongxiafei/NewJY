package wangdong;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class SpringQtz {
	private static int counter = 0;

	public void execute() {
		long ms = System.currentTimeMillis();
		System.out.println("\t\t" + new Date(ms));
		System.out.println("(" + counter++ + ")");
		
		  try {
				URL url=new URL("http://www.net.cn/domain/taodomaindetail?spm=5334.652006.4.4.z1c657&domainName=renrenhuimai.com");
			    URLConnection   conn=url.openConnection();
			    HttpURLConnection htpconn=(HttpURLConnection)conn;
			    int code =htpconn.getResponseCode();
			    boolean flag=false;
			    if(code==200)
			    {
			    	
			    	flag=true;
			    	System.out.println("访问成功");
		           
			    }else{
			    	
			    	flag=false;
			    	System.out.println("访问失败");
			    }
			  
			  } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
