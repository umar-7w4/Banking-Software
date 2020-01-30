-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 23, 2017 at 04:29 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bankdb`
--
CREATE DATABASE IF NOT EXISTS `bankdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bankdb`;

-- --------------------------------------------------------

--
-- Table structure for table `fixedaccount`
--

CREATE TABLE IF NOT EXISTS `fixedaccount` (
  `AccountNo` int(11) NOT NULL,
  `Name` varchar(70) NOT NULL,
  `Address` varchar(70) NOT NULL,
  `Phoneno` varchar(70) NOT NULL,
  `Savingaccount` varchar(70) NOT NULL,
  `Openingdate` varchar(70) NOT NULL,
  `Amount` varchar(70) NOT NULL,
  `Period` varchar(70) NOT NULL,
  `Interestrate` varchar(70) NOT NULL,
  `Maturityamount` varchar(70) NOT NULL,
  `Maturitydate` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fixedaccount`
--

INSERT INTO `fixedaccount` (`AccountNo`, `Name`, `Address`, `Phoneno`, `Savingaccount`, `Openingdate`, `Amount`, `Period`, `Interestrate`, `Maturityamount`, `Maturitydate`) VALUES
(0, '0', '0', '0', '0', 'test', 'test', 'test', 'test', 'test', 'test'),
(1, 'ajay', 'kkk', 'kkk', '1', '22/7/2017', '9000', '2', '9', '10620', '22/7/2019');

-- --------------------------------------------------------

--
-- Table structure for table `savingaccount`
--

CREATE TABLE IF NOT EXISTS `savingaccount` (
  `AccountNo` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `PhoneNo` varchar(50) NOT NULL,
  `intro_acc_no` varchar(50) NOT NULL,
  `Balance` varchar(50) NOT NULL,
  `Opening_date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `savingaccount`
--

INSERT INTO `savingaccount` (`AccountNo`, `Name`, `Address`, `PhoneNo`, `intro_acc_no`, `Balance`, `Opening_date`) VALUES
(2, 'Anit', 'lko', '988', '1', '4000', '22/7/2017');

-- --------------------------------------------------------

--
-- Table structure for table `transactiontable`
--

CREATE TABLE IF NOT EXISTS `transactiontable` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `AccountNo` int(11) NOT NULL,
  `Date` varchar(50) NOT NULL,
  `Deposit` varchar(50) NOT NULL,
  `Withdraw` varchar(50) NOT NULL,
  `Balance` varchar(50) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `transactiontable`
--

INSERT INTO `transactiontable` (`tid`, `AccountNo`, `Date`, `Deposit`, `Withdraw`, `Balance`) VALUES
(1, 2, '22/7/2017', '4000', '0', '4000'),
(2, 2, '22/7/2017', '5000', '0', '9000'),
(3, 2, '22/7/2017', '0', '7000', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `urt`
--

CREATE TABLE IF NOT EXISTS `urt` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `MobileNo` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `DOB` varchar(50) NOT NULL,
  `DOJ` varchar(50) NOT NULL,
  `Usertype` varchar(50) NOT NULL,
  `Sq` varchar(50) NOT NULL,
  `Ans` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `urt`
--

INSERT INTO `urt` (`Username`, `Password`, `Name`, `Address`, `MobileNo`, `Email`, `DOB`, `DOJ`, `Usertype`, `Sq`, `Ans`) VALUES
('abc', 'abc', 'abc', 'abc', 'abc', 'abc', 'abc', 'abc', 'abc', 'abc', 'abc');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
