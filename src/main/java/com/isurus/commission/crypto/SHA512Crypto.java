package com.isurus.commission.crypto;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512Crypto {
    public String encode(String raw) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(raw.getBytes());
        return String.format("%0128x", new BigInteger(1, md.digest()));
    }
}
