
# Sự khác biệt giữa Angular và AngularJS

|               |           Angular         |          AngularJS        |
|:--------------|:--------------------------|:--------------------------|
|   Năm phát hành   | 2009    |   2016    |
|   Nhà phát triển  |Google (Đã ngừng hỗ trợ)|  Google|
|   Ngôn ngữ phát triển|    	JavaScript| TypeScript của Microsoft|
|   Công cụ mẫu|    AngularJS sở hữu rất nhiều chỉ thị| Angular cũng có các chỉ thị tiêu chuẩn, nhưng chúng được sử dụng theo cách khác với AngularJ|
|   Hỗ trợ trình duyệt| Không hỗ trợ trên các trình duyệt di động|  Được hỗ trợ bởi tất cả các trình duyệt phổ biến|
|   Ứng dụng|   Không dễ quản lý như Angular, nhưng lý tưởng cho các ứng dụng nhỏ.| Dễ dàng hơn để xây dựng và duy trì các ứng dụng lớn.|
|   Cấu hình Route| 	Sử dụng $ routeprovider.when () cho cấu hình định tuyến|    Sử dụng @Route Config {(…)} để cấu hình định tuyến|
|   Hiệu suất|  Chậm|   	Nhanh hơn AngularJS|
- Ví dụ về công cụ mẫu
    + AngularJS: Các chỉ thị thường bắt đầu bằng ng-...\
    ng-model tạo rằng buộc hai chiều\
    ng-bind tạo rằng buộc một chiều
    + Angular\
    ng-Model, nếu viết nó trong ngoặc “[]”, bạn sẽ nhận được ràng buộc một chiều\
                Còn viêt nó trong “[()]” thì sẽ tạo được ràng buộc hai chiều.
				
- Note: Angular Cli để tạo dự án Angular?

## Angular Cli là gì?
- Chúng ta sử dụng tool Angular Cli để giúp chúng ta tạo dự án một cách nhanh chóng.
- Nó tự động cấu hình các file và package của dự án angular cho chúng ta một cách tự động
- Angular Cli để tạo các components, directive hay service vào trong dự án có sẵn chỉ bằng 1 dòng lệnh
# Cài đặt Angular Cli và tạo một dự án Angular
- Kiểm tra tương thích giữa angular và nodejs
 <https://angular.dev/reference/versions>
- Cài đặt Angular Cli\
    **$ npm install -g @angular/cli@latest**
- Kiểm tra phiên bản Angular Cli\
    **$ ng --version**
- Tạo dự án Angular\
    **$ ng new [NameProject]**
	+ Ở bản angular 17 thì không còn tạo app.moudule, nếu quen dùng app.moudule thì cần lệnh dưới khi tạo dự án Angular\
	**--no-standalone**
- Biên dịch dự án\
    **$ ng serve**

    **$ ng serve --host 0.0.0.0 --port [Number]**
## Các bước tạo project Angular CLI
- Tạo một dự án mới\
    **$ ng new [nameProject]**
- Để biết thêm cá options đi kèm có thêm xem thêm link dưới

    <https://angular.io/cli/new>
