# Angular Cli để tạo dự án Angular?
## Angular Cli là gì?
- Chúng ta sử dụng tool Angular Cli để giúp chúng ta tạo dự án một cách nhanh chóng.
- Nó tự động cấu hình các file và package của dự án angular cho chúng ta một cách tự động
- Angular Cli để tạo các components, directive hay service vào trong dự án có sẵn chỉ bằng 1 dòng lệnh
## Cài đặt Angular Cli và tạo một dự án Angular
- Cài đặt Angular Cli

    npm install -g @angular/cli@latest
- Kiểm tra phiên bản Angular Cli

    ng --version
- Tạo dự án Angular

    ng new [NameProject]
- Biên dịch dự án

    ng serve

    ng serve --host 0.0.0.0 --port [Number]
## Các lệnh Command trong Angular CLI
### Tạo dự án mới

    ng new [nameProject]
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
    + File .editorconfig : file này dùng để cấu hình nếu trình soạn thảo code chúng ta dùng là Visual Studio. Mình có thể thay đổi cấu hình tại đây.
    + File .gitignore : dùng để thể hiện file nào được đưa lên github file nào không được đưa lên.
    + angular.json : dùng để cấu hình lại Angular Cli.
    + browserslist : những phiên bản browser sẽ tương thích với dự án angular.
    + karma.config.js : file này dùng để chạy các testing (kiểm thử) các chức năng.
    + package.json : file này chứa các thư viện cần thiết cho dự án angular, ngoài ra nếu ta thêm một thư viện bên thứ 3 vào thì khai báo trong này.
    + tslint.js : dùng để kiểm tra code có chất lượng hay không, có dễ đọc hay dễ bảo trì không, có theo chuẩn không.
    + thư mục e2e : chức các file liên quan đến việc testing. Angular sử dụng thư viện protractor để thực hiện automation test trên các trình duyệt
    + thư mục node_modules : nơi chứa các thư viện và được download về cho dự án angular. Nó được quản lý bằng NPM có nghĩa là ta dùng NPM để xoá , thêm các thư viện.
    + thư mục src : nơi chứa các source khi chương trình chạy. Đây là nơi tập trung các dòng code của ứng dụng angular.
    + thư mục app : angular cli tạo ra folder này giống như folder cha của ứng dụng. Angular cli tạo ra như một ví dụ mẫu để sau này ta tạo các component khác. Trong thư mục app thường có
    + app.component.html : nơi chúng ta viết các files html. Là tầng view mà người dùng có thể thấy được
    + app.component.ts (component class) : là file xử lý các nghiệp vụ nó giống như Controller bên Spring Web.
    + app.component.css : chúng ta định nghĩa các css mà component sẽ dùng.
    + app.component.ts : file này dùng cho việc testing (kiểm thử).
    + app.module.ts : file dùng để cấu hình cho module app.
    + app-routing.module.ts : file này dùng để điều hướng.