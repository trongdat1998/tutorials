#Kiểm tra Version Git\
	**$ git --v**
# User Git
- Cấu hình kiểm tra liên quan tới tài khoản Git
## Check user đang được login trong Git
- Kiểm tra tên người dùng đã được cấu hình trong Git\
	**$ git config user.name**
- Kiểm tra email đã được cấu hình trong Git\
	**$ git config user.email**
- Kiểm tra thông tin cấu hình toàn cục\
	**$ git config --list**
## Login tài khoản vào Git
- Thiết lập tên người dùng\
	**$ git config --g user.name "Dev name"**
- Thiết lập địa chỉ email\
	**$ git config --g user.email "Dev email"**
## Logout tài khoản Git
- Xóa tên người dùng\
	**$ git config --global --unset user.name**
- Xóa địa chỉ email\
	**$ git config --global --unset user.email**
- Xóa thông tin xác thực toàn bộ\
	**$ git config --global --unset-all**
# Tạo nhánh
1. Bạn cần đứng ở nhánh chính
- Khi bạn tạo nhánh mới tất cả các thông tin sẽ được lấy từ nhánh mà bạn đang đứng. Nên bạn cần đứng ở nhánh chính (thường là *main* hoặc *master*)\
	**$ git checkout main**
2. Tạo nhánh mới\
	**$ git branch <tên_nhánh_mới>**
3. Chuyển đổi sang nhánh mới\
	**$ git checkout <tên_nhánh_cần_đến>
