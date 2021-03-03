package com.headfirst.strategy;


public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallark = new MallardDuck();
		mallark.performFly();
		mallark.performQuack();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
