package edu.qtech.singleton;

public class Singleton_1 {
	 private static Singleton_1 singleton;
    private Singleton_1(){}
    //synchronized迫使每个线程在进入这个方法之前，要先等候别的线程离开该方法。
    //也就是说，不会有两个线程可以同时进入这个方法。
    //但这样耗费不较大。
    public static synchronized Singleton_1 getInstance(){
   	 if(singleton == null){
   		 singleton = new Singleton_1();
   	 }
   	 return singleton;
    }
    //其他方法
}