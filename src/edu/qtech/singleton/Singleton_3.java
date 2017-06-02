package edu.qtech.singleton;

/**
 * �˷�ʽ�������� jdk 1.4�Ժ�İ汾
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
     //��������
}

