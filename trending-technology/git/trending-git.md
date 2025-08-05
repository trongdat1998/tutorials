### 1. Hệ thống quản lý phiên bản - Version Control System (VSC)
- Là một hệ thống ghi nhận và lưu lại sự thay đổi của các file theo thời gian.
- Cũng giúp bạn phục hồi quay về trạng thái ở một thời điểm trước đó
- Phân loại VCS: <span style="color: red;">Có 3 loại</span>
##### 1.1. Hệ thống quản lý phiên bản cục bộ (Local Version Control Systems)
- Là dạng quản lý phiên bản ngay trên máy tính cá nhân của người dùng
- Nhược điểm: Không phù hợp cho làm việc nhóm. Dễ bị mất dữ liệu nếu ổ cứng bị hỏng.
- Ví dụ: RCS (Revision Control System)
##### 1.2. Hệ thống quản lý phiên bản tập trung (Centralized Version Control Systems - CVCS)
- Là hệ thống gồm **một máy chủ** chứa toàn bộ dữ liệu của dự án
- Nhược điểm: Phải phụ thuộc vào máy chủ trung tâm
- Ví dụ: SVN (Apache Subversion)
##### 1.3. Hệ thống quản lý phiên bản phân tán (Distributed Version Control Systems - DVCS)
- Khi một client truy xuất dữ liệu từ máy chủ, nó không chỉ lấy về dữ liệu ở phiên bản mới nhất, mà nó còn tải về cả kho chứa của hệ thống.
- Nhược điểm: Khó học
- Ví dụ: Git

