package com.javastudy.exam.inputoutput.system_in_out;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;

        String name = "홍길";
        byte[] nameBytes= name.getBytes();

        os.write(nameBytes);
        os.flush();
        // ------------------------------------
        for(byte b=48; b<58; b++) {
            os.write(b);
        }
        os.write(10); // 줄바꿈 쓰기

        for(byte b=97; b<123; b++) {
            os.write(b);
        }
        os.write(10); // 줄바꿈 쓰기

        String hangul = "가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);

        os.flush();


        os.close();
    }
}
