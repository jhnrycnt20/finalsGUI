-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2024 at 05:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydata`
--

-- --------------------------------------------------------

--
-- Table structure for table `datanew`
--

CREATE TABLE `datanew` (
  `id` int(20) NOT NULL,
  `f_name` varchar(50) NOT NULL,
  `l_name` varchar(50) NOT NULL,
  `middle_initial` varchar(50) NOT NULL,
  `contact_number` varchar(50) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `account_type` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datanew`
--

INSERT INTO `datanew` (`id`, `f_name`, `l_name`, `middle_initial`, `contact_number`, `Gender`, `email`, `address`, `username`, `password`, `account_type`, `status`) VALUES
(22, 'qwerty', 'qwer', 'qwerts', '09123456789', 'Male', 'qwerty@gmail.com', 'tangke', 'johnnny', '7c222fb2927d828af22f592134e8932480637c0d', 'Admin', 'Active'),
(23, 'josh', 'mojica', 'weaks', '12345678900', 'Male', 'john@gmail.com', 'tangke', 'john', 'b50c1150924c36092855c74b44e9967e12640420', 'Admin', 'Active'),
(25, 'john', 'rey', 'cant', '09505584607', 'Male ', 'cant@gmail.com', 'tangke', 'johnrey', 'aff633d16d0d830a78df6240fdc7b4270fa6effd', 'Frontdesk', 'Active'),
(26, 'tanjiro', 'kamado', 'demonslayer', '09505584607', 'Male ', 'tanjiro@gmail.com', 'wano', 'tanjiro', 'ef500910d1033613950ee11a6e69085fb929b2b0', 'Admin', 'Active'),
(27, 'king 2', 'OMPAD', 'lupad', '12345678901', 'Male', 'king2@gmail.com', 'minglaward2', 'king2', '8488b86ba8665f5c41a522cedb8df1aea26ea695', 'Admin', 'Active'),
(28, 'king3', 'ompad3', 'lupad3', '12345678909', 'Female', 'king3@gmail.com', 'ward3', 'king3', '8488b86ba8665f5c41a522cedb8df1aea26ea695', 'Admin', 'Active'),
(29, 'king4', 'OMPAD4', 'lupad4', '09876543211', 'Male ', 'king4@gmail.com', 'ward4', 'king4', '8488b86ba8665f5c41a522cedb8df1aea26ea695', 'Admin', 'Active'),
(30, 'king5', 'ompad5', 'lupad5', '00998877665', 'Male ', 'king5', 'ward6', 'king5', '8488b86ba8665f5c41a522cedb8df1aea26ea695', 'Frontdesk', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datanew`
--
ALTER TABLE `datanew`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datanew`
--
ALTER TABLE `datanew`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
