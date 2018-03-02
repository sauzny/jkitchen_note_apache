package com.sauzny.codec;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;

public class MyBase64 {

    public static void main(String[] args) {
        String str = "Base64";
        String encode = Base64.encodeBase64URLSafeString(str.getBytes(StandardCharsets.UTF_8));
        byte[] decodeBytes = Base64.decodeBase64(encode);

        System.out.println("原文：" + str);
        System.out.println("Base64 encode ：" + encode);
        System.out.println("Base64 decode ：" + new String(decodeBytes, StandardCharsets.UTF_8));
    }
}
