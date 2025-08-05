### 1. Decision Making statements - Câu lệnh rẻ nhánh
「if-else và switch-case」
#### 1.1. if-else
- Cho phép bạn thực hiện một hành động nếu điều kiện đúng (true), và nếu điều kiện sai (false)
- Có các kiểu của mệnh đề if-else trong java như sau:
	+ if
	+ if-else
	+ if-else if
	+ Câu lệnh if lồng nhau

※ Dùng khi nhỏ hơn 4 nhánh, còn lại dùng switch-case
- Cú pháp:
	```Java
		if(condition){  
			//code to be executed  
		} 
	```
	+ condition: là biểu thức logic trả về giá trị boolean (true hoặc false)
	+ Khối mã nằm trong dấu ngoặc nhọn {} sẽ được thực thi nếu điều kiện đúng
- Ví dụ:
	+ File Name: IfExample.java
		```java
		public class IfExample {  
			public static void main(String[] args) {  
				//defining an 'age' variable  
				int age = 20;
				//checking the age
				if (age > 18) {
					System.out.print("Age is greater than 18");
				}
			}  
		}  
		```
	+ Output:
		```java
		Age is greater than 18
		```
#### 1.2. Switch
- Là một cấu trúc điều khiển rẽ nhánh, giúp kiểm tra giá trị của một biến và thực hiện các khối lệnh tương ứng
- Cú pháp:
	```Java
	switch(expression){    
		case value1:    
			//code to be executed;    
			break;  //optional  
		case value2:    
			//code to be executed;    
			break;  //optional  
		......
		default:     
		code to be executed if all cases are not matched;  
	}   
	```
	+ expression: Biểu thức cần kiểm tra (có thể là int, char, String, enum)
	+ value_x: Nếu *expression* bằng *value_x*, các lệnh trong case đó sẽ thực thi.
	+ break: Dùng để thoát khỏi switch-case. Nếu không có break, chương trình tiếp tục thực thi các case tiếp theo.
	+ default: Nếu không có case nào khớp, default sẽ được thực thi.
- Ví dụ:
	+ FileName: SwitchExample.java
		```java
		public class SwitchExample {  
			public static void main(String[] args) {  
				//Declaring a variable for switch expression  
				int number = 20;
				//Switch expression
				switch (number) {
					//Case statements
					case 10:
						System.out.println("10");
						break;
					case 20:
						System.out.println("20");
						break;
					case 30:
						System.out.println("30");
						break;
					//Default case statement
					default:
						System.out.println("Not in 10, 20 or 30");
				}
			}  
		}  
		```
	+ Output:
		```java
		20
		```
### 2.Loop statements - Câu lệnh lặp
「for, while và do-while」
#### 2.1. Vòng lặp for
- for dùng khi biết trước số lần lặp.
- Có 3 kiểu của vòng lặp for trong java
	+ for đơn giản
	+ for cải tiến (For-each)
	+ for gán nhãn (break hoặc continue)
- Cú pháp:
	```Java
	for(initialization; condition; increment/decrement){    
		//statement or code to be executed    
	}   		
	//and 
	for(data_type variable : array | collection){  
		//body of for-each loop  
	} 
	```
	+ initialization: Khai báo và khởi tạo biến điều khiển vòng lặp
	+ condition:  logic kiểm tra xem vòng lặp có tiếp tục chạy không
	+ increment/decrement: Biểu thức cập nhật biến điều khiển sau mỗi lần lặp (Tăng hoặc Giảm)
	+ data_type: Kiểu dữ liệu của phần tử, phù hợp với phần tử được lưu
	+ variable: Biến điều khiển vòng lặp
	+ array | collection: Đây là đối tượng bạn muốn duyệt qua.
- Ví dụ 1:
	+ Filename: ForExample.java
		```java
		public class ForExample {  
			public static void main(String[] args) {  
				//Code of Java for loop  
				for (int i = 1; i <= 10; i++) {
					System.out.print(i + " "); 
				}  
			}  
		}  
		```
	+ Output:
		```java
		1 2 3 4 5 6 7 8 9 10
		````
- Ví dụ 2:
	+ FileName: ForEachExample
		```java
		class ForEachExample{  
			public static void main(String args[]){  
				//declaring an array  
				int arr[] = {12, 13, 14, 44};
				//traversing the array with for-each loop
				for (int i : arr) {
					System.out.print(i + " ");
				} 
			}  
		}  
		```
	+ Output:
		```java
		12 13 14 44
		```
#### 2.2. Vòng lặp While
- while dùng khi chưa biết số lần lặp.
- Cú pháp:
	```Java
	while (condition){      
		//code to be executed     
	}   
	```
	+ condition: là điều kiện để xác định dùng vòng lặp. Có giá trị là true hoặc false.
- Ví dụ:
	+ FileName: WhileExample.java
		```java
		public class WhileExample {  
			public static void main(String[] args) {  
				int i = 1;
				while (i <= 10) {
					System.out.print(i + " ");
					i++;
				}  
			}  
		}  
		```
	+ Output:
		```java
		1 2 3 4 5 6 7 8 9 10
		```
#### 2.3. Vòng lặp do-while
- do-while dùng khi chưa biết số lần lặp và cần chạy ít nhất 1 lần.
- Cú pháp:
	```Java
	do{    
		//code to be executed / loop body     
	}while (condition);  
	```
	+ condition: là điều kiện để xác định dùng vòng lặp. Có giá trị là true hoặc false.
- Ví dụ:
	+ FileName: DoWhileExample.java
		```java
		public class DoWhileExample {    
			public static void main(String[] args) {
				int i = 1;  
				do {
					System.out.print(i + " ");
					i++;
				} while (i <= 10);  
			}    
		}   
		```
	+ Output:
		```java
		1 2 3 4 5 6 7 8 9 10 
		```
### 3.Jump statements - Câu lệnh dừng
「break và continue」
#### 3.1. Break
- Break được dùng để thoát ra khỏi vòng lặp chứa nó ngay lập tức
- Ví dụ:
	+ FileName: BreakExample.java
		```Java
		public class BreakExample {  
			public static void main(String[] args) {  
				//using for loop  
				for (int i = 1; i <= 10; i++) {
					if (i == 5) {
						//breaking the loop
						break;
					}
					System.out.print(i + " ");
				}  
			}  
		}  
		```
	+ Output:
		```java
		1 2 3 4 
		```
#### 3.2. Continue
- Continue dùng để bỏ qua không thực hiện các lệnh phía bên dưới từ khóa continue của vòng lặp và quay lên kiểm tra trở lại biểu thức điều kiện lặp
- Ví dụ:
	+ FileName: ContinueExample.java
		```Java
		public class ContinueExample {  
			public static void main(String[] args) {  
				//for loop  
				for (int i = 1; i <= 10; i++) {
					if (i == 5) {
						//using continue statement
						continue;//it will skip the rest statement
					}
					System.out.print(i + " ");
				} 
			}  
		}  
		```
	+ Output:
		```java
		1 2 3 4 6 7 8 9 10 
		```
