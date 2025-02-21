### Phương thức kiểm tra và so sánh chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|equals(String anotherString)|So sánh hai chuỗi, phân biệt chữ hoa và chữ thường.|
|equalsIgnoreCase(String anotherString)|So sánh hai chuỗi, không phân biệt chữ hoa và chữ thường.
|compareTo(String anotherString)|So sánh hai chuỗi theo thứ tự từ điển (lexicographically).|
|compareToIgnoreCase(String anotherString)|So sánh hai chuỗi không phân biệt hoa thường.|
|startsWith(String prefix)|Kiểm tra chuỗi có bắt đầu bằng prefix hay không.|
|startsWith(String prefix, int offset)|Kiểm tra chuỗi có bắt đầu bằng prefix từ vị trí offset.|
|endsWith(String suffix)|Kiểm tra chuỗi có kết thúc bằng suffix hay không.|
|contains(CharSequence sequence)|Kiểm tra chuỗi có chứa chuỗi con sequence hay không.|
|isEmpty()|Kiểm tra xem chuỗi có rỗng ("") hay không.|

#### Phương thức lấy dữ liệu từ chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|charAt(int index)|Lấy ký tự tại vị trí index.|
|length()|Lấy độ dài của chuỗi.|
|substring(int beginIndex)|Lấy chuỗi con từ vị trí beginIndex đến cuối.|
|substring(int beginIndex, int endIndex)|Lấy chuỗi con từ beginIndex đến endIndex - 1.|
|indexOf(String str)|Trả về vị trí xuất hiện đầu tiên của chuỗi str.|
|indexOf(String str, int fromIndex)|Tìm chuỗi str từ vị trí fromIndex.|
|lastIndexOf(String str)|Tìm vị trí xuất hiện cuối cùng của str.|

#### Phương thức thay đổi hoặc chuyển đổi chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|toUpperCase()| Chuyển chuỗi thành chữ hoa.|
|toLowerCase()| Chuyển chuỗi thành chữ thường.|
|trim()| Xóa khoảng trắng đầu và cuối chuỗi.|
|strip() (Java 11+)| Loại bỏ khoảng trắng đầu/cuối (tốt hơn trim()).|
|stripLeading() (Java 11+)|	Xóa khoảng trắng đầu chuỗi.|
|stripTrailing() (Java 11+)|	Xóa khoảng trắng cuối chuỗi.|
|replace(char oldChar, char newChar)| Thay thế ký tự trong chuỗi.|
|replace(CharSequence oldStr, CharSequence newStr)| Thay thế chuỗi con trong chuỗi.|
|replaceAll(String regex, String replacement)| Thay thế theo biểu thức chính quy.|
|replaceFirst(String regex, String replacement)| 	Thay thế lần xuất hiện đầu tiên của chuỗi khớp với regex|

#### Phương thức nối chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|concat(String str)| Nối chuỗi str vào cuối chuỗi hiện tại.|
|join(CharSequence delimiter, CharSequence... elements) (Java 8+)| Nối các phần tử với dấu phân cách delimiter.|
|+ (toán tử cộng chuỗi)| Nối hai chuỗi lại với nhau.|

#### Phương thức cắt chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|split(String regex)| Cắt chuỗi dựa trên biểu thức chính quy.|
|split(String regex, int limit)| Cắt chuỗi nhưng giới hạn số lượng phần tử.|

#### Phương thức định dạng chuỗi

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|format(String format, Object... args)| Trả về chuỗi theo định dạng giống printf().|
|valueOf(Object obj)| Chuyển đổi giá trị thành chuỗi.|

### Phương thức bảo mật và hiệu suất

|      Phương thức     |       Mô tả        |
|:------------------|:----------------------|
|intern()| 	Lưu chuỗi vào pool chuỗi để tối ưu bộ nhớ.|
|getBytes()| Chuyển chuỗi thành mảng byte|
|toCharArray()| Chuyển chuỗi thành mảng ký tự (char[]).|

