-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 27, 2017 at 11:16 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HelpLine`
--

-- --------------------------------------------------------

--
-- Table structure for table `Customer Reporting Form`
--

CREATE TABLE `Customer Reporting Form` (
  `CustomerReportingFromID` int(11) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Postcode` varchar(8) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Date Reported` date NOT NULL,
  `Equipment Type` varchar(40) NOT NULL,
  `Nature of Problem` varchar(40) NOT NULL,
  `Severity (1=high, 2=medium, 3=low)` varchar(11) NOT NULL,
  `Staff receiving equipment` varchar(11) NOT NULL,
  `Staff assigned to fix equipment` varchar(11) NOT NULL,
  `Date resolved` date NOT NULL,
  `Estimated cost of repair` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Product Form`
--

CREATE TABLE `Product Form` (
  `productFormID` int(11) NOT NULL,
  `CustomerReportingFormID` int(11) NOT NULL,
  `StaffID` int(11) NOT NULL,
  `Product Name` varchar(30) NOT NULL,
  `Manufacturer` varchar(40) NOT NULL,
  `Model Number` decimal(10,0) NOT NULL,
  `Serial Number` decimal(10,0) NOT NULL,
  `Date bought in for fixing` date NOT NULL,
  `Nature of problem` varchar(30) NOT NULL,
  `Date fixed` date NOT NULL,
  `Work done` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Staff Information Form`
--

CREATE TABLE `Staff Information Form` (
  `StaffID` int(11) NOT NULL,
  `FirstName` char(20) NOT NULL,
  `LastName` char(30) NOT NULL,
  `Address` char(40) NOT NULL,
  `PostCode` char(7) NOT NULL,
  `Email` char(30) NOT NULL,
  `DateOfBirth` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
