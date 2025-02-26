import com.xushu.SA;
import org.junit.Assert;
import org.junit.Test;

public class SureATest {
    @Test
    public void testA() {
        System.out.println("接口SureATestA测试！！！");
    }

    @Test
    public void testB() {
        System.out.println("接口SureATestB测试！！！");
    }

    @Test
    public void testC() {
        Integer age = 11;
        String name = "小小";
        SA sa = new SA();
        sa.setAge(age);
        sa.setName(name);
        System.out.println(sa.soutAge());
        System.out.println(sa.soutName());
        //这里设置了true，报告文件无打印信息，直接显示的是成功
        Assert.assertTrue("显示" + sa.soutName(), true);
    }
}