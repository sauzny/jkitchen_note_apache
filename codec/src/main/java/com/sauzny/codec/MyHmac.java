package com.sauzny.codec;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

public class MyHmac {

    public static void HMAC_MD5(){
        String data = "HMAC_MD5";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void HMAC_SHA_1(){
        String data = "HMAC_SHA_1";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void HMAC_SHA_224(){
        String data = "HMAC_SHA_224";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_224, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void HMAC_SHA_256(){
        String data = "HMAC_SHA_256";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void HMAC_SHA_384(){
        String data = "HMAC_SHA_384";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void HMAC_SHA_512(){
        String data = "HMAC_SHA_512";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, "key");
        String hex = hmacUtils.hmacHex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }
    
    public static void main(String[] args) {
        MyHmac.HMAC_MD5();
        MyHmac.HMAC_SHA_1();
        MyHmac.HMAC_SHA_224();
        MyHmac.HMAC_SHA_256();
        MyHmac.HMAC_SHA_384();
        MyHmac.HMAC_SHA_512();
    }
}
