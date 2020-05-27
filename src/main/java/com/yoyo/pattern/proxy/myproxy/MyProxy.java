package com.yoyo.pattern.proxy.myproxy;



import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxy {

    private  static  final  String ln = "\r\n";
    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException, IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.生成源代码.java
        String sourceCode = generatingSourceCode(interfaces,h);

        //2..java保存到磁盘上
        String filepath = MyProxy.class.getResource("").getPath();
        System.out.println(filepath);
        File f = new File(filepath+"$Proxy0.java");
        FileWriter fw =new FileWriter(f);
        fw.write(sourceCode);
        fw.flush();
        fw.close();
        //3.编译.java文件成.class
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
        task.call();
        manager.close();

        //4.把.class加载到jvm
       //ClassLoader classLoader = ClassLoader.getSystemClassLoader();
      // Class c = classLoader.loadClass(filepath+"$Proxy0.class");
        Class proxyclass = loader.findClass("$Proxy0");
        Constructor constructor = proxyclass.getConstructor(MyInvocationHandler.class);
        //5.返回字节码重组的新的代理对象
        return constructor.newInstance(h);
    }


    private static String generatingSourceCode(Class<?>[] interfaces,MyInvocationHandler h) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.yoyo.proxy.myproxy;"+ ln);
        sb.append("import java.lang.reflect.InvocationHandler;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("import java.lang.reflect.UndeclaredThrowableException;" + ln);
        sb.append("public class $Proxy0  implements " );
        for (int i=0;i<interfaces.length;i++){
            sb.append(interfaces[0].getName());
            if(i<interfaces.length-1){
                sb.append(",");
            }
        }

        sb.append(" {" + ln);
        sb.append("MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h){" + ln);
        sb.append("this.h=h;" + ln);
        sb.append("}" + ln);
        for (Class<?> clz:interfaces) {
            for (Method m:clz.getMethods()) {
                sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"() {" + ln);
                sb.append("Method m = null;" + ln);
                sb.append("try {" + ln);
                sb.append("m = "+clz.getName()+".class.getMethod(\""+m.getName()+"\");" + ln);
                sb.append("h.invoke(this, m, (Object[])null);" + ln);
                sb.append(" } catch (NoSuchMethodException e) {" + ln);
                sb.append(" e.printStackTrace();" + ln);
                sb.append("} catch (ClassNotFoundException e) {" + ln);
                sb.append("e.printStackTrace();" + ln);
                sb.append("} catch (Throwable throwable) {" + ln);
                sb.append("throwable.printStackTrace();" + ln);
                sb.append("}" + ln);
                sb.append(" }" + ln);
            }
        }

        sb.append(" }" + ln);
        return sb.toString();

    }


}
