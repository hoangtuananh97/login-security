<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
      <section>
      <div class="container">
         <div class="row search-row">
            <p><input type="text" class="quicksearch" placeholder="Search" /></p>
         </div>
         <div class="btn-group sort-button-group pull-right"> 
            <button class="button btn-default is-checked" data-sort-direction="asc" data-sort-value="original-order" type="button">Sort <span aria-hidden="true" class="fa fa-button-up"></span></button> 
            <button class="button btn-default" data-sort-direction="asc" data-sort-value="name" type="button">Name <span aria-hidden="true" class="fa fa-chevron-up"></span></button> 
            <button class="button btn-default" data-sort-direction="asc" data-sort-value="symbol" type="button">symbol  <span aria-hidden="true" class="fa fa-chevron-up"></span></button>
            <button class="button btn-default" data-sort-direction="asc" data-sort-value="number" type="button">number <span aria-hidden="true" class="fa fa-chevron-up"></span></button> 
            <button class="button btn-default" data-sort-direction="asc" data-sort-value="weight" type="button">weight <span aria-hidden="true" class="fa fa-chevron-up"></span></button> 
         </div>
         <!-- /.btn-group -->
         <button class="btnview" id="btnlistView"><i class="fa fa-bars"></i> List</button> 
         <button class="btnview activebtn" id="btngirdview"><i class="fa fa-th-large"></i> Grid</button>
         <div class="row">
            <div class="col-md-3">
               <div class="filters">
                  <div class="ui-group">
                     <div class="thuonghieu">
                        <button class=" collapsible activeli">Thuong hieu</button>
                        <ul class="list-group content button-group js-radio-button-group" data-filter-group="color"" style="max-height: 100%">
                           <li class="list-group-item">
                              <button class=" button is-checked" id="btnall" data-filter="">any</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".red">red</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".blue">blue</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".yellow">yellow</button>
                              <span class="badge">12</span>
                           </li>
                        </ul>
                     </div>
                  </div>
                  <div class="ui-group">
                     <div class="thuonghieu">
                        <button class="collapsible">Muc gia</button>
                        <ul class="list-group content button-group js-radio-button-group" data-filter-group="size">
                           <li class="  list-group-item">
                              <button class="button is-checked" data-filter="">any</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".small">small</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".wide">wide</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".big">big</button>
                              <span class="badge">12</span>
                           </li>
                           <li class="list-group-item">
                              <button class="button" data-filter=".tall">tall</button>
                              <span class="badge">12</span>
                           </li>
                        </ul>
                     </div>
                  </div>
               </div>
            </div>
            <div class="col-md-9">
               <div class="grid">
                  <div class="color-shape small round blue">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p1.jpg"/>" class="img_width">
                        <figcaption class="aa">
                           <h3 class="name">aaa</h3>
                           <p class="symbol">bb</p>
                           <p class="number">80</p>
                           <p class="weight">200.59</p>
                           <button class="btn btn-success btngiohang">Them gio hang</button>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape small round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p2.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">bb</h3>
                           <p class="symbol">aa</p>
                           <p class="number">80</p>
                           <p class="weight">400.59</p>
                           <button class="btn btn-success btngiohang">Them gio hang</button>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape small round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p1.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">cc</h3>
                           <p class="symbol">sdf</p>
                           <p class="number">123</p>
                           <p class="weight">256.59</p>
                           <button class="btn btn-success btngiohang">Them gio hang</button>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape small round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/3.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">ddd</h3>
                           <p class="symbol">sdfg</p>
                           <p class="number">34</p>
                           <p class="weight">260.59</p>
                           <button class="btn btn-success btngiohang">Them gio hang</button>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape small round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/2.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">eee</h3>
                           <p class="symbol">yyy</p>
                           <p class="number">67</p>
                           <p class="weight">200.59</p>
                           <button class="btn btn-success btngiohang">Them gio hang</button>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape small round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p4.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">vMercuryfđgđfgdfdfds</h3>
                           <p class="symbol">fgh</p>
                           <p class="number">89</p>
                           <p class="weight">2004.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape wide square blue">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p4.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">ercury</h3>
                           <p class="symbol">aaa</p>
                           <p class="number">80</p>
                           <p class="weight">200.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape wide square yellow">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/5.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">kMercury</h3>
                           <p class="symbol">hdfhh</p>
                           <p class="number">820</p>
                           <p class="weight">2040.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape big round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p1.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">vMercury</h3>
                           <p class="symbol">dsf</p>
                           <p class="number">380</p>
                           <p class="weight">5200.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape big round blue">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p4.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">iMercury</h3>
                           <p class="symbol">hhh</p>
                           <p class="number">324</p>
                           <p class="weight">23.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape tall square yellow">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/p1.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">sdaa</h3>
                           <p class="symbol">nmk</p>
                           <p class="number">34</p>
                           <p class="weight">342.59</p>
                        </figcaption>
                     </figure>
                  </div>
                  <div class="color-shape tall round red">
                     <figure class="figure_width">
                        <img src="<c:url value="/resources/images/5.jpg"/>"" class="img_width">
                        <figcaption>
                           <h3 class="name">mercury</h3>
                           <p class="symbol">hhh</p>
                           <p class="number">80</p>
                           <p class="weight">200.59</p>
                        </figcaption>
                     </figure>
                  </div>
               </div>
            </div>
            <!-- het divgridView -->
         </div>
      </div>
     </section> 