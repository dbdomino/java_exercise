## System 콘솔 입출력
### 콘솔
- 시스템을 사용하기 위해 키보드로 입력을 받고 화면으로 출력하는 소프트웨어
- Unix, Linux: 터미널
- Windows 운영체제 : 명령 프롬프트
- 이클립스: Console 뷰
  - System.in 입력스트림
  - System.out 출력스트림
  - System.err 출력스트림 (에러메시지 출력)

### System.in 필드
- InputStream 타입의 입력 스트림이므로 InputStream 변수에 대입할 수 있다.
  - >InputStream is= System.in;
- 읽은 Byte는 키보드의 아스키 코드(ascii code) 이다.
  - >int asciiCode = is.read();
- 아스키 코드로부터 문자 읽기
  - >char inputChar = (char) is.read();

### java.util.Scanner
- 콘솔로부터 기본 타입의 값을 바로 읽을 수 있다.
- Scanner sc = new Scanner(System.in)
- nextBoolean() / boolean 값으로 읽는다.
- nextByte() / byte 값으로 읽는다.
- nextInt() / Int 값으로 읽는다.
- nextLong() / long 값으로 읽는다.
- nextFloat() / float 값으로 읽는다.
- nextDouble() / double 값으로 읽는다.
- nextLine() / String 값으로 읽는다.
  