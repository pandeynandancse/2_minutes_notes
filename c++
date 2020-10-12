C follows the top-down approach.
C++ follows the bottom-up approach.

 	C++ supports function overloading.
  In C++, you can use functions/constructors in structure/union.
  Operator overloading is possible in C++.
  
  C programs are divided into procedures and modules 	C++ programs are divided into functions and classes.
  C++ supports the feature of namespace.
  
  C++ provides exception handling using Try and Catch block.
  C++ supports inheritance.
  
  #include<iostream.h>   ---  cin ,cout
  #include <conio.h>    --- console input output   -- getch()
  
  
  endl -- newline
  
  
  
---------------------------------------------------------------------------------------------------------------  
Basic Data Type 	int, char, float, double, etc
Derived Data Type 	array, pointer, etc
Enumeration Data Type 	enum
User Defined Data Type 	structure



------------------------------------------------------------------------------------------------

keywords :(Not in c but in c++)
asm 	    dynamic_cast 	    namespace     	reinterpret_cast 	      bool

explicit 	      new 	        static_cast 	      false 	      catch

operator 	          template 	          friend          	private 	        class

this        	inline         	public       	throw         	const_cast

delete        	mutable 	    protected 	    true       	try



----------------------------------------------------------------------------------------------------


identifier(varable name) vs keywords


------------------------------------------------------------------
In C, we can assign the void pointer to any other pointer type without any typecasting, whereas in C++, 
we need to typecast when we assign the void pointer type to any other pointer type.


void pointer--->>

                                            #include <stdio.h>  
                                            int main()  
                                            {  
                                               void *ptr; // void pointer declaration  
                                               int *ptr1;  // integer pointer declaration  
                                               int a =90;  // integer variable initialization  
                                               ptr=&a; // storing the address of 'a' in ptr  
                                               ptr1=ptr; // assigning void pointer to integer pointer type.  
                                               printf("The value of *ptr1 : %d",*ptr1);  
                                               return 0;  
                                            }  
                                            
                                            
                                            
                                            
                     o/p =>> 90                       
                               
                               
                               
                               
                                            
                                            
                                              #include <iostream>  
                                              using namespace std;  
                                              int main()  
                                              {  
                                                void *ptr; // void pointer declaration  
                                                int *ptr1; // integer pointer declaration  
                                                int data=10; // integer variable initialization  
                                                ptr=&data;  // storing the address of data variable in void pointer variable  
                                                ptr1=(int *)ptr; // assigning void pointer to integer pointer  
                                                std::cout << "The value of *ptr1 is : " <<*ptr1<< std::endl;  
                                                return 0;  
                                              }  


        
                      o/p=>10





-----------------------------------------------------------------------------------------

c++ references:

                                      #include <iostream>  
                                      using namespace std;  
                                      int main()  
                                      {  
                                      int a=10;  
                                      int &value=a;  
                                      std::cout << value << std::endl;  
                                      return 0;  
                                      }                                    /// 10
                                      
                                      
                                      
                                  
                                  
                                  
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      #include <iostream>  
                                      using namespace std;  
                                      int main()  
                                      {  
                                      int a;  
                                      int &value=a;  
                                      value =10;  
                                      cout<< a;
                                      return 0;  
                                      }                                    /// 10
                                      
                                      
                       
                       
                       
                       
                       
                       
                       
                       
                       
                                Memory address:
                                        #include <iostream>  
                                        using namespace std;  
                                        void func(int &);  
                                        int main()  
                                        {  
                                          int i;  
                                          int &a=i;  
                                          std::cout << "The address of 'a' variable is : " <<&a<< std::endl;  
                                          std::cout << "The address of 'i' variable is : " <<&i<< std::endl;  
                                          return 0;  
                                        }  
                                       
                                       ////// both address will be same
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                     properties:
                          It must be initialized at the time of the declaration.
                          It cannot be reassigned means that the reference variable cannot be modified.
                          Function parameter:
                                   
                                   a)References can also be passed as a function parameter.
                                   It does not create a copy of the argument and behaves as an alias for a parameter. 
                                  
                                   In main-->>  swap(a,b);
                                      swap(&a,&b){body;}   ///// it will swap of main function's variable also.
                                    
                                    b) In main -->> swap(&a,&b);
                                       swap(*a,*b){body;}  /// it will swap
                                    
                                    c) In main -->> swap(a,b)
                                    swap(a,b){body;}   /// it will not swap
                                    
                                    
                                    
 --------------------------------------------------------------------------------------------------
 
 
 Reference vs pointer:
 a)  We cannot assign the NULL value to the reference variable, but the pointer variable can be assigned with a NULL value.
 
 b) Indirection :
        Pointers can have pointer to pointer offering more than one level of indirection.
       
           #include <iostream>  
           using namespace std;  
           int main()  
           {  
            int *p;  
            int a=8;  
            int **q;  
            p=&a;  
            q=&p;  
           std::cout << "The value of q is : " <<*q<< std::endl;  
           return 0;  
           }  
                                     
                                 
                                 
                      
                      
                      
               
               
               
           Reference to reference is not valid,
              #include <iostream>  
              using namespace std;  
              int main()  
              {  
                int a=8; // variable initialization  
               int &p=a; // creating a reference variable for ?a? variable.  
               int &&q=p;  // reference to reference is not valid, it throws an error.  
               return 0;  
              }  
                                     
                                       
                                    
 --------------------------------------------------------------------------------------------------
 
 Memory management:
 
 A new operator is used to create the object while a delete operator is used to delete the object.
                            a)   int *p;  
                                 p = new int;
                                 *p = 45;
                            
                            or
                            
                            b)  int *p = new int(45);  
                            
                            c) delete p;  
                            
                            d) create dynammic Array :
                                int *a1 = new int[8]; 
                                    
                            e)  delete[] a1
                            
                            or 
                               delete a1
                               
                               
                               
                             
    The following are the advantages of the new operator over malloc() function:
                  a) It does not use the sizeof() operator as it automatically computes the size of the data object.
                  b) It automatically returns the correct data type pointer, so it does not need to use the typecasting.
                  c) Like other operators, the new and delete operator can also be overloaded.
                  d) It also allows you to initialize the data object while creating the memory space for the object.

                           ------------------------------------------------------------------------------------------------
                           
                           
              malloc” or “memory allocation” method in C is used to dynamically allocate a single large block of memory with the specified size. 
              It returns a pointer of type void which can be cast into a pointer of any form. 
              It initializes each block with default garbage value.
              Eg. ptr = (int*) malloc(100 * sizeof(int));
              
              
              
              calloc” or “contiguous allocation” method in C is used to dynamically allocate the specified number of blocks of memory of the specified type.
              It initializes each block with a default value ‘0’.
              Eg. ptr = (float*) calloc(25, sizeof(float));

      
              “free” method in C is used to dynamically de-allocate the memory. 
              The memory allocated using functions malloc() and calloc() is not de-allocated on their own.
              Hence the free() method is used, whenever the dynamic memory allocation takes place. 
              It helps to reduce wastage of memory by freeing it.
              Eg. free(ptr);

 
 
            realloc” or “re-allocation” method in C is used to dynamically change the memory allocation of a previously allocated memory. 
            In other words, if the memory previously allocated with the help of malloc or calloc is insufficient, realloc can be used to dynamically re-allocate memory.
            Eg. ptr = realloc(ptr, newSize);

