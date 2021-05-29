/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casado.hash_calculator;

import java.util.Base64;

/**
 *
 * @author podiaserpior
 */
public class Hex {

    public static String encrypt(String input) {
        StringBuffer sb = new StringBuffer();

        char ch[] = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            String encoded = Integer.toHexString(ch[i]);
            sb.append(encoded);
        }

        String encodedString = sb.toString();
        return encodedString;

    }

    public static String decrypt(String encodedString) {
        String decodedString = new String();
        
        char[] charArray = encodedString.toCharArray();
        for (int i = 0; i < charArray.length; i = i + 2) {
            String st = "" + charArray[i] + "" + charArray[i + 1];
            char ch = (char) Integer.parseInt(st, 16);
            decodedString = decodedString + ch;
        }
        System.out.println(decodedString);

        return decodedString;
    }
}
