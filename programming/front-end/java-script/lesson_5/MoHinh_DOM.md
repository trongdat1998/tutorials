# Document Object Model
- DOM là một chuẩn được định nghĩa bởi W3C (World Wide Web Consortium) để có thể truy cập và thao tác với các tài liệu như html hay xml bằng các ngôn ngữ lập trình như Javascript, VB…
# DOM được chia thành 3 mức
    + Core DOM: Tiêu chuẩn cho bất kỳ tài liệu có cấu trúc nào
    + XML DOM: Tiêu chuẩn cho tài liệu XML.
    + HTML DOM: Tiêu chuẩn cho tài liệu HTML
## HTML DOM
- HTML DOM định nghĩa các đối tƣợng và thuộc tính của tất cả các thành phần HTML và phƣơng thức để truy cập đến chúng
- Hay: HTML DOM là chuẩn để lấy, thay đổi, thêm, xóa các thành phần HTML
# Node trong DOM
- Tất cả các thành phần trong tài liệu HTML đều được biểu diễn bằng đối tượng node.
    + Toàn bộ tài liệu là **document node**
    + Tất cả các thành phần của HTML đều là **element node**
    + Văn bản trong thành phần HTML là **text node**
    + Tất cả các thuộc tính là **attribute node**
    + Chú thích là **comment node**
- Tài liệu HTML ví dụ
    + Node gốc là **html**
    + **html** có hai node con là **head** và **body**
    + **head** có một node con là **title**
    + **body** chứa hai node con là **p** và **a**
    ```js
    <html > 
        <head> 
            <title> Hi</title> 
        </head> 
        <body> 
            <p> Hello</p> 
            <a href = “http://google.com”>Link</a> 
        </body> 
    </html> 
    ```
## Quan hệ giữa các Node
- Giữa các node có mối quan hệ cha, con (parent, children) và anh em (siblings)
    + Node cha có các node con, các node con cùng cấp bậc gọi là anh em
## Thuộc tính và các phương thức của Node
- Thuộc tính định nghĩa các đặc tính cho node
- Phƣơng thức để thực hiện các thao tác với node
    + Truy cập đến node
    + Thêm node con cho node
    + Xóa node con
- Các thuộc tính của Node

|       Thuộc tính      |           giải thích          |
|:----------------------|:------------------------------|
|x là đối tượng node|
|x.innerHTML    |Giá trị văn bản của x|
|x.nodeName |Tên của x|
|x.nodeValue |Giá trị của x|
|x.nodeType |Kiểu của Node|
|x.parentNode   |Node cha của x|
|x.childNodes   |Các node con của x|
|x.attributes   |Các node thuộc tính của x|
- Các phương thức của Node

|          Thuộc tính         |             Giải thích            |
|:----------------------------|:----------------------------------|
|x là đối tượng node|
|x.getElementById(id)   |Trả về thành phần có id xác định|
|x.getElementsByTagName(name)| Trả về tất cả các thành phần với tên thẻ xác định|
|x.appendChild(node) |Thêm node con vào node x|
|x.removeChild(node)    |Xóa node con của node x|
- Có thể truy cập đến các node bằng 3 cách sau:
    + Sử dụng phương thức **getElementById(id)**
    + Sử dụng phương thức **getElementsByName(name)**
    + Sử dụng phương thức **getElementsByTagName(name)**
    + Sử dụng mối quan hệ giữa các node để điều hƣớng