package edu.qtech.singleton;

public class Singleton_1 {
	 private static Singleton_1 singleton;
    private Singleton_1(){}
    //synchronized��ʹÿ���߳��ڽ����������֮ǰ��Ҫ�ȵȺ����߳��뿪�÷�����
    //Ҳ����˵�������������߳̿���ͬʱ�������������
    //�������ķѲ��ϴ�
    public static synchronized Singleton_1 getInstance(){
   	 if(singleton == null){
   		 singleton = new Singleton_1();
   	 }
   	 return singleton;
    }
    //��������
}