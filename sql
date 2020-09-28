sql - standard language which stands for Structured Query Language based on the English language
    - SQL is the core of the relational database which is used for accessing and managing database    
MySQL - database management system
      - an RDMS (Relational Database Management System) such as SQL Server, Informix etc.





Q2. What are the different subsets of SQL?
DDL (Data Definition Language) – It allows you to perform various operations on the database such as CREATE, ALTER and DELETE objects.
DML ( Data Manipulation Language) – It allows you to access and manipulate data. It helps you to insert, update, delete and retrieve data from the database.
DCL ( Data Control Language) – It allows you to control access to the database. Example – Grant, Revoke access permissions.






DBMS - A DBMS allows a user to interact with the database.
     - The data stored in the database can be modified, retrieved and deleted and can be of any type like strings, numbers, images etc.
     
     
 
 
 
 
There are two types of DBMS:
                Relational Database Management System: The data is stored in relations (tables). Example – MySQL.
                Non-Relational Database Management System: There is no concept of relations, tuples and attributes.  Example – Mongo





Table / fields(column)




JOIN - A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
     - inner , full outer , right ouuter , right outer




CHAR and VARCHAR2  - Both Char and Varchar2 are used for characters datatype but varchar2 is used for character strings of variable length
                     whereas Char is used for strings of fixed length. For example, char(10) can only store 10 characters and will not be able
                     to store a string of any other length whereas varchar2(10) can store any length i.e 6,8,2 in this variable.
                     
                     
                     
                     
                     
                     
Primary key : column or set of columns that uniquely identifies a row

Constraints : NOT NULL
CHECK
DEFAULT
UNIQUE
PRIMARY KEY
FOREIGN KEY






Delete : used to delete a row in a table.
       : You can rollback data after using delete statement.
       :  slower than truncate statement.
       : DML command.
     
Truncate : delete all the rows from a table.
         :  cannot rollback
         :DDL command
         
         
         
         
         
         
         
Primary Key  : Only one primary key is allowed to be used in a table.
             : Duplicate and NULL (empty) values are not valid in the case of the primary key.
             : Primary keys can be used as foreign keys for other tables too.
             : Emp_id here is primary key of the table. As the id of each employee is unique and no two employees can have the same Emp_id.
             
             
Unique Key : Multiple unique keys can present in a table. 
           : NULL values are allowed in case of a unique key. 
           : These can also be used as foreign keys for another table.             
           : As the phone number of each employee is unique and it might be possible that an employee does not have any phone number.
           : Unique identifier for rows of a table when primary key is not present
           
           
           
           
           
Foreign Key  : The foreign key in the child table references the primary key in the parent table.





Data Integrity defines the accuracy as well as the consistency of the data stored in a database.




Index : An index refers to a performance tuning method of allowing faster retrieval of records from the table. An index creates an entry for each value and hence it will be faster to retrieve data.
Unique Index : This index does not allow the field to have duplicate values if the column is unique indexed. If a primary key is defined, a unique index can be applied automatically.
Clustered Index: : This index reorders the physical order of the table and searches based on the basis of key values. Each table can only have one clustered index.
Non-Clustered Index : Non-Clustered Index does not alter the physical order of the table and maintains a logical order of the data. Each table can have many nonclustered indexes.

Clustered index is used for easy retrieval of data from the database and its faster whereas reading from non clustered index is relatively slower.
One table can only have one clustered index whereas it can have many non clustered index.
Clustered index alters the way records are stored in a database as it sorts out rows by the column which is set to be clustered index whereas in a non clustered index, it does not alter the way it was stored but it creates a separate object within a table which points back to the original table rows after searching.




SQL query to display the current date : GetDate()



