Tổng quan: Một ngoại lệ là một lỗi phát sinh tại thời điểm chạy chương trình <span style='color: red;'>(run-time-error) </span>
# 1. Hệ thống phân cấp ngoại lệ
- Trong Java, tất cả các ngoại lệ đều được đại diện bởi các lớp. Tất cả các lớp ngoại lệ đều được bắt nguồn từ một lớp tên là **Throwable**. Có 2 lớp trực tiếp của **Throwable** là **Exception** và **Error**.
  - Error liên quan đến các lỗi phát sinh bởi máy ảo Java. Các lỗi này nằm ngoài kiểm soát của DEV, thông thường các chương trình không thể xử lý được chúng.
  - Exception phát sinh do hoạt động của chương trình\
    Ví dụ: lỗi chia cho 0; giới hạn mảng
# 2. Các kiểu ngoại lệ
- Có hai loại ngoại lệ chính là: **checked**, **unchecked** và error. Còn Sun Microsystem nói rằng có ba loại ngoại lệ là thêm **error**
  - Checked: được **extends** từ lớp **Throwable** ngoại trừ **RuntimeException** và **Error**. Được sử dụng bằng các câu lệnh **truy-catch** và **throws**.
  - Unchecked: được **extends** từ **RuntimeException**.
  - Error: Error là lỗi không thể cứu chữa được.\
    Ví dụ: OutOfMemoryError, VirtualMachineError, AssertionError
- Khác nhau giữa Checked và Unchecked
  - **Checked** được thực hiện lúc biên dịch chương trình.
  - **Unchecked** được thực hiện lúc trong lúc chạy chương trình
# 3. Cơ bản về kiểm soát ngoại lệ
- Cơ chế kiểm soát ngoại lệ của Java xoay quanh 5 từ khóa là: **try, catch, throw, throws, finally**
## 3.1. Sử lý truy và catch
- Khối lệnh **try** trong Java được sử dụng để chứa một đoạn code có thế xảy ra một ngoại lệ. Nó phải được khai báo trong phương thức.
- Dạng tổng quát
  ```java
  try {  
   // code có thể ném ra ngoại lệ
  } catch(Exception_class_Name ref) {
  // code xử lý ngoại lệ
  }
  ```
- Một lệnh **truy** không thể đứng 1 mình nó bắt buộc phải có **catch** hay **finally**, hay cả 2.
- Một lệnh **truy** có thể **kết hợp** với nhiều **hơn một lệnh catch**. Tuy nhiên, mỗi lệnh catch cần bắt một kiểu ngoại lệ khác nhau, nếu không chương trình xẽ bị lỗi
## 3.2. Hậu quả của một ngoại lệ không được bắt
- Việc bắt ngoại lệ ngăn không cho chương trình dừng thực thi một cách bất thường.
- Nếu lỗi sảy ra thì máy ảo Java (JWM) sẽ làm nhiệm vụ này. Cơ chế mặc định của JVM là dừng thư thi chương trình và hiển thị dò vết ngăn xếp (stack trace) cùng thông báo lỗi (error message)
## 3.3. Sử dụng nhiều lệnh catch
- Một lệnh **truy** có thể **kết hợp** với nhiều **hơn một lệnh catch**.
- Tuy nhiên, mỗi lệnh catch cần bắt một kiểu ngoại lệ khác nhau, nếu không chương trình xẽ bị lỗi
## 3.4. Bắt các ngoại lệ lớp con
- Một mệnh đề catch bắt được ở lớp cha thì sẽ bắt được tất cả các ngoại lệ lớp con.
- Nếu muốn bắt đồng thời lớp cha và con thì phải đặt lệnh catch lớp con trên lớp cha, nếu không sẽ gây lỗi
## 3.5. Các khối try có thể lồng nhau
- Một khối truy có thể được lồng trong khối truy khác, và khối truy bên trong xẽ được thực thi trước
- Thông thường khối truy bên ngoài bắt các lỗi cự kỳ nguy hiểm, còn khối truy bên trong để kiểm soát các lỗi ít nguy hiểm hơn
## 3.6. Chuyển tiếp một ngoại lệ
- Một ngoại lệ bị bắt bởi lện catch có thể được chuyển tiếp ra lệnh catch nằm bên ngoài.
- Việc chuyển tiếp ngoại lệ cho phép nhiều ngoại lệ khác nhau có thể truy cập đến cùng một ngoại lệ
# 4. Đưa ra một ngoại lệ - Throw
- Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ tùy chỉnh (**ngoại lệ do người dùng tự định nghĩa**) một trong hai ngoại lệ checked hoặc unchecked. Luồng chạy của chương trình sẽ bị **ngừng** ngay sau khi **throw được gọi**
- Sử dụng throw bằng cách sử dụng try-catch hoặc khai báo throws trong khai báo phương thức
- Dạng tổng quát
    ```java
    throw exceptOb;
    ```
    Ở đây, exceptOb là đối tượng của lớp ngoại lệ bắt ngồn từ **Throwable**
