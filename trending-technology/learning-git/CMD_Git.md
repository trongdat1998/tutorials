# Hệ thống quản lý phiên bản - Version Control System (VSC)
- Là một hệ thống ghi nhận và lưu lại sự thay đổi của các file theo thời gian. Cũng giúp bạn phục hồi quay về trạng thái ở một thời điểm trước đó
- Phân loại VCS:
1. Hệ thống quản lý phiên bản cục bộ (Local Version Control Systems)
	+ Là dạng quản lý phiên bản ngay trên máy tính cá nhân của người dùng
	+ Nhược điểm: Không phù hợp cho làm việc nhóm; dễ bị mất dữ liệu nếu ổ cứng bị hỏng.
	+ Ví dụ: RCS (Revision Control System)
2. Hệ thống quản lý phiên bản tập trung (Centralized Version Control Systems - CVCS)
	+ Là hệ thống gồm **một máy chủ** chứa toàn bộ dữ liệu phiên bản khác nhau của dự án
	+ Nhược điểm: Phải phụ thuộc vào máy chủ trung tâm
	+ Ví dụ: SVN (Apache Subversion)
3. Hệ thống quản lý phiên bản phân tán (Distributed Version Control Systems - DVCS)
	+ Khi một client truy xuất dữ liệu từ máy chủ, nó không chỉ lấy về dữ liệu ở phiên bản mới nhất, mà nó còn tải về cả kho chứa của hệ thống.
	+ Nhược điểm: Khó học
	+ Ví dụ: Git
# Tìm hiểu về Git
- Git là 1 hệ thống quản lý phiên bản phân tán (DVCS)
- Hầu hết mọi thao tác với Git diễn ra ở Local
- GitHub, GitLab là những trang web phát triển dự trên công cụ Git\
![](./image/git/git.jpg)