Inner join: Inner Join in MySQL is the most common type of join. It is used to return all the rows from multiple tables where the join condition is satisfied. 
Left Join:  Left Join in MySQL is used to return all the rows from the left table but only the matching rows from the right table where the join condition is fulfilled.
Right Join: Right Join in MySQL is used to return all the rows from the right table but only the matching rows from the left table where the join condition is fulfilled.
Full Join: Full join returns all the records when there is a match in any of the tables. Therefore, it returns all the rows from the left-hand side table and all the rows from the right-hand side table.







 Entities and Relationships : 
 Entities:  A person, place, or thing in the real world about which data can be stored in a database. 
            Tables store data that represents one type of entity.
            For example – A bank database has a customer table to store customer information. 
                          Customer table stores this information as a set of attributes (columns within the table) for each customer.
                          

Relationships: Relation or links between entities that have something to do with each other. 
               For example – The customer name is related to the customer account number and contact information, which might be in the same table.
               There can also be relationships between separate tables (for example, customer to accounts).
               
               
               
               
               
               
               


 Normalization: process of organizing data to avoid duplication and redundancy.
                More Tables with smaller rows
                 Efficient data access
                 Quickly find the information
                  Easier to implement Security
                  Allows easy modification
                  Ensure Consistent data after modification
                  
                  
                  
                  
                  
                  
DROP command removes a table and it cannot be rolled back from the database whereas TRUNCATE command removes all the rows from the table.




First Normal Form (1NF) – No repeating groups within rows
Second Normal Form (2NF) – Every non-key (supporting) column value is dependent on the whole primary key.
Third Normal Form (3NF) – Dependent solely on the primary key and no other non-key (supporting) column value.






 ACID property: Atomicity, Consistency, Isolation, Durability.
              : used to ensure that the data transactions are processed reliably in a database system.              
 Atomicity: Atomicity refers to the transactions that are completely done or failed where transaction refers to a single logical operation of a data
 Consistency: Consistency ensures that the data must meet all the validation rules. In simple words,  you can say that your transaction never leaves the database without completing its state.
 Isolation: The main goal of isolation is concurrency control.
 Durability: Durability means that if a transaction has been committed, it will occur whatever may come in between such as power loss, crash or any sort of error.
 
 
 
 
 
 
 Trigger in SQL is are a special type of stored procedures that are defined to execute automatically in place or after data modifications.
 It allows you to execute a batch of code when an insert, update or any other query is executed against a specific table.
 
 
 
 
 
 A NULL value is not at all same as that of zero or a blank space. 
 NULL value represents a value which is unavailable, unknown, assigned or not applicable whereas a zero is a number and blank space is a character.
 
 
 
              
              
 
cross join and natural join :  cross join produces the cross product or Cartesian product of two tables
                               whereas the natural join is based on all the columns having the same name and data types in both the tables.
                               
                               
                               
                               

subquery in SQL : A subquery is a query inside another query where a query is defined to retrieve data or information back from the database.
                  In a subquery, the outer query is called as the main query whereas the inner query is called subquery.
                  Subqueries are always executed first and the result of the subquery is passed on to the main query.                               
                  
                  
different types of a subquery :  Correlated and Non-Correlated.
                              :  Correlated subquery: These are queries which select the data from a table referenced in the outer query. It is not considered as an independent query as it refers to another table and refers the column in a table.
                                 Non-Correlated subquery: This query is an independent query where the output of subquery is substituted in the main query.








group functions in SQL : Group functions work on the set of rows and returns one result per group.
                         Some of the commonly used group functions are: AVG, COUNT, MAX, MIN, SUM, VARIANCE.
                         
                         
                         
                         
                         
                         
Relationship : Relationships are defined as the connection between the tables in a database. There are various relationships, namely:

One to One Relationship.
One to Many Relationship.
Many to One Relationship.
Self-Referencing Relationship.







How can you insert NULL values in a column while inserting the data?
NULL values can be inserted in the following ways:
              Implicitly by omitting column from column list.
              Explicitly by specifying NULL keyword in the VALUES clause
              
              
              
              
              
              
