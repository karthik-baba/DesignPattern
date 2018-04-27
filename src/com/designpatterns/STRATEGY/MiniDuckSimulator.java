package com.designpatterns.STRATEGY;

import com.designpatterns.STRATEGY.behaviourImp.FlyRocketPowered;
import com.designpatterns.STRATEGY.behaviourImp.HuntingQuacks;

public class MiniDuckSimulator {
	public static void main(String args[])
	{
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
		
		Duck hunt=new ModelDuck();
		hunt.setQuackBehaviour(new HuntingQuacks());
		hunt.performQuack();
	}
}
