package javasamples.multithreading.sync;

public class Callme {

	synchronized void call(String msg) {

	System.out.print("[" + msg);


	try {

	Thread.sleep(2000);

	}catch (InterruptedException e) {

	System.out.println("Interrupted");

	}

	System.out.print("]");

	}

	}


