package com.designpatterns.STRATEGY;

import com.designpatterns.STRATEGY.behaviourImp.FlyWithWings;
import com.designpatterns.STRATEGY.behaviourImp.Quack;

public class MallardDuck extends Duck{
	public MallardDuck()
	{
		quackBehaviour=new Quack();
		flyBehaviour=new FlyWithWings();
	}
	public void display()
	{
		System.out.println("I'm a real Mallard Duck");
	}
}
