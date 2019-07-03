-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2019 at 05:38 AM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nusantara`
--

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `id_supplier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `nama`, `kategori`, `harga`, `stok`, `id_supplier`) VALUES
(2, 'Estazolam', 'Tablet', 15000, 48, 4),
(3, 'Fentanyl', 'Ampul', 78500, 31, 5),
(4, 'Acetylcysteine', 'Tablet', 12000, 58, 6),
(5, 'Acnol Feldin', 'Botol', 27000, 16, 1),
(6, 'Actapin Amoldipine', 'Kapsul', 33000, 36, 4),
(7, 'Actonel', 'Tablet', 56000, 22, 2),
(8, 'Actosmet', 'Strip', 16000, 42, 3);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telpon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama`, `alamat`, `telpon`) VALUES
(1, 'Apotik Delima', 'Jl. Delima III No.24 Bogor', '085123235887'),
(2, 'Apotik Sejahtera', 'Jl. Sultan No.15 Bekasi', '089755237575'),
(3, 'Apotik Herina', 'Jl. Abdul Ghani No.31 Semarang', '082210107883'),
(4, 'Apotik Bersama', 'Jl. Opera No.57 Depok', '085612017856'),
(5, 'Apotik Herbalindo', 'Ruko Grand Ruby No.147 Jakarta', '087823315004'),
(6, 'Apotik Jasaraya', 'Jl. Diponegoro No.41 Surabaya', '081247726363');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `id_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id_supplier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
