package com.e.c.a.h.integratedexamplev1.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hugoa on 5/12/2017.
 */

public class HashUtil {
    public static String getHash(long timestamp) {
        try {
            return md5(timestamp + Constants.PRIVATE_KEY + Constants.PUBLIC_KEY);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String md5(String s) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update(s.getBytes());

        byte msgDiggest[] = digest.digest();

        BigInteger bigInteger = new BigInteger(1, msgDiggest);
        String hashText = bigInteger.toString(16);

        while(hashText.length() < 32) {
            hashText = "0" + hashText;
        }

        return hashText;
    }
}
