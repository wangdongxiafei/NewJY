package wangdong;

import java.sql.Date;

public class SpringQtz {
	private static int counter = 0;

	public void execute() {
		long ms = System.currentTimeMillis();
		System.out.println("\t\t" + new Date(ms));
		System.out.println("(" + counter++ + ")");
	}
}