#### ※ Một số nhóm phương thức quan trọng cần lưu ý khi lựa chọn sử dụng
|      Mục đích     |       Nên dùng        |
|:------------------|:----------------------|
|Kiểm tra chuỗi con| contains() (nếu chỉ cần kiểm tra) hoặc indexOf() (nếu cần biết vị trí)|
|So sánh chuỗi| equals() (so sánh nội dung), == (so sánh tham chiếu), compareTo() (so sánh từ điển)|
|Thay thế chuỗi| replace() (chuỗi cố định), replaceAll() (dùng regex), replaceFirst() (thay lần đầu)|
|Cắt chuỗi| split() (chia thành mảng), substring() (lấy một phần)

------------------------------------
1. Java String charAt()
-  Trả về ký tự tại chỉ mục chỉ định
- Cú pháp
    ```java
    public char charAt(int index)
    ```
- Ví dụ
    + FileName: CharAtExample.java
        ```java
        public class CharAtExample{  
        public static void main(String args[]){  
            String name="javatpoint";  
            char ch=name.charAt(4); //returns the char value at the 4th index  
            System.out.println(ch);  
        }}  
        ```
    + Output:
    ```java
    t
    ```
2. Java String compareTo()
- Dùng so sánh thứ tự của hai đối tượng, kết quả trả về là kiểu số nguyên (int)
+ **Số nguyên âm:** nếu đối tượng hiện tại nhỏ hơn đối tượng được so sánh.
+ **Số 0:** nếu hai đối tượng bằng nhau.
+ **Số nguyên dương:** nếu đối tượng hiện tại lớn hơn đối tượng được so sánh\
※ Phương thức compareTo() sử dụng thứ tự từ điển khi so sánh hai chuỗi. Điều này có nghĩa là các ký tự được sắp xếp theo thứ tự tăng dần trong bảng mã ASCII hoặc Unicode.
- Cú pháp:
    ```java
        public int compareTo(String anotherString)   
    ```
- Ví dụ:
    + FileName: CompareTo.java
        ```java
        public class CompareTo{  
            public static void main(String args[]){  
                String s1="hello";  
                String s2="hello";  
                String s3="meklo";  
                String s4="hemlo";  
                String s5="flag";  
                System.out.println(s1.compareTo(s2));   //0 because both are equal  
                System.out.println(s1.compareTo(s3));   //-5 because "h" is 5 times lower than "m"  
                System.out.println(s1.compareTo(s4));   //-1 because "l" is 1 times lower than "m"  
                System.out.println(s1.compareTo(s5));   //2 because "h" is 2 times greater than "f"  
            }}  
        ```
    + Output:
        ```java
        0
        -5
        -1
        2
        ```
3. Java String concat()
- Dùng để nối chuỗi đã cho vào phần cuối của chuỗi này
- Cú pháp
    ```java
    public String concat(String anotherString)    
    ```
- Ví dụ:
    + FileName: ConcatExample.java
        ```java
        public class ConcatExample{    
        public static void main(String args[]){    
            String s1="java string";    
            s1.concat("is immutable");  //chuỗi không thay đổi
            System.out.println(s1);    
            s1=s1.concat(" is immutable so assign it explicitly");    
            System.out.println(s1);    
        }}    
        ```
    + Output:
        ```java
        java string
        java string is immutable so assign it explicitly
        ```
- So sánh concat() với toán tử +
    + concat() có hiệu xuất cao hơn so với toán tử +, do nó tạo ra ít đối tượng trung gian hơn
    + Khi sử lý với giá trị null thì phương thức concat() đưa ra NullPointerException, còn toán tử + thì vẫn nối chuỗi được
4. Java String contains()
- Được sử dụng để kiểm tra xem một đối tượng có chứa một đối tượng khác hay không
- Cú pháp
    ```java
    public boolean contains(CharSequence sequence)
    ```
    + sequence: Chuỗi con cần kiểm tra
