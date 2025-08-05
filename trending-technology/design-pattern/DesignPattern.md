https://viblo.asia/p/tong-hop-cac-bai-huong-dan-ve-design-pattern-23-mau-co-ban-cua-gof-3P0lPQPG5ox
# Design Pattern

## Khái niệm
- Design Patterns là các mẫu thiết kế không phải là ngôn ngữ cụ thể nào cả.
- Lợi ích của Design Pattern
	+ Tiết Kiệm Thời Gian: Design Pattern cung cấp cách tiếp cận chuẩn cho các vấn đề thường gặp, giúp tiết kiệm thời gian trong thiết kế và phát
	+ Tái Sử Dụng: Các Design Pattern thúc đẩy việc tái sử dụng mã nguồn, giúp phát triển phần mềm nhanh hơn và giảm tổng chi phí.
	+ Code Dễ Hiểu và Gỡ Lỗi: Áp dụng Design Pattern làm cho mã nguồn dễ hiểu hơn, dễ gỡ lỗi hơn.
## Phân loại Design Patterns
Có 23 mẫu được chia thành 3 nhóm.
### Creational Patterns (Nhóm khởi tạo)
- Đưa ra một số giải pháp tạo đối tượng mà không cần sử dụng method **new**
- Bao gồm 5 mẫu:
	1. Singleton: Chỉ tạo ra một đối tượng duy nhất trong suốt quá trình thực thi chương trình.
		```java
			public class EagerInitialization {
				// Start
				private EagerInitialization(){}
				private static final EagerInitialization INSTANCE = new EagerInitialization();
				public static EagerInitialization getInstance(){
					return INSTANCE;
				}
				// End
				private String name;

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}
				
				public static void main(String[] args) {
					EagerInitialization eager1 = EagerInitialization.getInstance();
					eager1.setName("Join");
					System.out.println("Name1: " + eager1.getName());

					EagerInitialization eager2 = EagerInitialization.getInstance();
					System.out.println("Name2: " + eager2.getName() +"\n");
					System.out.println("Như vậy eager2 đã không được tạo lại");
				}
			}
		```
		+ Output:
		```java
		Name1: Join
		Name2: Join

		Như vậy eager2 đã không được tạo lại
		```
	2. Factory Method: Thay vì tự tay tạo ra đối tượng, bạn để cho các lớp con quyết định nên tạo loại đối tượng nào.
	3. Abstract Factory: Là phần mở rộng của *Factory Method*
	4. Prototype: Cho phép bạn tạo đối tượng mới bằng cách sao chép (clone) một đối tượng đã có sẵn, thay vì tạo mới từ đầu
	5. Builder: Các đối tượng phức tạp tạo ra bằng cách dây dựng trên nhiều bước nhỏ
### Structural Patterns (Nhóm cấu trúc)
- Bao gồm 7 mẫu: Todo
### Behavioral Patterns (Nhóm tương tác)
- Bao gồm 11 mẫu: Todo
## Note
- SVN:Todo