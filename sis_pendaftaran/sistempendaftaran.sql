-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25 Jul 2016 pada 05.59
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistempendaftaran`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbljurusan`
--

CREATE TABLE `tbljurusan` (
  `ID_Jurusan` varchar(10) NOT NULL,
  `Jurusan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbljurusan`
--

INSERT INTO `tbljurusan` (`ID_Jurusan`, `Jurusan`) VALUES
('P001', 'IPA'),
('P002', 'IPS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblkartu`
--

CREATE TABLE `tblkartu` (
  `ID_Kartu` varchar(10) NOT NULL,
  `ID_Pendaftar` varchar(10) NOT NULL,
  `Nama_Lengkap` varchar(25) NOT NULL,
  `Jurusan` varchar(25) NOT NULL,
  `Ruang_tes` varchar(25) NOT NULL,
  `Waktu` varchar(10) NOT NULL,
  `Jam` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblkartu`
--

INSERT INTO `tblkartu` (`ID_Kartu`, `ID_Pendaftar`, `Nama_Lengkap`, `Jurusan`, `Ruang_tes`, `Waktu`, `Jam`) VALUES
('0001', 'ID002', 'dede', 'IPA', 'AULA LANTAI 1', '12-09-2016', '08.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblnilai`
--

CREATE TABLE `tblnilai` (
  `ID_Nilai` varchar(10) NOT NULL,
  `ID_Kartu` varchar(10) NOT NULL,
  `Nama_Lengkap` varchar(25) NOT NULL,
  `Jurusan` varchar(25) NOT NULL,
  `Matematika` int(10) NOT NULL,
  `B_Indonesia` int(10) NOT NULL,
  `B_Inggris` int(10) NOT NULL,
  `Jumlah` int(10) NOT NULL,
  `Rata_rata` int(10) NOT NULL,
  `Keterangan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblnilai`
--

INSERT INTO `tblnilai` (`ID_Nilai`, `ID_Kartu`, `Nama_Lengkap`, `Jurusan`, `Matematika`, `B_Indonesia`, `B_Inggris`, `Jumlah`, `Rata_rata`, `Keterangan`) VALUES
('N001', '0001', 'dede', 'IPA', 80, 80, 80, 240, 80, 'Lulus'),
('N002', '0001', 'dede', 'IPA', 80, 80, 80, 240, 80, 'Lulus');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblpendaftar`
--

CREATE TABLE `tblpendaftar` (
  `ID_Pendaftar` varchar(10) NOT NULL,
  `Nama_Lengkap` varchar(45) NOT NULL,
  `Tempat_Lahir` varchar(15) NOT NULL,
  `Tanggal_Lahir` varchar(15) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Agama` varchar(10) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `No_telp` varchar(15) NOT NULL,
  `Jurusan` varchar(10) NOT NULL,
  `Nama_Ayah` varchar(45) NOT NULL,
  `Nama_Ibu` varchar(45) NOT NULL,
  `Tinggi_Badan` varchar(10) NOT NULL,
  `Berat_Badan` varchar(10) NOT NULL,
  `Jarak_ke_Sekolah` varchar(10) NOT NULL,
  `Jumlah_Saudara` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblpendaftar`
--

INSERT INTO `tblpendaftar` (`ID_Pendaftar`, `Nama_Lengkap`, `Tempat_Lahir`, `Tanggal_Lahir`, `Jenis_Kelamin`, `Agama`, `Alamat`, `No_telp`, `Jurusan`, `Nama_Ayah`, `Nama_Ibu`, `Tinggi_Badan`, `Berat_Badan`, `Jarak_ke_Sekolah`, `Jumlah_Saudara`) VALUES
('ID002', 'dede', 'tangerang', '02-03-2104', 'Laki-laki', 'KRISTEN', 'pasar kemis', '0987886765', 'IPA', 'ayah dede', 'ibu dede', '20', '40', '23', 4),
('ID003', 'roro', 'jakarta', '09-09-1994', 'Laki-laki', 'ISLAM', 'jakarta', '09876543', 'IPA', 'ayah ', 'ibu', '23', '23', '23', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblpetugas`
--

CREATE TABLE `tblpetugas` (
  `ID_Petugas` varchar(10) NOT NULL,
  `Nama_Petugas` varchar(45) NOT NULL,
  `Tempat_Lahir` varchar(15) NOT NULL,
  `Tanggal_Lahir` varchar(15) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Jabatan` varchar(15) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `No_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblpetugas`
--

INSERT INTO `tblpetugas` (`ID_Petugas`, `Nama_Petugas`, `Tempat_Lahir`, `Tanggal_Lahir`, `Jenis_Kelamin`, `Jabatan`, `Alamat`, `No_telp`) VALUES
('P001', 'INDRA L GHAZALI', 'JAKARTA', '03-01-1994', 'Laki-laki', 'Petugas', 'Pondok Indah', '085777549852'),
('P002', 'dede', 'jakarta', '01-09-1993', 'Laki-laki', 'Petugas', 'jakarta', '08978675');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbljurusan`
--
ALTER TABLE `tbljurusan`
  ADD PRIMARY KEY (`Jurusan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
