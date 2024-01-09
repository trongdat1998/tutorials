# Các lệnh cơ bản trong Git
- Check version\
	**$ git --v**
- Hướng dẫn bạn có thể làm được những gì, tất cả các lệnh có thể\
	**$ git help --all**
- Kiểm tra trạng thái của kho lưu trữ\
	**$ git status**
- Lấy đường link của Git trong folder dự án\
	**$ git remote -v**
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
# Làm việc với nhánh (branch)
- Nhánh sẽ được lưu trên local và trên remote repository
## Kiểm tra các nhánh hiện có trên git
- Khi clone source code về local chỉ lưu nhánh chính (main), bạn cần checkout sang các nhánh khác để local nhận được các nhánh khác.
- Kiểm tra các branch hiện có trên remote repository của bạn.\
	**$ git branch -a**
- Kiểm tra các nhánh hiện có trên local.\
	**$ git branch**
## Tạo nhánh mới
- *Khác với tạo nhánh trên các IDE hay trực tiếp trên Git. Khi dùng lệnh nội dung có trong nhánh xẽ không có gì bạn cần làm thêm bước hợp nhất (merge) nhánh.*
1. Tạo mới nhánh\
	**$ git branch <tên_nhánh_mới>**
2. chuyển đến nhánh cần lấy nội dung (thường là *main* hoặc *master*).\
	**$ git checkout <main>**
3. Hợp nhất 2 nhánh.\
	**$ git merge <nhánh_vừa_tạo>**
4. Đẩy nhánh vừa tạo lên remote repository.\
	**$ git push -u origin <nhánh_vừa_tạo>**
## Chuyển đổi sang nhánh mới
	$ git checkout <tên_nhánh_cần_đến>
## Xóa nhánh
1. Xóa nhánh trên local, sau đó thực hiện xóa nhánh trên remote repository. Bạn cần đảm bảo bạn đang đứng khác nhánh cần xóa.\
	**$ git branch -d <branch_name>** *# Nhánh này đã được merge*\
	**$ git branch -D <branch_name>** *# Nhánh này chưa được merge*
2. Xóa nhánh trên remote repository.\
	**$ git push -d origin <nhanh_cần_xóa>** *# Nhánh này vẫn lưu trên local. Bạn có để push lên remote repository lại, hoặc loại bỏ luôn*
## Đổi tên nhánh
1. Đổi tên nhánh\
	**$ git branch -M <Tên_mới_cho_nhánh>** *# Đổi tên nhánh tại vị trí nhánh bạn đang đứng*\
	**$ git branch -M <Tên_nhánh_khác_với vị_trí đứng> <Tên_mới_cho_nhánh>** *# Đổi tên nhánh khác với vị trí bạn đang đứng*
2. Đẩy tên mới của nhánh lên remote repository\
	**$ git push -u origin <Tên_mới_của_nhánh>**
3. Xóa nhánh cũ đi\
	**$ git push -d origin <Tên_nhánh_cũ>**
# Đẩy code lên Git
1. Khởi tạo repository (nếu chưa có)\
	**$ git init**
2. Thêm các file đã có sự thay đổi\
	**$ git add <>**
- (. hoặc --all) dùng để thêm tất cả các thay đổi, hoặc bạn có thể add các file bạn cần đẩy lên *
3. Thực hiện note cho các nội dung thay đổi\
	**$ git commit -m "<commit_message_here>"**
- Khi bạn lỡ may thực hiện < git add. > và bạn cần loại bỏ bớt đi các file không muốn đẩy lên\
	**$ git reset** *# Giúp bạn quay lại đước < git add >, bạn sẽ thực hiện add những file cần đẩy lên git*
4. Đưa code lên remote repository\
	**$ git push origin <branch_name>**
# Xóa commit
- Dùng cho trường hợp commit bị sai, không hoàn chỉnh hoặc có vấn đề, bạn muốn loại bỏ nó
1.  Lấy key của commit cần chuyển đến\
	**$ git log**
2. Chuyển commit mà bạn muốn code bạn thực hiện tại vị trí đấy\
	**$ git reset --hard <mã_key>**
3. Thực hiện xóa commit
	**$ git push --force**
- [Lưu ý]: khi bạn muốn quay về vị trí commit-2 thì các vị trí commit-3,4,.. sẽ được xóa và không lấy lại được
# Kéo code về local
- Kéo tất cả các thay đổi từ khác với vị trí đứng về local.\
	**$ git pull origin <nhánh_cần_kéo_về>**
- Kéo tất cả các thay đổi từ mà bạn đang đứng về local.\
	**$ git pull**
- Kéo tất cả các thay đổi từ kho lưu trữ từ xa vào branch bạn đang làm việc.\
	**$ git pull origin**
- Cách pull chống sung đột
	**$ git pull --rebase**
# Hợp nhất code
1. Di chuyển về nhánh nhận sự hợp nhất.\
	**$  git checkout <branch_mane1>** *# branch_mane1 là nhánh cần hợp nhất*\
2. Tiến hành hợp nhất.\
	**$ git rebase <branch_mane2>** *# Code từ branch_mane2 được hợp nhất vào branch_mane1*\
## [Chú ý]: Tương đồng với merge nhưng có sự khác biệt như sau
- Merge: Chỉ lấy nội dung commit cuối cùng của hai nhánh, tích hợp tạo thành commit mới. Các commit trước đó được giữ nguyên không thay đổi.
- Rebase: Lấy code từ branch_mane2, từ những commit ở branch_mane2 tích hợp đồng thời tái tạo lại commit mới ở branch_mane1 (Các commit đã tồn tại bị bỏ đi).