-----------------------------------------------------------------------------------------------
Object:
         In other words, object is an entity that has state and behavior. Here, state means data and behavior means functionality.
         Object is a runtime entity, it is created at runtime.
         Object is an instance of a class.
         
         
         

Constructor:
       constructor is a special method which is invoked automatically at the time of object creation
       Default and Parameterized constructor.
       
       
       
       
Destructors(~):
      A destructor works opposite to constructor; it destructs the objects of classes. 
      It can be defined only once in a class. Like constructors, it is invoked automatically.




                        #include <iostream>  
                       using namespace std;  
                       class Employee  
                        {  
                          public:  
                               Employee()    
                               {    
                                   cout<<"Constructor Invoked"<<endl;    
                               }    
                               ~Employee()    
                               {    
                                   cout<<"Destructor Invoked"<<endl;    
                               }  
                       };  
                       int main(void)   
                       {  
                           Employee e1; //creating an object of Employee   
                           Employee e2; //creating an object of Employee  
                           return 0;  
                       }  
                       
            
            
 --------------------------------------------------------------------------------------------------------------------------------
 class (usses new, reference type object) and strucutre(without new, value type  object) are same in c++ almost.
 We access data member of struct using pointer as shown : ptr->member i.e. (*ptr).member
 
 In the same way, object is variable of class and this is pointer of that variable. It means this stores the address of that object/variable.
 so, if we try to access the data member of class use ==>> this->member
 
 
 
 
 
 data memebers of each object is seperate while member function is shared by all objects
 show if they want to change their data member value they use this pointer for representing their own value;
 
 
 
 -------------------------------------------------------------------------------
 
 
 static :
      a)DATA MEMEBR:  If class's data member is static then it is shared by all of it's objects.
                      So no use of 'this' with static data member.
        
        
        
                      eg. class Account{
                                   static float rateOfInterest;   };

                          Account::rateOfInterest=9;       ////way of accessig static data member.Accessed by class name not by object.





  
      b)  Member functions:  Static member functions are allowed to access only the static data members 
                             or other static member functions, they can not access the non-static data members 
                             or member functions of the class.
                             
                             Invoked as ==>>> class_name::static_function()
                             
                             
                             
                             
                             
 ----------------------------------------------------------------------------------------------------------------
 
 
 
 this:(this is pointer of current object)
 
