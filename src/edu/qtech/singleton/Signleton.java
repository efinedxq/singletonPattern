package edu.qtech.singleton;

import java.util.ArrayList;

public class Signleton {
	//����ʵ���ĸ���
    private static int maxNumOfSingleton = 2;
    //��ǰʵ�������к�
    private static int countNumOfNow = 0;
    //���ÿ��ʵ����Ӧ������
    private static ArrayList<String> list = new ArrayList<String>();
    //ʵ���б�
    private static ArrayList<Signleton>  signletonList = new ArrayList<Signleton>();
    
    
}
