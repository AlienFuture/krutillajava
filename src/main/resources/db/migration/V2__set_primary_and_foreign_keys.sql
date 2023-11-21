-- set primary key for table `user`
ALTER TABLE `users` ADD PRIMARY KEY (`id`);

ALTER TABLE `students` ADD PRIMARY KEY (`id`);

-- set primary key for messages
ALTER TABLE `messages` ADD PRIMARY KEY (`id`);

-- set guests primary key
ALTER TABLE `guests` ADD PRIMARY KEY (`id`);

-- set primary key for guest_students AND guest_id = guests foreign key, and student_id = students foreign key
ALTER TABLE `guest_students` ADD PRIMARY KEY (`id`);
ALTER TABLE `guest_students` ADD CONSTRAINT `guest_students_ibfk_1` FOREIGN KEY (`guest_id`) REFERENCES `guests` (`id`);