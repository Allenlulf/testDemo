package com.lulf.sjmsdemo;
import java.lang.reflect.Method;
public class $Proxy0 implements com.lulf.sjms.ZFZ{
MyInvocationHandler h;
public $Proxy0(MyInvocationHandler h) {
this.h=h;
}
public void zfz() throws Throwable{
Method m= com.lulf.sjms.ZFZ.class.getMethod("zfz",new Class[]{});
this.h.invoke(this,m,null);
}
public void zf() throws Throwable{
Method m= com.lulf.sjms.ZFZ.class.getMethod("zf",new Class[]{});
this.h.invoke(this,m,null);
}
}