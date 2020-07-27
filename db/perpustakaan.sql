-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 27, 2020 at 01:22 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Dumping database structure for toko
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--
CREATE DATABASE IF NOT EXISTS `perpustakaan` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `perpustakaan`;
CREATE TABLE `buku` (
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `kategori` varchar(30) NOT NULL,
  `deskripsi` text NOT NULL,
  `stok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `kategori`, `deskripsi`, `stok`) VALUES
('B0001', ' SEI CERT C Coding Standard', 'Carneige Mellon University', 'Carneige Mellon University', 'Ilmu Sains dan Teknologi', 'Standar Coding menggunakan bahasa C', 3),
('B0002', 'SEI Seires in Software Engineering', 'Robert C. Secord', 'Pearson Education', 'Ilmu Kesehatan', 'Keamann Pemrogarman C', 10),
('B0003', 'Research Methodology', 'C.R. Kothari', 'New Age International', 'Ilmu Sains dan Teknologi', 'Metodologi penelitian', 17),
('B0004', 'Social Engineering', 'Christopher Hadnagy', 'John Willey & Sons', 'Ilmu Sosial dan Humaniora', 'rekayasa psikologis (social enginnering) melalui sudut pandang', 15);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `nama`, `password`, `salt`) VALUES
(1, 'arija', 'Muhammad Jalaludin Arija', '5bf87154fdba3b22f22aa484e9cc81464dd8cdfe5d9f2fdb302a68f3ab351b1f', '1aadc2bfb8514c6d91e2c62effa7fda3'),
(2, 'riama', 'Riama Kristallia', 'c097814392faa26a8548882b76a571ce665de053c445cb98ce4f465b5f601940', '74642888fcc5418eb11369b66cb1aabb'),
(3, 'nilam', 'Nilam Qolbi', '25ac027139fedd4f7ef153e93a798b139bde0dba8cd95d466d82191014e05677', '2dd4a04fc8ff470989ded0532454364c'),
(6, 'admin', 'Administrator', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` int(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `fakultas` varchar(30) NOT NULL,
  `jurusan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama`, `fakultas`, `jurusan`) VALUES
(1716101337, 'Muhammad Jalaluddin Arija', 'Kedokteran', 'Kedokteran'),
(1716101348, 'Nilam Qolbi', 'MIPA', 'Fisika'),
(1716101354, 'Riama Kristallia', 'Teknik', 'Teknik Sipil');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE `pinjaman` (
  `id_pinjam` varchar(30) NOT NULL,
  `npm` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `jumlah` int(30) NOT NULL,
  `tgl_pinjam` varchar(30) NOT NULL,
  `tgl_balik` varchar(30) NOT NULL,
  `denda` int(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pinjaman`
--

INSERT INTO `pinjaman` (`id_pinjam`, `npm`, `nama`, `id_buku`, `judul`, `jumlah`, `tgl_pinjam`, `tgl_balik`, `denda`, `status`) VALUES
('P0001', '1716101354', 'Riama Kristallia', 'B0001', ' SEI CERT C Coding Standard', 2, '22 July 2020', '25 July 2020', 0, 'Belum Kembali'),
('P0002', '1716101348', 'Nilam Qolbi', 'B0003', 'Research Methodology', 3, '23 July 2020', '26 July 2020', 0, 'Belum Kembali'),
('P0003', '1716101337', 'Muhammad Jalaluddin Arija', 'B0004', 'Social Engineering', 5, '23 July 2020', '26 July 2020', 0, 'Belum Kembali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`id_pinjam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
