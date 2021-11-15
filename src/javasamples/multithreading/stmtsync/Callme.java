package javasamples.multithreading.stmtsync;

public class Callme {

	void call(String msg) {

	System.out.println("[" + msg);


	try {

	Thread.sleep(100);

	}catch (InterruptedException e) {

	System.out.println("Interrupted");

	}

	System.out.print("]");

	}

	}

