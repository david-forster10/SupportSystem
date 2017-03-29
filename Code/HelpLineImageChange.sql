-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.19-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for helpline
DROP DATABASE IF EXISTS `helpline`;
CREATE DATABASE IF NOT EXISTS `helpline` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `helpline`;

-- Dumping structure for table helpline.customer reporting form
DROP TABLE IF EXISTS `customer reporting form`;
CREATE TABLE IF NOT EXISTS `customer reporting form` (
  `CustomerReportingFormID` int(11) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Postcode` varchar(8) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Date Reported` date NOT NULL,
  `Equipment Type` varchar(40) NOT NULL,
  `Nature of Problem` varchar(40) NOT NULL,
  `Severity` varchar(11) NOT NULL COMMENT ' (1=high, 2=medium, 3=low)',
  `Staff receiving equipment` int(11) NOT NULL,
  `Staff assigned to fix equipment` int(11) NOT NULL,
  `Date resolved` date NOT NULL,
  `Estimated cost of repair` decimal(10,0) NOT NULL,
  PRIMARY KEY (`CustomerReportingFormID`),
  UNIQUE KEY `Staff receiving equipment` (`Staff receiving equipment`),
  KEY `Staff assigned to fix equipment` (`Staff assigned to fix equipment`),
  CONSTRAINT `customer reporting form_ibfk_1` FOREIGN KEY (`Staff receiving equipment`) REFERENCES `staff information form` (`StaffID`),
  CONSTRAINT `customer reporting form_ibfk_2` FOREIGN KEY (`Staff assigned to fix equipment`) REFERENCES `staff information form` (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table helpline.customer reporting form: ~10 rows (approximately)
DELETE FROM `customer reporting form`;
/*!40000 ALTER TABLE `customer reporting form` DISABLE KEYS */;
INSERT INTO `customer reporting form` (`CustomerReportingFormID`, `FirstName`, `LastName`, `Address`, `Postcode`, `Telephone`, `Date Reported`, `Equipment Type`, `Nature of Problem`, `Severity`, `Staff receiving equipment`, `Staff assigned to fix equipment`, `Date resolved`, `Estimated cost of repair`) VALUES
	(1, 'David', 'Hayes', '92 Park Avenue', 'SY4 1AU', '07736270935', '2017-03-20', 'Computer', 'Graphics Card not working', '2', 3, 3, '2017-03-22', 30),
	(2, 'Delores', 'Benjamin', '78 Ivy Lane', 'L12 7GT', '07744738885', '2017-03-05', 'Printer', 'Printing Jam', '3', 10, 2, '2017-03-07', 15),
	(3, 'Deanna', 'Smith', '38 Newport Road', 'LE8 1PG', '079 1014 6346', '2017-03-20', 'Router', 'Cant connect to the internet', '2', 2, 1, '2017-03-21', 10),
	(4, 'Linda', 'Smith', '60 Hindhead Road', 'NN6 7AR', '07071335603', '2017-02-15', 'Switches', 'Switch Hub isn\'t responding', '1', 1, 4, '2017-02-27', 65),
	(5, 'Rashida', 'Meador', '8 Oxford Rd', 'W15 3AJ', '07063216686', '2017-01-09', 'Monitor', 'Monitor wont pick up signal ', '2', 4, 5, '2017-01-11', 43),
	(6, 'Luis', 'Thompson', '15 Grenoble Road', 'TA9 9EP', '07745880890', '2017-02-20', 'Computer', 'Unable to boot up ', '1', 5, 6, '2017-02-22', 38),
	(7, 'Christian', 'Montague', '71 Traill Street', 'BS6 1NW', '07980196988', '2017-03-07', 'Computers', 'USB Hub unresponsive', '1', 6, 7, '2017-03-09', 13),
	(8, 'Juan', 'Newton', '56 Worthy Lane', 'A62 2LY', '07931021612', '2017-03-24', 'Moniter', 'Dead Pixels', '1', 7, 8, '2017-03-28', 45),
	(9, 'Joseph', 'Sanders', '42 Peachfield Road', 'O44 1ZR', '07873550770', '2017-01-17', 'Printer', 'Not connecting to Computer', '1', 8, 9, '2017-01-19', 27),
	(10, 'Gloria', 'Priest', '67 Bishopgate Street', 'LA10 7SN', '07757143071', '2017-03-27', 'Router', 'Faulty Cable', '3', 9, 10, '2017-03-28', 5);
/*!40000 ALTER TABLE `customer reporting form` ENABLE KEYS */;

-- Dumping structure for table helpline.login
DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `StaffID` int(20) NOT NULL,
  `Password` varchar(150) NOT NULL,
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `login_ibfk_1` FOREIGN KEY (`StaffID`) REFERENCES `staff information form` (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table helpline.login: ~10 rows (approximately)
DELETE FROM `login`;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`StaffID`, `Password`) VALUES
	(1, '5dc1694048f13848fd2890966f3f0afaf5e0cd7adde7ffc25fc18f03e2c38eb7'),
	(2, '4d73a20736b483e6758db5e6d0997590e0f889c5bd420ddaea7c968023650c82'),
	(3, 'f6c5cbeb0229fcff7982ecb2fd6a9e571a55aa47d4aa52f682e542f57b69e21c'),
	(4, '472b6988d601652b3f2d97f1d9b09232adba67cad4dd5e0c2e81ad81aba2e21e'),
	(5, '9f15c73b1e77988dc4e0ff62c09202235be8bf5dc7b96e35559e428268bed2e2'),
	(6, '4bde92ca3a2496a876ac2886f6be98365e7a8ffcd51494fa3a4f8bdbd40890dd'),
	(7, '14647183c61f89e7dfb9055920102f3afbe312d1baee413705b87a6894dbfa7d'),
	(8, 'ab9b6da329450e25fe894e0473e2990233576ea46db9bf60825c795f4302c8ae'),
	(9, '78ccfc0e1a566e042362893b776c0e2bdab6dbed0ecc0460f2935b75ecdbcd09'),
	(10, '779533101cb74bc0dd55886a7c3513951bd99ea19f3fa7d069ef3366ac7b4d6e');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

-- Dumping structure for table helpline.product form
DROP TABLE IF EXISTS `product form`;
CREATE TABLE IF NOT EXISTS `product form` (
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
  `Work done` varchar(200) NOT NULL,
  PRIMARY KEY (`productFormID`),
  KEY `CustomerReportingFormID` (`CustomerReportingFormID`),
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `product form_ibfk_1` FOREIGN KEY (`CustomerReportingFormID`) REFERENCES `customer reporting form` (`CustomerReportingFormID`),
  CONSTRAINT `product form_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `staff information form` (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table helpline.product form: ~10 rows (approximately)
DELETE FROM `product form`;
/*!40000 ALTER TABLE `product form` DISABLE KEYS */;
INSERT INTO `product form` (`productFormID`, `CustomerReportingFormID`, `StaffID`, `Product Name`, `Manufacturer`, `Model Number`, `Serial Number`, `Date bought in for fixing`, `Nature of problem`, `Date fixed`, `Work done`) VALUES
	(1, 1, 3, 'Graphics Card', 'MSI', 11, 77, '2017-03-21', 'Ports on Hard not working', '2017-03-22', '-'),
	(2, 2, 2, 'Printer', 'Dell', 80, 70, '2017-03-06', 'Printer Jam', '2017-03-07', '-'),
	(3, 3, 1, 'Router', 'TP-Link', 16, 57, '2017-03-20', 'Connection to Internet', '2017-03-21', '-'),
	(4, 4, 4, 'Switch Hub', 'Netgear', 36, 1, '2017-02-17', 'Switch not Responding', '2017-03-27', '-'),
	(5, 5, 5, 'Monitor Cable', 'Dell', 60, 17, '2017-01-10', 'Not picking up signal', '2017-01-11', '-'),
	(6, 6, 6, 'Hard-Drive', 'Western Digital', 69, 53, '2017-02-20', 'Not Booting up', '2017-03-22', '-'),
	(7, 7, 7, 'USB Hub', 'ADVENT', 9, 33, '2017-03-07', 'Hub Unresponsive', '2017-03-09', '-'),
	(8, 8, 8, 'Monitor', 'Dell', 51, 63, '2017-03-24', 'Dead Pixels', '2017-03-28', '-'),
	(9, 9, 9, 'USB Cable', 'Dell', 67, 61, '2017-01-18', 'No connection to computer', '2017-01-19', '-'),
	(10, 10, 10, 'Router Cable', 'Netgear', 70, 13, '2017-03-28', 'Faulty Cable', '2017-03-28', '-');
/*!40000 ALTER TABLE `product form` ENABLE KEYS */;

-- Dumping structure for table helpline.staff information form
DROP TABLE IF EXISTS `staff information form`;
CREATE TABLE IF NOT EXISTS `staff information form` (
  `StaffID` int(11) NOT NULL,
  `FirstName` char(20) NOT NULL,
  `LastName` char(30) NOT NULL,
  `Address` char(40) NOT NULL,
  `PostCode` char(7) NOT NULL,
  `Email` char(30) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `PictureURL` varchar(150) NOT NULL,
  PRIMARY KEY (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table helpline.staff information form: ~10 rows (approximately)
DELETE FROM `staff information form`;
/*!40000 ALTER TABLE `staff information form` DISABLE KEYS */;
INSERT INTO `staff information form` (`StaffID`, `FirstName`, `LastName`, `Address`, `PostCode`, `Email`, `DateOfBirth`, `PictureURL`) VALUES
	(1, 'Mary', 'Porter', '97 Redcliffe Way', 'WF4 2LG', 'MaryPorter@gmail.com', '1989-10-12', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\1.png'),
	(2, 'Michelle', 'Hoggard', '34 Constitution St', 'L17 8PJ', 'MichelleLHoggard@gmail.com', '1970-04-14', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\2.png'),
	(3, 'Thomas', 'Davis', '86 Trinity Crescent', 'LN6 4JX', 'ThomasDavis@hotmail.com', '1948-06-26', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\3.png'),
	(4, 'Paul', 'Kellum', '39 Exning Road', 'SN4 3SY', 'PaulKellum@hotmail.com', '1976-10-14', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\4.png'),
	(5, 'Barbara', 'Baldwin', '39 Golf Road', 'N16 2HP', 'BarbaraBaldwin@hotmail.com', '1957-08-04', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\5.png'),
	(6, 'Kenneth', 'Terry', '89 Greyfriars Road', 'I12 5PT', 'KenTerry@gmail.com', '1965-04-02', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\6.png'),
	(7, 'William', 'Westover', '10 Haslemere Road', 'N17 6AN', 'WilliamWest@gmail.com', '1976-06-14', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\7.png'),
	(8, 'John', 'Wilson', '84 Sandyhill Rd', 'WR6 2SL', 'JohnWilson@hotmail.com', '1970-07-07', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\8.png'),
	(9, 'Wills', 'Jordan', '14 New Dover Rd', 'H43 4JA', 'WIllsJordan@gmail.com', '1976-08-14', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\9.png'),
	(10, 'Joanna', 'Hall', '5 Boroughbridge Road', 'NP6 9PS', 'JoannaHall@hotmail.com', '1970-02-13', 'C:\\Users\\Vanilla\\Documents\\GitHub\\SupportSystem\\Images\\StaffImages\\10.png');
/*!40000 ALTER TABLE `staff information form` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