a) this is a reference variable that refers to the current object.
     use:
        a)this can be used to refer current class instance variable.====>>>parameters (formal arguments) and instance variables are same.
                                                       So, we are using this keyword to distinguish local variable and instance variable. 
        b)this can be used to invoke current class method (implicitly)(automatically done by compiler)
        
        c)this() can be used to invoke current class constructor. can be default or parameterized.
                               ===>>>Call to this() must be the first statement in constructor.
                               
        d)this can be passed as an argument in the method .==>> it means passing current object as parameter to function.
                       
                       
                       
   
   
 ----------------------------------------------------------------------------------------------------------
 structure vs class :
 a) in struct -->> If access specifier is not declared explicitly, then by default access specifier will be public. 
  in class -->> If access specifier is not declared explicitly, then by default access specifier will be private.
 
 b)  struct Rectangle rec;   declaring object/variable 
     
     By constructor -->>struct Rectangle rec=Rectangle(4,6);      
                        rec.areaOfRectangle();    
                        rec.length=6;
  
   
     
     
     For class -->Rectangle obj = new Rectangle(4,6)
                  obj.areaofRectangle();
                  obj.length=5;
 
 
 
 
 
 -------------------------------------------------------------------------------
 
 Structure/union in c does not have function/constructor/.
 But in c++ they exists.
 
 Structures can be  inherited and by default public but union can not.
 -------------------------------------------------------------------------------
 
 Enumeration:
              1) enum can have fields, constructors and methods.
              2) enum may implement many interfaces but cannot extend any class because it internally extends Enum class


 enum week { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday };  
 week day;
 day = Wedenesay;
 print(day)     ///2
       
 ---------------------------------------------------------------------------------------------------
 
 Friend:
 
       1) Friend function/class:
                     If a function/class is declared as a friend function/class in some class, then the protected and 
                     private data of that class can be accessed using the function/class.
                     
                     For accessing the data, the declaration of a friend function/class should be done inside 
                     the body of a class starting with the keyword friend.
                     
                      An ordinary function that is not the member function of a class has no privilege to access the 
                      private data members, but the friend function does have the capability to access any private data members.
                     
                       
                      
                      
                      a) Friend function:
                                 It can be invoked like a normal function without using the object.
                                 because it is not in scope of class sot cannot be accesed by object.
                                 
                                 If friend function wants to acccess class member then it should have class's object as function paramaeter and that object access respective class object
                                 using an object name and dot membership operator with the member name.
                                 
                                 Friend function is defined without class name and scope operator.
                         
                                 A friend function can also be used for function overloading.
                                 
                                 
                     b) Friend class : 
                                 If friend class wants to acccess class member then it should have class's object as function paramaeter and that object access respective class's data member
                                 using an object name and dot membership operator with the member name.
 
 
 
 ---------------------------------------------------------------------------------------------------------


                                                  Inheritance:
                                                  
1) The private members of the base class are never inherited    

1b) By default inheritance of class  is private.

1c) By default inheritance of struct  is public.

1d) union and enum can not be inherited.

