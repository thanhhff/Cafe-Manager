-- Hướng dẫn sử dụng cafe-manager.sql kết hợp với Project
-- 1. Tải Xampp tại trang chủ và cài đặt 
-- 2. Kích hoạt Xampp và bật Server SQL 
-- 3. Trong phpMyAdmin thêm CSDL mới 'cafe-manager' 
-- 4. Import file 'cafe-manager.sql' vào CSDL 'cafe-manager'

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `cafe-manager`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `table` (bàn)
--

CREATE TABLE `ban` (
  `MaBan` int(11) NOT NULL,
  `TenBan` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `TrangThai` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Thêm dữ liệu vào Table 
--

INSERT INTO `ban` (`MaBan`, `TenBan`, `TrangThai`) VALUES
(1, 'Bàn 1', 'Đã đặt trước'),
(2, 'Bàn 2', 'Đang phục vụ'),
(3, 'Bàn 3', 'Đang phục vụ'),
(4, 'Bàn 4', 'Đã đặt trước'),
(5, 'Bàn 5', 'Trống'),
(6, 'Bàn 6', 'Trống'),
(7, 'Bàn 7', 'Trống'),
(8, 'Bàn 8', 'Đang phục vụ'),
(9, 'Bàn 9', 'Trống'),
(10, 'Bàn 10', 'Đang phục vụ'),
(11, 'Bàn 11', 'Đã đặt trước'),
(12, 'Bàn 12', 'Trống'),
(13, 'Bàn 13', 'Đang phục vụ'),
(14, 'Bàn 14', 'Trống'),
(15, 'Bàn 15', 'Trống'),
(16, 'Bàn 16', 'Đang phục vụ'),
(17, 'Bàn 17', 'Trống'),
(18, 'Bàn 18', 'Trống'),
(19, 'Bàn 19', 'Đã đặt trước'),
(20, 'Bàn 20', 'Đang phục vụ'),
(21, 'Bàn 21', 'Trống'),
(22, 'Bàn 22', 'Đã đặt trước'),
(23, 'Bàn 23', 'Đang phục vụ');
-- (24, 'Bàn 24', 'Đã đặt trước'),
-- (25, 'Bàn 25', 'Trống');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethd`
--

CREATE TABLE `chitiethd` (
  `MaChiTietHD` int(11) NOT NULL,
  `MaHoaDon` int(11) NOT NULL,
  `MaMon` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `Gia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHoaDon` int(11) NOT NULL,
  `GiamGia` int(11) DEFAULT NULL,
  `MaBan` int(11) NOT NULL,
  `GioDen` datetime NOT NULL,
  `TongTien` int(11) DEFAULT NULL,
  `TrangThai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Cấu trúc bảng cho bảng `nhommon`
--

CREATE TABLE `nhommon` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `MauSac` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhommon`
--

INSERT INTO `nhommon` (`MaLoai`, `TenLoai`, `MauSac`) VALUES
(1, 'Món được yêu thích', '#ac3939'),
(2, 'Cà phê', '#66b3ff'),
(3, 'Thức uống đá xay', '#9900ff'),
(4, 'Trà trái cây', '#ffcc00'),
(5, 'Thức uống trái cây', '#40ff00'),
(6, 'Macchiato', '#e68a00'),
(7, 'Thức ăn nhẹ', '#009966'),
(8, 'Choco-Matcha', '#009999'),
(9, 'Cà phê gói', '#ff3333');


-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `id` int(11) NOT NULL,
  `username` varchar(30) COLLATE utf8_vietnamese_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_vietnamese_ci NOT NULL,
  `lv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`id`, `username`, `password`, `lv`) VALUES
