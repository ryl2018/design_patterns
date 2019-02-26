package create_shape.factory_method;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author renyuanliang
 * @data 2019/2/22 16:44
 */
public class ClassUtils {
    /**
     * 给一个接口，返回这个接口的所有实现类
     * @param c
     *        接口的字节码对象
     * @return 实现类字节码集合
     */
    public static List<Class> getAllClassByInterface(Class c){
        List<Class> returnClassList = new ArrayList<>();
        if(c.isInterface()){
            String packageName = c.getPackage().getName();
            List<Class> classes = null;
            try {
                classes = getClasses(packageName);
                for (Class cc:classes){
                    if(c.isAssignableFrom(cc)){
                        if(!c.equals(cc)){
                            returnClassList.add(cc);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return  returnClassList;
    }

    /**
     * 返回包名下的所有字节码对象
     * @param packageName 包名
     * @return 字节码对象集合
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static List<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        //parh 方法工厂模式
        String path = packageName.replace(".","/");
//        URL resource = contextClassLoader.getResource(path);
//        File f = new File(resource.getFile());
        Enumeration<URL> resources = contextClassLoader.getResources(path);
        List<File> files = new ArrayList<>();
        while(resources.hasMoreElements()){
            URL url = resources.nextElement();
            files.add(new File(url.getFile()));
        }
        List<Class> classes = new ArrayList<>();
        for (File directory: files) {
            classes.addAll(findClasses(directory,packageName));
        }
        return  classes;
    }

    /**
     * 查找文件下的所有字节码文件并返回字节码对象
     * @param directory 文件夹对象
     * @param packageName 包名
     * @return 该文件下的所有字节码对象
     * @throws ClassNotFoundException
     */
    private static List<Class> findClasses(File directory,String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if(!directory.exists()){
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file:files){
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." +
                        file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' +
                        file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
