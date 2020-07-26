-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 26, 2020 at 01:34 PM
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
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

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
('B0001', 'Etika Kedokteran dan Hukum Keehatan Edisi 3', 'Prof. M. Jusuf Hanafiah, SpOG, Dr. Amri Amir, Spf', 'Buku Kedokteran ', 'Ilmu Kesehatan', '\n\n   Deskripsi', 60),
('B0002', 'Dasar-Dasar Matematika Ekonomi Edisi Keempta Jilid 1', 'Alpha C. Chiang, KEvin Wainwright', 'Erlangga', 'Ilmu Sains dan Teknologi', 'Dasar-dasar matematika ekonomi', 50);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `nama`, `password`, `salt`) VALUES
('arija', 'Muhammad Jalaludin Arija', '5bf87154fdba3b22f22aa484e9cc81464dd8cdfe5d9f2fdb302a68f3ab351b1f', '1aadc2bfb8514c6d91e2c62effa7fda3'),
('riama', 'Riama Kristallia', 'c097814392faa26a8548882b76a571ce665de053c445cb98ce4f465b5f601940', '74642888fcc5418eb11369b66cb1aabb'),
('nilam', 'Nilam Qolbi', '25ac027139fedd4f7ef153e93a798b139bde0dba8cd95d466d82191014e05677', '2dd4a04fc8ff470989ded0532454364c');

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
  `judul` varchar(30) NOT NULL,
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
('P0001', '065116299', 'Bayu Junis Pribadi', 'B0003', 'Depok', 24, '06 February 2018', '08 February 2018', 0, 'Sudah Kembali'),
('P0002', '1716101348', 'Nilam', 'B0002', 'rahasia ketamvanan uyab', 1, '21 July 2020', '28 July 2020', 0, 'Sudah Kembali'),
('P0003', '1716101348', 'Nilam', 'B0001', 'Ketamvanan Bayu', 1, '21 July 2020', '22 July 2020', 5000, 'Sudah Kembali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
