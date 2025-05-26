

# 👗 Hệ thống Web Bán Quần Áo 

Đây là hệ thống web giúp **quản lý và bán quần áo hiệu quả** với 2 phần chính:

---

## 📂 Cấu trúc dự án Web

### 🛒 Phần Client (Giao diện người dùng cuối)

Thư mục `client` chứa các file JSP giao diện dành cho người dùng cuối, bao gồm:

* 📌 `banner-slider/slider.jsp`
* 🧩 Các phần **header**: `bottomHeader.jsp`, `mainHeader.jsp`, `menu.jsp`, `topHeader.jsp`
* 🧩 **footer**: `footer.jsp`, `script.jsp`
* 📄 Các trang chức năng chính như:
  `index.jsp`, `product.jsp`, `product-detail.jsp`, `cart.jsp`, `checkout.jsp`, `login.jsp`, `register.jsp`, `order.jsp`, `payment.jsp`, `contact.jsp`, v.v...

**Chức năng:** Giúp người dùng duyệt quần áo, tìm kiếm, xem chi tiết sản phẩm, thêm vào giỏ hàng, thanh toán, đăng nhập, đăng ký,...

---

### ⚙️ Phần Admin (Dashboard quản trị)

Thư mục `admin` chứa các file JSP dành cho quản trị viên:

* 🧩 Thư mục `header`, `footer` và `assets` để tái sử dụng chung.
* 🗂️ Các trang quản lý: `addadmin.jsp`, `addproduct.jsp`, `editproduct.jsp`, `show-product.jsp`, `show-order.jsp`, `show-user.jsp`, v.v.

**Chức năng:** Quản lý sản phẩm, danh mục, đơn hàng, người dùng và thống kê doanh thu.

---

## 🛠️ Công nghệ sử dụng

### Backend & Admin Web

* 💻 Ngôn ngữ: Java
* 🏗 Framework: Spring Boot
* 🌐 Giao diện: JSP (Java Server Pages)
* 🗃 ORM: JPA (Hibernate)
* 🛢 Database: MySQL
* ⚙ Build tool: Maven

---

🗄️ Cơ sở dữ liệu (Database)
Sử dụng MySQL làm hệ quản trị cơ sở dữ liệu chính cho phần backend và admin web.

Các bảng chính bao gồm:

👨‍💼 admin - quản lý tài khoản quản trị viên

👤 users - quản lý tài khoản người dùng

📰 boardnew - quản lý tin tức / bài viết

🗂 catalog - danh mục sản phẩm

🛒 ordered - thông tin đơn hàng

👟 productreview - đánh giá sản phẩm

💳 transactions - giao dịch thanh toán

Kết nối giữa Spring Boot và MySQL được cấu hình qua file application.properties hoặc application.yml.

ORM JPA/Hibernate giúp ánh xạ dữ liệu giữa các bảng và đối tượng Java, hỗ trợ thao tác CRUD hiệu quả.

## 💰 Thanh toán

* Thanh toán bằng **Tiền mặt (COD)**

---

🚀 Hướng dẫn cài đặt
Phần quản trị (ADMIN)
Mở thư mục WebContent/admin-web trong Visual Studio Code hoặc IDE bạn sử dụng.

Chạy lớp Admin.java để khởi động backend và admin web.

Mở trình duyệt và truy cập:
http://localhost:8080/do-an-java/admin/login

Thực hiện các thao tác thêm, sửa, xóa sản phẩm, danh mục, và xem thống kê doanh thu.

## 👤 Phần người dùng (Client)

### Chức năng chính

#### 🔐 Xác thực

* Đăng ký / Đăng nhập bằng Email hoặc Google
* Thay đổi thông tin cá nhân, mật khẩu

#### 🛍️ Mua sắm

* Hiển thị quần áo theo danh mục
* Danh mục bán chạy, tìm kiếm theo tên, giá, kích cỡ
* Xem chi tiết sản phẩm (kích cỡ, mô tả, đánh giá)
* Quản lý giỏ hàng (thêm, xóa, sửa số lượng)
* Danh sách yêu thích, áp dụng mã giảm giá

#### 💳 Thanh toán & Đơn hàng

* Thanh toán bằng **Tiền mặt (COD)**
* Theo dõi đơn hàng, lịch sử mua hàng

#### 💬 Hỗ trợ người dùng

* Trung tâm trợ giúp
* Báo lỗi & góp ý

---