### 2. Tìm hiểu về Git
- Git là 1 hệ thống quản lý phiên bản phân tán (DVCS)
- Hầu hết mọi thao tác với Git diễn ra ở local
- GitHub, GitLab và Azure DevOps là những trang web phát triển dự trên công cụ Git\
 ![alt](https://github.com/trongdat1998/tutorials/blob/main/image/git/git.jpg?raw=true)
#### 2.1. Các khu vực làm việc và Repository
 ![alt](https://github.com/trongdat1998/tutorials/blob/main/image/git/working.png?raw=true)
##### 2.1.1. Working Directory (project)
- Là khu vực mà bạn thực hiện các thay đổi trực tiếp trên các tệp của dự án.
##### 2.1.2. Staging Area (project/.git/index)
- Là khu vực lưu tạm các file thay đổi
##### 2.1.3. Local Repository 
- Là repository bố trí trên máy của bản thân mình
##### 2.1.4. Remote repository
- Là repository để chia sẻ giữa nhiều người và bố trí trên server chuyên dụng
### 3. Trạng thái của file trong Git
![alt](https://github.com/trongdat1998/tutorials/blob/main/image/git/status_file.jpg?raw=true)
- Ở trên local file có 2 trạng thái là: Được Git theo dõi và không được Git theo dõi
##### 3.1. Untracked (Chưa được Git theo dõi)
- File mới được tạo (trên repo chưa có)
- Hiển thị trong danh mục **「Untracked files: 」** khi chạy lệnh\
	**$git status**
- Để chuyển trạng thái *Untracked ⇒ Staged*\
	**$ git add**
##### 3.2. Modified
- Là những file có sự thay đổi và được Git theo dõi
- Hiển thị trong danh mục **「Changes not staged for commit: 」** khi chạy lệnh\
	**$ git status**
- Để chuyển trạng thái *Modified ⇒ Staged*\
		**$ git add**
##### 3.3. Staged
- Đánh dấu các sự thay đổi để chuẩn bị cho bước commit
- Hiển thị trong danh mục **「Changes to be committed: 」** khi chạy lệnh\
	**$ git status**
- Để chuyển trạng thái *Staged ⇒ Unmodified*\
	**$ git commit**
- Để chuyển trạng thái *Staged* về trạng thái trước đấy *Untracked và Staged*\
		**$ git reset**
##### 3.4. Unmodified
- Khi các file đã được đánh dấu sau khi được commit sẽ lại trở về trạng thái ko thay đổi
- Lúc này khi chúng ta sẽ không còn thấy các file có thay đỗi nữa khi chạy lệnh\
	**$ git status**
- Để chuyển trạng thái *Unmodified ⇒ Remote Repo*\
	**$ git push**
- Để chuyển trạng thái *Unmodified* về trạng thái trước đấy *Staged*\
	**$ git reset --soft HEAD~1**
### 4.Thao tác cơ bản trên Git

#### 4.1. Các lệnh cơ bản trong Git
- Lấy đường link của Git trong folder dự án\
	**$ git remote -v**
- Bấn *q* để thoát khi dùng lệnh Git
#### 4.2. Cấu hình cho Git

##### 4.2.1. Check cấu hình Git
- Kiểm tra toàn bộ thông tin cấu hình \
	**$ git config --list**
- Kiểm tra tên người dùng\
	**$ git config user.name**
- Kiểm tra email\
	**$ git config user.email**
##### 4.2.2. Login Git
- Thiết lập tên người dùng\
	**$ git config --global user.name "<dev_name>"**
- Thiết lập địa chỉ email\
	**$ git config --global user.email "<dev_email>"**
##### 4.2.3. Logout Git
- Xóa thông tin xác thực toàn bộ\
	**$ git config --global --unset-all**
- Xóa tên người dùng\
	**$ git config --global --unset user.name**
- Xóa địa chỉ email\
	**$ git config --global --unset user.email**
### 5. Git Init
- Tạo ra file ẩn (.git), bạn có thể thao tác các lệnh của git trên local repository
- Bạn có thể dùng các lệnh để lưu lịch sử chỉnh sửa như bình thường
- Không thể dùng *git push* vì bạn chỉ có thể làm việc trên local
### 6. Git Clone
- Cho phép các lập trình viên sao chép một kho chứa từ xa (Remote Repo) về máy tính cá nhân (Local)\
	**$ git clone <repository_URL>**

	+ Bạn muốn lấy nhánh được chỉ định

	**$ git clone -b <branch_name> <repo_URL>**
### 7.Branch
- Ghi lại history, mỗi branch độc lập thì có history riêng.
- Vai trò: phân chia các task công việc thành các branch từ đó tránh được việc xung đột
- Khi cần gộp branch dùng tính năng *git merge*
##### 7.1. List Branch
- Kiểm tra các branch trên repo.\
	**$ git branch -a**
- Kiểm tra các nhánh trên local.\
	**$ git branch**
##### 7.2. Create Branch
- Tạo mới nhánh\
	**$ git branch <tên_nhánh_mới>**
- *Khác với tạo nhánh trên các IDE hay trực tiếp trên Repo. Khi dùng lệnh nhánh vừa tạo xẽ trống bạn cần làm thêm bước hợp nhất (merge) nhánh.*
	+ Chuyển đến nhánh cần lấy nội dung (thường là *main* hoặc *master*).\
		**$ git checkout <main>**
	+ Hợp nhất hai nhánh.\
		**$ git merge <tên_nhánh_vừa_tạo>**
	+ Đẩy nhánh vừa tạo lên remote repository.\
		**$ git push -u origin <tên_nhánh_vừa_tạo>**
##### 7.3. Switch Branch
- Chuyển sang nhánh chỉ định\
		**$ git checkout <tên_nhánh_cần_đến>**\
※ Đảm bảo nhánh hiện tao không có thay đổi
##### 7.4. Delete Branch
- Bạn cần đảm bảo bạn đang đứng khác nhánh cần xóa
- Để xóa hoàn toàn branch cần thực hiện 2 bước: trên local và repo
- Xóa nhánh trên local.
	+ Nhánh đã được merge\
		**$ git branch -d <branch_name>**
	+ Nhánh này chưa được merge\
		**$ git branch -D <branch_name>** 
- Xóa nhánh trên repo.\
	**$ git push -d origin <branch_name>**
##### 7.5. Rename Branch
- Để đổi tên branch cần thực hiện 2 bước: trên local và repo
- Đổi tên trên local
	+ Đổi tên nhánh khi bạn đang đứng ở nhánh đấy\
		**$ git branch -M <new_branch_name>**
	+ Đổi tên nhánh khi bạn đang đứng ở nhánh khác\
		**$ git branch -M <old_branch_name><new_branch_name>**
- Đổi tên và xóa nhánh cũ trên repo
	+ Đẩy tên mới của nhánh lên repo\
		**$ git push -u origin <Tên_mới_của_nhánh>**
	+ Xóa nhánh cũ trên repo\
		**$ git push -d origin <Tên_nhánh_cũ>**

##### 7.6. Note
- Khi xóa nhánh hoặc đổi tên nhánh những người khác không thực hiện được gì với nhánh cũ, nên cần checkout sang nhánh vừa đổi

### 8. Git Add
- Lưu thông tin thay đổi vào vùng *staging* để chuẩn bị cho lệnh commit tiếp theo
	+ Đưa vào vùng staging file, thư mục cụ thể\
		**$ git add <file1><file2>**
	+ Đưa vào vùng staging toàn bộ thư mục làm việc\
		**$ git add .** # Thêm tất cả thay đổi.
	+ Đưa vào vùng staging toàn bộ thư mục làm việc có đuôi *.java*\
		**$ git add .java** 
### 9. Git Commit
- Lệnh commit cơ bản, thực hiện với tham số *-m* để kèm dòng thông tin về commit\
	**$ git commit -m "Commit message"**
- Khi cho tham số -a nó tương đương *git add* (chỉ add những file được git theo dõi) sau đó tự động chạy git commit\
	**$ git commit -am "Commit message"**
- Giúp bạn sửa đổi commit gần đây nhất\
	**$ git commit --amend -m "Commit message"**

	+ --amend cho phép bạn ghi đè lên commit cuối cùng đã thực hiện

		```git
			$ git add.
			$ git commit -m "cm1'
				# bạn tiếp tục chỉnh sửa
			$ git add.
			$ git commit -m "cm2'
				# lịch sử commit của cm2 ⇒ update message
			git commit --amend -m "update message"**
			git push
				# Lúc này trên server lưu thay đổi ở cm2
		```
	+ --no-edit khi bạn muốn add thêm file mà không muốn sửa commit message 
		```git
		$ git commit -m 'Add home'
			# Nhận ra là add thiếu 1 file home.css và muốn thêm vào commit bên trên
		$ git add home.css
		$ git commit --amend --no-edit
		```
### 10. Git status
- Được dùng để biết thông tin trạng thái sửa đổi, thêm mới, xóa các file trước khi thực hiện commit
- Nếu muốn hiện thị thông tin ngắn gọn hơn thì cho thêm tham số *-s*\
	**$ git status -s**\
→ <span style="color: red;">??</span> = untracked (file lạ)\
→ <span style="color: red;">M</span> = staged (có sửa đổi)\
→ <span style="color: green;">M</span> = staged (có sửa đổi, chưa commit)\
→ <span style="color: green;">A</span> = added (file mới thêm, chưa commit)\
→ <span style="color: red;">D</span> = deleted (file bị xóa)

### 11. Git log
- Tìm kiếm, xem lại, lọc các thông tin log lịch sử commit. 
	+  Mỗi commit gồm: mã hash, người tạo, ngày tạo và nội dung message commit\
		**$ git log**
	+ Hiển thị số lượng commit thêm chỉ số index\
		**$ git log -2**
	+ Nếu muốn xem thêm chi tiết các thay đổi thêm *-p*\
		**$ git log -p -2**
	+ Lọc theo ngày\
		**$ git log --after="2023-11-1" --before="2023-11-21"**
	+ Chỉ hiển thị mã hash và message\
		**$ git log --oneline**
	+ Bạn có thể xem lịch sự commit theo luồng\
		**$ git log --graph**

### 12. Git reset
- Cách sử dụng lệnh git reset để quay lại, hủy commit cuối hoặc hủy đưa vào vùng staging
	+ Khi bạn lỡ *commit* nhưng chưa muốn push mà muốn quay lại chỉnh sửa tiếp, nếu bạn muốn quay về trạng thái file chỉnh sửa thì chạy thêm *git reset*\
		**$ git reset --soft HEAD~1**
	+ Khi bạn lỡ *add* và muốn quay lại để chỉnh sửa file\
		**$ git reset**
### 13. Git diff
- Dùng để kiểm tra sự khác nhau
	+ Kiểm tra thông tin khác nhau trong vùng staging\
		**$ git diff**
	+ Kiểm tra thay đổi giữa hai commit\
		**$ git diff <hash-commit1> <hash-commit2>**
	+ Kiểm tra sự thay đổi của hai nhánh\
		**$ git diff <branch1> <branch2>**
### 14. Git checkout
- Có 2 chức năng: Chuyển nhánh và phục hồi file từ commit trước đó
	+ Chuyển nhánh\
		***$ git checkout <tên_nhanh>***
	+ Phục hồi file từ commit trước đó\
		**$git checkout <commit_id> index.html**
### 15. Git rebase 
- Tương đồng với merge nhưng có sự khác biệt như sau
	+ Merge: Chỉ lấy nội dung commit cuối cùng của hai nhánh, tích hợp tạo thành commit mới. Các commit trước đó được giữ nguyên không thay đổi.
	+ Rebase: Lấy code từ branch_mane2, từ những commit ở branch_mane2 tích hợp đồng thời tái tạo lại commit mới ở branch_mane1 (Các commit đã tồn tại bị bỏ đi).
- Gộp nhánh master vào beta\
	***$ git checkout beta***\
	***$ git rebase master***
### 16. Git stash
- Lưu lại công việc đang làm ở branch này để chuyển sang branch khác (Khi bạn chưa muốn commit code).\
	**$ git stash save # Hoặc $ git stash**
- Đẩy lại nôi dung vừa được lưu\
	**$ git stash pop**
- Xem list các branch ở local với các nội dung bạn chưa muốn commit.\
	**$ git stash list**
- Xem lại nội dung thay đổi cụ thể ở branch chỉ định .\
	**$ git stash show stash@{number}**\
	*※ number là ứng với số lấy ở $ git stash list*
- Lấy nội dung ở branch chỉ định vào nhánh vừa checkout đến.\
	**$ git stash apply stash@{number}**\
		*# number là ứng với số lấy ở $ git stash list*
- Xoá toàn bộ các nội dung ở các nhánh chưa commnit lên remote repository.\
	**$ git stash clear**
### 17. Chỉnh sửa commit
- Dùng cho trường hợp commit bị sai, không hoàn chỉnh hoặc có vấn đề, bạn muốn loại bỏ nó
#### 17.1 Tạo một commit mới vẫn dữ được các lịch sử commit trước đó
- khi chạy lệnh $ git revert <commit_2_id> thì tạo ra một commit mới với tên Revert"commit_2'" và nội dung được copy từ commit_1\
		old: commit_1 -> commit_2 -> commit_3\
		update: commit_1 -> commit_2 -> commit_3 -> Revert"commit_2"\
1. Lấy key của commit cần chuyển đến\
	**$ git log**
2. Chuyển commit mà bạn muốn code bạn thực hiện tại vị trí đấy\
	**$ git revert <commit_id>**\
		*# Sử dụng các lệnh VI - ấn :wq để thoát màn hình trên cửa sổ CMD*
3. Thực hiện thay đổi lịch sử commit_id trên remote repository\
	**$ git push**
#### 17.2. Lấy nội dung tại commit_id và xóa toàn bộ nội dung và lịch sử commit trước đó
- khi chạy lệnh $ git reset --hard <commit_2_id> các commit trước đó sẽ bị xóa\
		old:commit_1 -> commit_2 -> 'commit_3\
		update:commit_1 -> commit_2\
1.  Lấy key của commit cần chuyển đến\
	**$ git log**
2. Chuyển commit mà bạn muốn code bạn thực hiện tại vị trí đấy\
	**$ git reset --hard <commit_id>**
3. Thực hiện thay đổi lịch sử commit_id trên remote repository\
	**$ git push --force**
#### 17.3. Lấy nội dung tại commit_id và tạo ra một commit mới xóa toàn bộ nội dung và lịch sử commit trước đó
- khi chạy lệnh $ git reset –soft <commit_2_id> các tạo một commit mới (bạn cần thực hiện git commit -m) và commit trước đó sẽ bị xóa\
		old: commit_1 -> commit_2 -> commit_3\
		update:commit_1 -> commit_2\
1. Lấy key của commit cần chuyển đến\
	**$ git log**
2. Đưa branch về trạng thái của commit_id được chọn\
	**$ git reset –-soft <commit_id>**
3. Tạo nôi dung cho mommit\
	**$ git commit -m'message"**
4. Thực hiện thay đổi lịch sử commit_id trên remote repository\
	**$ git push**
#### 17.4. Note: Sự khác nhau giữ $ git reset --hard và $ git reset --force
- Ngoài việc quay về vị trí commit_id chỉ định mà còn có các điểm khác như dưới.
- *git reset --hard* # nội dung ở trong folder cũng loại bỏ tất cả sự thay đổi của file để máp với nội dung tại commit_id. git revert nội dung trong folder cùng tương tự
- *git reset –-soft* # nội dung ở trong folder sẽ được dữ nguyên ở commit trước khi reset. Nên khi chọn cách này bạn cần tạo mới một commit mới hoặc lại bỏ các nội dung thay đổi. Khi bạn clone link git vào một folder mới các nội dung ở commit trước reset sẽ không thấy 
### 18. Git pull
- Kéo tất cả các thay đổi từ khác với vị trí đứng về local.\
	**$ git pull origin <nhánh_cần_kéo_về>**
- Kéo tất cả các thay đổi từ mà bạn đang đứng về local.\
	**$ git pull**
- Kéo tất cả các thay đổi từ kho lưu trữ từ xa vào branch bạn đang làm việc.\
	**$ git pull origin**
- Cách pull chống sung đột\
	**$ git pull --rebase**
### 19. Sử lý code khi bị sung đột (conflict)
- Nguyên nhân: khi bạn cùng chỉnh sửa ở cùng một dùng code thì khả năng bị conflict khi merge là vô cùng cao
- Bạn cần biết code nào đang là đoạn code chung và khác biệt giữa 2 file
- VD: Tôi có file_A đang bị xung đột giữa 2 nhánh branch_1 (nhánh đang đúng) và branch_2
	+ Code branch_1 :"<<<<<<< Updated upstream" ~ "======="
	+ Code branch_2: "=======" ~  ">>>>>>> Stashed changes"
	+ Những đoạn code không nằm trong những khoảng trên là code cả 2 nhánh đều có
### 20. Cách dùng file Gitignore
- Liệt kê các file mà bạn không muốm đưa lên Git
- Các pattern format hay dùng
	+ Cấu trúc dự án\
		```java
		.
		├── build/
		├── src/
		│   ├── build/
		│   └── temp/
		└── .gitignore
		```
	+ Tạo file Gitignore\
		Tải thư viện touch cho win\
			**npm install touch-cli -g**\
		Tạo file cho thu mục\
			**$ touch .gitignore**
	+ Sử dụng # để comment và có thể để cách dòng cho dễ đọc.
	+ Loại bỏ 1 file cụ thể: liệt kê trực tiếp tên tệp
	+ Sử dụng `*` tìm các file có định dạng và loại bỏ chúng\
	Vd) *.log -> Tìm tất cả các file có đuôi là .log, sẽ không thực hiện commit các file này lên Git
	+ Loại bỏ 1 folder cụ thể\
		**/build/** -> chỉ loại bỏ được thư mục build ngang hàng với file gitignore\
		**build/** -> loại bỏ được tất cả các thu mục có tên build


