CREATE TABLE `guest_students` (
                                  `id` int(11) NOT NULL,
                                  `guest_id` int(11) DEFAULT NULL,
                                  `student_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `guests` (
                          `id` int(11) NOT NULL,
                          `firstname` varchar(255) DEFAULT NULL,
                          `lastname` varchar(255) DEFAULT NULL,
                          `stay_at` datetime DEFAULT NULL,
                          `stay_until` datetime DEFAULT NULL,
                          `phone` varchar(255) DEFAULT NULL,
                          `gender` tinyint(1) DEFAULT NULL,
                          `age` tinyint(4) DEFAULT NULL,
                          `is_deleted` tinyint(1) DEFAULT NULL,
                          `created_at` datetime DEFAULT NULL,
                          `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `messages` (
                            `id` int(11) NOT NULL,
                            `title` varchar(255) DEFAULT NULL,
                            `content` longtext DEFAULT NULL,
                            `created_at` datetime DEFAULT NULL,
                            `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `students` (
                            `id` int(11) NOT NULL,
                            `neptun_code` varchar(255) DEFAULT NULL,
                            `firstname` varchar(255) DEFAULT NULL,
                            `lastname` varchar(255) DEFAULT NULL,
                            `gender` tinyint(1) DEFAULT NULL,
                            `year_of_birth` datetime DEFAULT NULL,
                            `address` varchar(255) DEFAULT NULL,
                            `is_deleted` tinyint(1) DEFAULT NULL,
                            `created_at` datetime DEFAULT NULL,
                            `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `users` (
                         `id` int(11) NOT NULL,
                         `username` varchar(255) NOT NULL,
                         `password` varchar(255) DEFAULT NULL,
                         `firstname` varchar(255) DEFAULT NULL,
                         `lastname` varchar(255) DEFAULT NULL,
                         `is_deleted` tinyint(1) DEFAULT NULL,
                         `created_at` datetime DEFAULT NULL,
                         `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;