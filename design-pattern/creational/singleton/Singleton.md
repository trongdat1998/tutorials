# Singleton

## Khái niệm
- Chỉ tạo ra một đối tượng duy nhất trong suốt quá trình thực  thi trương chình.
## Được sử dụng trong những trường hợp nào?
- Đảm bảo chỉ có một thể hiện(instance) duy nhất của một class
- Việc quản lý việc truy cập tốt hơn vì chỉ có một thể hiện duy nhất.
## Nguyên tắc để tạo lên một Singleton
- **private constructor** giúp để hạn chế truy cập từ class bên ngoài.
- Thể hiện của đối tượng được đặt **private static final** đảm bảo biến chỉ được khởi tạo trong class.
- Có một method **public static** để return instance được khởi tạo ở trên.
## Các cách tạo Singleton trong code
- Trên thực tế chúng ta có rất nhiều cách để tạo ra một **Singleton** tuy nhiên mình sẽ chỉ giới thiệu những mẫu chính và thường gặp.
- Nên sử dụng **BillPughSingleton** vì có hiệu quả cao, sử dụng **Lazy Initialization** khi làm việc với ứng dụng đơn luồng, và **Double Check Locking** khi làm việc với ứng dụng đa luồng.
1. Eager initialization
+ Đối tượng được khởi tạo ngay khi được gọi đến
+ Nó có một nhược điểm là đối tượng được tạo nhưng không dùng tới.
- Note: Đây là các dễ nhất tuy nhiên nó dễ dàng bị phá vỡ bởi Reflection.
    ```java
    public class EagerInitialization {
        private EagerInitialization(){}
        private static final EagerInitialization INSTANCE = new EagerInitialization();
        public static EagerInitialization getInstance(){
            return INSTANCE;
        }
    }
    ```
2. Static block initialization
+ Cách làm tương tự như Eager initialization chỉ khác phần static block cung cấp thêm handle exception khi tạo instance.
    ```java
    public class StaticBlockSingleton {
        private StaticBlockSingleton() {}
        private static final StaticBlockSingleton INSTANCE;
        // Static block initialization for exception handling
        static {
            try {
                INSTANCE = new StaticBlockSingleton();
            } catch (Exception e) {
                throw new RuntimeException("Exception occured in creating singleton instance");
            }
        }
        public static StaticBlockSingleton getInstance() {
            return INSTANCE;
        }
    }
    ```
3. Lazy Initialization
+ Cách này đã khắc phục được nhược điểm của cách Eager initialization, chỉ khi nào getInstance() được gọi thì instance mới được khởi tạo
+ Cách này chỉ sử dụng tốt trong trường hợp **đơn luồng** (single-thread).
+ [Lưu ý:] Nhưng nếu có nhiều luồng (multi-thread) cùng chạy và cùng gọi đến hàm getInstance() tại cùng một thời điểm.
 Thì có thể có nhiều hơn 1 thể hiện của instance. Để khắc phục nhược điểm này chúng ta sử dụng **Thread Safe Singleton**.
    ```java
    public class LazyInitialization {
        private LazyInitialization(){}
        private static LazyInitialization instance;
        public static LazyInitialization getInstance(){
            if (instance == null){
                instance = new LazyInitialization();
            }
            return instance;
        }
    }
    ```
4. Thread Safe Singleton
+ Gọi **synchronized** (nó chỉ có thể được thực thi bởi một luồng (thread) duy nhất vào một thời điểm) trong hàm  **getInstance()**.
+ [Nhược điểm:]
	Một phương thức synchronized sẽ chạy rất chậm và tốn hiệu năng, bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread khác đang sử dụng.
+ [Lưu ý:]
	Có những tác vụ xử lý trước và sau khi tạo thể hiện không cần thiết phải block.
	Vì vậy chúng ta cần cải tiến nó đi 1 chút với **Double Check Locking Singleton**.
    ```java
    public class ThreadSafe {
        private ThreadSafe(){}
        private static volatile ThreadSafe instance;
        public static synchronized ThreadSafe getInstance(){
            if (instance == null){
                instance = new ThreadSafe();
            }
            return instance;
        }
    }
    ```
5. Double Check Locking Singleton
+ khai báo **volatile** cho instance để kiểm tra sự tồn tại thể hiện của lớp
    ```java
    public class DoubleCheckLocking {
        private DoubleCheckLocking(){}
        private static volatile  DoubleCheckLocking instance;
        public static DoubleCheckLocking getInstance(){
            if (instance == null){
                synchronized (DoubleCheckLocking.class){
                    if (instance == null){
                        instance = new DoubleCheckLocking();
                    }
                }
            }
            return instance;
        }
    }
    ```
6. Bill Pugh Singleton Implementation
+ Với cách làm này bạn sẽ tạo ra **static nested clas**s với vai trò 1 Helper khi muốn tách biệt chức năng cho 1 class function rõ ràng hơn.
+ Đây là cách thường hay được sử dụng và có hiệu suất tốt
    ```java
    public class BillPugh {
        private BillPugh() {}
        public static BillPugh getInstance() {
            return SingletonHelper.INSTANCE;
        }

        private static class SingletonHelper {
            private static final BillPugh INSTANCE = new BillPugh();
        }
    }
    ```
+ Khi Singleton được tải vào bộ nhớ thì SingletonHelper chưa được tải vào. Nó chỉ được tải khi và chỉ khi phương thức getInstance() được gọi. Với cách này tránh được lỗi cơ chế khởi tạo instance của Singleton trong Multi-Thread, performance cao do tách biệt được quá trình xử lý. Do đó, cách làm này được đánh giá là cách triển khai Singleton nhanh và hiệu quả nhất.