‘BETWEEN’ and ‘IN’ : SELECT * FROM Students where ROLL_NO BETWEEN 10 AND 50; 
                   : SELECT * FROM students where ROLL_NO IN (8,15,25); 
               
               
        
  
  
   MERGE statement? : This statement allows conditional update or insertion of data into a table. It performs an UPDATE if a row exists, or an INSERT if the row does not exist. 
   
   
   
   
   
   Clause in SQL : A clause helps to filter the rows from the entire set of records.
                   For example – WHERE, HAVING clause.





     ‘HAVING’ CLAUSE and a ‘WHERE’ CLAUSE : HAVING clause can be used only with SELECT statement. It is usually used in a GROUP BY clause and whenever GROUP BY is not used, HAVING behaves like a WHERE clause.
Having Clause is only used with the GROUP BY function in a query whereas WHERE Clause is applied to each row before they are a part of the GROUP BY function in a query.




 fetch common records from two tables : Select studentID from student. <strong>INTERSECT </strong> Select StudentID from Exam
 
 
 
 
 case manipulation functions in SQL : 
 LOWER: This function returns the string in lowercase. It takes a string as an argument and returns it by converting it into lower case. 
 UPPER: This function returns the string in uppercase. It takes a string as an argument and returns it by converting it into uppercase.
 INITCAP: This function returns the string with the first letter in uppercase and rest of the letters in lowercase.
 
 
 
 
 
 different set operators available in SQL: Union, Intersect or Minus operators.
 
 
 
 
 
 ALIAS command : ALIAS name can be given to any table or a column.
                : Select emp.empID, dept.Result from employee emp, department as dept where emp.empID=dept.empID
                
                
                
              
              
aggregate and scalar functions:      Aggregate functions are used to evaluate mathematical calculation and returns a single value. These calculations are done from the columns in a table. For example- max(),count() are calculated with respect to numeric.
Scalar functions return a single value based on the input value. For example – UCASE(), NOW() are calculated with respect to string
     





fetch alternate records from a table: Select studentId from (Select rowno, studentId from student) where mod(rowno,2)=0
Now, to display odd numbers:
Select studentId from (Select rowno, studentId from student) where mod(rowno,2)=1







 pattern matching : % – It matches zero or more characters.
For example- select * from students where studentname like ‘a%’
_ (Underscore) – it matches exactly one character.
For example- select * from student where studentname like ‘abc_’







select unique records from a tabl : Select DISTINCT studentID from Student





fetch first 5 characters of the string: Select SUBSTRING(StudentName,1,5) as studentname from student




difference between SQL and PL/SQL : SQL is a query language that allows you to issue a single query or execute a single insert/update/delete 
whereas PL/SQL is Oracle’s “Procedural Language” SQL, which allows you to write a full program (loops, variables, etc.) to accomplish
multiple operations such as selects/inserts/updates/deletes. 






View : A view is a virtual table which consists of a subset of data contained in a table. Since views are not present, it takes less space to store.
      View can have data of one or more tables combined and it depends on the relationship.
    :Restricting access to data.
      Making complex queries simple.
      Ensuring data independence.
      Providing different views of same data.
      
      
      
      
      
      
  Auto Increment in SQL : Auto increment keyword allows the user to create a unique number to get generated whenever a new record is inserted into the table.
  
  
  Datawarehouse :Datawarehouse refers to a central repository of data where the data is assembled from multiple sources of information.
                 Those data are consolidated, transformed and made available for the mining as well as online processing.
                 Warehouse data also have a subset of data called Data Marts.
                 
                 
                 
                 
                 
                 
Local and Global variables : same as for another programming language.       




Collation : Collation is defined as a set of rules that determine how data can be sorted as well as compared.
 types of Collation Sensitivity: Case Sensitivity: A and a and B and b.
Kana Sensitivity: Japanese Kana characters.
Width Sensitivity: Single byte character and double-byte character.
Accent Sensitivity.





