-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 10 Oca 2021, 20:07:17
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otomasyon3`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `admin_name` varchar(50) NOT NULL,
  `admin_pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`admin_name`, `admin_pass`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personalgiris`
--

CREATE TABLE `personalgiris` (
  `sno` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `personalgiris`
--

INSERT INTO `personalgiris` (`sno`, `username`, `password`) VALUES
(9, 'deneme', '123');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `id` int(11) NOT NULL,
  `kadi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `sifre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `adi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `soyadi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `cinsiyet` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `pozisyon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `egitim_durumu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `bolum` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `b_tarihi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `turekle`
--

CREATE TABLE `turekle` (
  `sno` int(11) NOT NULL,
  `Tisim` varchar(50) NOT NULL,
  `Tkont` varchar(50) NOT NULL,
  `Tfiyat` varchar(50) NOT NULL,
  `b_tarihi` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `turekle`
--

INSERT INTO `turekle` (`sno`, `Tisim`, `Tkont`, `Tfiyat`, `b_tarihi`) VALUES
(1, 'İstanbul', '50', '150TL', '15/05/2021');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyegiris`
--

CREATE TABLE `uyegiris` (
  `sno` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tur` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `uyegiris`
--

INSERT INTO `uyegiris` (`sno`, `username`, `password`, `tur`) VALUES
(25, 'yusuf', '123', 'haktan');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE `uyeler` (
  `id` int(11) NOT NULL,
  `adi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `soyadi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `dtarihi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tc` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tel` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `cinsiyet` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `boy` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `kilo` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `yas` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `kayit_tarihi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `programi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `personalgiris`
--
ALTER TABLE `personalgiris`
  ADD PRIMARY KEY (`sno`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `turekle`
--
ALTER TABLE `turekle`
  ADD PRIMARY KEY (`sno`);

--
-- Tablo için indeksler `uyegiris`
--
ALTER TABLE `uyegiris`
  ADD PRIMARY KEY (`sno`);

--
-- Tablo için indeksler `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `personalgiris`
--
ALTER TABLE `personalgiris`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `turekle`
--
ALTER TABLE `turekle`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `uyegiris`
--
ALTER TABLE `uyegiris`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Tablo için AUTO_INCREMENT değeri `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
