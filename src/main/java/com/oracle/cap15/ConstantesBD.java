package com.oracle.cap15;

public enum ConstantesBD {
	  //customer
	  CUSTOMER_ID,
	  FIRST_NAME_CUSTOMER{public String toString() {return "FIRST_NAME";}},
	  LAST_NAME_CUSTOMER{public String toString() {return "LAST_NAME";}},
	  EMAIL,
	  PHONE,
	  
	  //author
	  AUTHOR_ID_AUTHOR{public String toString() {return "AUTHOR_ID";}},
	  FIRST_NAME_AUTHOR{public String toString() {return "FIRST_NAME";}},
	  LAST_NAME_AUTHOR{public String toString() {return "LAST_NAME";}},
	  
	  //book
	  ISBN_BOOK{public String toString() {return "ISBN";}},
	  TITLE,
	  PUB_DATE,
	  BOOK_FORMAT,
	  UNIT_PRICE,
	  
	  //autho_book
	  AUTHOR_ID_BOOK{public String toString() {return "AUTHOR_ID";}},
	  ISBN_AUTHOR_BOOK{public String toString() {return "ISBN";}},
	  
	  URL{public String toString() {return "jdbc:oracle:thin:@localhost:1521:xe";}},
	  USER{public String toString() {return "aluno";}},
	  PASSWORD{public String toString() {return "123";}}
	  
	  ;
	
	
}