Stored Procedure : A Stored Procedure is a function which consists of many SQL statements to access the database system.
                   Several SQL statements are consolidated into a stored procedure and execute them whenever and wherever required which saves time 
                   and avoid writing code again and again                   
Stored Procedure can be used as a modular programming which means create once, store and call for several times whenever it is required. This supports faster execution. It also reduces network traffic and provides better security to the data.
Disadvantage:
The only disadvantage of Stored Procedure is that it can be executed only in the database and utilizes more memory in the database server.                   
                   
                   
                   





7 aggregate functions in SQL:
AVG(): Returns the average value from specified columns.
COUNT(): Returns number of table rows.
MAX(): Returns the largest value among the records.
MIN(): Returns smallest value among the records.
SUM(): Returns the sum of specified column values.
FIRST(): Returns the first value.
LAST(): Returns last value.





Scalar functions are used to return a single value based on the input values.
UCASE(): Converts the specified field in the upper case.
LCASE(): Converts the specified field in lower case.
MID(): Extracts and returns character from the text field.
FORMAT(): Specifies the display format.
LEN(): Specifies the length of the text field.
ROUND(): Rounds up the decimal field value to a number.








Triggers in SQL is kind of stored procedures used to create a response to a specific action performed on the table such as INSERT, UPDATE or DELETE. You can invoke triggers explicitly on the table in the database.
Action and Event are two main components of SQL triggers. When certain actions are performed, the event occurs in response to that action.





A View can be defined as a virtual table that contains rows and columns with fields from one or more tables.
CREATE VIEW view_name AS
SELECT column_name(s) 
FROM table_name 
WHERE condition



update the view:
SQL CREATE and REPLACE can be used for updating the view.
CREATE OR REPLACE VIEW view_name AS
 SELECT column_name(s)
 FROM table_name
 WHERE condition
 
 
 --------
 
 
 working of SQL Privileges?SQL GRANT and REVOKE commands are used to implement privileges in SQL multiple user environments. 
 The administrator of the database can grant or revoke privileges to or from users of database objects by using commands like SELECT, INSERT, UPDATE, DELETE, ALL, etc.
 
 GRANT Command: This command is used to provide database access to users other than the administrator.
Syntax:
GRANT privilege_name
 ON object_name
 TO {user_name|PUBLIC|role_name}
 [WITH GRANT OPTION];
 
 REVOKE command: This command is used to provide database deny or remove access to database objects.
Syntax:
REVOKE privilege_name
 ON object_name
 FROM {user_name|PUBLIC|role_name};
 
 
 
 -------
 
 
 
 
 
  SQL Sandbox in SQL Server : SQL Sandbox is a safe place in the SQL server environment where untrusted scripts are executed. There are 3 types of SQL sandbox:
Safe Access Sandbox: Here a user can perform SQL operations such as creating stored procedures, triggers etc. but cannot have access to the memory as well as cannot create files.
External Access Sandbox: Users can access files without having the right to manipulate the memory allocation.
Unsafe Access Sandbox: This contains untrusted codes where a user can have access to memory.
 
 
 ---------
 
 SQL Injection is a type of database attack technique where malicious SQL statements are inserted into an entry field of database in a way that once it is executed, the database is exposed to an attacker for the attack. 
 
 
 ----
 
 
 
 
  NVL function : used to convert the null value to its actual value.
  
  
  Cartesian product : output of Cross Join is called a Cartesian product
  
  
  
  
  
   difference between DELETE and TRUNCATE?
                   The basic difference in both is DELETE command is DML command and the TRUNCATE command is DDL.
                DELETE command is used to delete a specific row from the table whereas the TRUNCATE command is used to remove all rows from the table.
                We can use the DELETE command with WHERE clause but cannot use the TRUNCATE command with it.


      
      
      
      
TRUNCATE removes all rows from the table which cannot be retrieved back, DROP removes the entire table from the database and it also cannot be retrieved back.





