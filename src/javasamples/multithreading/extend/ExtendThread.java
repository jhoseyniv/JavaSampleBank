package javasamples.multithreading.extend;

class ExtendThread {

	public static void main (String args [ ]) {

	new NewThread();


	try {

	for(int i = 10; i > 0;i--) {

	System.out.println("Main Thread:" + i);

	Thread.sleep(1000);

	}

	}catch (InterruptedException e) {

	System.out.println("Main Thread Interrupted");

	}

	System.out.println("Exiting Main Thread.");

	}

	}

	 

