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
  - boolean 으로 모두 반환함. 
  - createNewFile() => 새로운 파일을 생성
  - mkdir => 새로운 폴더 생성
  - mkdirs => 경로상에 없는 모든 폴더 생성
  - delete => 파일 또는 디렉토리 삭제
- 파일 및 디렉토리의 정보를 리턴하는 메소드
  - boolean
    - delete() => 파일 또는 디렉토리 삭제
    - canExecute() => 실행할 수 있는 파일인지 여부
    - canRead() => 읽을 수 있는 파일인지 여부
    - canWrite() => 수정 및 저장할 수 있는 파일인지 여부
    - isFile() =>  파일인지 여부
    - isDirectory() => 디렉토리인지 여부
    - isHidden() => 숨김 파일인지 여부
  - long
    - lastModified() => 마지막 수정 날짜 및 시간을 리턴
    - length() => 파일의 크기 리턴
  - String
    - getName() => 파일의 이름을 리턴
    - getParent() => 부모 디렉토리를 리턴
    - getPath() =>  전체 경로를 리턴
  - String[]
    - list() =>  => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 String 배열로 리턴
    - list(FilenameFilter filter) => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에 FilenameFilter에 맞는 것만 String 배열로 리턴
  - File
    - getParentFile() => 부모 디렉토리를 File 객체로 생성 후 리턴
  - File[]
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