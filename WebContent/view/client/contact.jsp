<%-- 
    Document   : index
    Created on : May 5, 2020, 10:57:00 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>

   
  <!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />
  <!-- / header section -->
  
<!--  content -->
   <!-- catg header banner section -->
  <section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/contact-banner.png" alt="banner liên hệ">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Liên hệ</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>         
          <li style="color:#fff">Thông tin liên hệ</li>
        </ol>
      </div>
     </div>
   </div>
  </section>
  <!-- / catg header banner section -->
<!-- start contact section -->
 <section id="aa-contact">
   <div class="container">
     <div class="row">
       <div class="col-md-12">
         <div class="aa-contact-area">
           <div class="aa-contact-top">
             <h2>Chúng tôi đang chờ để hỗ trợ bạn..</h2>
             <p>Nếu bạn nó bất cứ thắc mắc hay ý kiến gì cứ tìm đến chúng tôi.</p>
           </div>
         
           <!-- Contact address -->
           <div class="aa-contact-address">
             <div class="row">
               <div class="col-md-7">
         			 <div class="aa-contact-map">
<iframe 
    src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3835.733926173207!2d108.25064671020758!3d15.975265441883662!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142108997dc971f%3A0x1295cb3d313469c9!2sVietnam%20-%20Korea%20University%20of%20Information%20and%20Communication%20Technology!5e0!3m2!1sen!2s!4v1747128371092!5m2!1sen!2s" 
    width="100%" 
    height="450" 
    frameborder="0" 
    style="border:0;" 
    allowfullscreen="" 
    loading="lazy" 
    referrerpolicy="no-referrer-when-downgrade">
</iframe>
           </div>
               </div>
               <div class="col-md-5">
                 <div class="aa-contact-address-right">
                   <address>
                     <h4>CLOTHING STORE</h4>
                     <p>Liên hệ cho chúng tôi bất cứ khi nào bạn cần.</p>
                     <p><span class="fa fa-home"></span>470 Trần Đại Nghĩa - Ngũ Hành Sơn - TP.ĐN</p>
                     <p><span class="fa fa-phone"></span>038.5109.397</p>
                     <p><span class="fa fa-envelope"></span>Email: contact@mailuan345@gmail.com</p>
                   </address>
                 </div>
               </div>
             </div>
           </div>
         </div>
       </div>
     </div>
   </div>
 </section>
<!--  end content-->
  
<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->


  
