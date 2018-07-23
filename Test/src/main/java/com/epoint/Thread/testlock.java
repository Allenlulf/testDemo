package com.epoint.Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class testlock implements MyLock{

	@Override
	public void lock() {
		
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tryLock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void MyLock(String SessionID) {
		// TODO Auto-generated method stub
		
	}
}
