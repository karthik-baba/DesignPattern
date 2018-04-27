package com.designpatterns.STRATEGY.puzzle;

public abstract class Character {
	WeaponBehaviour weaponBehaviour;
	public abstract void fight();
	public void setWeapon(WeaponBehaviour w)
	{
		this.weaponBehaviour=w;
	}

}
