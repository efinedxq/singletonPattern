import javax.swing.SingleSelectionModel;

import edu.qtech.singleton.People;
import edu.qtech.singleton.SingletonPool;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           SingletonPool sPool = new SingletonPool();
           People p1 = sPool.getInstance();
           People p2 = sPool.getInstance();
           People p3 = sPool.getInstance();
           p2.release();
           People p4 = sPool.getInstance();
	}

}
