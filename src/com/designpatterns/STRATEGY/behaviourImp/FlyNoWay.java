package com.designpatterns.STRATEGY.behaviourImp;

import com.designpatterns.STRATEGY.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly");
	}

}
