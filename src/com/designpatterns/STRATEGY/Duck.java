package com.designpatterns.STRATEGY;

import com.designpatterns.STRATEGY.behaviours.FlyBehaviour;
import com.designpatterns.STRATEGY.behaviours.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public Duck()
	{
		
	}
	public abstract void display();
	
	public void performQuack()
	{
		quackBehaviour.quack();
	}
	public void performFly()
	{
		flyBehaviour.fly();
	}
	
	public void swim()
	{
		System.out.println("All Ducks float");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb)
	{
		flyBehaviour=fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb)
	{
		quackBehaviour=qb;
	}
}

