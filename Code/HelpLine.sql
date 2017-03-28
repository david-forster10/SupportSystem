-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 28, 2017 at 11:20 AM
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
  `Staff receiving equipment` int(11) NOT NULL,
  `Staff assigned to fix equipment` int(11) NOT NULL,
  `Date resolved` date NOT NULL,
  `Estimated cost of repair` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Customer Reporting Form`
--

INSERT INTO `Customer Reporting Form` (`CustomerReportingFromID`, `FirstName`, `LastName`, `Address`, `Postcode`, `Telephone`, `Date Reported`, `Equipment Type`, `Nature of Problem`, `Severity (1=high, 2=medium, 3=low)`, `Staff receiving equipment`, `Staff assigned to fix equipment`, `Date resolved`, `Estimated cost of repair`) VALUES
(1, 'David', 'Hayes', '92 Park Avenue', 'SY4 1AU', '07736270935', '2017-03-20', 'Computer', 'Graphics Card not working', '2', 3, 3, '2017-03-22', '30'),
(2, 'Delores', 'Benjamin', '78 Ivy Lane', 'L12 7GT', '07744738885', '2017-03-05', 'Printer', 'Printing Jam', '3', 10, 2, '2017-03-07', '15'),
(3, 'Deanna', 'Smith', '38 Newport Road', 'LE8 1PG', '079 1014 6346', '2017-03-20', 'Router', 'Cant connect to the internet', '2', 2, 1, '2017-03-21', '10'),
(4, 'Linda', 'Smith', '60 Hindhead Road', 'NN6 7AR', '07071335603', '2017-02-15', 'Switches', 'Switch Hub isn\'t responding', '1', 1, 4, '2017-02-27', '65'),
(5, 'Rashida', 'Meador', '8 Oxford Rd', 'W15 3AJ', '07063216686', '2017-01-09', 'Monitor', 'Monitor wont pick up signal ', '2', 4, 5, '2017-01-11', '43'),
(6, 'Luis', 'Thompson', '15 Grenoble Road', 'TA9 9EP', '07745880890', '2017-02-20', 'Computer', 'Unable to boot up ', '1', 5, 6, '2017-02-22', '38'),
(7, 'Christian', 'Montague', '71 Traill Street', 'BS6 1NW', '07980196988', '2017-03-07', 'Computers', 'USB Hub unresponsive', '1', 6, 7, '2017-03-09', '13'),
(8, 'Juan', 'Newton', '56 Worthy Lane', 'A62 2LY', '07931021612', '2017-03-24', 'Moniter', 'Dead Pixels', '1', 7, 8, '2017-03-28', '45'),
(9, 'Joseph', 'Sanders', '42 Peachfield Road', 'O44 1ZR', '07873550770', '2017-01-17', 'Printer', 'Not connecting to Computer', '1', 8, 9, '2017-01-19', '27'),
(10, 'Gloria', 'Priest', '67 Bishopgate Street', 'LA10 7SN', '07757143071', '2017-03-27', 'Router', 'Faulty Cable', '3', 9, 10, '2017-03-28', '5');

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `StaffID` int(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`StaffID`, `Password`) VALUES
(1, 'ui6quahB9'),
(2, 'eithu5Jia9o'),
(3, 'fujaeNg2'),
(4, 'yohwai7Phoh'),
(5, 'oV3jee2Jein'),
(6, 'ohToh6shee'),
(7, 'ahdeiZ7dei'),
(8, 'zou8eig6Jai'),
(9, 'riNg8ieCh0ogh'),
(10, 'Ais2aeye');

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
  `Nature of problem` varchar(200) NOT NULL,
  `Date fixed` date NOT NULL,
  `Work done` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Product Form`
--

