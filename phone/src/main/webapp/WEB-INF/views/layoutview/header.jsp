<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %> 
     <header>
         <div class="top-bar_sub container-fluid">
            <div class="row">
               <div class="col-md-4 top-forms text-left mt-4"  data-aos="fade-up">
                  <span>Welcome Back!</span>
                  <span class="mx-lg-4 mx-md-2  mx-1">
 				  <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-green w3-large">
                  <i class="fas fa-lock"></i> Sign In</button>
                  </span>
                  <span>
                  <button onclick="document.getElementById('id02').style.display='block'" class="w3-button w3-green w3-large">
                  <i class="far fa-user"></i> Register</button>
                  </span>
                   Welcome: ${pageContext.request.remoteUser}
                     <form action="<c:url value="/j_spring_security_logout" />" method="post">
     				 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  				     <input type="submit" value="Logout" />
 					 </form>
 					<p>Error: ${message }</p> 
               </div>
               <div class="col-md-4 logo text-center" data-aos="fade-up">
                  <a class="navbar-brand" href="index.html">
                  <i class="fab fa-gitkraken"></i> Baked</a>
               </div>
               <div class="col-md-4 log-icons text-right"  data-aos="fade-up">
                  <ul class="social_list1 mt-4">
                     <li>
                        <a href="#" class="facebook1 mx-2">
                        <i class="fab fa-facebook-f"></i>
                        </a>
                     </li>
                     <li>
                        <a href="#" class="twitter2">
                        <i class="fab fa-twitter"></i>
                        </a>
                     </li>
                     <li>
                        <a href="#" class="dribble3 mx-2">
                        <i class="fab fa-dribbble"></i>
                        </a>
                     </li>
                     <li>
                        <a href="#" class="pin">
                        <i class="fab fa-pinterest-p"></i>
                        </a>
                     </li>
                  </ul>
               </div>
            </div>
         </div>
         
  <!-- Login -->
  <div id="id01" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

      <div class="w3-center"><br>
        <span onclick="document.getElementById('id01').style.display='none'" class="w3-button w3-xlarge w3-hover-red w3-display-topright" title="Close Modal">&times;</span>
        <img src="assets/images/avata.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">
      </div>

      <form class="w3-container" action="<c:url value='j_spring_security_login' />" method='POST'>
        <div class="w3-section">
          <label><b>Username</b></label>
          <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="username" required>
          <label><b>Password</b></label>
          <input class="w3-input w3-border" type="password" placeholder="Enter Password" name="password" required>
          <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit">Login</button>
          <input class="w3-check w3-margin-top" type="checkbox" checked="checked"> Remember me
           <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </div>
      </form>

      <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
        <button onclick="document.getElementById('id01').style.display='none'" type="button" class="w3-button w3-red">Cancel</button>
        <span class="w3-right w3-padding w3-hide-small">Forgot <a href="#">password?</a></span>
      </div>

    </div>
  </div>
<!-- hết login -->
<!-- register -->

  <div id="id02" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

      <div class="w3-center"><br>
        <span onclick="document.getElementById('id02').style.display='none'" class="w3-button w3-xlarge w3-hover-red w3-display-topright" title="Close Modal">&times;</span>
        <img src="assets/images/avata.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">
      </div>

      <form class="w3-container" method="post" 
      	action="${pageContext.request.contextPath}/account/account.html" >
        <div class="w3-section">
          <label><b>Tên người dùng</b></label>
          <input class="w3-input w3-border w3-margin-bottom"  type="text" placeholder="Enter Username" name="usrname" required />

          <label><b>Địa chỉ gmail</b></label>
          <input class="w3-input w3-border w3-margin-bottom"  type="email" placeholder="Enter gmail" name="gmail" required />

          <label><b>Giới tính</b></label>
          <input class="" type="radio" name="gioitinh" value="1"   /> Nam
          <input class="" type="radio" name="gioitinh" value="0"   /> Nữ
          <br/>
          
          <label><b>Địa chỉ</b></label>
          <textarea name="diachi"   class="w3-input w3-border w3-margin-bottom"></textarea>
          
          <label><b>Ảnh</b></label>
          <input class="w3-input w3-border w3-margin-bottom"  type="text" placeholder="Enter picture" name="anh" required />
          
          <label><b>Password</b></label>
          <input class="w3-input w3-border" type="password"  placeholder="Enter Password" name="psw" required />
          
          <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit">Đăng ký</button>
        </div>
      </form>

      <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
      
        <button onclick="document.getElementById('id01').style.display='none'" type="button" class="w3-button w3-red">Cancel</button>
       
      </div>

    </div>
  </div>

<!-- register -->       
         
      </header>
      <div class="banner">
         <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
               <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
               <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
               <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
               <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
               <div class="carousel-item active">
                  <div class="carousel-caption">
                     <h3>Phone
                        <span>Phone</span>
                     </h3>
                  </div>
               </div>
               <div class="carousel-item item2">
                  <div class="carousel-caption">
                     <h3>Iphone
                        <span>Iphone !</span>
                     </h3>
                  </div>
               </div>
               <div class="carousel-item item3">
                  <div class="carousel-caption">
                     <h3>Asus
                        <span>Hello</span>
                     </h3>
                  </div>
               </div>
               <div class="carousel-item item4">
                  <div class="carousel-caption">
                     <h3>Nokia
                        <span>Nokia!</span>
                     </h3>
                  </div>
               </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
            </a>
         </div>
      </div>