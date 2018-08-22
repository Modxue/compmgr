package edu.zut.cs.tools.test;

import edu.zut.cs.tools.Md5;
import org.junit.Test;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/21 12:31
 */
public class Md5Test {

    /**
     * 测试MD5加密工具方法
     */
    @Test
    public void md5Test(){
        String key = "123";
        String encodeKey = new Md5().lock(key);
        System.out.println(encodeKey);
    }
}
