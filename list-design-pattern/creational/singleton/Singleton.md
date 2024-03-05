# Singleton

## Khái niệm
- Chỉ tạo ra một đối tượng duy nhất trong suốt quá trình thực  thi trương chình.
## Được sử dụng trong những trường hợp nào?
- Đảm bảo rằng chỉ có một instance của lớp.
- Việc quản lý việc truy cập tốt hơn vì chỉ có một thể hiện duy nhất.
- Có thể quản lý số lượng thể hiện của một lớp trong giớn hạn chỉ định.
## Nguyên tắc để tạo lên một Singleton
- **private constructor** để hạn chế truy cập từ class bên ngoài.
- Đặt **private static final variable** đảm bảo biến chỉ được khởi tạo trong class.
- Có một method **public static** để **return instance** được khởi tạo ở trên.
## Các cách tạo Singleton trong code
- Trên thực tế chúng ta có rất nhiều cách để tạo ra một Singleton tuy nhiên mình sẽ chỉ giới thiệu những mẫu chính và thường gặp.
- Nên sử dụng **BillPughSingleton** vì có hiệu quả cao, sử dụng **Lazy Initialization** khi làm việc với ứng dụng đơn luồng, và **Double Check Locking** khi làm việc với ứng dụng đa luồng.
1. Eager initialization
    + Singleton Class được khởi tạo ngay khi được gọi đến, *dây là cách dễ nhất* 
    + Nó có một nhược điểm là instance được khởi tạo, nhưng có thể sẽ không dùng tới.
2. Static block initialization
    + Cách làm tương tự như Eager initialization chỉ khác phần static block cung cấp thêm handle exception khi tạo instance.
3. Lazy Initialization
    + Cách này đã khắc phục được nhược điểm của cách Eager initialization, chỉ khi nào getInstance() được gọi thì instance mới được khởi tạo
    + Cách này chỉ sử dụng tốt trong trường hợp **đơn luồng** (single-thread).
    + [Lưu ý:] Nhưng nếu có nhiều luồng (multi-thread) cùng chạy và cùng gọi đến hàm getInstance() tại cùng một thời điểm thì có thể có nhiều hơn 1 thể hiện của instance. Để khắc phục nhược điểm này chúng ta sử dụng **Thread Safe Singleton**.
4. Thread Safe Singleton
    + Gọi **synchronized** (nó chỉ có thể được thực thi bởi một luồng (thread) duy nhất vào một thời điểm) trong hàm  **getInstance()**.
    + [Nhược điểm:] một phương thức synchronized sẽ chạy rất chậm và tốn hiệu năng, bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread khác đang sử dụng.
    + [Lưu ý:] Có những tác vụ xử lý trước và sau khi tạo thể hiện không cần thiết phải block. Vì vậy chúng ta cần cải tiến nó đi 1 chút với **Double Check Locking Singleton**.
5. Double Check Locking Singleton
    + khai báo **volatile** cho instance để kiểm tra sự tồn tại thể hiện của lớp
6. Bill Pugh Singleton Implementation
    + Với cách làm này bạn sẽ tạo ra **static nested clas**s với vai trò 1 Helper khi muốn tách biệt chức năng cho 1 class function rõ ràng hơn.
    + Đây là cách thường hay được sử dụng và có hiệu suất tốt
    + Khi Singleton được tải vào bộ nhớ thì SingletonHelper chưa được tải vào. Nó chỉ được tải khi và chỉ khi phương thức getInstance() được gọi. Với cách này tránh được lỗi cơ chế khởi tạo instance của Singleton trong Multi-Thread, performance cao do tách biệt được quá trình xử lý. Do đó, cách làm này được đánh giá là cách triển khai Singleton nhanh và hiệu quả nhất.