- Ví dụ:
    + File Name: ContainsExample.java
        ```java
        class ContainsExample{  
        public static void main(String args[]){  
            String name="what do you know about me";  
            System.out.println(name.contains("do you know"));  
            System.out.println(name.contains("about"));  
            System.out.println(name.contains("hello"));  
        }}  
        ```
    + Output:
        ```java
        true
        true
        false
        ```
5. Java String endsWith()
- Được sử dụng để kiểm tra xem một chuỗi có kết thúc bằng một chuỗi con cụ thể hay không
- Cú pháp:
    ```java
    public boolean endsWith(String suffix)   
    ```
- Ví dụ:
    + FileName: EndsWithExample.java
        ```java
        public class EndsWithExample{  
        public static void main(String args[]){  
            String s1="java by javatpoint";
            System.out.println(s1.endsWith("point"));
            System.out.println(s1.endsWith("java")); 
        }}  
        ```
    + Output:
        ```java
        true
        false
        ```
6. Java String equals()
- Được sử dụng để kiểm tra xem hai chuỗi có bằng nhau hay không, phân biệt chữ hoa và chữ thường
- Cú pháp:
    ```java
    public boolean equals(Object anotherObject)  
    ```
- Ví dụ:
    + FileName: EqualsExample.java
        ```java
        public class EqualsExample{  
        public static void main(String args[]){  
            String s1="javatpoint";
            String s2="javatpoint";
            String s3="Javatpoint";
            String s4="python";
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s1.equals(s4));
        }}  
        ```
    + Output:
        ```java
        true
        false
        false
        ```
7. Java String equalsIgnoreCase()
- - Được sử dụng để kiểm tra xem hai chuỗi có bằng nhau hay không,  không phân biệt chữ hoa và chữ thường
- Cú pháp:
    ```java
    public boolean equalsIgnoreCase(String str) 
    ```
- Ví dự:
    + FileName: EqualsIgnoreCaseExample.java
        ```java
        public class EqualsIgnoreCaseExample{  
        public static void main(String args[]){  
            String s1="javatpoint";
            String s2="javatpoint";
            String s3="Javatpoint";
            String s4="python";
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s1.equals(s4));
        }}  
        ```
    + Output:
        ```java
        true
        true
        false
        ```
8. Java String format()
- Được sử dụng để tạo ra một chuỗi đã được định dạng theo một mẫu cụ thể, nó tương tự như hàm printf().
- Cú pháp:
    ```java
    public static String format(String format, Object... args)  
    //and
    public static String format(Locale locale, String format, Object... args)  
    ```
    + locale: Đối tượng Locale xác định vùng miền sẽ được áp dụng trong quá trình định dạng. Nếu locale là null, thì Locale mặc định của hệ thống sẽ được sử dụng
    + format: Chuỗi định dạng chứa các ký tự định dạng.
    + args: Các đối số cần được định dạng và chèn vào chuỗi định dạng.
- Ví dụ:
    + File Name: FormatExample.java
        ```java
        public class FormatExample{    
        public static void main(String args[]){    
            String formattedString = String.format(Locale.US, "Hello, %s! You have %d new messages.", "John", 5);
            System.out.println(formattedString);  
        }} 
        ```
    + Output:
        ```java
        Hello, John! You have 5 new messages.
        ```
9. Java String getBytes()
-  Được sử dụng để trả về mảng byte của chuỗi
- Cú pháp:
    ```java
    public byte[] getBytes()  
    public byte[] getBytes(Charset charset)  
    public byte[] getBytes(String charsetName)throws UnsupportedEncodingException  
    ```
    + **charset** là bộ ký tự (UTF_16, US_ASCII...) để mã hóa thành một mảng byte
- Ví dụ 1:
    + FileName: StringGetBytesExample.java
        ```java
        public class StringGetBytesExample{  
        public static void main(String args[]){  
            String s1="ABCDEFG";  
            byte[] barr=s1.getBytes();  
            for(int i=0;i<barr.length;i++){  
                System.out.println(barr[i]);  
            }  
        }}  
        ```
    + Output
        ```java
        65
        66
        67
        68
        69
        70
        71
        ```
