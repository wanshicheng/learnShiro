package org.wanshicheng.cipher;

import junit.framework.Assert;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;
import org.junit.Test;

/**
 * Created by Administrator on 2016/10/9.
 */
public class CipherTest {

    @Test
    public void base64Test() {
        String str = "hello";
        String base64Encoded = Base64.encodeToString(str.getBytes());
        System.out.println(base64Encoded);
        String str2 = Base64.decodeToString(base64Encoded);
        Assert.assertEquals(str, str2);
    }

    @Test
    public void hexTest() {
        String str = "hello";
        String hexEncoded = Hex.encodeToString(str.getBytes());
        String str2 = new String(Hex.decode(hexEncoded.getBytes()));
        System.out.println(hexEncoded);
        Assert.assertEquals(str, str2);
    }
}
