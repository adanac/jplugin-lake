
CREATE TABLE CUSTOMER (
	cust_id    BIGINT  auto_increment primary key,
	cust_name VARCHAR(64),
	cust_address VARCHAR(256),
	sex  VARCHAR(2),
	status VARCHAR(5),
	cust_level INT,
	create_date  VARCHAR(64)
);