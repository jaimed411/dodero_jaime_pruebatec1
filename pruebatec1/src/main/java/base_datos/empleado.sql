-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-12-2023 a las 20:07:43
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empleados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `ID` bigint(20) NOT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `CARGO` varchar(255) DEFAULT NULL,
  `FECHAINICIO` date DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `SALARIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`ID`, `APELLIDO`, `CARGO`, `FECHAINICIO`, `NOMBRE`, `SALARIO`) VALUES
(10, 'Dodero Rojas', 'Desarrollador Java Junior', '2023-12-27', 'Jaime ', 18000),
(11, 'González Pérez', 'Desarrollador Senior', '2023-12-27', 'Alejandro ', 80000),
(12, 'Rodriguez Mendoza', 'Ingeniera de Software', '2023-12-27', 'Valeria', 75000),
(13, 'Martinez Gomez', 'Arquitecto de Software', '2023-12-27', 'Sergio', 90000),
(14, 'Fuig Geren', 'Desarrollador junior ', '2023-12-27', 'Leo', 25000),
(15, 'Lopez Venel', 'Especialista en Seguridad Informática', '2023-12-27', 'Carolina', 85000),
(16, 'Martinez Gomez', 'Analista de Datos', '2005-04-17', 'Sergio ', 70000),
(17, 'Marlen Soto', 'Especialista en Seguridad Informática', '2000-01-15', 'Pedro', 88000),
(18, 'Spiri Talvez', 'Desarrollador Java Junior', '2023-09-04', 'Alexia', 18000),
(19, 'Gomez Fred', 'Desarrolladora senior', '2021-12-08', 'Esther', 79000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
