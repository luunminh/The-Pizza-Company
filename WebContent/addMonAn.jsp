<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="./assetss/css/Login.css">
    <link rel="stylesheet" href="./assetss/css/addProduct.css">

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
                                <a href="testAdminServlet" class="account-login">Đăng nhập</a>
                                <span>/</span>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="header-navbar">
                    <div class="header-navbar-menu-type">
                        <a href="" class="header-navbar-menu">Pizza</a>
                        <a href="" class="header-navbar-menu">Mỳ ý</a>
                        <a href="" class="header-navbar-menu">Salad</a>
                        <a href="" class="header-navbar-menu">Liên hệ</a>
                    </div>
                    <div class="header-navbar-function">
                        <div class="header-navbar-search">
                            <iconify-icon icon="material-symbols:search-rounded"
                                class="account-icon icon-primary-color"></iconify-icon>
                            <input type="text" placeholder="Tìm kiếm sản phẩm" class="header-navbar-search-input ">
                        </div>
                        <div class="header-navbar-cart">
                            <iconify-icon icon="material-symbols:shopping-cart-outline"
                                class="account-icon icon-primary-color">
                            </iconify-icon>
                            <input type="text" placeholder="Giỏ hàng" class="header-navbar-search-input"
                                style="width: 80px; cursor: pointer;" readonly>
                            <a href="#" style="width:100%"></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- <div class="slider-main">
                <section id="slider">
                    <input type="radio" name="slider" id="s1">
                    <input type="radio" name="slider" id="s2" checked>
                    <input type="radio" name="slider" id="s3">
                    <label id="slide1" for="s1">
                        <img src="./assetss/img/banner2.jpeg" alt="" height="100%" width="100%" class="img-banner">
                    </label>
                    <label id="slide2" for="s2">
                        <img src="./assetss/img/banner1.jpeg" alt="" height="100%" width="100%" class="img-banner">
                    </label>
                    <label id="slide3" for="s3">
                        <img src="./assetss/img/banner2.jpeg" alt="" height="100%" width="100%" class="img-banner">
                    </label>
                </section>
            </div> -->
            <div class="content">
                <div class="form-container">
                    <h2 class="form-title">
                        Thêm món ăn
                    </h2>

                    <form action="AddServletMonAn" method="post" class="form-login" >
                        <div class="form-input-group">
                            <div class="form-label">Mã món ăn</div>
                            <input type="text" placeholder="Nhập mã món ăn tại đây" name="maMonAn" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Tên món ăn</div>
                            <input type="text" placeholder="Nhập tên món ăn tại đây" name="tenMonAn" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Thể loại món ăn</div>
                            <Select class="userCbb" name="theloaiMonAn">
                                <option value="pizza">Pizza</option>
                                <option value="pasta">Mỳ ý</option>
                                <option value="salad">Salad</option>
                            </Select>
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Giá món ăn</div>
                            <input type="text" placeholder="Hình ảnh món ăn" name="giaMonAn" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Mô tả</div>
                            <input type="text" placeholder="Mô tả của món ăn" name="motaMonAn" class="form-input"
                                rows="3">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Link hình ảnh món ăn</div>
                            <input type="text" placeholder="Hình ảnh món ăn" name="hinhanhMonAn" class="form-input">
                        </div>
                        <button class="btn-login" type="submit">Thêm</button>
                    </form>
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
</body>

</html>