2) 5 types supported in c++:

    Single inheritance
    Multiple inheritance(Diamond case)(many parents one child)
    Hierarchical inheritance(one parent many child)
    Multilevel inheritance
    Hybrid inheritance



  3)                             class derived_class_name :: visibility-mode base_class_name  
                               {  
                                   // body of the derived class.  
                               }  
                               
                               
                               
    visibility mode: The visibility mode specifies whether the features of the base class are publicly inherited or
                     privately inherited. It can be public or private.
                     By default private.
                     
                     
    4) Visibility modes:
     
     
             Public: When the member is declared as public, it is accessible to all the functions of the program.
             Private: When the member is declared as private, it is accessible within the class only.
             Protected: When the member is declared as protected, it is accessible within its own class as well as the class immediately derived from it.



   5)
   Visibility of Inherited Members
                                         Base class visibility 	                      Derived class visibility
                                                                                   Public     	   Private        	Protected
                                                Private 	                      Not Inherited 	Not Inherited 	   Not Inherited
                                                Protected                         	Protected 	   Private 	        Protected
                                                Public 	                             Public 	    Private       	  Protected
                                                
                                                
                                                
   6) Ambiguity in Multiple inheritance:
                  i)  When more than one parent class has same function name then their ambiguity takes place i their child class.
                  
                  
                                     class base1
                                         {
                                           public:
                                              void someFunction( )
                                              { .... ... .... }  
                                         };
                                         class base2
                                         {
                                             void someFunction( )
                                              { .... ... .... } 
                                         };
                                         class derived : public base1, public base2
                                         {
                                            someFunction();
                                         };

                                         int main()
                                         {
                                             derived obj;
                                             obj.someFunction() // Error!  
                                         }




      TO SOLVE  THIS USE AS FOLLOWING:
      
      
                                         class derived : public base1, public base2
                                         {
                                                 .base1::someFunction( );  
                                                  base2::someFunction();
                                         };



      
                                         int main()
                                               {  derived obj;
                                                   obj.base1::someFunction( );  // Function of base1 class is called
                                                   obj.base2::someFunction();   // Function of base2 class is called.
                                               }
                  
                  
                  
        7) AMBIGUITY IN SINGLE INHERITANCE:
                    When base class' function and derived class' function is totally same i.e. no. of argument and 
                    argument type and return type same then that function is overrided that means base class' function is ignored in derived class.
                         This is called function overriding.
                         
     ----------------------------------------------------------------------------------------------------------------------
     
     
     Aggregation:(HAS-A relationship):
     
     ===>>>>  example of aggregation where Employee class has the reference of Address class as data member. 
     
                                    #include <iostream>  
                                        using namespace std;  
                                        class Address {  
                                            public:  
                                           string addressLine, city, state;    
                                             Address(string addressLine, string city, string state)    
                                            {    
                                                this->addressLine = addressLine;    
                                                this->city = city;    
                                                this->state = state;    
                                            }    
                                        };  
                                        class Employee    
                                            {    
                                                private:  
                                                Address* address;  //Employee HAS-A Address   
                                                public:  
                                                int id;    
                                                string name;    
                                                Employee(int id, string name, Address* address)    
                                               {    
                                                   this->id = id;    
                                                   this->name = name;    
                                                   this->address = address;    
                                               }    
                                             void display()    
                                               {    
                                                   cout<<id <<" "<<name<< " "<<     
                                                     address->addressLine<< " "<< address->city<< " "<<address->state<<endl;    
                                               }    
                                           };   
                                        int main(void) {  
                                            Address a1= Address("C-146, Sec-15","Noida","UP");    
                                            Employee e1 = Employee(101,"Nakul",&a1);    
                                                    e1.display();   
                                           return 0;  
                                        }  

     //////101 Nakul C-146, Sec-15 Noida UP

     --------------------------------------------------------------------------------------------------------------------------
     
     
     
     Polymorphism : 
           
              A lady behaves like a teacher in a classroom, mother or daughter in a home and customer in a market. 
              Here, a single person is behaving differently according to the situations.
     
     
     
     Compile Time (overloading , Static or early binding): Function overloading and operator overloading.
     
     Run time(overriding, Dynamic or late binding)  : Virtual Function , Method Overriding, And pointer.
     
     
     
     Overloading is a compile time polymorphism where more than one method is having the same name
     but with the different number of parameters or the type of the parameters.
     
     Overriding is a run time polymorphism where more than one method is having the same name,
     number of parameters and the type of the parameters.
     
     
     
     
     
     
     
     
     
                          a)  // pointers to base class
                                    #include <iostream>
                                    using namespace std;

                                    class Polygon {
                                      protected:
                                        int width, height;
                                      public:
                                        void set_values (int a, int b)
                                          { width=a; height=b; }
                                    };

                                    class Rectangle: public Polygon {
                                      public:
                                        int area()
                                          { return width*height; }
                                    };

                                    class Triangle: public Polygon {
                                      public:
                                        int area()
                                          { return width*height/2; }
                                    };

                                    int main () {
                                      Rectangle rect;
                                      Triangle trgl;
                                      Polygon * ppoly1 = &rect;   // upcasting
                                      Polygon * ppoly2 = &trgl;
                                      ppoly1->set_values (4,5);
                                      ppoly2->set_values (4,5);
                                      cout << rect.area() << '\n';
                                      cout << trgl.area() << '\n';
                                      return 0;
                                    }
     
                       //  output 20 10
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                                       #include <iostream>    
                                         using namespace std;    
                                         class Shape {                                        //  base class  
                                             public:    
                                         virtual void draw(){                             // virtual function  
                                         cout<<"drawing..."<<endl;      
                                             }        
                                         };     
                                         class Rectangle: public Shape                  //  inheriting Shape class.  
                                         {      
                                          public:    
                                          void draw()      
                                            {      
                                                cout<<"drawing rectangle..."<<endl;      
                                             }      
                                         };    
                                         class Circle: public Shape                        //  inheriting Shape class.  

                                         {      
                                          public:    
                                          void draw()      
                                            {      
                                               cout<<"drawing circle..."<<endl;      
                                            }      
                                             void draw2()      
                                            {      
                                               cout<<"drawing circle2..."<<endl;      
                                            }      
                                         };    
                                         int main(void) {    
                                             Shape *s;                               //  base class pointer.  
                                             Shape sh;                               // base class object.  
                                                Rectangle rec;    
                                                 Circle cir;    
                                               s=&sh;    
                                              s->draw();     
                                                 s=&rec;    
                                              s->draw();      
                                             s=&cir;
                                             s->draw();  
                                             
                                             s->draw2();      ////// ERROR IS THROWN AS IT IS NOT DEFINED IN BASE CLASS OF s.
                                         }    
 
 
                               ///  output:  drawing...
                                            drawing rectangle...
                                            drawing circle...
                                            
                                      
                                      
                                      
                                      
                                      
                                      
                                  NOTE:: IF virtual keyword is not written then output of program will be 
                                                             drawing......
                                                             drawing.......
                                                             drawing.......
                                            
            
            
            
            
            
                                            
                                            
      DOWNCASTING :  . It converts base class pointer to derived class pointer.
                                        
                                     eg. Employee is base class and manager is derived from employee. 
                                          //pointer to base class object
                                          Employee* emp;
                                          //object of derived class
                                          Manager m1("Steve", "Kent", 3000, 0.2);
                                          //implicit upcasting
                                          emp = &m1;
                                          //explicit downcasting from Employee to Manager
                                          Manager* m2 = (Manager*)(emp);
                      
                   
    DOWNCASTING IS NOT SAFE AS UPCASTING.
    
    
