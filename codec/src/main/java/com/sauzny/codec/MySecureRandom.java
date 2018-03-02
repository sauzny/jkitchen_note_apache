package com.sauzny.codec;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;

/**
 * *************************************************************************
 * @文件名称: MySecureRandom.java
 *
 * @包路径  : com.sauzny.codec 
 *				 
 * @版权所有: Personal xinxin (C) 2017
 *
 * @类描述:   生成盐值，推荐使用
 * 
 * @创建人:   ljx 
 *
 * @创建时间: 2018年3月2日 - 上午9:00:59 
 *	
 **************************************************************************
 */
public class MySecureRandom {

    public static String createSalt(Random random){
        byte[] salt = new byte[8];
        random.nextBytes(salt);    
        String str = Base64.encodeBase64URLSafeString(salt);
        return str;
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        Random random = SecureRandom.getInstanceStrong();

        for(int i=0;i<10; i++){
            long a = System.currentTimeMillis();
            String salt = MySecureRandom.createSalt(random);
            long b = System.currentTimeMillis();
            
            System.out.println("生成salt：" + salt + " 耗时：" + (b-a));
        }
    }
}
