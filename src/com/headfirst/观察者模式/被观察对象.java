package com.headfirst.观察者模式;

public interface 被观察对象 {
	public void registerObserver(观察者 o);
	public void removeObserver(观察者 o);
	public void notifyObservers();
}