A class that declares or inherits a virtual function is called a polymorphic class
    
    
----------------------------------------------------------------------------------------------------------------------


Function overloading:


                    a) Causes of Function Overloading:
                         Type Conversion.
                         Function with default arguments.
                         Function with pass by reference.

        
            i) Type conversion : 
                              
                                      #include<iostream>  
                                     using namespace std;  
                                     void fun(int);  
                                     void fun(float);  
                                     void fun(int i)  
                                     {  
                                         std::cout << "Value of i is : " <<i<< std::endl;  
                                     }  
                                     void fun(float j)  
                                     {  
                                         std::cout << "Value of j is : " <<j<< std::endl;  
                                     }  
                                     int main()  
                                     {  
                                         fun(12);  
                                         fun(1.2);  
                                         return 0;  
                                     }  
                             
         
                  fun(12) is ok.
                  BUT fun(1.2) creates ambiguity because any floating point number is considered as double in c++ .
                  so 1.2 is considered as double .
                  If we replace  from float to double then there is no ambiguity and code works.
                  
                  
                  
                  
                  ii)Function with default arguments.
                  
                                   #include<iostream>  
                                   using namespace std;  
                                   void fun(int);  
                                   void fun(int,int);  
                                   void fun(int i)  
                                   {  
                                       std::cout << "Value of i is : " <<i<< std::endl;  
                                   }  
                                   void fun(int a,int b=9)  
                                   {  
                                       std::cout << "Value of a is : " <<a<< std::endl;  
                                       std::cout << "Value of b is : " <<b<< std::endl;  
                                   }  
                                   int main()  
                                   {  
                                       fun(12);  

                                       return 0;  
                                   }  
                                   
                                   
                                   Here is ambiguity.
                                   
                              
                      iii) Function with pass by reference.
                      
                                  #include <iostream>  
                                 using namespace std;  
                                 void fun(int);  
                                 void fun(int &);   
                                 int main()  
                                 {  
                                 int a=10;  
                                 fun(a); // error, which f()?  
                                 return 0;  
                                 }  
                                 void fun(int x)  
                                 {  
                                 std::cout << "Value of x is : " <<x<< std::endl;  
                                 }  
                                 void fun(int &b)  
                                 {  
                                 std::cout << "Value of b is : " <<b<< std::endl;  
                                 }  
                                   
                  
                  
----------------------------------------------------------------------------------------------------------------------

