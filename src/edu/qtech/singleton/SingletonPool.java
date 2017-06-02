package edu.qtech.singleton;

import java.util.ArrayList;

public class SingletonPool {
	//创建实例的个数
    private static int maxNumOfSingleton = 2;
    //实例列表
    private static ArrayList<People>  peopleList = new ArrayList<People>();
    //实例
	private People people;
	
    public SingletonPool(){
    	System.out.println("对象池一共有n个对象：n="+maxNumOfSingleton);
    	for(int i = 0; i < maxNumOfSingleton; i++){
    		 people = new People(i+1+"");
    		 peopleList.add(people);
    	}
    }
    public People getInstance(){
    	
    	for(int i = 0;i < maxNumOfSingleton; i ++){
    		People p = peopleList.get(i);
    		if(!p.isBuzy()){
    			System.out.println("获取到实例对象："+p.getName());
    			return p.getInstance();
    		}
    	}
    	System.out.println("对象池已空，无法获取到实例对象");
    	return people;
    }
}
