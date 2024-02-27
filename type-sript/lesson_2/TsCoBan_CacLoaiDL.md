# Type Annotation\
** var message : string = "Hello World"**
- Trong đó:
    + var: khai báo
    + message: Tên biến
    + ':' Annotation
    + string: Loại dữ liệu
    + Hello World: Gía trị khởi tạo
# Core Type

|number|1, 5.3, -10|Tất cả các số, không có sự khác biệt giữa Interger và float |
|:-----|:----|:------|
|string|`Hi`, "Hi", 'Hi'|Tất cả những giá trị kiểu text |
|boolean |true, false |Chỉ có 2 giá trị true hoặc false|
| object|{age:30}|Bấtkỳobject Javascriptnào|
|array|string[]|Bất kỳ mảng Javascriptnào(number, string,….)   |
|tuple|[number, string,...]|Dùng để chứa 2 hoặc nhiều giá trị có kiểu dữ liệu khác nhau|
|Hàm hỗ trợ tuple
    Push(): thêm phần tử\
    Pop(): xoá phần tử cuối cùng của tuple|
|any|*|Thiết lập loại dữ liệu bất kỳ cho biến/mảng (chưa biết kiểu dữ liệu)|
|unino|Mã nhị phân|Thiết lập loại dữ liệu cho biến/ mảng/ hàm|
|enum|Enum {NEW,OLD}|Tập hợp các constant (Thêm mới bởi Typescript)|
|unknown|giống any|Có thể được chỉ định bất kỳ giá trị nào|

#Sự khác nhau giữa Null & Undefined

|               Null            |               Undefined                   |
|:------------------------------|:------------------------------------------|
|Có giá trị gán cho biến        |Không có giá trị gán cho biến              |
|Cóthể gán cho biến không trỏ đến bất kỳ đối tượng nào|Biến được khai báo nhưng vẫn chưa gán giá trị|
|Typeof là object   |Typeof là undefined|
|Null có thể là rỗng hoặc không tồn tại|Được dùng khi biến không được gán giá trị|
|Sự vắng mặt của giá trị cho một biến|Sựvắng mặt của biến đó|
|Null có thể được chuyển đổi thành 0|Cóthể được chuyển đổi thành NaN|
# Ép kiểu
- [Cách 1:] Sử dụng angle-bracket\
 *let strLength: number = (<string> userInput).length;*
    ```ts
    let userInput:unknown = prompt("Mời nhập cái gì đó");
    let sokytu: number = ( <string> userInput ).length;
    console.log(sokytu);
    ```
- [Cách 2:] Sử dụng cú pháp as\
 *let strLength: number = (userInput as string).length;*
    ```ts
    let userInput:unknown = prompt("Mời nhập cái gì đó");
    let sokytu: number = (userInput as string).length;
    console.log(sokytu);
    ```
