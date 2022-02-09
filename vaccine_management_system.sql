-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 06, 2021 at 03:35 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vaccine_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(25) NOT NULL,
  `sec_q` varchar(25) NOT NULL,
  `sec_ans` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `sec_ans`) VALUES
('ashik12', 'Ashikur Rahman', '12345', 'Your Lucky Number?', '13');

-- --------------------------------------------------------

--
-- Table structure for table `issue_vaccine`
--

CREATE TABLE `issue_vaccine` (
  `vaccine_id` varchar(10) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `identity` varchar(100) NOT NULL,
  `vaccine_namee` varchar(20) NOT NULL,
  `dateOfIssue` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `take_vaccine`
--

CREATE TABLE `take_vaccine` (
  `vaccine_id` varchar(10) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `identity` varchar(100) NOT NULL,
  `vaccine_namee` varchar(20) NOT NULL,
  `dateOfIssue` varchar(20) NOT NULL,
  `dateOfTake` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `take_vaccine`
--

INSERT INTO `take_vaccine` (`vaccine_id`, `user_id`, `vaccine_name`, `user_name`, `identity`, `vaccine_namee`, `dateOfIssue`, `dateOfTake`) VALUES
('467', '8465', 'Pfizer-BioNTech', 'Md.Ashikur Rahman', 'University Students', 'Pfizer-BioNTech', 'Aug 6, 2021', 'Aug 6, 2021'),
('818', '2249', 'Moderna', 'Niloy Ahmed', 'University Students', 'Moderna', 'Aug 6, 2021', 'Aug 8, 2021'),
('494', '2742', 'AstraZeneca', 'Ashfaq', 'University Students', 'AstraZeneca', 'Aug 6, 2021', 'Aug 7, 2021');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `nid_number` varchar(100) NOT NULL,
  `identity` varchar(100) NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `division` varchar(20) NOT NULL,
  `Zila` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `nid_number`, `identity`, `vaccine_name`, `division`, `Zila`) VALUES
('2249', 'Niloy Ahmed', '17316226', 'University Students', 'Moderna', 'Rangpur', 'Dinajpur'),
('2742', 'Ashfaq', '17316228', 'University Students', 'AstraZeneca', 'Dhaka', 'Dhaka'),
('8465', 'Md.Ashikur Rahman', '1420306284', 'University Students', 'Pfizer-BioNTech', 'Khulna', 'Kushtia');

-- --------------------------------------------------------

--
-- Table structure for table `vaccine`
--

CREATE TABLE `vaccine` (
  `vaccine_id` varchar(10) NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `authorised` varchar(20) NOT NULL,
  `Pruduced_by` varchar(30) NOT NULL,
  `doses` varchar(10) NOT NULL,
  `price` varchar(10) NOT NULL,
  `quantity` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccine`
--

INSERT INTO `vaccine` (`vaccine_id`, `vaccine_name`, `authorised`, `Pruduced_by`, `doses`, `price`, `quantity`) VALUES
('112', 'Johnson & Johnson', 'Yes,Work 67%', 'Janssen Pharmaceutical', '1', 'Free', '100'),
('467', 'Pfizer-BioNTech', 'Yes,Work 95%', 'German and USA', '2', 'Free', '100'),
('494', 'AstraZeneca', 'Work 76%', 'Oxford University', '2', 'Free', '100'),
('818', 'Moderna', 'Yes,Work 94%', 'America', '2', 'Free', '100'),
('941', 'Sinopharm-BBIBP', 'Work 79%', 'China', '2', 'Free', '100');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `vaccine`
--
ALTER TABLE `vaccine`
  ADD PRIMARY KEY (`vaccine_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
