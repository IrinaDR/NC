begin;

drop table customer;

CREATE TABLE Customer (
    Login          CHAR (15)   PRIMARY KEY,
    Password       CHAR (8) NOT NULL,
    Email         CHAR (40) NOT NULL,
    Account        double precision
);

CREATE TABLE Shops (
   Address   CHAR(50)   PRIMARY KEY,
   Product_handler   CHAR(50)   NOT NULL
);

CREATE TABLE Status (
   Status_id   INT   PRIMARY KEY,
   Value   CHAR(300)   NOT NULL
);

CREATE TABLE Search_mode (
   Search_mode_id   INT   PRIMARY KEY,
   Value   CHAR(300)   NOT NULL
);

CREATE TABLE Message (
  Message_id 		INT      PRIMARY KEY,
  Customer      	CHAR(15) NOT NULL,
  Status_id             INT        NOT NULL,
  Content       CHAR(300)       NOT NULL,
  Data          TIME WITH TIME ZONE,
  FOREIGN KEY (Customer) REFERENCES Customer (Login),
  FOREIGN KEY (Status_id) REFERENCES Status (Status_id)
);


CREATE TABLE Bot (
   Bot_id   INT   PRIMARY KEY,
   Customer   CHAR(15)   NOT NULL,
   Good_name    CHAR(10)   NOT NULL,
   Shop    CHAR(50)   NOT NULL,
   Start_time   TIME WITH TIME ZONE,
   Finish_time   TIME WITH TIME ZONE,
   Search_mode_id   INT,
   Num   INT,
   FOREIGN KEY (Customer) REFERENCES Customer (Login),
   FOREIGN KEY (Search_mode_id) REFERENCES Search_mode (Search_mode_id),
   FOREIGN KEY (Shop) REFERENCES Shops (Address)
);


commit;