## Các khu vực làm việc và Repository
![alt](https://github.com/trongdat1998/personal-blog/tree/main/image/git/working.png)
1. Working Directory (project)
	+ Là khu vực mà bạn thực hiện các thay đổi trực tiếp trên các tệp của dự án.
2. Staging Area (project/.git/index)
	+ Là khu vực lưu tạm các file thay đổi chuẩn bị commit
3. Local Repository 
	+ Là repository bố trí trên máy của bản thân mình
4. Remote repository
	+ Là repository để chia sẻ giữa nhiều người và bố trí trên server chuyên dụng
## Trạng thái của file trong Git
![alt](https://github.com/trongdat1998/personal-blog/tree/main/image/git/status_file.jpg)
- Ở trên local repository file có 2 trạng thái là: Được Git theo dõi và không được Git theo dõi
1. Untracked (Chưa được Git theo dõi)
- Tệp mới được tạo hoặc thêm vào thư mục làm việc nhưng chưa được Git theo dõi.
- Hiển thị trong *git status* dưới danh mục **Untracked files:**
- Để chuyển trạng thái Untracked ⇒ Staged\
	**git add**
2. Modified
- Là những file có sự thay đổi và được Git theo dõi
- Hiển thị trong *git status* dưới danh mục **Changes not staged for commit:**
- Để chuyển trạng thái Modified ⇒ Staged\
	**git add**
3. Staged
- Đánh dấu các sự thay đổi để chuẩn bị cho bước commit
- Hiển thị trong *git status* dưới danh mục **Changes to be committed:**
- Để chuyển trạng thái *Staged ⇒ Unmodified*\
	**git commit**
- - Để chuyển trạng thái Staged về trạng thái trước đấy (Untracked và Staged)\
	**git reset**
4. Unmodified
- Khi các file đã được đánh dấu sau khi được commit sẽ lại trở về trạng thái ko thay đổi
- Lúc này khi chúng ta *git status* sẽ không còn thấy các file có thay đỗi nữa.
- Để chuyển trạng thái *Unmodified ⇒ Remote Repo*\
	**git push**
## Thao tác cơ bản trên Git
- Tìm hiểu về các command thông dụng trong Git
### Các lệnh cơ bản trong Git
- Check version\
	**$ git --v**
- Hướng dẫn bạn có thể làm được những gì, tất cả các lệnh có thể\
	**$ git help --all**
- Lấy đường link của Git trong folder dự án\
	**$ git remote -v**
- Bấn *q* để thoát khi dùng lệnh *git log*
### Git user

1. Check git
- Kiểm tra tên người dùng đã được cấu hình trong Git\
	**$ git config user.name**
- Kiểm tra email đã được cấu hình trong Git\
	**$ git config user.email**
- Kiểm tra toàn bộ thông tin cấu hình git\
	**$ git config --list**
2. Login Git
- Thiết lập tên người dùng\
	**$ git config --global user.name "<dev_name>"**
- Thiết lập địa chỉ email\
	**$ git config --global user.email "<dev_email>"**
3. Logout Git
- Xóa tên người dùng\
	**$ git config --global --unset user.name**
- Xóa địa chỉ email\
	**$ git config --global --unset user.email**
- Xóa thông tin xác thực toàn bộ\
	**$ git config --global --unset-all**
### Branch
https://xuanthulab.net/lam-viec-voi-nhanh-branch-tao-nhanh-gop-nhanh-trong-git.html
- Là phân nhánh của repository và ghi lại luồng của history, mỗi branch độc lập thì có history riêng, không ảnh hưởng đến branch khác
- Vai trò: phân chia các task công việc thành các branch từ đó tránh được việc xung đột
- Khi cần gộp lại các tính năng đã phát triển trên các branch khác nhau thì sẽ sử dụng tính năng *git merge*
#### Xem danh sách các nhánh - branch
- Kiểm tra các branch hiện có trên remote repository của bạn.\
	**$ git branch -a**
- Kiểm tra các nhánh hiện có trên local.\
	**$ git branch**
#### Tạo một nhánh mới
- *Khác với tạo nhánh trên các IDE hay trực tiếp trên Git. Khi dùng lệnh nội dung có trong nhánh xẽ không có gì bạn cần làm thêm bước hợp nhất (merge) nhánh.*
◇ Tạo mới nhánh\
	**$ git branch <tên_nhánh_mới>**\
◇ Chuyển đến nhánh cần lấy nội dung (thường là *main* hoặc *master*).\
	**$ git checkout <main>**
◇ Hợp nhất 2 nhánh.\
	**$ git merge <tên_nhánh_vừa_tạo>**
◇ Đẩy nhánh vừa tạo lên remote repository.\
	**$ git push -u origin <tên_nhánh_vừa_tạo>**
#### Chuyển nhánh làm việc mới
- Chuyển sang nhánh chỉ định\
	**$ git checkout <tên_nhánh_cần_đến>**\
※ : Khi bạn đang ở branch_1 (file_A có chỉnh sửa) sẽ không checkout sang được branch_2
#### Xóa nhánh
◇ Xóa nhánh trên local, sau đó thực hiện xóa nhánh trên remote repository. Bạn cần đảm bảo bạn đang đứng khác nhánh cần xóa.\
	**$ git branch -d <branch_name>**\
		*# Nhánh này đã được merge*\
	**$ git branch -D <branch_name>**
		*# Nhánh này chưa được merge*
◇ Xóa nhánh trên remote repository.\
	**$ git push -d origin <nhanh_cần_xóa>**
		*# Khi bạn bỏ qua 1. thì nhánh này vẫn lưu trên local. Bạn có để push lên remote repository lại, hoặc loại bỏ luôn*
#### Đổi tên nhánh
◇ Đổi tên nhánh\
	**$ git branch -M <Tên_mới_cho_nhánh>**\
		*# Đổi tên nhánh tại vị trí nhánh bạn đang đứng*\
	**$ git branch -M <Tên_nhánh_khác_với vị_trí đứng> <Tên_mới_cho_nhánh>**\
		*# Đổi tên nhánh khác với vị trí bạn đang đứng*
◇ Đẩy tên mới của nhánh lên remote repository\
	**$ git push -u origin <Tên_mới_của_nhánh>**
◇ Xóa nhánh cũ đi\
	**$ git push -d origin <Tên_nhánh_cũ>**
- Note: Khi xóa nhánh và đổi tên nhánh những người khác không thực hiện được gì với nhánh cũ, nên cần checkout sang nhánh vừa đổi

### Git init
- Tạo ra file ẩn (.git), bạn có thể thao tác các lệnh của git trên local repository
※ Bạn có thể dùng các lệnh để lưu lịch sử chỉnh sửa như bình thường, nhưng không thể dùng *git push* vì bạn chỉ có thể làm việc trên local

### Git add
- Lưu thông tin thay đổi vào vùng *staging* để chuẩn bị cho lệnh commit tiếp theo
◇ Đưa vào vùng staging file, thư mục cụ thể\
	**$ git add <file1> <file2>**
◇ Đưa vào vùng staging toàn bộ thư mục làm việc\
	**$ git add .       # thêm tất cả thay đổi**\
	**$ git add *.java  # thêm tất cả file có phần mở rộng .java**
	
### Git commit
◇ Lệnh commit cơ bản, thực hiện với tham số *-m* để kèm dòng thông tin về commit\
	**$ git commit -m "Ghi chú về commit"**
◇ Khi cho tham số -a nó tương đương *git add* (chỉ add những file được git theo dõi) sau đó tự động chạy git commit
	**$ git commit -a -m "Ghi chú về commit"**
◇ Nếu commit đã được tạo ra nhưng chưa thực hiện push lên remote. Thì bạn có thể tạo ra commit mới thay thế cho commit cuối cùng đó
	**$ git commit --amend -m "Thông tin về commit"**
※ Dùng trong trường hợp không muốn tạo ra nhiều commit trong lịch sử commit. Ví dụ:\
	```git
		git add\
		git commit -m "cm1'
		# bạn tiếp tục chỉnh sửa
		git add
		git commit -m "cm2'
		git push
		# Lúc này trên server lưu thay đổi ở cm2
	```

### Git status
- Sử dụng lệnh *git status* để biết thông tin trạng thái sửa đổi, thêm mới, xóa các file trước khi thực hiện commit
◇ Nếu muốn hiện thị thông tin ngắn gọn hơn thì cho thêm tham số *-s*
	**$ git status -s**\
→ <span style="color: red;">??</span> = untracked (file lạ)\
→ <span style="color: red;">M</span> = staged (có sửa đổi, chưa commit)\
→ <span style="color: green;">M</span> = staged (có sửa đổi, chưa commit)\
→ <span style="color: green;">A</span> = added (file mới thêm, chưa commit)\
→ <span style="color: red;">D</span> = deleted (file bị xóa)

### Git log
- Tìm kiếm, xem lại, lọc các thông tin log lịch sử commit. 
◇ Mỗi commit có các thông tin gồm: mã hash của commit, dòng thông báo, người tạo commit và ngày tạo commit
	**$ git log**
◇ Nếu chỉ muốn hiện thị một số commit log, ví dụ hiện thị log của 2 commit cuối thì cho thêm -2 vào lệnh
	**$ git log -2**
◇ Nếu muốn hiện thị chi tiết các thay đổi của từng commit thì thêm vào tham số -p
	**$ git log -p -2**
◇ Lọc theo ngày bạn có thể dùng tham số --after="year-month-day" hoặc --before="year-month-day"
	**$ git log --after="2023-11-1" --before="2023-11-21"**
◇ Chỉ hiển thị mã hash và message
	**$ git log --oneline**
◇ Bạn có thể xem lịch sự commit một cách trực quan của một nhánh
	**$ git log --graph**

### Git reset
- Cách sử dụng lệnh git reset để undo, hủy commit cuối hoặc hủy đưa thay đổi vào vùng staging
#### Hủy commit
- git reset với tham số --soft
+ Những thay đỗi chuyển về vùng staging (các chỉnh sữa trước đấy vẫn còn lưu)
	**$ git reset --soft HEAD~1**
- git reset với tham số --hard
+ Những thay đỗi không chuyển về vùng staging (các chỉnh sữa trước đấy về code được pull trên git)
	**$ git reset --hard HEAD~1**\
#### Hủy git add
- Nếu bạn đã dùng lệnh git add để cập nhật thay đổi vào vùng staging, bạn có thể hủy thao tác này bằng cách thực hiện lệnh
	**$ git reset**
####Hủy đưa một file vào staging
- Nếu muốn hủy một file nào đó trong vùng staging chứ không phải toàn bộ thì dùng lệnh
	**$ git reset -- <filename>**

### Git diff
- Dùng để kiểm tra sự khác nhau, thay đổi giữa thư mục làm việc và commit cuối, giữa index và commit cuối, giữa các nhánh
+ Kiểm tra thông tin khác nhau trong vùng staging\
	** $ git diff**
+ Kiểm tra sự thay đổi của index (staging) với commit cuối\
	** $git diff --staged**
+ Kiểm tra thay đổi giữa hai commit\
	**$ git diff <hash-commit1> <hash-commit2>**
+ Kiểm tra sự thay đổi của hai nhánh\
	**$ git diff <branch1> <branch2>**


// Todo
- Lưu lại công việc đang làm ở branch này để chuyển sang branch khác (Khi bạn chưa muốn commit code).\
	**$ git stash save # Hoặc $ git stash**
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

# Commmit

## Tạo commit mới
- Tức bạn thực hiện việc thay đổi code và lưu thay đổi đấy trên remote repository
1. Khởi tạo repository (nếu chưa có)\
	**$ git init**
2. Thêm các file đã có sự thay đổi\
	**$ git add <file_add>**
- file_add là:*(. hoặc --all)* dùng để thêm tất cả các thay đổi, hoặc bạn có thể add các file bạn cần đẩy lên *
3. Thực hiện note cho các nội dung thay đổi\
	**$ git commit -m "<message>"**
- Khi bạn lỡ may thực hiện < git add. > và bạn cần loại bỏ bớt đi các file không muốn đẩy lên\
	**$ git reset**\
		*# Giúp bạn quay lại đước < git add >, bạn sẽ thực hiện add những file cần đẩy lên git*
4. Đưa code lên remote repository\
	**$ git push origin <branch_name>**
## Chỉnh sửa commit
- Dùng cho trường hợp commit bị sai, không hoàn chỉnh hoặc có vấn đề, bạn muốn loại bỏ nó
### Tạo một commit mới vẫn dữ được các lịch sử commit trước đó
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
### Lấy nội dung tại commit_id và xóa toàn bộ nội dung và lịch sử commit trước đó
- khi chạy lệnh $ git reset --hard <commit_2_id> các commit trước đó sẽ bị xóa\
		old:commit_1 -> commit_2 -> 'commit_3\
		update:commit_1 -> commit_2\
1.  Lấy key của commit cần chuyển đến\
	**$ git log**
2. Chuyển commit mà bạn muốn code bạn thực hiện tại vị trí đấy\
	**$ git reset --hard <commit_id>**
3. Thực hiện thay đổi lịch sử commit_id trên remote repository\
	**$ git push --force**
### Lấy nội dung tại commit_id và tạo ra một commit mới xóa toàn bộ nội dung và lịch sử commit trước đó
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
### Note: Sự khác nhau giữ $ git reset --hard và $ git reset --force
- Ngoài việc quay về vị trí commit_id chỉ định mà còn có các điểm khác như dưới.
- *git reset --hard* # nội dung ở trong folder cũng loại bỏ tất cả sự thay đổi của file để máp với nội dung tại commit_id. git revert nội dung trong folder cùng tương tự
- *git reset –-soft* # nội dung ở trong folder sẽ được dữ nguyên ở commit trước khi reset. Nên khi chọn cách này bạn cần tạo mới một commit mới hoặc lại bỏ các nội dung thay đổi. Khi bạn clone link git vào một folder mới các nội dung ở commit trước reset sẽ không thấy 
## Chèn commit vào một vị trí bất kỳ
- TODO
## Thay đổi nội dung khi commit
- Khi bạn lỡ commit nhưng nhận ra nội dung bị sai và cần chỉnh sửa và bạn vẫn muốn dữ commit không muốn xóa đi. Và chỉ sửa lại commit cuối cùng
1. Add lại những nội dung cần chỉnh sửa lại\
	**$ git add <file_cần_update_lại>**
2. Sửa lại nội dung commit\
	**$ git commit --amend --no-edit**
3. Đẩy nội dung cần chỉnh sửa lại commit lên repo\
	**$ git push -f origin**
- TODO
# Kéo code về local
- Kéo tất cả các thay đổi từ khác với vị trí đứng về local.\
	**$ git pull origin <nhánh_cần_kéo_về>**
- Kéo tất cả các thay đổi từ mà bạn đang đứng về local.\
	**$ git pull**
- Kéo tất cả các thay đổi từ kho lưu trữ từ xa vào branch bạn đang làm việc.\
	**$ git pull origin**
- Cách pull chống sung đột\
	**$ git pull --rebase**
# Hợp nhất code
1. Di chuyển về nhánh nhận sự hợp nhất.\
	**$  git checkout <branch_mane1>**\
		*# branch_mane1 là nhánh cần hợp nhất*
2. Tiến hành hợp nhất.\
	**$ git rebase <branch_mane2>**\
		*# Code từ branch_mane2 được hợp nhất vào branch_mane1*
## [Chú ý]: Tương đồng với merge nhưng có sự khác biệt như sau
- Merge: Chỉ lấy nội dung commit cuối cùng của hai nhánh, tích hợp tạo thành commit mới. Các commit trước đó được giữ nguyên không thay đổi.
- Rebase: Lấy code từ branch_mane2, từ những commit ở branch_mane2 tích hợp đồng thời tái tạo lại commit mới ở branch_mane1 (Các commit đã tồn tại bị bỏ đi).
# Liên kết các dự án vào với nhau
- Khi bạn muốn nhóm các project lại với nha thành một project tổng thì bạn cần dùng đên Git Submodules
1. Tạo một remote repository trên  git để thực hiện tạo một project tổng. Các project nhỏ khác đã được tạo trên Git
2. Thực hiện nhóm các project\
	**$ git submodule add <url>**
3. Khi add các submodule thì các project con không có gì, bạn cần chạy lệnh\
	**$ git submodule update --init --recursive**
4. Thực hiện tạo mới commit như thường\
	** git add, commit, push**
- Note: Bạn muốn thay đổi cá project con thì bạn vào chính project, chứ không được vào project all update code nó sẽ gây lỗi
- Để cập nhật các submodule khi có sự update\
	**$ git submodule update --recursive --remote --merge**
# Sử lý code khi bị sung đột (conflict)
- Nguyên nhân: khi bạn cùng chỉnh sửa ở cùng một dùng code thì khả năng bị conflict khi merge là vô cùng cao
- Bạn cần biết code nào đang là đoạn code chung và khác biệt giữa 2 file
- VD: Tôi có file_A đang bị xung đột giữa 2 nhánh branch_1 (nhánh đang đúng) và branch_2
+ Code branch_1 :"<<<<<<< Updated upstream" ~ "======="
+ Code branch_2: "=======" ~  ">>>>>>> Stashed changes"
+ Những đoạn code không nằm trong những khoảng trên là code cả 2 nhánh đều có
# Cách dùng file Gitignore
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


