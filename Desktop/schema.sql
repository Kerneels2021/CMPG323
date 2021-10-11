CREATE SCHEMA HR;

CREATE SEQUENCE HR.GENERIC_SEQ
    START WITH 50002
    INCREMENT BY 1;

CREATE TABLE HR.DEMO_ACCOUNT_TYPE (
	ACCOUNT_TYPE_ID BIGINT NOT NULL,
	MNEMONIC VARCHAR(100) NOT NULL UNIQUE,
	ACCOUNT_TYPE_NAME VARCHAR(255) NOT NULL,
	CREATION_DATE DATE NOT NULL,
PRIMARY KEY (ACCOUNT_TYPE_ID));

CREATE TABLE HR.DEMO_ACCOUNT_TX (
	ACCOUNT_TX_ID BIGINT NOT NULL,
	ACCOUNT_TYPE_ID BIGINT NOT NULL,
	MEMBER_ID BIGINT NOT NULL,
	AMOUNT NUMBER(15) NOT NULL,
	TX_DATE DATE NOT NULL,
CONSTRAINT FK_ACCOUNT_TYPE_ID FOREIGN (ACCOUNT_TYPE_ID) REFERENCES HR.DEMO_ACCOUNT_TYPE (ACCOUNT_TYPE_ID),);


