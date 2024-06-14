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
-- Table structure for table `applicantstab`
--

CREATE TABLE `applicantstab` (
  `id` int(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `middle_initial` varchar(20) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `email_address` varchar(20) NOT NULL,
  `adress` varchar(20) NOT NULL,
  `mother_name` varchar(20) NOT NULL,
  `father_name` varchar(20) NOT NULL,
  `year_course` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `scholarship_type` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `applicantstab`
--

INSERT INTO `applicantstab` (`id`, `fname`, `lname`, `middle_initial`, `contact_number`, `email_address`, `adress`, `mother_name`, `father_name`, `year_course`, `gender`, `scholarship_type`, `status`) VALUES
(7, 'shena', 'omambac', 'alferez', '09505584607', 'shaira@gmail.com', 'sanfernando', 'shaina', 'rayan', 'bsit-4C', 'Female', 'Smart', 'Approved'),
(9, 'shane', 'alferez', 'eseguera', '09458509903', 'shane@gmail.com', 'carcar', 'marry', 'arnold', 'bshm', 'Female', 'Ched', 'Approved'),
(11, 'tets', 'trs', 'tss', '0912345678', 'hh@gmail.com', 'naga', 'ivy', 'wena', 'bsit-2a', 'Female', 'Unifast', 'Approved'),
(12, 'linda', 'morel', 'lindasd', '12345678900', 'linda@gmail.com', 'tangke', 'dianna', 'lucas', 'bsit-6y', 'Female', 'Smart', 'Pending'),
(13, 'mikha', 'lim', 'dfgdf', '11111111111', 'asfdaf@gmail.com', 'tangke', 'emma', 'loid', 'bsit-6y', 'Male', 'Ched', 'Approved'),
(16, 'daniel', 'padilla', 'gomez', '09123456789', 'daniel@gmail.com', 'tangke', 'ella', 'janjan', 'EDUC-1a', 'Female', 'Ched', 'Decline'),
(18, 'nezuko', 'kamado', 'kabado', '09123456789', 'nezuko@gmail.com', 'shibuya', 'nazuko', 'napasok', '4-FA', 'Female', 'Smart', 'Pending'),
(19, 'lica', 'manuban', 'baban', '09987654321', 'Southkorea@gmail.com', 'korea', 'liza', 'junkook', '3-FA', 'Female', 'Ched', 'Pending'),
(20, 'jean', 'jeanny', 'lim', '09123456789', 'jean@gmail.com', 'america', 'aira', 'john', 'FA-2', 'Female', 'Ched', 'Approved'),
(21, 'king', 'ompad', 'bini', '09123456788', 'king@gmail.com', 'minglanilla', 'kingjr', 'queen', 'BSIT-3', 'Male', 'Ched', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applicantstab`
--
ALTER TABLE `applicantstab`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `applicantstab`
--
ALTER TABLE `applicantstab`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
