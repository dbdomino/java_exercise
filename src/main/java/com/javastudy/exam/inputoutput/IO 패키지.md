## IO 패키지
### java.io 패키지
- 자바의 기본적인 데이터 입출력(IO: 
- Input/Output)API 제공
- 기본적으로 바이트 단위 입출력 / 문자 단위 입출력 으로 나뉘는 듯하다.
  - File : 파일 시스템의 파일의 정보를 얻기위한 클래스
  - Console : 콘솔로부터 문자를 입출력하기 위한 클래스
  - InputStream / OutputStream  : 바이트 단위 입출력을 위한 최상위 입출력 스트림 클래스
  - FileInputStream / FileOutputStream : 바이트 단위 입출력을 위한 하위 스트림 클래스<br>
    DataInputStream / DataOutputStream<br>
    ObjectInputStream / ObjectOutputStream<br>
    PrintStream<br>
    BufferedInputStream / BufferedOutputStream<br>
  - Reader / Writer : 문자 단위 입출력을 위한 최상위 입출력 스트림 클래스
  - FileReader / FileWriter : 문자 단위 입출력을 위한 하위 스트림 클래스
  InutStreamReader / OutputStreamWriter<br>
  PrintWriter<br>
  BufferedReader / BufferedWriter<br>
### 바이트 기반 스트림과 문자 기반 스트림
- 바이트 기반 스트림
  - 그림, 멀티미디어, 문자 등 모든 중류의 데이터를 받고 보낼 수 있다.
- 문자 기반 스트림
  - 문자만 받고 보낼 수 있도록 특화되어 있다.
- ![streaminout01.png](picture%2Fstreaminout01.png)
- 입력받을때는 InputStream, Reader 기반으로 받는다.
- 보낼때는 OutputStream, Writer 기반으로 보낸다.
### inputStream
- 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
- 주요 메소드로
  - read(int b), read(byte[] b) read(byte[] b, int off, int len)
  - close() // 스트림은 사용 한 경우 close() 해주는걸 권장, 메모리를 반환
  - InputStream에서 사용했던 시스템 자원을 풀어주며 더이상 사용하지 않을경우 호출한다.
  ```
  InputStream is = new FileInputStream("파일경로:");
  int readByte;
  while ( (readByte = is.read()) != -1 ) {  // readByte = is.read() 비교가 아니라 대입, 읽을게 없으면 -1 반환
     ....
  }
  ```
### outputStream
- 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
  - FileOutputStream, PrintStream, BufferedOutputStream, DataOutputStream
- 주요 메소드
  - write(int b), write(byte[] b) write(byte[] b, int off, int len) 출력 스트림으로 n 바이트 보내기, 바이트 배열을 보내기
  - flush() 버퍼에 잔류하는 모든 바이트를 출력하기
  - close() 사용한 시스템 자원을 반납하고 출력 스트림 닫기

### Reader
- 문자기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
- Reader <- FileReader BufferedReader InputStreamReader
- 주요 메소드 (한 문자는 2byte로 되어있으므로 한문자 읽을때 2byte 읽음)
  - read() read() read(char[] cbuf) read(char[] cbuf, int off, int len)  
  - close() 사용한 시스템 자원을 반납하고 출력 스트림 닫기

### Writer
- 문자 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
- Writer <- FileWriter BufferedWriter PrintWriter OutputStreamWriter
- Writer의 주요 메소드
  - write(int c) write(char[] cbuf) write(char[] cbuf, int off, int len)
  - write(String str) write(String str, int off, int len)
  - flush()  // 버퍼에 잔류하는 모든 바이트를 출력하기, writer()를 쓴 뒤엔 반드시 flush를 해주자. 버퍼를 비우기 위해
  - close() 사용한 시스템 자원을 반납하고 출력 스트림 닫기