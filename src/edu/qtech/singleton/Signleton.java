package edu.qtech.singleton;

import java.util.ArrayList;

public class Signleton {
	//创建实例的个数
    private static int maxNumOfSingleton = 2;
    //当前实例的序列号
    private static int countNumOfNow = 0;
    //存放每个实例对应的内容
    private static ArrayList<String> list = new ArrayList<String>();
    //实例列表
    private static ArrayList<Signleton>  signletonList = new ArrayList<Signleton>();
    
    
}
