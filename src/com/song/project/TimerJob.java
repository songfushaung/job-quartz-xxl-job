package com.song.project;

import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask 
 * @author Administrator
 *
 */
public class TimerJob {
  public static void main(String[] args) {
	  //执行的任务
	  TimerTask task=new TimerTask() {
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					  System.out.println("任务执行了:"+i);
				  }
			}
		};
	  Timer timer = new Timer();
	        // 天数
			long delay = 0;
			// 秒数
			long period = 1000;
	  timer.schedule(task, delay,period);
}
}
