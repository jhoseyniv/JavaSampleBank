package javasamples.multithreading.stmtsync;

public class SyncStmt {

	public static void main (String args [ ]) {

		Callme target = new Callme();

		Caller ob1 = new Caller (target, "Hello");

		Caller ob2 = new Caller (target, "Synchronized");

		Caller ob3 = new Caller (target, "World");

		try {

		ob1.t.join();
		System.out.println("Join 1");

		ob2.t.join();
		System.out.println("Join 2");

		ob3.t.join();
		System.out.println("Join 3");

		}catch (InterruptedException e) {

		System.out.println("Interrupted");

		}

	}

}

