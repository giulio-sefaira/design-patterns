package com.jorgefigueiredo.designpatterns.gof;

public class AdapterPattern {

	public static void main(String[] args) {

		Target target = new Adapter();
		target.operation();
		
	}

}


class Target {
	
	public void operation() {
		System.out.println("Called Target operation()");
	}
	
}

class Adapter extends Target {
	
	private final NewTarget newTarget = new NewTarget();
	
	@Override
	public void operation() {
		
		newTarget.newOperation();
		
	}
	
}

class NewTarget {
	
	public void newOperation() {
		System.out.println("Called NewTarget newOperation()");
	}
	
}