INSERT INTO `Product Form` (`productFormID`, `CustomerReportingFormID`, `StaffID`, `Product Name`, `Manufacturer`, `Model Number`, `Serial Number`, `Date bought in for fixing`, `Nature of problem`, `Date fixed`, `Work done`) VALUES
(1, 1, 3, 'Graphics Card', 'MSI', '11', '77', '2017-03-21', 'Ports on Hard not working', '2017-03-22', '-'),
(2, 2, 2, 'Printer', 'Dell', '80', '70', '2017-03-06', 'Printer Jam', '2017-03-07', '-'),
(3, 3, 1, 'Router', 'TP-Link', '16', '57', '2017-03-20', 'Connection to Internet', '2017-03-21', '-'),
(4, 4, 4, 'Switch Hub', 'Netgear', '36', '1', '2017-02-17', 'Switch not Responding', '2017-03-27', '-'),
(5, 5, 5, 'Monitor Cable', 'Dell', '60', '17', '2017-01-10', 'Not picking up signal', '2017-01-11', '-'),
(6, 6, 6, 'Hard-Drive', 'Western Digital', '69', '53', '2017-02-20', 'Not Booting up', '2017-03-22', '-'),
(7, 7, 7, 'USB Hub', 'ADVENT', '9', '33', '2017-03-07', 'Hub Unresponsive', '2017-03-09', '-'),
(8, 8, 8, 'Monitor', 'Dell', '51', '63', '2017-03-24', 'Dead Pixels', '2017-03-28', '-'),
(9, 9, 9, 'USB Cable', 'Dell', '67', '61', '2017-01-18', 'No connection to computer', '2017-01-19', '-'),
(10, 10, 10, 'Router Cable', 'Netgear', '70', '13', '2017-03-28', 'Faulty Cable', '2017-03-28', '-');

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

--
-- Dumping data for table `Staff Information Form`
--

INSERT INTO `Staff Information Form` (`StaffID`, `FirstName`, `LastName`, `Address`, `PostCode`, `Email`, `DateOfBirth`) VALUES
(1, 'Mary', 'Porter', '97 Redcliffe Way', 'WF4 2LG', 'MaryPorter@gmail.com', '1989-10-12'),
(2, 'Michelle', 'Hoggard', '34 Constitution St', 'L17 8PJ', 'MichelleLHoggard@gmail.com', '1970-04-14'),
(3, 'Thomas', 'Davis', '86 Trinity Crescent', 'LN6 4JX', 'ThomasDavis@hotmail.com', '1948-06-26'),
(4, 'Paul', 'Kellum', '39 Exning Road', 'SN4 3SY', 'PaulKellum@hotmail.com', '1976-10-14'),
(5, 'Barbara', 'Baldwin', '39 Golf Road', 'N16 2HP', 'BarbaraBaldwin@hotmail.com', '1957-08-04'),
(6, 'Kenneth', 'Terry', '89 Greyfriars Road', 'I12 5PT', 'KenTerry@gmail.com', '1965-04-02'),
(7, 'William', 'Westover', '10 Haslemere Road', 'N17 6AN', 'WilliamWest@gmail.com', '1976-06-14'),
(8, 'John', 'Wilson', '84 Sandyhill Rd', 'WR6 2SL', 'JohnWilson@hotmail.com', '1970-07-07'),
(9, 'Wills', 'Jordan', '14 New Dover Rd', 'H43 4JA', 'WIllsJordan@gmail.com', '1976-08-14'),
(10, 'Joanna', 'Hall', '5 Boroughbridge Road', 'NP6 9PS', 'JoannaHall@hotmail.com', '1970-02-13');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Customer Reporting Form`
--
ALTER TABLE `Customer Reporting Form`
  ADD PRIMARY KEY (`CustomerReportingFromID`),
  ADD UNIQUE KEY `Staff receiving equipment` (`Staff receiving equipment`),
  ADD KEY `Staff assigned to fix equipment` (`Staff assigned to fix equipment`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD KEY `StaffID` (`StaffID`);

--
-- Indexes for table `Product Form`
--
ALTER TABLE `Product Form`
  ADD PRIMARY KEY (`productFormID`),
  ADD KEY `CustomerReportingFormID` (`CustomerReportingFormID`),
  ADD KEY `StaffID` (`StaffID`);

--
-- Indexes for table `Staff Information Form`
--
ALTER TABLE `Staff Information Form`
  ADD PRIMARY KEY (`StaffID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Customer Reporting Form`
--
ALTER TABLE `Customer Reporting Form`
  ADD CONSTRAINT `customer reporting form_ibfk_1` FOREIGN KEY (`Staff receiving equipment`) REFERENCES `Staff Information Form` (`StaffID`),
  ADD CONSTRAINT `customer reporting form_ibfk_2` FOREIGN KEY (`Staff assigned to fix equipment`) REFERENCES `Staff Information Form` (`StaffID`);

--
-- Constraints for table `Login`
--
ALTER TABLE `Login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`StaffID`) REFERENCES `Staff Information Form` (`StaffID`);

--
-- Constraints for table `Product Form`
--
ALTER TABLE `Product Form`
  ADD CONSTRAINT `product form_ibfk_1` FOREIGN KEY (`CustomerReportingFormID`) REFERENCES `Customer Reporting Form` (`CustomerReportingFromID`),
  ADD CONSTRAINT `product form_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `Staff Information Form` (`StaffID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