## 5. Tìm hiểu về Throwable
- Tất cả các ngoại lệ đều được hỗ trợ các phương thức do Throwable định nghĩa.
- Hai phương thức hay nhất được Throwable định nghĩa là: **printStackTrace() và toString()**.

|           Phương thức         |                       Mô tả                       |
|:------------------------------|:--------------------------------------------------|
|Throwable fillInStackTrace()   |Trả về một đối tượng Throwable chứa một ngăn xếp lưu vết đầy đủ. Đối tượng này có thể chuyển tiếp được|
|String getLocalizedMessage()   |Trả về mô tả ngoại lệ đã được bản địa hóa|
|String getMessage()    |Trả về mô tả ngoại lệ|
|void printStrackTrace()    |Hiển thị ngăn xếp lưu vết|
|void printStrackTrace (PrintStream stream)|Gửi ngăn xếp lưu vết đến một luồng nào đó|
|String toString()  |Trả về một đối tượng String chứa mô tả đầy đủ về ngoại lệ|
# 6.Sử dụng finally
- Khối lệnh **finally** trong Java **luôn được thực thi** khi kết thúc khối try/catch cho dù có ngoại lệ xảy ra hay không hoặc gặp lệnh return trong khối try.
- Dạng tổng quát
    ```java
    try{
        // đoạn mã theo dõi ngoại lệ
    }
    catch(ExcepType1 exOb){
        // đoạn mã kiểm soát lỗi ExcepType1
    }
    catch(ExcepType2 exOb){
        // đoạn mã kiểm soát lỗi ExcepType2
    }
    //...
    finally{
        // đoạn mã khối finally
    }
# 7. Sử dụng Throws
- Là khi một phương thức phát sinh ngoại lệ, nhưng lại không muốn bắt ngoại lệ đấy. Hay nói cách khác là lách qua ngoại lệ đấy
- Dạng tổng quát
    ```java
    kiểu-trả-về tên-pt() throws danh-sách-ngoại-lệ{  
        // phần thân của phương thức
    }
    ```
    ***danh-sách-ngoại-lệ*** là một danh sách các ngoại lệ mà phương thức có thể đưa ra bên ngoài
# 8. Các ngoại lệ có sẵn trong Java
- Trong gói java.lang, Java đã định nghĩa sẵn một lớp ngoại lệ

|               Ngoại lệ            |                Ý nghĩa                        |
|:----------------------------------|:----------------------------------------------|
|ArithmeticException    |Các lỗi số học, ví dụ: chia cho 0|
|ArrayIndexOutOfBoundsException |Lỗi chỉ số mảng vượt quá giới hạn|
|ArrayStoreException    |Phép gán các thành phần của mảng không phù hợp kiểu|
|ClassCastException |Ép kiểu không hợp lệ|
|IllegalArgumentException   |Tham số được sử dụng để gọi phương thức không hợp lệ|
|IllegalMonitorStateException   |Hoạt động monitor không hợp lệ, ví dụ như đợi trên một unlocked thread|
|IllegalStateException  |Môi trường hoặc ứng dụng không đúng trạng thái|
|IllegalThreadStateException    |Yêu cầu hoạt động không phù hợp với thread hiện tại|
|IndexOutOfBoundsException  |Chỉ mục ngoài giới hạn|
|NegativeArraySizeException |Tạo mảng với cỡ của mảng là số ấm|
|NullPointerException   |Sử dụng không hợp lệ với tham chiếu null|
|NumberFormatException  |Chuyển đổi thành số thất bại|
|SecurityException  |Vi phạm bảo mật|
|StringIndexOutOfBounds |Chỉ mục ngoài giới hạn của một string|
|UnsupportedOperationException  |Một hoạt động không được hỗ trợ gặp phải|
|ClassNotFoundException |Lớp không tồn tại|
|CloneNotSupportedException |Thử clone một đối tượng không triển khai Clonable interface|
|IllegalAccessException |Truy cập lớp bị từ chối|
|InstantiationException |Thử tạo mới một đối tượng từ lớp Abtract hoặc Interface|
|InterruptedException   |Một thread bị dừng lại bởi một thread khác|
|NoSuchFieldException   |Trường yêu cầu không tồn tại|
|NoSuchMethodException  |Phương thức yêu cầu không tồn tại|
# 9. Tạo lớp con ngoại lệ
- Là ngoại lệ do người dùng tự định nghĩa, được sử dụng để tùy biến ngoại lệ theo yêu cầu của người dùng
- Lớp con này xẽ được extends lớp Exception tức nó xẽ được kế thừa toàn bộ phương thức của lớp Throwable

