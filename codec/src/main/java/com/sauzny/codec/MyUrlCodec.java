package com.sauzny.codec;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.net.URLCodec;

public class MyUrlCodec {

    public static void main(String[] args) throws UnsupportedEncodingException {
        
        URLCodec urlCodec = new URLCodec();
        
        String data = "https://github.com";

        String encode = urlCodec.encode(data, StandardCharsets.UTF_8.toString());

        System.out.println("原文：" + data);
        System.out.println(data + " encode ：" + encode);
    }
}
