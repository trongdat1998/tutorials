# CẤU TRÚC ĐIỀU KHIỂN
- Có 3 loại:
    + Cấu trúc tuần tự
    + Cấu trúc lựa chọn
    + Cấu trúc lặp
## Cấu trúc lựa chọn: Có 3 kiểu
- Lệnh lựa chọn đơn\
    ```js
    if(dieu_kien){\
        //lôgíc\
    }
    ```
- Lệnh lựa chọn kép\
    ```js
    if(dieu_kien){
        //lôgíc 
    }
    else{
        //lôgíc 
    }
    ```
- Lệnh đa lựa chọn
    ```js
    switch ( dieukien ) { 
        case giatri1:  
            //lôgíc 
            break; 
        case giatri2: 
            //lôgíc 
            break; 
         default: 
            //lôgíc    
    } 
    ```
    [Lưu ý]:Sử dụng break để thoát khỏi lệnh switch, nếu không sẽ chuyển xuống thực hiện lệnh trong mệnh đề case tiếp theo 
## Lệnh lặp
- Lệnh lặp không biết trước số lần lặp 
    + While
    + Do ...While
- Lệnh lặp biết trước số lần lặp
    + For
# Hàm
- Hàm để thực hiện một chức năng cụ thể.
- Cú pháp
    + Hàm không trả về giá trị
    ```js
    function tenham (thamso1, thamso2, …, thamson) { 
        //LôGíc  
    } 
    ```
    + Hàm trả về giá trị
    ```js
    function tenham (thamso1, thamso2, …, thamson) { 
        //LôGíc
        return giatritrave;
    } 
    ```
## Hàm Confirm
- Là hộp thoại để nhập hồi đáp từ phía người dùng
- Hàm trả về hồi đáp của người dùng
    + Trả về True nếu người dùng nhấn vào OK
    + Trả về False nếu người dùng nhấn vào Cancel
# Phạm vi biến
 - Biến cục bộ
    + Biến được khai báo trong hàm
    + Chỉ được tham chiếu đến trong phạm vi khai báo
 - Biến toàn cục
    + Biến được khai báo ngoài hàm
    + Có thể tham chiếu đến bất cứ đâu
# Xử lý sự kiện
- Tất cả các element trên trang web đều có một tập các sự kiện tương ứng.
## Một số sự kiện
- onClick\
    *Được kích hoạt khi nhấn chuột vào một element*
- onLoad và on Unload \
    *Được kích hoạt khi người dùng vào hoặc thoát khỏi trang web*
- onFocus, onBlur, onChange\
    *Được kích hoạt khi các trường nhận được focus, mất focus hay được thay đổi giá trị*
- onMouseOver\
    *Được kích hoạt khi người dùng di chuột lên một element HTML trên form*
## Timer
- JavaScript cung cấp các phương thức để xử lý các sự kiện thời gian 

|      Phương thức      |           Giải thích          |
|:----------------------|:------------------------------|
|setTimeout |Thực hiện công việc sau một khoảng thời gian trong tương lai|
|clearTimeout   |Hủy bỏ setTimeout trước đó|
|setInterval    |Thực hiện lặp lại công việc sau một khoảng thời gian|
|clearInterval  |Hủy bỏ setInterval|