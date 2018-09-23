package com.song.project;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorJob implements Runnable{
	  private String jobName = "";
	  public ScheduledExecutorJob(String jobName){
	  super();
	   this.jobName = jobName;    
	  }  
	   public void run(){
	     System.out.println("execute " + jobName);
	   }  
	   
	   public static void main(String[] args){
	   ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
	   service.scheduleAtFixedRate(new ScheduledExecutorJob("job1"),1,1,TimeUnit.SECONDS); 
	   service.scheduleWithFixedDelay(new ScheduledExecutorJob("job2"), 1,1, TimeUnit.SECONDS);
	   }
	}
