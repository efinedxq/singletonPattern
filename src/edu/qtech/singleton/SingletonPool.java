package edu.qtech.singleton;

import java.util.ArrayList;

public class SingletonPool {
	//����ʵ���ĸ���
    private static int maxNumOfSingleton = 2;
    //ʵ���б�
    private static ArrayList<People>  peopleList = new ArrayList<People>();
    //ʵ��
	private People people;
	
    public SingletonPool(){
    	System.out.println("�����һ����n������n="+maxNumOfSingleton);
    	for(int i = 0; i < maxNumOfSingleton; i++){
    		 people = new People(i+1+"");
    		 peopleList.add(people);
    	}
    }
    public People getInstance(){
    	
    	for(int i = 0;i < maxNumOfSingleton; i ++){
    		People p = peopleList.get(i);
    		if(!p.isBuzy()){
    			System.out.println("��ȡ��ʵ������"+p.getName());
    			return p.getInstance();
    		}
    	}
    	System.out.println("������ѿգ��޷���ȡ��ʵ������");
    	return people;
    }
}