Normalization is used to organize the data in such a manner that data redundancy will never occur in the database and avoid insert, update and delete anomalies.
There are 5 forms of Normalization:
First Normal Form (1NF): It removes all duplicate columns from the table. It creates a table for related data and identifies unique column values.
First Normal Form (2NF): Follows 1NF and creates and places data subsets in an individual table and defines the relationship between tables using the primary key.
Third Normal Form (3NF): Follows 2NF and removes those columns which are not related through the primary key.
Fourth Normal Form (4NF): Follows 3NF and does not define multi-valued dependencies. 4NF is also known as BCNF.
      
      
      
      
      
      
 cursor is a database object which is used to manipulate data in a row-to-row manner.
Cursor follows steps as given below:
Declare Cursor
Open Cursor
Retrieve row from the Cursor
Process the row
Close Cursor
Deallocate Cursor      
               
               
               
               
               
Collation refers to a set of rules that determine how data is sorted and compared. 
Character data is sorted using rules that define the correct character sequence, with options for specifying case-sensitivity, accent marks, kana character types and character width.
 
 
 
 
  Database White Box Testing:
  Database Consistency and ACID properties
Database triggers and logical views
Decision Coverage, Condition Coverage, and Statement Coverage
Database Tables, Data Model, and Database Schema
Referential integrity rules




Black Box Testing?
Data Mapping
Data stored and retrieved
Use of Black Box testing techniques such as Equivalence Partitioning and Boundary Value Analysis (BVA)





               
               


index can be defined as the way to retrieve the data more quickly. We can define indexes using CREATE statements.
Syntax:
CREATE INDEX index_name
 ON table_name (column_name)
Further, we can also create a Unique Index using the following syntax:
CREATE UNIQUE INDEX index_name
 ON table_name (column_name)
 
 
 
 
 
 
 COMMIT saves all changes made by DML statements.
 
 
 
 
 
 
 CHECK constraint is used to limit the values or type of data that can be stored in a column.
 They are used to enforce domain integrity.
 
 
 
 
 
 
  a table can have many foreign keys but only one primary key.
  
  
  
   stored procedure is a set of SQL queries that can take input and send back output.
   
   
   
   
    Normalization?
The process of table design to minimize the data redundancy is called normalization. 
We need to divide a database into two or more table and define the relationship between them.




 Trigger allows us to execute a batch of SQL code when table event occurs (INSERT, UPDATE or DELETE commands are executed against a specific table).
 
 
 
 
 
 DML stands for Data Manipulation Language. INSERT, UPDATE and DELETE  are DML statements.
DDL stands for Data Definition Language. CREATE, ALTER, DROP, RENAME are DDL statements.





 
 
 A transaction is a sequence of code that runs against a database. It takes the database from one consistent state to another.
 
 
 
 
 
 
 difference between UNIQUE and PRIMARY KEY constraints?
Answer: The differences are as follows:
A table can have only one PRIMARY KEY whereas there can be any number of UNIQUE keys.
The primary key cannot contain Null values whereas the Unique key can contain Null values.







Does View contain Data?
Answer: No, Views are virtual structures.



Can a View based on another View?
Answer: Yes, A View is based on another View.




difference between Rename and Alias?
Answer: Rename is a permanent name given to a table or column whereas Alias is a temporary name given to a table or column.




 we avoid duplicating records in a query By using the DISTINCT keyword, duplication of records in a query can be avoided.
 
 
 
 
 A temp table is a temporary storage structure to store the data temporarily.
 
 
 
 
  Collation :  Set of rules that define how data is stored, how case-sensitivity and Kana character can be treated etc.
  
  
  
  
   Case function? : Case facilitates if-then-else type of logic in SQL. It evaluates a list of conditions and returns one of the multiple possible result expressions.
   
   
   
   
   
    What is Referential Integrity?
Answer: Set of rules that restrict the values of one or more columns of the tables based on the values of the primary key or unique key of the referenced table.
 

   
   
   
   
   
   select from where orderby groupby having
   select from where orderby limit
   select from join using
