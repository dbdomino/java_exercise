package com.javastudy.exam.inputoutput.system_in_out;

import java.io.Console;

public class ConsoleEx {
    public static void main(String[] args) {
        Console console = System.console(); // Console 은 cmd에서 실행하지 않으면 null을 발생시킴

        System.out.print("아이디: ");
        String id = console.readLine();

        System.out.print("패스워드: ");
        char[] charPass = console.readPassword();
        String strPasswd = new String(charPass);

        System.out.println("-----------");
        System.out.println(id);
        System.out.println(strPasswd);

    }
}