- Ví dụ 2:
    + FileName: StringGetBytesExample2.java
        ```java
        public class StringGetBytesExample2{  
        public static void main(String args[]){  
            String str = "ABCDEFG"; 
            byte[] byteArr = str.getBytes(StandardCharsets.UTF_16);
            for(int i=0;i<barr.length;i++){  
                System.out.println(byteArr[i]);  
            }  
        }}  
        ```
    + Output
        ```java
        -2
        -1
        0
        65
        0
        66
        0
        67
        0
        68
        0
        69
        0
        70
        0
        71
        ```
10. Java String getChars()
- Được sử dụng để sao chép nội dung của chuỗi vào mảng char[]
- Cú pháp:
    ```java
    public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)    
    ```
    + int srcBeginIndex:  vị trí bắt đầu sao từ chép chuỗi
    + int srcEndIndex: ví trí kết thúc sao chép từ chuỗi
    + char[] destination: là mảng char[] chứa giá trị sao chép từ chuỗi
    + int dstBeginIndex: vị trí bắt đầu của mảng *destination*.
- Ví dụ:
    + FileName: StringGetCharsExample.java
        ```java
        public class StringGetCharsExample{  
        public static void main(String args[]){  
            String str = new String("hello javatpoint how r u");  
                char[] ch = new char[10];  
                try{  
                    str.getChars(6, 16, ch, 0);  
                    System.out.println(ch);  
                }catch(Exception ex){System.out.println(ex);}  
        }}  
        ```
    + Output:
        ```java
        javatpoint
        ```
    ※ Nếu nội dung sao chép lớn hơn giá trị được lưu (ch) sẽ pháp sinh lỗi, còn nếu giá trị sao chép bé hơn giá trị được lưu sẽ tạo ra các khoảng trắng.
11. Java String indexOf()
- Cho phép tìm kiếm vị trí xuất hiện đầu tiên của một chuỗi hoặc ký tự cụ thể trong một chuỗi
- Phương thức này trả về chỉ số (vị trí) của phần tử khớp đầu tiên được tìm thấy hoặc trả về -1 nếu không tìm thấy phần tử khớp nào. Nếu chuỗi con được tìm kiếm là một chuỗi rỗng sẽ trả về 0.
- Cú pháp:
    ```java
    public int indexOf(int ch)
    public int indexOf(int ch, int fromIndex)
    public int indexOf(String substring)
    public int indexOf(String substring, int fromIndex) 
    ```
    + ch: Ký tự cần tìm (được biểu diễn bằng mã Unicode).
    + fromIndex: Vị trí bắt đầu tìm kiếm trong chuỗi, loại bỏ các ký tự trước đấy nhưng vị trí đánh đấu vẫn bắt đầu từ ký tự đầu tiên của chuỗi
    + substring: Ký tự cần tìm
- Ví dụ:
    + FileName: IndexOfExample.java
        ```java
        public class IndexOfExample{  
        public static void main(String args[]){  
            String s1 = "this is index of example";

            int index1 = s1.indexOf(105);
            System.out.println(index1);

            int index2 = s1.indexOf(105,4);
            System.out.println(index2);

            int index3 = s1.indexOf(97,4);
            System.out.println(index3);

            int index4 = s1.indexOf("is");
            System.out.println(index4);

            int index5 = s1.indexOf("is", 4);
            System.out.println(index5);
        }}  
        ```
    + Output:
        ```java
        2
        5
        19
        2
        5
        ```
12. Java String intern()
- Khi chuỗi được tạo bởi từ khóa new, phương thức intern giúp chuyễn chuỗi đấy về vùng nhớ String pool
- Cú pháp:
    ```java
    public String intern()  
    ```
