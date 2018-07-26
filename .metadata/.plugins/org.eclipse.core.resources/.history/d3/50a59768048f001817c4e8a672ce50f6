package com.lulf.sjmsdemo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 代码生成，编译，重新动态load到JVM
 * 
 * @author lulf
 */
public class MyClassLoader extends ClassLoader {

	private File baseDir;

	public MyClassLoader() {
		String path = MyClassLoader.class.getResource("").getPath();
		this.baseDir = new File(path);
	}

	protected Class<?> findClass(String name) throws ClassNotFoundException {
		String classname = MyClassLoader.class.getPackage().getName() + "." + name;
		if (baseDir != null) {
			File classFile = new File(baseDir, name.replaceAll("\\.", "/") + ".class");
			if (classFile.exists()) {
				FileInputStream in = null;
				ByteArrayOutputStream out = null;
				try {
					in = new FileInputStream(classFile);
					out = new ByteArrayOutputStream();
					byte[] buff = new byte[1024];
					int len;
					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}
					return defineClass(classname, out.toByteArray(), 0, out.size());
				} catch (Exception e) {
					e.getStackTrace().toString();
				} finally {
					try {
						if (out != null) {
							out.close();
						}
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}
		return null;
	}
}
