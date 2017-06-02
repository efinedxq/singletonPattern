package edu.qtech.singleton;

public class Singleton_2 {
	 private static Singleton_2 singleton = new Singleton_2() ;
    private Singleton_2(){}
    
    public static  Singleton_2 getInstance(){
   	 return singleton;
    }
    //其他方法
}