package com.designpatterns.STRATEGY;

import com.designpatterns.STRATEGY.behaviourImp.FlyNoWay;
import com.designpatterns.STRATEGY.behaviourImp.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck()
	{
		flyBehaviour=new FlyNoWay();
		quackBehaviour=new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model Duck");
	}

}
