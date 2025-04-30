-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-04-2025 a las 20:05:40
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
-- Base de datos: `agendam`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contactos`
--

CREATE TABLE `contactos` (
  `idContacto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(150) NOT NULL,
  `apodo` varchar(70) DEFAULT NULL,
  `relacion` varchar(40) DEFAULT NULL,
  `telefono` varchar(25) DEFAULT NULL,
  `cumpleanios` date DEFAULT NULL,
  `instagram` varchar(50) DEFAULT NULL,
  `email` text DEFAULT NULL,
  `empresa` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `contactos`
--

INSERT INTO `contactos` (`idContacto`, `nombre`, `apellidos`, `apodo`, `relacion`, `telefono`, `cumpleanios`, `instagram`, `email`, `empresa`) VALUES
(1, 'Perico', 'Palotes', 'Perico el de los Palotes', 'tonto del pueblo', NULL, NULL, NULL, NULL, NULL),
(3, 'Manolo', 'Casado', 'Manolo el del bombo', NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'Jose Luis', 'Moreno', 'El de los muñecos', NULL, NULL, NULL, NULL, NULL, NULL),
(5, 'Jose Luis', 'Moreno', 'El de los muñecos', NULL, NULL, NULL, NULL, NULL, NULL),
(6, 'Manolo', 'Casado', 'Manolo el del bombo', NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contactos`
--
ALTER TABLE `contactos`
  ADD PRIMARY KEY (`idContacto`),
  ADD UNIQUE KEY `instagram` (`instagram`),
  ADD UNIQUE KEY `telefono` (`telefono`),
  ADD UNIQUE KEY `email` (`email`) USING HASH;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contactos`
--
ALTER TABLE `contactos`
  MODIFY `idContacto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
