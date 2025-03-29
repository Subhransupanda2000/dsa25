package com.basics;

public class PalindromeDemo {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(PalindromeDemo.isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

}