- Ví dụ:
    + FileName: InternExample.java
        ```java
        public class InternExample{  
        public static void main(String args[]){  
            String s1=new String("hello");  
            String s2="hello";  
            String s3=s1.intern();
            System.out.println(s1==s2); 
            System.out.println(s2==s3);
        }}  
        ```
    + Output
        ```java
        false
        true
        ```
13. Java String isEmpty()
- Được sử dụng để kiểm tra xem một chuỗi có rỗng hay không
- Cú pháp:
    ```java
    public boolean isEmpty()
    ```
- Ví dụ:
    + FileName: StringIsEmptyExample.java
        ```java
        public class StringIsEmptyExample {    
        public static void main(String args[]){    
            String s1="";    
            String s2="javatpoint";    
                
            System.out.println(s1.isEmpty());    
            System.out.println(s2.isEmpty());    
        }}  
        ```
    + Output
        ```java
        true
        false
        ```
14. Java String.join()
- Được dùng để nối tất cả các chuỗi bằng dấu phân tách chỉ định
- Cú pháp
    ```java
    public static String join(CharSequence delimiter, CharSequence... elements)    
    //and    
    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) 
    ```
    + delimiter: Chuỗi phân cách được sử dụng để ngăn cách các phần tử.
    + elements: Chứa các phần tử cần được nối.
- Ví dụ:
    + FileName: StringJoinExample.java
        ```java
        public class StringJoinExample{  
        public static void main(String args[]){  
            String joinString1=String.join("-","welcome","to","javatpoint");  
            System.out.println(joinString1);  

            // join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
            List<String> strList = new ArrayList<String>();
            strList.add("w3r");
            strList.add("Join");
            strList.add("Example");
            // joining with comma as delimiter
            String finalStr = String.join(";", strList);
            System.out.println(finalStr);
        }} 
        ```
    + Output:
        ```java
        welcome-to-javatpoint
        w3r;Join;Example
        ```
15. Java String lastIndexOf()
- Cho phép tìm kiếm vị trí xuất hiện đầu tiên của một chuỗi hoặc ký tự cụ thể trong một chuỗi
- Khác phương thức *indexOf* là tìm kiếm từ đầu chuỗi đến cuối chuỗi, còn ở phương thức *lastIndexOf* sẽ tìm kiếm từ cuối chuỗi đến đầu chuỗi. Nhưng vị trí đánh dấu vẫ từ trái qua phải
- Cú pháp
    ```java
    public int lastIndexOf(int ch)
    public int lastIndexOf(int ch, int fromIndex)
    public int lastIndexOf(String substring)
    public int lastIndexOf(String substring, int fromIndex)
    ```
- Ví dụ:
    + FileName: LastIndexOfExample.java
        ```java
        public class LastIndexOfExample{  
        public static void main(String args[]){  
            String s1 = "this is index of example";

            int index1 = s1.lastIndexOf(105);
            System.out.println(index1);

            int index2 = s1.lastIndexOf(105,4);
            System.out.println(index2);

            int index3 = s1.lastIndexOf("s");
            System.out.println(index3);

            int index4 = s1.lastIndexOf("s", 4);
            System.out.println(index4);
        }}  
        ```
    + Output:
        ```java
        8
        2
        6
        3
        ```
16. Java String.length()
- Trả về độ dài của chuỗi
- Cú pháp:
    ```java
    public int length()
    ```
- Ví dụ:
    + FileName: LengthExample.java
        ```java
        public class LengthExample{  
        public static void main(String args[]){  
            String s1="javatpoint";  
            String s2="python";  
            System.out.println("string length is: "+s1.length()); 
            System.out.println("string length is: "+s2.length());
        }}  
        ```
    + Output:
        ```java
        string length is: 10
        string length is: 6
        ```
17. Java String replace()
- Được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
- Cú pháp:
    ```java
    public String replace(char oldChar, char newChar)    
    public String replace(CharSequence target, CharSequence replacement)   
    ```
    + oldChar: Ký tự cần được thay thế
    + newChar: Ký tự mới sẽ thay thế
    + target: Chuỗi con cần được thay thế
    + replacement: Chuỗi mới sẽ thay thế
