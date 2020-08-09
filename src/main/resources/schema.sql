DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS STAFF;
DROP TABLE IF EXISTS RECEIPT;
DROP TABLE IF EXISTS PRODUCTS;
DROP TABLE IF EXISTS VENDOR;
DROP TABLE IF EXISTS ORDERS;
DROP TABLE IF EXISTS ORDERLINE;

CREATE TABLE CUSTOMER(
	id VARCHAR2(50) PRIMARY KEY,
	customername VARCHAR2(250) NOT NULL,
	lastname VARCHAR2(50) not null,
	address VARCHAR2(50) not null,
	cellnumber VARCHAR2(50) not null,
	email VARCHAR2(50) not null,
	cardDetails VARCHAR2(50),
	custid VARCHAR2(50)
	);

CREATE TABLE STAFF
(
    staffname VARCHAR2(50) not null,
    lastname VARCHAR2(50) not null,
    address VARCHAR2(50),
    cellnumber VARCHAR2(50) not null unique,
    email VARCHAR2(50) not null unique,
    STAFFID VARCHAR2(50) not null unique

);

CREATE TABLE RECEIPT
(
    custid VARCHAR2(50)  not null unique,
    total double(20) not null,
    dateofreceipt date not null,
    location varchar2(50) not null,
    receiptID VARCHAR2(50) not null unique
);

CREATE TABLE PRODUCTS
(
    productname VARCHAR2(50) not null unique,
    price DOUBLE(10) not null,
    details VARCHAR2(50) not null,
    productID VARCHAR2(15) not null unique
);

CREATE TABLE VENDOR
(
    vendorname VARCHAR2(50) not null,
    cellnumber VARCHAR2(50),
    address VARCHAR2(50),
    vendorID VARCHAR2(50) not null unique,
    email VARCHAR2(50) not null
);

CREATE TABLE ORDERS
(
);

CREATE TABLE ORDERLINE
(
);