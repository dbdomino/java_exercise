package com.javastudy.exam.inputoutput.system_in_out;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.println("이름 : ");

        int nameBytes = is.read(datas); // 읽은 데이터, 키보드로 입력한게, read()를 통해 datas로 들어간다.
        String name = new String(datas, 0 , nameBytes-1); // 라인 피드 1byte를 빼서 해당한줄의 내용만 출력시키기 위함.

        System.out.println("하고싶은말: ");
        int commandBytes = is.read(datas); // 읽은 데이터, 키보드로 입력한게, read()를 통해 datas로 들어간다.
        String command = new String(datas, 0 , commandBytes-1); // 라인 피드 1byte를 빼서 해당한줄의 내용만 출력시키기 위함.

        System.out.println("이름 : "+name); // 요로�
        System.out.println("하고싶은말: "+command); // 마시루입니�

    }
}
