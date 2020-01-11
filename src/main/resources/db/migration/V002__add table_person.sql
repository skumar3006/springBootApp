-- Sandeep kumar vishwakarma
--------------------------------------------
DO $$ BEGIN 
	
CREATE TABLE person (
  id serial NOT NULL, 
  first_name character varying(255) NOT NULL, 
  last_name character varying(255) NOT NULL, 
  dob timestamp without time zone, 
  CONSTRAINT pk_person_id PRIMARY KEY (id)
);

END $$;
