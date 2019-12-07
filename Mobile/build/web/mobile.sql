-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 11, 2017 at 05:55 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `exchange`
--

CREATE TABLE IF NOT EXISTS `exchange` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `request_from` varchar(15) NOT NULL,
  `request_to` varchar(10) NOT NULL,
  `customer_Num` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `exchange`
--


-- --------------------------------------------------------

--
-- Table structure for table `kiosk`
--

CREATE TABLE IF NOT EXISTS `kiosk` (
  `kioskID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `agentName` varchar(15) NOT NULL,
  `mtn_Num` varchar(10) NOT NULL,
  `warid_Num` varchar(10) NOT NULL,
  `mtn_Float` int(11) NOT NULL,
  `warid_Float` int(11) NOT NULL,
  `mtn_Cash` int(11) NOT NULL,
  `warid_Cash` int(11) NOT NULL,
  PRIMARY KEY (`kioskID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `kiosk`
--


-- --------------------------------------------------------

--
-- Table structure for table `total_com`
--

CREATE TABLE IF NOT EXISTS `total_com` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `kiosk` varchar(20) NOT NULL,
  `agentName` varchar(20) NOT NULL,
  `mtn_total` int(11) NOT NULL,
  `airtel_total` int(11) NOT NULL,
  `total` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `total_com`
--


-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE IF NOT EXISTS `transaction` (
  `transactionID` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `customer_num` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL,
  `commission` int(11) NOT NULL,
  `com_backup` int(11) NOT NULL,
  `kiosk_fonNum` varchar(10) NOT NULL,
  `agent_Name` varchar(15) NOT NULL,
  `date_time` varchar(30) NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`transactionID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `transaction`
--


-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) DEFAULT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`, `status`) VALUES
(4, 'jack', '1234', 'admin');