- Cấu trúc dự an Angular khi mới tạo
    ```
    ├── e2e
    │   ├── src
    │   │   ├── app.e2e-spec.ts 
    │   │   ├── app.po.ts
    │   ├── protractor.conf.js 
    │   ├── tsconfig.e2e.json
    ├── node_modules
    ├── src
    │   ├── app
    │   │   ├── app-routing.module.ts
    │   │   ├── app.component.css
    │   │   ├── app.component.html
    │   │   ├── app.component.spec.ts
    │   │   ├── app.component.ts
    │   │   ├── app.module.ts
    │   ├── assets
    │   │   ├── .gitkeep
    │   ├── environments
    │   │   ├── environment.prod.ts
    │   │   ├── environment.ts
    │   ├── favicon.ico
    │   ├── index.html
    │   ├── main.ts
    │   ├── polyfills.ts
    │   ├── styles.css
    │   ├── test.ts
    ├── .editorconfig
    ├── .gitignore
    ├── angular.json
    │── browserslist   
    ├── karma.conf.js
    ├── package-lock.json
    ├── package.json
    ├── README.md
    ├── tsconfig.app.json
    ├── tsconfig.json
    ├── tsconfig.spec.json
    └── tslint.json
    ```

    + Thư mục cha (root) gồm có các thư mục con là e2e, node_module và src. Ngoài ra có thêm một số file cấu hình bên ngoài.
    + File *.editorconfig* : file này dùng để cấu hình nếu trình soạn thảo code chúng ta dùng là Visual Studio. Mình có thể thay đổi cấu hình tại đây.
    + File *.gitignore* : dùng để thể hiện file nào được đưa lên github file nào không được đưa lên.
    + *angular.json* : dùng để cấu hình lại Angular Cli.
    + *browserslist* : những phiên bản browser sẽ tương thích với dự án angular.
    + *karma.config.js* : file này dùng để chạy các testing (kiểm thử) các chức năng.
    + *package.json* : file này chứa các thư viện cần thiết cho dự án angular, ngoài ra nếu ta thêm một thư viện bên thứ 3 vào thì khai báo trong này.
    + *tslint.js* : dùng để kiểm tra code có chất lượng hay không, có dễ đọc hay dễ bảo trì không, có theo chuẩn không.
    + thư mục *e2e* : chức các file liên quan đến việc testing. Angular sử dụng thư viện protractor để thực hiện automation test trên các trình duyệt
    + Thư mục *node_modules* : nơi chứa các thư viện và được download về cho dự án angular.
		Nó được quản lý bằng NPM có nghĩa là ta dùng NPM để xoá , thêm các thư viện.
    + Thư mục *src* : nơi chứa các source khi chương trình chạy. Đây là nơi tập trung các dòng code của ứng dụng angular.
    + Thư mục *app* : angular cli tạo ra folder này giống như folder cha của ứng dụng. 
		Angular cli tạo ra như một ví dụ mẫu để sau này ta tạo các component khác. Trong thư mục app thường có
    + *app.component.html* : nơi chúng ta viết các files html. Là tầng view mà người dùng có thể thấy được
    + *app.component.ts* (component class) : là file xử lý các nghiệp vụ nó giống như Controller bên Spring Web.
    + app.component.css : chúng ta định nghĩa các css mà component sẽ dùng.
    + *app.component.ts* : file này dùng cho việc testing (kiểm thử).
    + *app.module.ts* : file dùng để cấu hình cho module app.
    + *app-routing.module.ts* : file này dùng để điều hướng.
	
## Các lệnh CLI Command dùng để tạo dự án bằng dòng lệnh
- ng generate
+ Mỗi loại thành phần trong "ng generate" có tác dụng và mục đích riêng,
 giúp bạn xây dựng và tổ chức ứng dụng của mình một cách hiệu quả và dễ dàng bảo trì
+ Nếu bạn không muốn tạo fiel 'spec.ts' thì ở mỗi thành phần cần có thêm lệnh\
	--skip-tests\
	<https://angular.io/cli/generate>
### 1. Component
- Component là một lớp nó thường hiểu như là controller tương tác giao diện người dùng.
- Một component thường có 3 thành phần chính là code TypeScript, template HTML và CSS
- Lệnh dùng để tạo component\
	ng generate component [name]\
	ng g c [name]
### 2. Module
- Module là cách chia nhỏ các thành phần ứng dụng (giống package trong Java)
- Lệnh dùng đẻ tạo module\
	ng generate module [name]\
	ng g m [name]
### 3. Service
-  Service là các class độc lập được sử dụng để chia sẻ logic và dữ liệu giữa các components trong ứng dụng.
 Service thường được sử dụng để tương tác với dữ liệu từ các nguồn bên ngoài như APIs hoặc lưu trữ dữ liệu địa phương.
- Lệnh tạo service\
	ng generate service [name]\
	ng g s [name]
### 4. Guard 
- Guards là các trình giám sát (interceptor) được sử dụng để kiểm soát việc điều hướng trong ứng dụng.
- Lệnh tạo guard\
	ng generate guard [name] \
	ng generate g [name]
### 5. Interceptor
- TODO
- Lệnh tạo interceptor
	ng generate interceptor [name]
### 4. Directive
- Directives có thể hiểu như là các đoạn mã typescript (hoặc javascript) kèm theo cả HTML và khi gọi thì gọi như là HTML luôn