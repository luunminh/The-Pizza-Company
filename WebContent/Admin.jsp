<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="model.bean.monan"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>The Pizza Company </title>
    <script src="https://code.iconify.design/iconify-icon/1.0.1/iconify-icon.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;500;600;700;800&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./assetss/css/grid.css">
    <link rel="stylesheet" href="./assetss/css/style.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />
    <link rel="shortcut icon" type="image/png" href="/assetss/img/logo-footer.png" />
</head>

<body>
    <div class="main">
        <div class="grid wide">
            <div class="main-header">
                <div class="header">
                    <div class="header-left-wrap">
                            <a href="testAdminServlet">
	                        <img src="./assetss/img/0002378_Logo-TPC-Nen-sang-Vie (1) (1).png" class="header-logo"
	                            alt="Logo pizza">
                            
                            </a>
                    </div>
                    <div class="header-middle-wrap">
                        <div class="header-ship-group">
                            <div class="header-ship-btn">
                                <iconify-icon icon="ic:outline-local-shipping" class="account-icon"></iconify-icon>
                                <div class="span">Đặt giao hàng</div>
                            </div>
                            <div class="header-ship-btn">
                                <iconify-icon icon="ic:baseline-storefront" class="account-icon"></iconify-icon>
                                <div class="span">Đặt đến lấy</div>
                            </div>
                        </div>
                    </div>
                    <div class="header-right-wrap">
                        <div class="account">
                            <div class="account-logo">
                                <iconify-icon icon="ph:user-circle-bold" class="account-icon-login"></iconify-icon>
                            </div>
                            <div class="account-login-and-register">
                                <a href="" class="account-login">Tài khoản</a>
                                <span>/</span>
                                <a href="testAdminServlet" class="account-login account-register">Đăng xuất</a>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="header-navbar">
                    <div class="header-navbar-menu-type">
                        <a href="" class="header-navbar-menu">Tài khoản cá nhân</a>
                        <a href="" class="header-navbar-menu">Quản lý sản phẩm</a>
                        <a href="" class="header-navbar-menu">Quản lý người dùng</a>
                    </div>
                    <div class="header-navbar-function">
                        <div class="header-navbar-search">
                            <iconify-icon icon="material-symbols:search-rounded"
                                class="account-icon icon-primary-color"></iconify-icon>
                            <input type="text" placeholder="Tìm kiếm sản phẩm" class="header-navbar-search-input ">
                        </div>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="product-title"
                    style="border-bottom:3px solid var(--primary-color);width:300px;margin: 30px 0;">Tất cả sản phẩm
                </div>
                <div class="product-more">
                    <a href="addMonAn.jsp" class="product-more-link">Tạo sản phẩm mới</a>
                    <iconify-icon icon="material-symbols:add" class="account-icon"></iconify-icon>

                </div>
                <div class="product-content">
                    <div class="product-title">Pizza</div>
                    <div class="product-list">
                    	<%
						ArrayList<monan> monAnList = (ArrayList<monan>)request.getAttribute("listMonAn");
							for(int i = 0 ; i < monAnList.size(); i++){
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= monAnList.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=monAnList.get(i).getTenMonAn() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=monAnList.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    <p class="price-title">Giá</p>
		                                    <p class="product-price"><%=monAnList.get(i).getGia()%>.000đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="UpdateMonAn_Servlet?maMonAn=<%=monAnList.get(i).getMaMonAn() %>" class="btn-title">Sửa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="HandleDeleteMonAn_Servlet?maMonAn=<%=monAnList.get(i).getMaMonAn()%>" class="btn-title">Xóa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                            </div>
		                        </div>
		                    
						<%} %>
					</div>

                </div>
			</div>
			<div class="product-content">
                    <div class="product-title">Pasta</div>
                    <div class="product-list">
                    	<%
						ArrayList<monan> pastaList = (ArrayList<monan>)request.getAttribute("listPastaMonAn");
							for(int i = 0 ; i < pastaList.size(); i++){
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= pastaList.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=pastaList.get(i).getTenMonAn() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=pastaList.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    <p class="price-title">Giá</p>
		                                    <p class="product-price"><%=pastaList.get(i).getGia()%>.000đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="UpdateMonAn_Servlet?maMonAn=<%=pastaList.get(i).getMaMonAn() %>" class="btn-title">Sửa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="HandleDeleteMonAn_Servlet?maMonAn=<%=pastaList.get(i).getMaMonAn() %>" class="btn-title">Xóa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                            </div>
		                        </div>
		                    
						<%} %>
					</div>

                </div>
	
			<div class="product-content">
                    <div class="product-title">Pasta</div>
                    <div class="product-list">
                    	<%
					ArrayList<monan> saladList = (ArrayList<monan>)request.getAttribute("listSaladMonAn");
							for(int i = 0 ; i < saladList.size(); i++){
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= saladList.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=saladList.get(i).getTenMonAn() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=saladList.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    <p class="price-title">Giá</p>
		                                    <p class="product-price"><%=saladList.get(i).getGia()%>.000đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="UpdateMonAn_Servlet?maMonAn=<%=saladList.get(i).getMaMonAn() %>" class="btn-title">Sửa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="HandleDeleteMonAn_Servlet?maMonAn=<%=saladList.get(i).getMaMonAn() %>" class="btn-title">Xóa</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                            </div>
		                        </div>
		                    
						<%} %>
					</div>
			</div>
        </div>
        <div class="footer">
            <div class="footer-top  grid wide">
                <div class="footer-top-part col-3">
                    <img src="./assetss/img/logo-footer.png" alt="" class="footer-logo">
                </div>
                <div class="footer-top-part col-3">
                    <p class="restaurant-introduce">GIỚI THIỆU</p>
                    <a href="" class="restaurant-introduce-link">Hệ thống nhà hàng</a>
                    <a href="" class="restaurant-introduce-link">Câu chuyện thương hiệu</a>
                    <a href="" class="restaurant-introduce-link">Ưu đãi thành viên</a>
                    <a href="" class="restaurant-introduce-link">Tin tức & sự kiện</a>
                    <a href="" class="restaurant-introduce-link">Tuyển dụng</a>
                    <p class="restaurant-introduce">VĂN PHÒNG ĐẠI DIỆN</p>
                    <p>Công ty Cổ phần Pizza Ngon 77 Trần Nhân Tôn, Phường 9, Quận 5, Thành phố Hồ Chí Minh

                        SĐT: +84 (028) 7308 3377

                        MST: 0104115527

                        Cấp lần đầu ngày 17 tháng 08 năm 2009 và có thể được sửa đổi vào từng thời điểm</p>
                </div>
                <div class="footer-top-part col-3">
                    <p class="restaurant-introduce">LIÊN HỆ</p>
                    <div class="restaurant-introduce-list">
                        <a href="" class="restaurant-introduce-link">Liên hệ</a>
                        <a href="" class="restaurant-introduce-link">Hướng dẫn mua hàng</a>
                        <a href="" class="restaurant-introduce-link">Chính sách giao hàng</a>
                        <a href="" class="restaurant-introduce-link">Chính sách bảo mật</a>
                        <a href="" class="restaurant-introduce-link">Điều khoản và Điều kiện</a>
                        <p class="restaurant-introduce">TỔNG ĐÀI HỖ TRỢ</p>
                        <a href="" class="restaurant-introduce-link">Đặt hàng: 1900 6066 (9:30 – 21:30)</a>
                        <a href="" class="restaurant-introduce-link">Tổng đài CSKH: 1900 633 606 (9:30 - 21:30)</a>
                    </div>

                </div>
                <div class="footer-top-part col-3">
                    <p class="restaurant-introduce">LIÊN KẾT VỚI CHÚNG TÔI</p>
                    <div class="restaurant-contact">
                        <div class="restaurant-social-media">
                            <a href="" class="restaurant-social-media-link">
                                <iconify-icon icon="ic:baseline-facebook" class="account-icon"></iconify-icon>
                                <iconify-icon icon="ri:instagram-fill" class="account-icon"></iconify-icon>
                                <iconify-icon icon="mdi:youtube" class="account-icon"></iconify-icon>
                            </a>
                        </div>

                    </div>
                    <img src="./assetss/img/certi.png" alt="" class="restaurant-certi">
                </div>

            </div>
            <div class="footer-bottom">
                Bản quyền © 2022 The Pizza Company. Đã đăng ký bản quyền.
            </div>

        </div>
    </div>
</body>

</html>