C follows the top-down approach.
C++ follows the bottom-up approach.

 	C++ supports function overloading.
  In C++, you can use functions in structure.
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
 
 Structure in c does not have function/constructor/.
 But in c++ they exists.
 
 -------------------------------------------------------------------------------
 
 
       
       
       
 
