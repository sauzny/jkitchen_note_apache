package com.sauzny.codec;

import org.mindrot.jbcrypt.BCrypt;

public class MyBCrypt {

    public static void main(String[] args) {

        // javascript 实现 https://github.com/nevins-b/javascript-bcrypt
        
        System.out.println(BCrypt.gensalt(4));
        System.out.println(BCrypt.gensalt());
        
        String plain = "a";
        String salt = BCrypt.gensalt(4);
        String expected = "$2a$06$m0CrhHm10qJ3lXRY.5zDGO3rS2KdeeWLuGmsfGlMfOxih58VYVfxe";
        
        long a = System.currentTimeMillis();
        
        String hashed = BCrypt.hashpw(plain, salt);
        
        long b = System.currentTimeMillis();
        
        System.out.println(hashed);
        
        System.out.println(b-a);
        
        System.out.println(BCrypt.checkpw(plain, expected));
    }
}
