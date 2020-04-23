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
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                     properties:
                          It must be initialized at the time of the declaration.
                          It cannot be reassigned means that the reference variable cannot be modified.
                          Function parameter:
                                   a) In main-->>  swap(a,b);
                                      swap(&a,&b){body;}   ///// it will swap of main function's variable also.
                                    
                                    b) In main -->> swap(&a,&b);
                                       swap(*a,*b){body;}  /// it will swap
                                    
                                    c) In main -->> swap(a,b)
                                    swap(a,b){body;}   /// it will not swap
                                    
                                    
                                    
 --------------------------------------------------------------------------------------------------
 
 
 
 
 
                                     
                                     
                                       
                                    
                                    
                                    
                                    
                                    


