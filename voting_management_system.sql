-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2023 at 10:24 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voting management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `parties`
--

CREATE TABLE `parties` (
  `Party_name` varchar(20) NOT NULL,
  `Party_designation` varchar(20) NOT NULL,
  `Cnic` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parties`
--

INSERT INTO `parties` (`Party_name`, `Party_designation`, `Cnic`) VALUES
('PartyA', 'karachi', '423823022'),
('PartyC', 'Lahore', '432203398'),
('PartyB', 'Islamabad', '439842022');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Cnic` varchar(13) NOT NULL,
  `Password` varchar(8) NOT NULL,
  `Name` varchar(12) NOT NULL,
  `Dob` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Cnic`, `Password`, `Name`, `Dob`) VALUES
('1223', 'ah12', 'suheer', '2000-8-16'),
('42301', '1234', 'Adeel', 'null'),
('423239023', '2332w', 'Basit', '2023-05-09'),
('423423424', '1234a', 'Touseef', '2003-03-23'),
('432323113', '5678b', 'Alqama', '2002-08-27');

-- --------------------------------------------------------

--
-- Table structure for table `signin`
--

CREATE TABLE `signin` (
  `cnic` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signin`
--

INSERT INTO `signin` (`cnic`, `Password`) VALUES
('123', '12344'),
('42343430', 'aw32'),
('424032821', 'ab1234');

-- --------------------------------------------------------

--
-- Table structure for table `voter`
--

CREATE TABLE `voter` (
  `Name` varchar(20) NOT NULL,
  `Cnic` varchar(13) NOT NULL,
  `Qualification` varchar(20) NOT NULL,
  `state_number` varchar(20) NOT NULL,
  `organization` varchar(20) NOT NULL,
  `post` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voter`
--

INSERT INTO `voter` (`Name`, `Cnic`, `Qualification`, `state_number`, `organization`, `post`) VALUES
('Ahmed', '123', 'MS', '74000', 'MAJU', 'Senior Lecturer'),
('Mirza', '21323', 'Matric', 'm3443', 'C', 'manager'),
('Tahir', '21332233', 'inter', '2390', 'A', 'chairman'),
('Adeel Shaikh', '4202302', 'Bs', '12434', 'Maju', 'student'),
('Irtiza', '432323232', 'inter', '9430', 'B', 'Head'),
('baqir', 'null', 'Bs', 'null', 'null', 'null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `parties`
--
ALTER TABLE `parties`
  ADD PRIMARY KEY (`Cnic`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`Cnic`);

--
-- Indexes for table `signin`
--
ALTER TABLE `signin`
  ADD PRIMARY KEY (`cnic`);

--
-- Indexes for table `voter`
--
ALTER TABLE `voter`
  ADD PRIMARY KEY (`Cnic`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