Opereator overloading:
(WE use operator overloading because we can do arithmatic operation on primitive data types such as int,float etc.. 
but not for user definde type. So defining operators on user defined data types is called operator overloading)

                  a) Operators that cannot be overloaded:
                           
                                          Scope operator (::)
                                          Sizeof
                                          member selector(.)
                                          member pointer selector(*)
                                          ternary operator(?:)

                 




                  b) Operators that can not overloaded by friend function.
                                         = 
                                         []
                                         ()
                                         ->
                                         
                   
                 c)    Defining operator overloading function(if member function)
                             
                                   i) IF overloading unary operator 
                                               return_type class_name  :: operator op()  
                                                    {  
                                                       // body of the function.  
                                                    }  
            
                                      
                                  ii) If overloading binary operator
                                                 return_type class_name  :: operator op(class_name obj)  
                                                    {  
                                                       // body of the function.  
                                                    }  
                                                  
  
                      Calling the operator overload function:
                                i) class_name obj;
                                   obj op;   (or op obj;)             //calling  //// this statement is treated as obj.operator()

        
                                ii) class_name obj1;obj2;
                                    obj1 op obj2             //// calling  ///// this statement is treated as obj1.operator(obj2)





                   e)  Defining operator overloading function(if friend function in class)
                             
                                   i) IF overloading unary operator 
                                               return_type operator op(class_name obj)  
                                                    {  
                                                       // body of the function.  
                                                    }  
            
                                      
                                  ii) If overloading binary operator
                                                 return_type operator op(class_name obj1, class_name obj2)  
                                                    {  
                                                       // body of the function.  
                                                    }  
                                                  
  
                      Calling the operator overload function:
                                i) class_name obj;
                                   obj op;   (or op obj;)             //calling  //// this statement is treated as operator(obj)

        
                                ii) class_name obj1;obj2;
                                    obj1 op obj2             //// calling  ///// this statement is treated as operator(obj1,obj2)






                 f)  When unary operators are overloaded through a member function take no explicit arguments, 
                     but, if they are overloaded by a friend function, takes one argument.
                 
                     When binary operators are overloaded through a member function takes one explicit argument, 
                     and if they are overloaded through a friend function takes two explicit arguments. 
                     
                     
    
       
                               
                 g)                    #include <iostream>  
                                       using namespace std;  
                                       class A  
                                       {  

                                           int x;  
                                             public:  
                                             A(){}  
                                           A(int i)  
                                           {  
                                              x=i;  
                                           }  
                                           void operator+(A);  /// binary operator overloading so required one argument                                           
                                           void display();  
                                       };  

                                       void A :: operator+(A a)  
                                       {  

                                           int m = x+a.x;  
                                           cout<<"The result of the addition of two objects is : "<<m;  

                                       }  
                                       int main()  
                                       {  
                                           A a1(5);  
                                           A a2(4);  
                                           a1+a2;  
                                           return 0;  
                                       }                     /////// output 9 

    
                              
                              
                              
                      h)  
                                #include <iostream>    
                                 using namespace std;    
                                 class Test    
                                 {    
                                    private:    
                                       int num;    
                                    public:    
                                        Test(): num(8){}    
                                        void operator ++()         {     
                                           num = num+2;     
                                        }    
                                        void Print() {     
                                            cout<<"The Count is: "<<num;     
                                        }    
                                 };    
                                 int main()    
                                 {    
                                     Test tt;    
                                     ++tt;  // calling of a function "void operator ++()"    
                                     tt.Print();    
                                     return 0;    
                                 }                      ///// output 10
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                      
                      
                      
                      
 ----------------------------------------------------------------------------------------------------------------------------
 Abstract class and pure virtual function:
 
                     a) An Abstract class is a class that has at least one pure virtual function.
                     b) A pure virtual function is a function without definition. 
                                           virtual return-type function-name(parameter-list) = 0;
                     c) You cannot create an object of the abstract class, 
                        but you can still use pointers of a base class to point an objects of the derived class.
                        
                        
                     d) C++ provides possibility to create pure virtual destructors.
                        Pure virtual destructor also makes a class an abstract class,
                        but there is a difference between pure virtual function and pure virtual destructor. 
                        Pure virtual destructor must be implemented:
               
                                                                  class A
                                                                 {
                                                                      public:
                                                                       virtual ~A() = 0;
                                                                 };

                                                                 A::~A()
                                                                 {
                                                                      cout << "Base class destrctor" << endl;
                                                                 }
                                                                 
                        But pure virtual function is not implemented.
                     
                     
                     
                   e) Pure Virtual Function with Function Body : 
                                    class Base
                                            {
                                                int x;
                                            public:
                                                 virtual void fun() = 0
                                             {
                                              cout<<"Base Class fun() is Called";
                                             }
                                                 int getX() 
                                             { 
                                              return x; 
                                             }
                                            };

                                            class Derived: public Base
                                            {
                                                 int y;
                                            public:
                                                 void fun() 
                                             { 
                                              cout << "Derived Class fun() called"; 
                                             }
                                            };

                                            int main(void)
                                            {
                                                 Derived d;
                                                 d.fun();
                                             
                                                          //Calling Base Class Pure Virtual Function fun()
                                                          Base::fun();
                                                 return 0;
                                            }
 
 
 
 ---------------------------------------------------------------------------------------------------------------------
 
a) destructor can not be overloaded , constructor can be overloaded
b) Virtual functions cannot be static members.
c) Constructors and destructor cannot be declared with the keyword virtual.
d) Destructor can be pure virtual also but then destructor have to be implemented also.
e) Constructors and destructors cannot be declared static, const, or volatile.
f) Derived classes do not inherit or overload constructors or destructors from their base classes, 
   but they do call the constructor and destructor of base classes.


g) Constructor can be defined in private section of class.
   Use of Friend Class in this case is important ==>> If we want that class/class_member should not be instantiated by anyone else but only by a friend class. 


h) normal non member unction can not access class' private/protected member from outside class but friend function ,that is not a memebr of class,can access from outside class 
   by passing that class' object as function parameter.
[friend function/class can acccess private data]
 ------------------------------------------------------------------------------------------------------------------------
 
 
 Data Abstraction : 
 
 a) Data Abstraction is a process of providing only the essential details to the outside world and hiding the internal details,
    i.e., representing only the essential details in the program.
    
    
 METHODS OF ACHIEVING DATA ABSTRACTION:
 i) Abstraction using classes: An abstraction can be achieved using classes. 
                               A class has the responsibility to determine which data member is to
                               be visible outside and which is not.For this it uses private , protected and public specifier.
                               A class communicates with the outer world by using public data member functions.
                               These member functions are often called interface of a class.
                               

