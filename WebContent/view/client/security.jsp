<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
  <!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />

  <section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/banner_tc12.jpg" alt="banner sản phẩm">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Chính sách bảo mật</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>
          <li style="color:#fff">Chính sách</li>         
        </ol>
      </div>
     </div>
   </div>
  </section>
  <section id="aa-product-category">
    <div class="container">
      <div class="row">
       <div>
          <h1 style ="text-align: center; color: red;">Chính Sách Bảo Mật - Thời Trang MAILUAN</h1>
          <p><strong>Thời Trang QUOCTHIEN</strong> luôn cam kết bảo vệ sự riêng tư của khách hàng khi truy cập và mua sắm trên website của chúng tôi. Chính sách bảo mật này giải thích cách chúng tôi thu thập, sử dụng, bảo mật và xử lý thông tin cá nhân của bạn.</p>
          <strong>1. Thu thập thông tin cá nhân</strong>
          <p>Chúng tôi thu thập thông tin như tên, email, số điện thoại, địa chỉ giao hàng, thông tin thanh toán và các thông tin khác liên quan để xử lý đơn hàng, cung cấp dịch vụ và hỗ trợ khách hàng. Chúng tôi cam kết không tiết lộ thông tin này cho bên thứ ba trừ khi có yêu cầu pháp lý.</p>
          <strong>2. Sử dụng thông tin cá nhân</strong>
          <p>Thông tin của bạn sẽ được sử dụng để:
            <ul>
              <li>Xử lý đơn hàng và giao hàng.</li>
              <li>Liên hệ hỗ trợ khách hàng.</li>
              <li>Cung cấp thông tin về sản phẩm và ưu đãi.</li>
              <li>Cải thiện chất lượng dịch vụ và trải nghiệm người dùng.</li>
            </ul>
          </p>
          <strong>3. Bảo mật thông tin</strong>
          <p>Chúng tôi sử dụng các biện pháp kỹ thuật và bảo mật để ngăn chặn truy cập trái phép, mất mát hoặc tiết lộ thông tin cá nhân. Các giao dịch thanh toán trực tuyến sẽ được mã hóa để đảm bảo an toàn tối đa.</p>
          <strong>4. Quyền lợi của khách hàng</strong>
          <p>Bạn có quyền truy cập, chỉnh sửa hoặc yêu cầu xóa thông tin cá nhân của mình bất cứ lúc nào bằng cách liên hệ với bộ phận hỗ trợ khách hàng của chúng tôi.</p>
          <strong>5. Sử dụng Cookie</strong>
          <p>Website của chúng tôi sử dụng cookie để tối ưu hóa trải nghiệm người dùng, ghi nhớ thông tin đăng nhập và phân tích hành vi truy cập. Bạn có thể từ chối cookie trong cài đặt trình duyệt của mình.</p>
          <strong>6. Bảo mật thanh toán</strong>
          <p>Các giao dịch thanh toán trực tuyến được xử lý thông qua cổng thanh toán bảo mật, đảm bảo thông tin thẻ tín dụng và thông tin cá nhân của bạn luôn được an toàn.</p>
          <strong>7. Thay đổi chính sách bảo mật</strong>
          <p>Chúng tôi có thể cập nhật chính sách bảo mật này bất cứ lúc nào. Bất kỳ thay đổi nào sẽ được thông báo trên trang này và có hiệu lực ngay lập tức.</p>
          <br />
        </div>
      </div>
     </div>
    </section>

<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->