- Ví dụ:
    + File Name: StringReplaceDemo.java
        ```java
        public class StringReplaceDemo {  
        public static void main(String[] args) {  
            String str1 = "Hello World";
            String replaced1 = str1.replace("o", "*");
            System.out.println(replaced1);

            String str2 = "Java is awesome";
            String replaced2 = str2.replace("awesome", "fantastic");
            System.out.println(replaced2); 
        }}
        ```
    + Output:
        ```java
        Hell* W*rld
        Java is fantastic
        ```
18. Java String replaceAll()
- Ngoài việc thay thế chuỗi cũ thành ký tự hoặc chuỗi mới như phương thức *replace*. Phương thức *replaceAll* còn dựa trên biểu thức chính quy (regular expression) để thay thế bằng chuỗi mới.\
※ List danh dách biểu thức chính qua hay dùng\
https://gpcoder.com/2222-huong-dan-su-dung-bieu-thuc-chinh-quy-regular-expression-trong-java/
- Cú pháp:
    ```java
    public String replaceAll(String regex, String replacement)  
    ```
    + regex: Biểu thức chính quy để xác định nơi chia chuỗi
    + replacement: chuỗi ký tự thay thế
- Ví dụ:
    + FileName: ReplaceAllExample.java
        ```java
        public class ReplaceAllExample{  
        public static void main(String args[]){  
            String str = "trong dat 1998";

            // Thay thế tất cả các chữ số bằng ký tự #
            String result = str.replaceAll("\\d", "#");
            System.out.println(result)
        }} 
        ```
    + Output:
        ```java
        trong dat ####
        ```
19. Java String split()
-  Dùng để tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi\
※ List danh dách biểu thức chính qua hay dùng\
https://gpcoder.com/2222-huong-dan-su-dung-bieu-thuc-chinh-quy-regular-expression-trong-java/
- Cú pháp:
    ```java
    public String split(String regex)  
    and,  
    public String split(String regex, int limit)  
    ```
    + regex: Biểu thức chính quy để xác định nơi chia chuỗi
    + int: Số lượng phần tử tối đa trong mảng kết quả, nếu có nhiều phần hơn, các phần còn lại sẽ gộp vào phần cuối cùng
- Ví dụ:
    + FileName: SplitExample.java
        ```java
        public class SplitExample{  
        public static void main(String args[]){  
            String s1="java string split method by javatpoint";  
            String[] words=s1.split("\\s");
            for(String w:words){  
            System.out.println(w);  
            }  
            System.out.println("---------");
            String[] words2=s1.split("\\s",2);// mảng words2 chỉ chứa 2 phần tử
            for(String w:words2){
                System.out.println(w);
            }
        }}  
        ```
    + Output:
        ```java
        java
        string
        split
        method
        by
        javatpoint
        ---------
        java
        string split method by javatpoint
        ```
20. Java String startsWith()
- Được sử dụng để kiểm tra một chuỗi (chuỗi cha) có được bắt đầu bởi một chuỗi đã được chỉ định. 
- Cú pháp:
    ```java
    public boolean startsWith(String prefix)  
    public boolean startsWith(String prefix, int offset) 
    ```
    + prefix: Chuỗi con cần kiểm tra.
    + offset: Vị trí bắt đầu kiểm tra trong chuỗi gốc.
- Ví dụ:
    + FileName: StartsWithExample.java
        ```java
        public class StartsWithExample  
        {    
        public static void main(String args[])  
        {    
            String s1="java string split method by javatpoint";

            System.out.println(s1.EndsWith("ja"));
            System.out.println(s1.startsWith("javatpoint"));
            System.out.println(s1.startsWith("java", 1));
        } }  
        ```
    + Output:
        ```java
        true
        false
        true
        ```
