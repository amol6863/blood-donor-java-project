-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2018 at 12:46 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `signup_table`
--

-- --------------------------------------------------------

--
-- Table structure for table `donardb`
--

CREATE TABLE `donardb` (
  `DonarID` int(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `BloodGroup` varchar(10) NOT NULL,
  `DOB` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donardb`
--

INSERT INTO `donardb` (`DonarID`, `Name`, `Address`, `Gender`, `Phone`, `BloodGroup`, `DOB`) VALUES
(5, 'Amol Bhulugade', 'talmavale\n  415103', 'Male', '9673414145', 'AB+', '1990-09-04'),
(6, 'Bhakti Bhulugade', 'karad\n  415110', 'Female', '9146801807', 'O+', '2014-09-19'),
(8, 'Rudra', 'karad', 'Male', '9421176034', 'A+', '2016-03-03'),
(10, 'sandy', 'mumbai', 'Male', '1111111111', 'AB-', '2015-01-13');

-- --------------------------------------------------------

--
-- Table structure for table `signupdb`
--

CREATE TABLE `signupdb` (
  `Name` varchar(20) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signupdb`
--

INSERT INTO `signupdb` (`Name`, `Username`, `Email`, `Phone`, `Password`) VALUES
('amol', 'amol6863', 'a4amol6863@gmail.com', '9673414145', '12345'),
('bhakti', 'bhakti111', 'bhakti111@gmail.com', '9673698676', '123'),
('rudra', 'rudra', 'rudra@gmail.com', '9421176034', '111'),
('zareen', 'zareen111', 'zareen@gmail.com', '9673414145', '321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donardb`
--
ALTER TABLE `donardb`
  ADD PRIMARY KEY (`DonarID`);

--
-- Indexes for table `signupdb`
--
ALTER TABLE `signupdb`
  ADD PRIMARY KEY (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donardb`
--
ALTER TABLE `donardb`
  MODIFY `DonarID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
