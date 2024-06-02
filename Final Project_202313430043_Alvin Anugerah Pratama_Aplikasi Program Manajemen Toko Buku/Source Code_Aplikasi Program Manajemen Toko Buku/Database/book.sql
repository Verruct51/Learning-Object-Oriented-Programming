-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Des 2023 pada 14.33
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `book`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `pertanyaan` varchar(100) NOT NULL,
  `jawaban` varchar(100) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `pertanyaan`, `jawaban`, `date`) VALUES
(4, 'admin', '12345', 'Apa Warna Favorit Mu?', 'hijau', '2023-12-24');

-- --------------------------------------------------------

--
-- Struktur dari tabel `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `book_id` int(100) NOT NULL,
  `title` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `pub_date` date DEFAULT NULL,
  `price` int(11) NOT NULL,
  `image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `book`
--

INSERT INTO `book` (`id`, `book_id`, `title`, `author`, `genre`, `pub_date`, `price`, `image`) VALUES
(17, 1, 'Upin Dan Ipin', 'Marzuki', 'Anak', '2023-07-10', 75000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\2.jpeg'),
(18, 2, 'Dongeng Tidur', 'Atep', 'Anak', '2023-01-09', 175000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\1.jpeg'),
(19, 3, 'Play With me', 'George', 'Anak', '2020-12-10', 80000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\3.jpeg'),
(20, 4, 'Cerita Bijak', 'Suci', 'Anak', '2019-12-19', 150000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\4.jpeg'),
(21, 5, 'Membaca Alquran', 'Qadri', 'Anak', '2020-12-09', 99000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\5.jpeg'),
(22, 6, 'Hadits Nabi SAW', 'Taimiyah', 'Agama', '2021-12-07', 215000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\6.jpeg'),
(23, 7, 'Kitab Shalat ', 'Jaelani', 'Agama', '2021-01-06', 60000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\7.jpeg'),
(24, 8, 'PAI', 'Sultan', 'Agama', '2023-07-12', 48000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\8.jpeg'),
(25, 9, 'Lentera Hati', 'Abdul', 'Agama', '2018-12-14', 168000, 'C:\\\\Users\\\\Lenovo\\\\Downloads\\\\9.jpeg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `customer_id` int(100) NOT NULL,
  `book_id` int(100) NOT NULL,
  `title` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `price` int(11) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`id`, `customer_id`, `book_id`, `title`, `author`, `genre`, `quantity`, `price`, `date`) VALUES
(11, 1, 1, 'Upin Dan Ipin', 'Marzuki', 'Anak', 2, 150000, '2023-12-24'),
(12, 2, 1, 'Upin Dan Ipin', 'Marzuki', 'Anak', 4, 300000, '2023-12-24'),
(13, 2, 7, 'Kitab Shalat ', 'Jaelani', 'Agama', 2, 120000, '2023-12-24'),
(14, 2, 4, 'Cerita Bijak', 'Suci', 'Anak', 5, 750000, '2023-12-24');

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer_info`
--

CREATE TABLE `customer_info` (
  `id` int(11) NOT NULL,
  `customer_id` int(100) NOT NULL,
  `total` int(11) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `customer_info`
--

INSERT INTO `customer_info` (`id`, `customer_id`, `total`, `date`) VALUES
(11, 1, 150000, '2023-12-24'),
(12, 2, 1170000, '2023-12-24');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `customer_info`
--
ALTER TABLE `customer_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT untuk tabel `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT untuk tabel `customer_info`
--
ALTER TABLE `customer_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
