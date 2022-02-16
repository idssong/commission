package com.isurus.commission.crypto;

import org.springframework.security.crypto.password.PasswordEncoder;

public class SHA512PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
//        if (rawPassword == null) {
//            throw new IllegalArgumentException("rawPassword cannot be null");
//        }
//        String salt = getSalt();
//        return BCrypt.hashpw(rawPassword.toString(), salt);
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        if (rawPassword == null) {
//            throw new IllegalArgumentException("rawPassword cannot be null");
//        }
//        if (encodedPassword == null || encodedPassword.length() == 0) {
//            this.logger.warn("Empty encoded password");
//            return false;
//        }
//        if (!this.BCRYPT_PATTERN.matcher(encodedPassword).matches()) {
//            this.logger.warn("Encoded password does not look like BCrypt");
//            return false;
//        }
//        return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
        return false;
    }
}
