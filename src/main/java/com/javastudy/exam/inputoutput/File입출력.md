## 파일 입출력
### File 클래스
- 파일 시스템의 파일을 표현하는 클래스
  - 파일 크기, 파일 속성, 파일 이름 등의 정보 제공
  - 파일 생성 및 삭제 기능 제공
  - 디렉토리를 생성하고 디렉토리에 존재하는 파일 리스트를 얻어내는 기능 제공
- 파일 객체 생성
  - > File file = new File("C:\\Temp\\file.txt");<br>File file = new File("C:/Temp/file.txt");
- 파일 또는 디렉토리 존재 유무 확인 메소드
  - > boolean isExist = file.exists();
- 파일 및 디렉토리 생성 및 삭제 메소드
  - boolean 반환. 
    - createNewFile() => 새로운 파일을 생성
    - mkdir => 새로운 폴더 생성
    - mkdirs => 경로상에 없는 모든 폴더 생성
    - delete => 파일 또는 디렉토리 삭제
- 파일 및 디렉토리의 정보를 리턴하는 메소드
  - boolean 반환.
    - delete() => 파일 또는 디렉토리 삭제
    - canExecute() => 실행할 수 있는 파일인지 여부
    - canRead() => 읽을 수 있는 파일인지 여부
    - canWrite() => 수정 및 저장할 수 있는 파일인지 여부
    - isFile() =>  파일인지 여부
    - isDirectory() => 디렉토리인지 여부
    - isHidden() => 숨김 파일인지 여부
  - long 반환.
    - lastModified() => 마지막 수정 날짜 및 시간을 리턴
    - length() => 파일의 크기 리턴
  - String 반환.
    - getName() => 파일의 이름을 리턴
    - getParent() => 부모 디렉토리를 리턴
    - getPath() =>  전체 경로를 리턴
  - String[] 반환.
    - list() => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 String 배열로 리턴
    - list(FilenameFilter filter) => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에 FilenameFilter에 맞는 것만 String 배열로 리턴
  - File 반환.
    - getParentFile() => 부모 디렉토리를 File 객체로 생성 후 리턴
  - File[] 반환.
    - listFiles() => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 File 배열로 리턴
    - listFiles(FilenameFilter filter) => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에 FilenameFilter에 맞는 것만 File 배열로 리턴
### Files 클래스
- Files class는 정적 메소드로 구성되어 있기 때문에 File 클래스처럼 객체로 만들 필요가 없다.
- Files의 정적 메소드는 운영체제의 파일 시스템에게 파일 작업을 수행하도록 위임한다.
- Files 클래스의 static 메소드
  - 복사 copy
  - 생성 createDirectories, createDirectory, createFile, createLink, createSymbolicLink, createTempDirectory, createTempFile
  - 이동 move
  - 삭제 delete, deletelfExists
  - 존재 검색 비교 exists, notExists, find, mismatch
  - 속성 getLastModifiedTime, getOwner, getPosixFilePermissions, isDirectory, isExecutable, isHidden, isReadable, isSymbolicLink, isWritable, size, setAttribute, setLastModifiedTime, setOwner, setPosixFilePermissions, probeContentType
  - 디렉토리 탐색 list, newDirectoryStream, walk
  - 데이터 입출력 newInputStream, newOutputStream, newBufferedReader, newBufferedWriter, readAllBytes, lines, readAll Lines, readString, readSymbolicLink, write, writeString
- Paths 정적 메소드
  ```
    Path path = Paths.get(String first, String... more)
  
  Path path = Paths.get("C:/Temp/dir/file.txt");
  Path path = Paths.get("C:/Temp/dir", "file.txt");
  Path path = Paths.get("C", "Temp", "dir", "file.txt");
  
  Path path = Paths.get("dir/file.txt"); 
  Path path = Paths.get("./dir/file.txt");
  ```
- Files 클래스 예제 832

### FileInputStream
- 파일로부터 바이트 단위로 읽어들일 때 사용
  - 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류를 읽어들일 수 있다.
- 객체 생성방법
  ```
  // 첫번째 방법
  FileInputStream fis = new FileInputStream("C:/Temp/image.png");
  
  // 두번째 방법
  File file = new File("C:/Temp/image.png");  
  FileInputStream fis = new FileInputStream(file);
  ```
  - FileInputStream 객체가 생성될 때 new FileInputStream(file); 처럼 파일객체를 넣어 파일과 연결
  - 만약 파일이 존재하지 않으면 FileNotFoundException 을 발생
  - try-catch문으로 예외 처리 해야함.
- InputStream 하위 클래스이므로 사용방법이 InputStream과 동일

### FileOutputStream
- 파일에 바이트 단위로 데이터를 저장할 때 사용
  - 그림, 오디오, 비디오, 텍스트등 모든 종류의 데이터를 파일로 저장할 수 있다.
- 객체 생성 방법
  ```
  // 첫번째 방법
  FileOutputStream fos = new FileOutputStream("C:/Temp/image.png");
  
  // 두번째 방법
  File file = new File("C:/Temp/image.png");  
  FileOutputStream fos = new FileOutputStream(file);
  ```
  - 파일이 이미 존재할 경우, 데이터를 출력하게 되면 파일을 덮어쓰게 됨.
  - 기존 파일 내용 끝에 데이터를 추가하려면(데이터를 추가하며 작성, append) 아래 예시처럼 하면 된다. 
  ```
  FileOutputStream fos = new FileOupputStream("C:/Temp/data.txt", true);
  FileOutputStream fos = new FileOupputStream(file, true); 
  ```
- OutputStream 하위 클래스이므로 사용 방법이 OutputStream과 동일하다.

### FileReader
- 텍스트 파일로부터 데이터를 읽어 들일 때 사용
  - 문자 단위로 읽기 때문에 텍스트가 아닌 그림, 오디오, 비디오 등의 파일은 읽을 수 없다.
- 객체 생성 방법
  ```
  // 첫번째 방법
  FileReader fr = new FileReader("C:/Temp/file.txt");
  
  // 두번째 방법
  File file = new File("C:/Temp/file.txt");
  FileReader fr = new FileReader(file);
  ```
  - FileReader 객체가 생성될 때 파일과 직접 연결
  - 만약 파일이 존재하지 않으면 FileNotFoundException을 발생
  - Try-catch문으로 예외 처리를 해야 한다.
- Reader 하위 클래스이므로 사용 방법이 Reader와 동일

### FileWriter
- 텍스트 파일에 문자 데이터를 저장할 때 사용
  - 텍스트가 아닌 그림, 오디오, 비디오 등의 데이터를 파일로 저장할 수 없다.
- 객체 생성 방법
  ```
  // 첫번째 방법
  FileWriter fw = new FileWriter("C:/Temp/file.txt");
  
  // 두번째 방법
  File file = new File("C:/Temp/file.txt");
  FileWriter fw = new FileWriter(file);
  ```
  - 파일이 이미 존재할 경우, 데이터를 출력하게 되면 파일을 덮어쓰게 됨.
  - 기존 파일 내용 끝에 데이터를 추가하려면 아래처럼 하면 된다. (이어 붙이기, append)
  ```
  FileWriter fw = new FileWriter("C:/Temp/file.txt", true);
  FileWriter fw = new FileWriter(file);
  ```
- Writer 하위 클래스이므로 사용 방법이 Writer 와 동일
