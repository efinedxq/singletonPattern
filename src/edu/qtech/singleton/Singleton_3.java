package edu.qtech.singleton;

/**
 * 此方式仅适用于 jdk 1.4以后的版本
 * @author dxq
 *
 */
public class Singleton_3 {
	
	 private volatile static Singleton_3 singleton;
	 
     private Singleton_3(){}
     
     public static  Singleton_3 getInstance(){
    	 if(singleton == null){
    		 synchronized (Singleton_3.class){
    			 if(singleton == null){
    				  singleton = new Singleton_3();
    			 }
    		 }
    	 }
    	 return singleton;
     }
     //其他方法
}