ii) Abstraction in header files: An another type of abstraction is header file. 
                                 For example, pow() function available is used to calculate the power of a number without 
                                 actually knowing which algorithm function uses to calculate the power. 
                                 Thus, we can say that header files hides all the implementation details from the user.
 
 
 ------------------------------------------------------------------------------------------------------------------------
 
 Namespaces:
 
   1) Properties of namespace:
                     Namespace declarations appear only at global scope.
                     Namespace declarations can be nested within another namespace.
                     Namespace declarations don’t have access specifiers. (Public or private)
                     No need to give semicolon after the closing brace of definition of namespace.

 
 
   2) Why use namespaces?
   Ans: a) Namespaces in C++ are used to organize too many classes so that it can be easy to handle the application.
      
        b) There cannot be two variables with the same name in the same scope. 
           Using namespaces, we can create two variables or member functions having the same name.
   
      
        c) EXTENSION OF PART b) -->>> You have two friends with the same name – Bill. When you speak with somebody about Bill,
        you have to specify some additional information that which Bill you are talking about.
        It can be his address or first name. 
        
        The same thing happens when you are using different libraries that
        have the same identifiers for different object. You have to tell to compiler additional information about 
        which object is used. In this case, you have to use the object’s namespace.
        
        
        
        
        eg) Why namespace???
                         // A program to demonstrate need of namespace 
                                     int main() 
                                     { 
                                      int value; 
                                      value = 0; 
                                      double value; // Error here 
                                      value = 0.0; 
                                     } 

                   In each scope, a name can only represent one entity. 
                   So, there cannot be two variables with the same name in the same scope. 
                   Using namespaces, we can create two variables or member functions having the same name.
        
        
        
        
        
        
        eg)                         #include <iostream>  
                                    using namespace std;  
                                    namespace First {    
                                        void sayHello() {   
                                            cout<<"Hello First Namespace"<<endl;          
                                        }    
                                    }    
                                    namespace Second  {    
                                           void sayHello() {   
                                               cout<<"Hello Second Namespace"<<endl;   
                                           }    
                                    }   
                                    
                                   
                                    int main()  
                                    {  
                                     First::sayHello();  
                                     Second::sayHello();  
                                    return 0;  
                                    }  
                                    
                                    ////// output --> Hello First Namespace
                                                      Hello Second Namespace
   
   
   
   
   
                  
                     eg) using namespace-----
                     
                     
                                               #include <iostream>  
                                           using namespace std;  
                                           namespace First{  
                                              void sayHello(){  
                                                 cout << "Hello First Namespace" << endl;  
                                              }  
                                           }  
                                           namespace Second{  
                                              void sayHello(){  
                                                 cout << "Hello Second Namespace" << endl;  
                                              }  
                                           }  
                                           using namespace First;  
                                           int main () {  
                                              sayHello();  
                                              return 0;  
                                           }  

                                       Output:
                                       Hello First Namespace	

                   
                         
                               NOTE: if we used using namespace for First and Second both then above code will throw an error.
                               
                               
                               
                               
                               
                       eg) Same name space at multiple places:(All are appended in one namespace automatically)
                       
                       
                                                      namespace myFirstNamespace
                                                           {
                                                            void foo()
                                                            {
                                                             cout << "foo from myFirstNamespace is called" << endl;
                                                            }
                                                           }
                                                           namespace mySecondNamespace
                                                           {
                                                            void foo()
                                                            {
                                                             cout << "foo from mySecondNamespace is called" << endl;
                                                            }
                                                           }
                                                           namespace myFirstNamespace
                                                           {
                                                            int x = 10;
                                                           }
                                                           int main()
                                                           {
                                                            myFirstNamespace::foo();
                                                            cout << "X = " << myFirstNamespace::x << endl;
                                                            cout << "Y = " << myFirstNamespace::y << endl;
                                                            return 0;
                                                           }
                                                           namespace myFirstNamespace
                                                           {
                                                            double y = 3.14;
                                                           }
 
 
 
 
                          eg) declaration of class inside namespace but definition outside--------
 
                                     // A C++ program to demonstrate use of class 
                                    // in a namespace 
                                    #include <iostream> 
                                    using namespace std; 

                                    namespace ns 
                                    { 
                                     // Only declaring class here 
                                     class geek; 
                                    } 

                                    // Defining class outside 
                                    class ns::geek 
                                    { 
                                    public: 
                                     void display() 
                                     { 
                                      cout << "ns geek display()\n"; 
                                     } 
                                    }; 

                                    int main() 
                                    { 
                                     //Creating Object of geek Class 
                                     ns::geek obj; 
                                     obj.display(); 
                                     return 0; 
                                    } 




                      eg) Define method outside namespace also:
            
                                    #include <iostream> 
                                    using namespace std; 

                                    namespace ns 
                                    { 
                                     void display(); 
                                     class geek 
                                     { 
                                     public: 
                                     void display(); 
                                     }; 
                                    } 

                                    // Defining methods of namespace 
                                    void ns::geek::display() 
                                    { 
                                     cout << "ns::geek::display()\n"; 
                                    } 
                                    void ns::display() 
                                    { 
                                     cout << "ns::display()\n"; 
                                    } 

                                    // Driver code 
                                    int main() 
                                    { 
                                     ns::geek obj; 
                                     ns::display(); 
                                     obj.display(); 
                                     return 0; 
                                    } 




                           eg) nested namespace:
                            
                                  namespace X
                                  {
                                   void foo()
                                   {
                                    cout << "foo from X is called" << endl;
                                   }
                                   namespace Y
                                   {
                                    void foo()
                                    {
                                     cout << "foo from Y is called" << endl;
                                    }
                                   }
                                  }
                                     
                                     
                                     
                                  X::Y::foo(); ////// "foo from Y is called" 
                                  
                                  
                                  
                                  
                               NOTE : namespace can be aliased as follows;

                                                                namespace XY = X::Y;
                                                                XY::foo(); ///// ////// "foo from Y is called" 
                                                                
                                                                
                                                                
                                                                
       
       
       
 ----------------------------------------------------------------------------------------------------------------------------
 
 Exception Handling :
       a)  Exception Handling in C++ is a process to handle runtime errors.
       We perform exception handling so the normal flow of the application can be maintained even after runtime errors.
       
       b)  All exceptions are derived from std::exception class.
       
       
       
       c) try - throw -catch ==>>>> whatever is thrown by try block is taken by catch and thus program does not terminate evenif error occurs.
                             
          
       
       eg.
                    #include <iostream>  
                    using namespace std;  
                    float division(int x, int y) {  
                       if( y == 0 ) {  
                          throw "Attempted to divide by zero!";  
                       }  
                       return (x/y);  
                    }  
                    int main () {  
                       int i = 25;  
                       int j = 0;  
                       float k = 0;  
                       try {  
                          k = division(i, j);  
                          cout << k << endl;  
                       }catch (const char* e) {  
                          cerr << e << endl;  
                       }  
                       return 0;  
                    }  

                Output:

                Attempted to divide by zero!

 