21. Java String substring()
- Được sử dụng để trích xuất một phần của chuỗi, bắt đầu từ một chỉ số xác định và kéo dài đến một chỉ số khác hoặc đến cuối chuỗ
- Cú pháp:
    ```java
    public String substring(int startIndex)
    and    
    public String substring(int startIndex, int endIndex) 
    ```
    + startIndex: chỉ số bắt đầu cắt chuỗi
    + endIndex: chỉ số kết thúc cắt chuỗi
- Ví dụ:
    + FileName: SubstringExample.java
        ```java
        public class SubstringExample{  
        public static void main(String args[]){  
            String s1="javatpoint";  
            System.out.println(s1.substring(2,4));
            System.out.println(s1.substring(2));
        }}  
        ```
    + Output:
        ```java
        va
        vatpoint
        ```
22. Java String.toCharArray()
- Được sử dụng để chuyển đổi chuỗi thành các mảng ký tự.
- Cú pháp:
    ```java
    public char[] toCharArray()  
    ```
- Ví dụ:
    + File Name: StringToCharArrayExample.java
        ```java
        public class StringToCharArrayExample{  
        public static void main(String args[]){  
            String s1="hello";  
            char[] ch=s1.toCharArray();  
            for(int i=0;i<ch.length;i++){  
                System.out.println(ch[i]);  
            }
        }}
        ```
    + Output:
        ```java
        h
        e
        l
        l
        o
        ```
23. Java String toLowerCase()
- Được sử dụng để chuyển chuỗi về dạng chữ thường.
- Cú pháp:
    ```java
    public String toLowerCase()  
    public String toLowerCase(Locale locale)  
    ```
    + locale: Đối tượng Locale xác định quy tắc chuyển đổi ký tự thành chữ thường
- Ví dụ:
    + File Name: StringLowerExample
        ```java
        public class StringLowerExample{  
        public static void main(String args[]){  
            String s1="JAVATPOINT HELLO stRIng";
            String s1lower=s1.toLowerCase();
            System.out.println(s1lower);

            String eng = s1.toLowerCase(Locale.ENGLISH);
            System.out.println(eng);
        }}
        ```
    + Output:
        ```java
        javatpoint hello string
        javatpoint hello string
        ```
24. Java String toUpperCase()
- Được sử dụng để chuyển chuỗi về dạng chữ hoa
- Cú pháp:
    ```java
    public String toUpperCase()  
    public String toUpperCase(Locale locale)  
    ```
    + locale: Đối tượng Locale xác định quy tắc chuyển đổi ký tự thành chữ hoa
- Ví dụ:
    + File name: StringUpperExample.java
        ```java
        public class StringUpperExample{  
        public static void main(String args[]){  
            String s1="hello string";
            String s1upper=s1.toUpperCase();
            System.out.println(s1upper);

            String english = s1.toUpperCase(Locale.forLanguageTag("en"));
            System.out.println(english);
        }}  
        ```
    + Output:
        ```java
        HELLO STRING
        HELLO STRING
        ```
25. Java String.trim()
- Được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi
- Cú pháp:
    ```java
    public String trim()  
    ```
- Ví dụ:
    + File Name: StringTrimExample.java
        ```java
        public class StringTrimExample{  
        public static void main(String args[]){  
        String s1="  hello string   ";  
        System.out.println(s1+"javatpoint");
        System.out.println(s1.trim()+"javatpoint");
        }}
        ```
    + Output
        ```java
          hello string   javatpoint
        hello stringjavatpoint
        ```
26. Java String.valueOf()
- Được sử dụng để chuyển đối kiểu dữ liệu khác thành chuỗi
- Cú pháp:
    ```java
    public String trim()
    ```
- Ví dụ:
    + File name: StringValueOfExample.java
        ```java
        public class StringValueOfExample {
            public static void main(String[] args) {
                int value = 30;
                String s1 = String.valueOf(value);
                System.out.println(s1 + 10);
            }}
        ```
    + Output:
        ```java
        3010
        ```