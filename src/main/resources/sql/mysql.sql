CREATE TABLE `test_mysql` (
                              `id` int(4) NOT NULL,
                              `name` varchar(255) DEFAULT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `test_mysql`(`id`, `name`) VALUES (1, 'mysql');
