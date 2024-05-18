## Sự khác biệt giữa Angular và AngularJS

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