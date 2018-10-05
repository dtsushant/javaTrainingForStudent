CREATE TABLE `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_name` varchar(255) NOT NULL,
  `math` double NOT NULL,
  `science` double NOT NULL,
  `english` double NOT NULL,
  `social_studies` double NOT NULL,
  `nepali` double NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `result_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`)
)