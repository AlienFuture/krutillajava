-- set primary key for guests AND auto_increment
ALTER TABLE `guests` ADD PRIMARY KEY (`id`);
ALTER TABLE `guests` MODIFY COLUMN `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `guest_students` ADD CONSTRAINT `guest_students_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`);
ALTER TABLE `guest_students` ADD CONSTRAINT `guest_students_ibfk_1` FOREIGN KEY (`guest_id`) REFERENCES `guests` (`id`);