package com.proxy.JDK;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 生成代理对象的代码
 * 
 * @author lulf
 *
 */
public class MyProxy {

	private static String ln = "\r\n";

	// 用來获取代理对象
	public static Object newProxyInstance(MyClassLoader classLoader, Class<?>[] interfaces, MyInvocationHandler h) throws Exception {
		// 1 生成源代码
		String proxySrc = generateSrc(interfaces[0]);
		// 2 将生成的源代码输出到磁盘，保存为.java文件
        String filepath=MyProxy.class.getResource("").getPath();
        File f=new File(filepath+"$Proxy0.java");
        FileWriter fw;
		try {
			fw = new FileWriter(f);
			fw.write(proxySrc);
		    fw.flush();
		    fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 3 编译源代码，并且生成.class文件
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager manager=compiler.getStandardFileManager(null, null, null);
		Iterable iterable=manager.getJavaFileObjects(f);
		CompilationTask task=compiler.getTask(null, manager, null, null, null, iterable);
		task.call();
		try {
			manager.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 4 将class文件中的内容，动态加载到JVM中
		// 5 返回被代理后的代理对象
		Class procyclass=classLoader.findClass("$Proxy0");
		Constructor c=procyclass.getConstructor(MyInvocationHandler.class);
		return c.newInstance(h);
	}

	private static String generateSrc(Class<?> interfaces) {
		StringBuffer src = new StringBuffer("package com.lulf.sjmsdemo;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);
		src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
		src.append("MyInvocationHandler h;" + ln);
		src.append("public $Proxy0(MyInvocationHandler h) {" + ln);
		src.append("this.h=h;" + ln);
		src.append("}" + ln);
		for (Method m : interfaces.getMethods()) {
			src.append("public " + m.getReturnType() + " " + m.getName() + "() throws Throwable{" + ln);
			src.append("Method m= " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
			src.append("this.h.invoke(this,m,null);" + ln);
			src.append("}" + ln);
		}
		src.append("}");
		return src.toString();
	}

}
