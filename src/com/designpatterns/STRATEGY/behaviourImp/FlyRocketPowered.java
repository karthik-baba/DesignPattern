package com.designpatterns.STRATEGY.behaviourImp;

import com.designpatterns.STRATEGY.behaviours.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying with a rocket");
	}
	
}
