package com.song.project;
/**
 * Thread实现定时任务
 * @author Administrator
 *
 */
public class ThreadJob {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 
				while(true){
					try {
						Thread.sleep(1000);

						Task();
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();

	}
   
	static void Task(){
		System.out.println("任务执行了.....");
	}
}
