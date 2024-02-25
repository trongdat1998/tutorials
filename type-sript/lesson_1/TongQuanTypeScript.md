# TypeScript là gì?
- Là ngôn ngữ lập trình
- Siêu ngôn ngữ (superset) của JavaScript
- Được compile (biên dịch) qua Javascripts (ES5 hoặc ES6) bởi trình biên dịch.
- Ngôn ngữ kiểu tĩnh (static typing)
- Hỗ trợ lập trình theo hướng đối tượng (object-oriented- programming) dựa vào class
- Mã nguồn mở
- Được phát triển bởi Microsoft
# Vì sao TypeScript tốt hơn Javascript
- Hỗ trợ tất cả các tính năng mới nhất của JavaScript, bao gồm ECMAScript 2015
- Hỗ trợ toàn bộ thư viện Javascript và tài liệu API, bao gồm JQuery, BootStrapJS, React và nhiều hơn thế nữa
- Tính năng tĩnh của JavaScript cũng giúp mã dễ dàng hơn để cấu trúc lại, cải thiện kỹ năng lập trình hướng đối tượng
- TypeScript dễ học
- Thích hợp xây dựng ứng dụng lớn nhanh chóng, dễ bảo trì và có khả năng tái sử dụng
# Khác nhau giữa TypeScript và JavaScript
- Strong typed language hoặc Static Typed language, là những ngôn ngữ yêu cầu bạn phải khai báo kiểu cho biến trước khi gán value.
- Dynamic Typed languageà loại ngôn ngữ lập trình cho phép thay đổi kiểu biến tùy biến. Thích thay thế nào cũng được.
- Dynamic là việc kiểm tra kiểu được thực hiện trong lúc runtime thay vì compile time. 
- [Chú ý]: 3 kiểu ở trên xẽ được khai báo trong các ngôn ngữ sẽ khác nhau

| 					TypeScript				 	|	 				JavaScript				 	|
|:----------------------------------------------|:----------------------------------------------|
|strong typing: static và dymanic type	|Chỉ làm việc với kiểu động (dynamic)	|
|Được phát triển bởi Anders Hejlsberg -2012|Được phát triển bởiNetscape năm 1995|
|Phần mở rộng của tênfile là **".ts"**.	|Phần mở rộng của tênfile là **".js".**	|
|Không chạy trực tiếp trên trình duyệt	|Chạy trên trình duyệt					|
|Lỗi có thể được tìm thấy và sửa chữa trong thời gian biên dịch.|Lỗi chỉ có thể tìm thấy lúc runtime.|
|Hỗ trợ OOP dựa vào classes, interfaces, inheritance, generics,….|Chỉ là ngôn ngữ kịch bản (scripting language).|
|Kiến thức về script bắt buộc			|Không cần kinh nghiệm về script trước đó|
|Cài đặt thông qua npm					|Không cần cài đặt.						|
#Cài đặt TypeScript
## Lựa chọn IDE
- Visual Studio Code
## Cài đặt NodeJs
<https://nodejs.org/en/download/>
- Kiểm tra version npm\
	**$ npm -v or npm --version**
- Kiểm tra version node\
	**$ node -v or node --version**
## Cài đặt TypeScript
<https://www.typescriptlang.org/>
- Lệnh cài đặt TypeScript\
	** npm install -g typescript**
- Kiểm tra version typescript\
	**$ tsc -v or tsc --version**