CREATE TABLE person (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    type ENUM('Adult', 'Child') NOT NULL,
    responsible_id INT,
    FOREIGN KEY (responsible_id) REFERENCES person(id)
);

CREATE TABLE gondola (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	number INT NOT NULL UNIQUE,
    seat1_id INT,
    seat2_id INT,
    FOREIGN KEY (seat1_id) REFERENCES person(id),
    FOREIGN KEY (seat2_id) REFERENCES person(id)
);