(1, 'admin', 'admin', 1),
(2, 'thanh.nt', '123456', 1),
(3, 'nam.kd', '123456', 1),
(4, 'nguyet.hm', '123456', 1),
(5, 'cong.tn', '123456', 1),
(6, 'nhanvien_1', '123456', 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thucdon`
--

CREATE TABLE `thucdon` (
  `MaMon` int(11) NOT NULL,
  `TenMon` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `MaLoai` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `DVT` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thucdon`
--

INSERT INTO `thucdon` (`MaMon`, `TenMon`, `MaLoai`, `DonGia`, `DVT`) VALUES
(1, 'Cà phê sữa đá', 2, 29000, 'Ly'),
(2, 'Bạc xỉu', 2, 29000, 'Ly'),
(3, 'Caramel Macchiato đá', 2, 50000, 'Ly'),
(4, 'Cà phê đá xay - lạnh', 2, 59000, 'Ly'),
(5, 'Cold Brew cam sả', 2, 50000, 'Ly'),
(6, 'Latte đá', 2, 50000, 'Ly'),
(7, 'Trà cà phê đá xay - lạnh', 2, 59000, 'Ly'),
(8, 'Cold Brew sữa tươi Macchiato', 2, 50000, 'Ly'),
(9, 'Cold Brew truyền thống', 2, 45000, 'Ly'),
(10, 'Phúc bồn tử cam đá xay', 3, 59000, 'Ly'),
(11, 'Cà phê đá xay - lạnh', 3, 59000, 'Ly'),
(12, 'Cookie đá xay', 3, 59000, 'Ly'),
(13, 'Đào việt quất đá xay', 3, 59000, 'Ly'),
(14, 'Cam vàng canh đá xay', 3, 62000, 'Ly'),
(15, 'Chocolate đá xay', 3, 59000, 'Ly'),
(16, 'Matcha đá xay', 3, 59000, 'Ly'),
(17, 'Chanh sả đá xay', 3, 49000, 'Ly'),
(18, 'Trà phúc bồn tử', 4, 50000, 'Ly'),
(19, 'Trà đào cam sả - đá', 4, 45000, 'Ly'),
(20, 'Trà bưởi mật ong', 4, 50000, 'Ly'),
(21, 'Oolong hạt sen - nóng', 4, 52000, 'Ly'),
(22, 'Trà cam vàng', 4, 55000, 'Ly'),
(23, 'Trà bưởi mật ong', 4, 55000, 'Ly'),
(24, 'Sinh tố cam xoài', 5, 59000, 'Ly'),
(25, 'Sinh tố việt quất', 5, 59000, 'Ly'),
(26, 'Trà sữa mắc ca trân châu trắng', 6, 45000, 'Ly'),
(27, 'Trà đen Macchiato', 6, 42000, 'Ly'),
(28, 'Matcha Macchiato', 6, 45000, 'Ly'),
(29, 'Trà xoài Macchiato - đá', 6, 50000, 'Ly'),
(30, 'Trà lài Macchiato - lạnh', 6, 42000, 'Ly'),
(31, 'Trà Cherry Macchiato', 6, 50000, 'Ly'),
(32, 'Điều vàng rang muôi', 7, 20000, 'Gói'),
(33, 'Đậu phộng tỏi ớt', 7, 10000, 'Goi'),
(34, 'Mít sấy', 7, 20000, 'Gói'),
(35, 'Trà Matcha Latte nóng', 8, 59000, 'Ly'),
(36, 'Trà Matcha Latte đá', 8, 59000, 'Ly'),
(37, 'Socola đá', 8, 59000, 'Ly'),
(38, 'Cà phê phin TCH Traditional', 9, 60000, 'Gói'),
(39, 'Cà phê Arabica TCH', 9, 100000, 'Gói');


--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `ban`
--
ALTER TABLE `ban`
  ADD PRIMARY KEY (`MaBan`);

--
-- Chỉ mục cho bảng `chitiethd`
--
ALTER TABLE `chitiethd`
  ADD PRIMARY KEY (`MaChiTietHD`),
  ADD KEY `MaHoaDon` (`MaHoaDon`),
  ADD KEY `MaMon` (`MaMon`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHoaDon`),
  ADD KEY `MaBan` (`MaBan`);

--
-- Chỉ mục cho bảng `nhommon`
--
ALTER TABLE `nhommon`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `thucdon`
--
ALTER TABLE `thucdon`
  ADD PRIMARY KEY (`MaMon`),
  ADD KEY `MaLoai` (`MaLoai`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `ban`
--
ALTER TABLE `ban`
  MODIFY `MaBan` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT cho bảng `chitiethd`
--
ALTER TABLE `chitiethd`
  MODIFY `MaChiTietHD` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHoaDon` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT cho bảng `nhommon`
--
ALTER TABLE `nhommon`
  MODIFY `MaLoai` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT cho bảng `thucdon`
--
ALTER TABLE `thucdon`
  MODIFY `MaMon` int(11) NOT NULL AUTO_INCREMENT;
--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethd`
--
ALTER TABLE `chitiethd`
  ADD CONSTRAINT `chitiethd_ibfk_1` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoadon` (`MaHoaDon`),
  ADD CONSTRAINT `chitiethd_ibfk_2` FOREIGN KEY (`MaMon`) REFERENCES `thucdon` (`MaMon`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaBan`) REFERENCES `ban` (`MaBan`);

--
-- Các ràng buộc cho bảng `thucdon`
--
ALTER TABLE `thucdon`
  ADD CONSTRAINT `thucdon_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `nhommon` (`MaLoai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
