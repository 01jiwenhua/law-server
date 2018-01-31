package com.shx.law;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String smsParam = String.format("{code:'%s',product:'%s'}", "1234", "互联司机");
        System.out.println(smsParam);
    }
}
