package edu.qtech.singleton;

public class People {
   private String name;
   private boolean  flag = false;
   
   public People() {
	// TODO Auto-generated constructor stub
   }
   public People(String s) {
		// TODO Auto-generated constructor stub
	   this.name = s;
   }
   public People getInstance(){
	   if(flag) return null;
	   flag = true;
	   return this;
   }
   
   public boolean isBuzy(){
	   return flag;
   }
   
   public void release(){
	   flag = false;
   }
   public String getName(){
	   return this.name;
   }
}
