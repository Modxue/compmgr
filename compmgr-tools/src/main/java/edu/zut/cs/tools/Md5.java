package edu.zut.cs.tools;

import org.springframework.util.DigestUtils;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/21 12:29
 */
public class Md5 {
    /**
     *
     * @param text 明文
     * @return 密文
     * @throws Exception
     */
    public String lock(String text) {
        //加密后的字符串
        String key = "computer";
        String encodeStr=DigestUtils.md5DigestAsHex((text+key).getBytes());
        return encodeStr;
    }
}
