_Dự án này là một triển khai CRUD của giỏ hàng sử dụng spring boot, thymeleaf, dataJPA và mysql.

_Dự án chứa các gói với mỗi gói đại diện cho các chức năng khác nhau.
+ gói entity chứa mô hình của sản phẩm
+ gói controller xử lý các yêu cầu khác nhau
+ gói repository chứa một giao diện để lấy chức năng của dataJPA
+ gói service triển khai chức năng giao diện và nhận danh sách sản phẩm

_Thư mục template chứa file html đại diện cho front-end của project


_Để chạy ứng dụng bạn cần cài đặt xampp, chạy xampp và click admin, tạo database tên shop
 Mở eclipse, chọn file -> open Projects File From System -> chọn file "Spring Commerce" -> finish và chạy dự án
Cuối cùng truy cập localhost:1001/, nó sẽ dẫn bạn đến dự án.
Tại đây bạn có thể thêm sản phẩm, cập nhật sản phẩm, xem chi tiết sản phẩm và xóa sản phẩm, bạn cũng có thể xem sản phẩm mình muốn bằng cách tìm kiếm tên của sản phẩm. Bạn có thể thêm sản phẩm vào giỏ hàng hoặc xóa chúng khỏi giỏ hàng

Nguồn tham khảo:
https://www.youtube.com/watch?v=Q4e_GydUjbs&t=1531s
