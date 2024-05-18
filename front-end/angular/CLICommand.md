Các lệnh CLI Command dùng để tạo dự án bằng dòng lệnh
# ng generate
- Mỗi loại thành phần trong "ng generate" có tác dụng và mục đích riêng, giúp bạn xây dựng và tổ chức ứng dụng của mình một cách hiệu quả và dễ dàng bảo trì
- Nếu bạn không muốn tạo fiel 'spec.ts' thì ở mỗi thành phần cần có thêm lệnh
	--skip-tests
	<https://angular.io/cli/generate>
## 1. Component
- Component là một lớp nó thường hiểu như là controller tương tác giao diện người dùng.
- Một component thường có 3 thành phần chính là code TypeScript, template HTML và CSS
- Lệnh dùng để tạo component
	ng generate component [name]
	ng g c [name]
## 2. Module
- Module là cách chia nhỏ các thành phần ứng dụng (giống package trong Java)
- Lệnh dùng đẻ tạo module
	ng generate module [name]
	ng g m [name]
## 3. Service
-  Service là các class độc lập được sử dụng để chia sẻ logic và dữ liệu giữa các components trong ứng dụng.
 Service thường được sử dụng để tương tác với dữ liệu từ các nguồn bên ngoài như APIs hoặc lưu trữ dữ liệu địa phương.
- Lệnh tạo service
	ng generate service [name]
	ng g s [name]
## 4. Guard 
- Guards là các trình giám sát (interceptor) được sử dụng để kiểm soát việc điều hướng trong ứng dụng.
- Lệnh tạo guard
	ng generate guard [name] 
	ng generate g [name]
# 5. Interceptor
- TODO
- Lệnh tạo interceptor
	ng generate interceptor [name]
## 4. Directive
- Directives có thể hiểu như là các đoạn mã typescript (hoặc javascript) kèm theo cả HTML và khi gọi thì gọi như là HTML luôn