eg.USer defined exception -> it is done by inheriting exception class and overiding what() function.


                class ZeroDivisionException :public exception
                {
                public:
                 ZeroDivisionException(int data)
                 {
                  someData = data;
                 }
                 //override what function
                 const char* what()
                 {
                  return "Zero division error";
                 }
                 int someData;
                };
                
                
                
                
                double divide(double a, double b)
                {
                 if (b == 0) //division by zero!!!!
                  throw ZeroDivisionException(a);
                 else
                  return a/b;
                }


  
  
  
                  int main()
                  {
                  try
                     {
                      double res = divide(1, 0);
                     }
                 catch (ZeroDivisionException e)
                     {
                      cout << e.what() << endl;
                      cout << "Trying to divide " << e.someData << " by zero" << endl;
                      }
                  }



----------------------------------------------------------------------------------------------------------------------------

Why Inline Function????
 
 An inline function is a function in which body is inserted in the place of its call. 
 These functions can be compared with Macros. 
 Inline functions are used to improve performance of the application. 
 However, many inline functions can lead your program to grow up in size. 
 That is why often only small functions are declared as inline.
 
 
  Use inline keyword with definition of function. 
  In this case, you have to declare function in the same way as you declare a simple function:
 
 
 eg.
     //declaration of an inline function
      class Person
      {
             string getLastName();
      }



    //// defining inline function
         //getLastName is in the same header file with declaration of
       //Person class
       inline string Person::getLastName()
       {
        return lastName;
       }


----------------------------------------------------------------------------------------------------------------------------


Mutable and Volatile

--------------------------------------------------------------------------------------------------------------------------------


Copy constructor:  
                   1) As we copy int value by assignment operator--
                                        int a =5;
                                        int b= a;  /// copied 

      
                   2) we copy string as follows:
                                  string s1 = "nandan";
                                  string s2;
                                  strcpy(s2,s1) /////string copied into s2 from s1
                                  
                                  
                                  
                   3) So how to copy object values to another object----
                             Here comes concept of copy constructor.




-----------------------------------------------------------------------------------------------------------------------------------

Array in c++:
     a) declaring array => int arr[2][2];  // declaration only
     b) dynammic array => int *arr = new int[2][2];
     c) default initializing array => double balance[5] = {1000.0, 2.0, 3.4, 17.0, 50.0};  //declaration and initializatoin at same time.
                            or 
                             double balance[] = {1000.0, 2.0, 3.4, 17.0, 50.0};
     
     d) for loop using initialization:
     
     e) passing array to function :
           void myFunction(int *param) {
                .
                .
                .
             }

          Way-2

             Formal parameters as a sized array as follows −

             void myFunction(int param[10]) {
                .
                .
                .
             }

           Way-3

             Formal parameters as an unsized array as follows −

             void myFunction(int param[]) {
                .
                .
                .
             }

     
     
      f) Returning array from function: ( C++ does not advocate to return the address of a local variable to outside of the
                                          function so you would have to define the local variable as static variable.)
      
              
              
                         int * getRandom( ) {
                              static int  r[10];

                              // set the seed
                              srand( (unsigned)time( NULL ) );

                              for (int i = 0; i < 10; ++i) {
                                 r[i] = rand();
                                 cout << r[i] << endl;
                              }

                              return r;
                           }

                           // main function to call above defined function.
                           int main () {

                              // a pointer to an int.
                              int *p;

                              p = getRandom();

                              for ( int i = 0; i < 10; i++ ) {
                                 cout << "*(p + " << i << ") : ";
                                 cout << *(p + i) << endl;
                              }

                              return 0;
                           }
     



--------------------------------------------------------------------------------------------------------------------------

when you

#include <cs50.h>
the compiler looks for cs50.h in a standard list of system directories (e.g., /usr/include/).

on the other hand, when you

#include "cs50.h"
the compiler looks for cs50.h first in the same directory as the directory of the current source code file,
then a list of directories that is often referred to as quote directories, and lastly the same directories as #include <cs50.h>
