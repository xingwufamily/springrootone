import cn.MyClassLoader;
import cn.MyClassLoader2;
import cn.designmodel.SingleMode.SingleModeOne;
import cn.designmodel.iterator.TestArrayList;
import cn.designmodel.iterator.TestIterator;
import cn.designmodel.iterator.TestList;
import cn.designmodel.observe.Product;
import cn.designmodel.observe.ProductNameOb;
import cn.designmodel.observe.ProductPriceOb;
import cn.designmodel.responsibilityOfchain.*;
import cn.designmodel.state.ManagerState;
import org.junit.Test;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JustTest {
    private int b;
    @Test
    public void test1() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {
        MyClassLoader ml = (MyClassLoader)Class.forName("cn.MyClassLoader").newInstance();
        MyClassLoader2 m2 = (MyClassLoader2)Class.forName("cn.MyClassLoader2").newInstance();
        System.err.println(ml.getParent());
        Class s1 = ml.loadClass("D://SingleModeOne");
        Class s2 = m2.loadClass("E://SingleModeOne");
        System.err.println(s1 == s2);

    }
    @Test
    public void test2() throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("notepad 111.txt",new String[]{},new File("d:/"));
        try {
            int i=p.exitValue();
            while(i!= 0){
                i=p.exitValue();
            }
            System.err.println("-----");
        } catch (Exception e) {
            e.printStackTrace();
        }
        p.destroy();
    }
    @Test
    public void test3(){
        double f = 0.026;
        System.err.println(String.format("%.2f%%",f));
        List list = new ArrayList();
        String c=null;
        list.stream().filter( a -> a.equals(c));
        list.stream().filter( a -> {return a.equals(c);});
        list.iterator();
    }
    @Test
    public void test4(){
        System.err.println(TestEnum2.E2.ordinal());
    }
}
enum TestEnum{
    A(1),B(2);
    private int a;
    private TestEnum(int a){
        this.a=a;
    }
    public int getInt(){
        return a;
    }
}