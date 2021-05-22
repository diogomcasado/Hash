/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casado.hash_calculator;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;

/**
 *
 * @author podiaserpior
 */
public class Base_64 {

    public static String encrypt(String input) {
        String encodedString = Base64.getEncoder().encodeToString(input.getBytes());
        return encodedString;

    }

    public static String decrypt(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
}
