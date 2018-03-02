package com.sauzny.codec;

import org.apache.commons.codec.digest.DigestUtils;

public class MyHash {

    public static void md5(){
        
        String data="MD5";
        String hex = DigestUtils.md5Hex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void md2(){
        
        String data ="MD2";
        String hex = DigestUtils.md2Hex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }

    public static void sha1(){
        
        String data ="sha1";
        String hex = DigestUtils.sha1Hex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }
    
    public static void sha256(){
        
        String data ="sha256";
        String hex = DigestUtils.sha256Hex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }
    
    public static void sha384(){
        
        String data ="sha384";
        String hex = DigestUtils.sha384Hex(data);

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }
    
    public static void sha512(){
        
        String data ="sha512";
        String hex = DigestUtils.sha512Hex(data);
        
        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + hex);
    }
    
    public static void main(String[] args) {
        MyHash.md2();
        MyHash.md5();
        MyHash.sha1();
        MyHash.sha256();
        MyHash.sha384();
        MyHash.sha512();
    }
}
