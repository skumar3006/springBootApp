-- Sandeep kumar vishwakarma
--------------------------------------------
DO $$ BEGIN 
	
CREATE TABLE owner (
  id serial NOT NULL, 
  first_name character varying(255) NOT NULL, 
  last_name character varying(255) NOT NULL, 
  phone1 character varying(20) NOT NULL, 
  phone2 character varying(20) NOT NULL, 
  dob timestamp without time zone, 
  CONSTRAINT pk_owner_id PRIMARY KEY (id)
);
CREATE TABLE address (
  id serial NOT NULL, 
  city character varying(255) NOT NULL, 
  street character varying(255) NOT NULL, 
  zip character varying(10) NOT NULL, 
  state character varying(255) NOT NULL, 
  country character varying(255) NOT NULL, 
  owner_id integer NOT NULL, 
  CONSTRAINT pk_address_id PRIMARY KEY (id), 
  CONSTRAINT fk_address_owner_id FOREIGN KEY (owner_id) REFERENCES owner(id)
);
CREATE TABLE car (
  id serial NOT NULL, 
  car_name character varying(255) NOT NULL, 
  model_date timestamp without time zone, 
  price numeric NOT NULL, 
  registration_number character varying(255) NOT NULL, 
  county character varying(255) NOT NULL, 
  state character varying(255) NOT NULL, 
  owner_id integer NOT NULL, 
  CONSTRAINT pk_car_id PRIMARY KEY (id), 
  CONSTRAINT fk_car_owner_id FOREIGN KEY (owner_id) REFERENCES owner(id)
);


END $$;
