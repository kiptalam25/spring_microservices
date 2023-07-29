CREATE TABLE items(
    id serial not null primary key,
    	 name VARCHAR(250),
    	dateCreated DATE,
    	unitPrice INT,
    	quantity INT,
        category_id INT
)