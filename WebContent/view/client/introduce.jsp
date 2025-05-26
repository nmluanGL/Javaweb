<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/view/client/assets" var="url"/>
<!-- Start header section -->
<jsp:include page="./header/mainHeader.jsp" flush="true" />

<section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/banner-product_it1.png" alt="banner sản phẩm">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Giới thiệu</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>      
          <li style="color:#fff">Giới thiệu</li>   
        </ol>
      </div>
     </div>
   </div>
</section>

<section id="aa-product-category">
  <div class="container">
    <div class="row">
      <div>
        <h1 style="text-align: center; color: red;">Thời Trang MAILUAN</h1>
        <p>Chúng tôi hy vọng mang đến cho khách hàng những bộ trang phục phong cách, đa dạng và chất lượng cao tại cửa hàng <strong>MAILUAN</strong>. 
        Với sứ mệnh trở thành một trong những nhà cung cấp thời trang uy tín hàng đầu tại Việt Nam, chúng tôi cam kết mang đến những sản phẩm thời trang 
        từ phong cách thanh lịch, năng động đến hiện đại, đáp ứng mọi nhu cầu của khách hàng.</p>
       <!-- <img src="${url}/images/introduc_1.png" alt="Thời trang chất lượng"/> <br/> <br>// -->
        <p>Chúng tôi luôn chú trọng vào chất lượng sản phẩm với quy trình lựa chọn kỹ lưỡng, kiểm soát chặt chẽ từng sản phẩm thời trang. 
        <strong>MAILUAN</strong> cam kết chỉ cung cấp các sản phẩm từ các nhà sản xuất uy tín, đảm bảo mang đến cho khách hàng những bộ trang phục đẹp, bền và an toàn cho sức khỏe.</p>
        <p>Bộ sưu tập của chúng tôi bao gồm đa dạng các dòng sản phẩm như áo thun, áo sơ mi, quần jeans, váy đầm, áo khoác, giày dép và phụ kiện thời trang. 
        Đặc biệt, chúng tôi luôn cập nhật những xu hướng thời trang mới nhất để khách hàng luôn có được phong cách thời thượng.</p>
        <img src="${url}/images/introduce_2.png" alt="Thời trang đa phong cách" width="1160" height="600"/> <br/> <br>
        <strong>Dưới đây là những dòng sản phẩm nổi bật của MAILUAN được khách hàng yêu thích:</strong><br/>
        <p> <strong>Thời trang nam:</strong> Đa dạng từ áo thun, áo sơ mi, quần jeans đến các bộ suit lịch lãm, giúp phái mạnh luôn tự tin và phong cách.</p>
        <p> <strong>Thời trang nữ:</strong> Với các mẫu váy đầm, áo kiểu, quần short, giày dép và phụ kiện đa dạng, đáp ứng mọi phong cách từ năng động đến dịu dàng.</p>
        <p> <strong>Phụ kiện thời trang:</strong> Gồm các loại túi xách, nón, dây chuyền, vòng tay và kính mắt giúp bạn hoàn thiện phong cách cá nhân.</p>
        <p> <strong>Giày dép phong cách:</strong> Bao gồm giày thể thao, giày cao gót, dép sandal và các loại giày thời trang khác, phù hợp cho mọi lứa tuổi.</p>
        <br />
      </div>
    </div>
  </div>
</section>

<!-- footer-->
<jsp:include page="./footer/footer.jsp" flush="true" />
<!-- end footer-->
