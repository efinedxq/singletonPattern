package edu.qtech.singleton;

import java.util.ArrayList;

public class SignletonPool {
	//����ʵ���ĸ���
    private static int maxNumOfSingleton = 5;
    //��ǰʵ�������к�
    private static int countNumOfNow = 0;
    //���ÿ��ʵ����Ӧ������
    private static ArrayList<String> list = new ArrayList<String>();
    //ʵ���б�
    private static ArrayList<SignletonPool>  signletonList = new ArrayList<SignletonPool>();
    
}
