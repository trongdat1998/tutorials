1. Khái niện
- String cơ bản là một đối tượng đại diện cho chuỗi các ký tự được xắp xếp theo một trật tự nhất định
    ```java
    char[] ch = {'j','a','v','a','s','t','r','i','n','g'};
    String s = new String(ch);
    ```
    Thì Tương tự với 

    ```java
    String s = "javastring";
    ```
- Chúng ta có thể tạo String trong Java bằng cách sử dụng 3 lớp: lớp String, StringBuffer và StringBuilder
    + String là không thể thay đổi (immutable), và không cho phép có class con.
    + StringBuffer, StringBuilder có thể thay đổi (mutable)
    + StringBuilder và StringBuffer là giống nhau, nó chỉ khác biệt tình huống sử dụng có liên quan tới đa luồng (Multi Thread).\
    => Về tốc độ xử lý StringBuilder là tốt nhất, sau đó StringBuffer và cuối cùng mới là String.
3. String
- Cách 1:
    ```java
    String s1 = "Hello word"
    ```
    +  Mỗi khi bạn tạo một chuỗi ký tự, JVM sẽ kiểm tra "string constant pool" trước. Nếu chuỗi đã tồn tại trong pool, một tham chiếu đến đối tượng đã tồn tại sẽ được trả về. Nếu không, một đối tượng chuỗi mới sẽ được tạo và thêm vào pool
- Cách 2:
    ```java
    String object = new String("Hello World");
    ```
    + JVM luôn tạo ra một string object mới trong bộ nhớ heap (không phải trong pool)
4. Phương thức Equals vs ==
- Toán tử == có ý nghĩa là so sánh địa chỉ vùng bộ nhớ lưu trữ của đối tượng
- Phương thức equals() có ý nghĩa là so sánh nội dung của 2 string
- Ví dụ:
    ```java
    String s1 = "Hello";
    String s2 = "Hello"; 
    String s3 = s1;  
    String s4 = new String("Hello");  
    String s5 = new String("Hello"); 
    
    s1 == s1;         // true
    s1 == s2;         // true
    s1 == s3;         // true
    s1 == s4;         // false
    s4 == s5;         // false
    
    s1.equals(s3);    // true, cùng nội dung
    s1.equals(s4);    // true, cùng nội dung
    s4.equals(s5);    // true, cùng nội dung.
    ```
4. StringBuffer
    ```java
    StringBuffer buffer = new StringBuffer("Hello");
    buffer.append("Word")
    ```
5. StringBuider
    ```java
    StringBuffer buider = new StringBuffer("Hello");
    buffer.append("Word");
    ```
2. Các cách để tạo String object
- **String literal:** Java String literal được tạo bởi cách khai báo dùng dấu ngoặc kép
    ```java
    String s = "java string";
    ```
    ※ Mỗi khi bạn tạo một chuỗi ký tự, JVM sẽ kiểm tra "string constant pool" trước. Nếu chuỗi đã tồn tại trong pool, một tham chiếu đến đối tượng đã tồn tại sẽ được trả về. Nếu không, một đối tượng chuỗi mới sẽ được tạo và thêm vào pool
- **Bằng từ khóa new:** : 
    ```java
    String s = new String("welcome");
    ```
- JVM luôn tạo ra một string object mới trong bộ nhớ heap (không phải trong pool)