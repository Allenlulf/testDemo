package com.epoint.Thread;

import java.util.concurrent.locks.Lock;

public interface MyLock extends Lock{
	void MyLock(String SessionID);
}
