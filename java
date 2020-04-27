a) Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) .

b) Green team -> green talk-> oak tree ->java


c) Java is an island of Indonesia where the first coffee was produced (called java coffee). 
It is a kind of espresso bean. Java name was chosen by James Gosling while having coffee near his office.


d) According to Sun, Java language is a simple programming language because:

                Java syntax is based on C++ (so easier for programmers to learn it after C++).
                Java has removed many complicated and rarely-used features, for example, explicit pointers, operator overloading, etc.
                There is no need to remove unreferenced objects because there is an Automatic Garbage Collection in Java.
                java uses compiler at compile time and interpreter at run time.

e) JAVA IS PORTABLE : Java code(.java) is compiled by the compiler and converted into bytecode(.class).
   This bytecode is a platform-independent code because it can be run on multiple platforms, i.e., Write Once and Run Anywhere(WORA).


f) Java is architecture neutral.
In C programming, int data type occupies 2 bytes of memory for 32-bit architecture and 4 bytes of memory for 64-bit architecture. 
However, it occupies 4 bytes of memory for both 32 and 64-bit architectures in Java.



g) To compile:	javac Simple.java
   To execute:	java Simple
   
   
   
   
h)                                        Valid java main method signature(final, public,static , void main())

    public static void main(String[] args)  
    public static void main(String []args)  
    public static void main(String args[])  
    public static void main(String... args)  
    static public void main(String[] args)  
    public static final void main(String[] args)  
    final public static void main(String[] args)  
    final strictfp public static void main(String[] args)  

                                      Invalid java main method signature(abstract cannot be used and void cannot be displaced)

    public void main(String[] args)  
    static void main(String[] args)  
    public void static main(String[] args)  
    abstract public static void main(String[] args)     
   
   
   
   
   
 i)  Internal detail of java program---
                        i)  At compile time, java file(.java) is compiled by Java Compiler (It does not interact with OS) and 
                            converts the java code into bytecode(.class)
   
                        ii) At runtime: class file->class loader->bytecode veririfed -> interpreter -> Runtime ->Hardware.
                        
                        
                        
                        
                        
 j)  Can you save a java source file by other name than the class name i.e. Simple?
      Answer: Yes, if class is not public.
      Explanation:   Save As-> Hard.java , it works, but when it is passed through compiler (.class file) is made of class name, not of source file name given by us.
                                  
          To compile:	javac Hard.java
          To execute:	java Simple              
                        
   
   
   
   
  k) Can you have multiple classes in a java source file?
      Answer: Yes, each class corresponds to .class file when source file is passed from compiler.
      Explanation:
          class A{}                                                                     A.class
          class B{}      saved them as D.java       passed through compiler          B.class
          class C{}                                                                     C.class
   
   
   
   
   
   l) JVM -->> Java virtual Machine  -->> Does not physically exists--->>provides a runtime environment in which Java bytecode can be executed. 
          --->>  It can also run those programs which are written in other languages and compiled to Java bytecode. 
          -->> The JVM performs the following main tasks:

                                                Loads code
                                                Verifies code
                                                Executes code
                                                Provides runtime environment





      JRE -->> also written as Java RTE -->> java runtime enviroment
          -->>It is the implementation of JVM.  -->>physically exists
          -->> It contains a set of libraries + other files that JVM uses at runtime.
          --->> contains jvm + set of libraries



      JDK -->>Java Development Kit
          -->> It physically exists.
          -->> It contains JRE + development tools. 
          -->>Development tools : interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc) etc...
          
          
       
       
       
    NOTE : JVM,JRE and JDK all are platform dependent but JAVA not.
          
          
   m) JNI : Java Native Interface (JNI) is a framework which provides an interface to communicate with another application 
            written in another language like C, C++, Assembly etc. Java uses JNI framework to send output to the Console or 
            interact with OS libraries.
   
   
   
   
   
   n) Types of variables in  java:
                  i) local(cannot be static)  --->> inside function of classs
                     instance   -->> inside class out side function  --> not sharable among objects (if static is not applied)
                     static   --->> instance with static so  sharable with other objects
                  
                  ii) Widening 
                               int a=10;  
                               float f=a;  
                  
                      Narrowing
                               float f=10.5f;  
                                //int a=f;        //Compile time error  
                                int a=(int)f;  
                  
                  
                  
                  
                  
                  
            
            
            
     o) Data types:
                         c(32-bit)(64bit)           c++(32-bit)(64bit)        java(does not matter) 
      
      boolean                1 byte                1 byte                      1-bit
      
      byte                                                                       1
      
      char                    1(1)                   1 (1)                         2
      
      short                  2(2)                    2(2)                          2
       
      int                    2(4)                  2(4)                           4
      
      long                                                                        8
      
      float                  4(4)                    4(4)                          4
      
      double                 8 (8)                   8 (8)                         8
      
      
      
      
      Question: Why char uses 2 byte in java and what is \u0000 ?
                
      Answer:   It is because java uses Unicode system not ASCII code system and In unicode, character holds 2 byte.
                \u0000 is the lowest range of Unicode system. 
                \uFFFF is highest value
      
      
      
      
      
   ---------------------------------------------------------------------------------------------------------------------------
   
   
   Operator:
   
   
   1) Unary :
          
          int x=10;  
		      System.out.println(x++ + ++x + x++ + ++x + x-- + --x + --x +--x);    ////// output 95
          
          
     
     
   2) Left shift operator(<<n) ==>> left shift bits n no. of times 
                                      System.out.println(10<<2);   //10*2^2=10*4=40  
                         
                         
                         
                                      
    3) Right shift operator(>>n) ==>> right shift bits n no. of times 
                                      System.out.println(20>>3);  //20/2^3=20/8=2  
      
    
    
    
    4) For positive number, >> and >>> works same  
       For negative number, >>> changes parity bit (MSB) to 0
       
       
       
       
    5) The logical && operator doesn't check second condition if first condition is false. 
       It checks second condition only if first one is true.

       The bitwise & operator always checks both conditions whether first condition is true or false.   
       
       
       
    
    6) The logical || operator doesn't check second condition if first condition is true. 
       It checks second condition only if first one is false.

       The bitwise | operator always checks both conditions whether first condition is true or false.
       
       
       
       eg. 
          int a=10;  
          int b=5;  
          int c=20;  

          System.out.println(a>b||a++<c);//true || true = true  
          System.out.println(a);//10 because second condition is not checked  
          System.out.println(a>b|a++<c);//true | true = true  
          System.out.println(a);//11 because second condition is checked  
       
       
       
---------------------------------------------------------------------------------------------------------------------------------

Question :  What is the difference between an object-oriented programming language and object-based programming language?
Answer: Object-based programming language follows all the features of OOPs except Inheritance. 
        c++, python, java is object oriented programming language
        Javascript and VBscript is object based proggramming language.
   
--------------------------------------------------------------------------------------------------------------------------------


Class in java:
1) A class in Java can contain:
                          Fields
                          Methods
                          Constructors
                          Blocks
                          Nested class and interface
                          
                          
                          
                          
                          
                          
 2) There are 3 ways to initialize object in Java.

                              By reference variable
                              By method (use this keyword -->> if instance variable and local variable are of same name)
                              By constructor
                              
                              
                              
  3) class Student
        {
            char[] name;
            int age;
        }

     Student s1 = new Student("nandan",22),s2 = new Student('Pandey',23)
->>> s1, s2 are reference variables allocated in stack memory.
     name and age for s1 are objects alloated in heap memory.
     name and age for s2 are objects alloated in heap memory.
     
  
  
  
  
  4) There are many ways to create an object in java. They are:

                    By new keyword
                    By newInstance() method
                    By clone() method
                    By deserialization
                    By factory method etc.

     


---------------------------------------------------------------------------------------------------------------------------
Constructor--

  1) A Java constructor cannot be abstract, static, final, and synchronized.
     NOTE: final is known as const in c++.
     
  2)  Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
     why?? 
     Because:The default constructor is used to provide the default values to the object like 0, null(for string), etc., depending on the type.


3) constructor overloading.

4) There is no copy constructor in Java but in c++ it exists.
   but  we can copy the values from one object to another like copy constructor in C++.
   
  
   There are many ways to copy the values of one object into another in Java. They are:
                                          By constructor
                                          By assigning the values of one object into another
                                          By clone() method of Object class




    
    
                  a) By constructor:
                                    class Student6{  
                                                int id;  
                                                String name;  
                                                //constructor to initialize integer and string  
                                                Student6(int i,String n){  
                                                id = i;  
                                                name = n;  
                                                }  
                                                //constructor to initialize another object  
                                                Student6(Student6 s){  
                                                id = s.id;  
                                                name =s.name;  
                                                }  
                                                void display(){System.out.println(id+" "+name);}  

                                                public static void main(String args[]){  
                                                Student6 s1 = new Student6(111,"Karan");  
                                                Student6 s2 = new Student6(s1);  
                                                s1.display();  
                                                s2.display();    
                                               }  
                                            }  


      
      
      
                            b) By copying values:
                            
                                    class Student7{  
                                              int id;  
                                              String name;  
                                              Student7(int i,String n){  
                                              id = i;  
                                              name = n;  
                                              }  
                                              Student7(){}  
                                              void display(){System.out.println(id+" "+name);}  

                                              public static void main(String args[]){  
                                              Student7 s1 = new Student7(111,"Karan");  
                                              Student7 s2 = new Student7();  
                                              s2.id=s1.id;  
                                              s2.name=s1.name;  
                                              s1.display();  
                                              s2.display();  
                                             }  
                                          }  
                            
   
   
   
   
   
   
   
 5)  Question :  Does constructor return any value?
   Answer: Yes, it is the current class instance (You cannot use return type yet it returns a value).
   
   
   
   
 6) Can constructor perform other tasks instead of initialization?
Answer: Yes, You can perform any operation in the constructor as you perform in the method.
  
   
   
   7) Is there Constructor class in Java?
    Answer: Yes. Java provides a Constructor class which can be used to get the internal information of a constructor in the class. 
   
   
   
   
   
  -----------------------------------------------------------------------------------------------------------------------
  
  
  Static keyword:( static property is shared to all objects.)
  
    a) The static can be:
                  Variable (also known as a class variable)
                  Method (also known as a class method)
                  Block
                  Nested class



    1) static method:(static method can be inherited)
                  
                        i) The static method can not use non static data member or call non-static method directly.
                       ii) this and super cannot be used in static context.


     Question:  Why is the Java main method static?
     Answer:  It is because the object is not required to call a static method.
     If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of 
     extra memory allocation.



      

   
   2) Static block: 
              Is used to initialize the static data member.
              It is executed before the main method at the time of classloading.
              
              eg.
                    class A2{  
                            static
                            {
                               System.out.println("static block is invoked");
                             }  
                            public static void main(String args[]){  
                             System.out.println("Hello main");  
                            }  
                        }  
                        
Question: Can we execute a program without main() method?
Answer:  No, one of the ways was the static block but now this feature has been removed.




--------------------------------------------------------------------------------------------------------------------------------

this keyword:

            Student s1 = new Student();
            s1.display()
            Here we created s1 instance of class Student . 
            Now if we want to refer this instance any where in program via any Student class method(say display()) whom this object/instance is calling we can use 'this'.


eg. 
a) To refer current class instance variable
                                  class Student{  
                                  int rollno;  
                                  String name;  
                                  float fee;  
                                  Student(int rollno,String name,float fee){  
                                  this.rollno=rollno;  
                                  this.name=name;  
                                  this.fee=fee;  
                                  }  
                                  void display(){System.out.println(rollno+" "+name+" "+fee);}  
                                  }  

                                  class TestThis2{  
                                  public static void main(String args[]){  
                                  Student s1=new Student(111,"ankit",5000f);  
                                  Student s2=new Student(112,"sumit",6000f);  
                                  s1.display();  
                                  s2.display();  
                                  }}  
                                  
                                  
                                  
       
     b) Calling current class constructor:(RULE: Call to this() must be the first statement in constructor.)
                
                class A{  
                      A(){  
                      this(5);                           /// rule that this() in constructor must be first statement is followed 
                      System.out.println("hello a");  
                      }  
                      A(int x){  
                      System.out.println(x); 
		      this();                    ///// rule violated //// C.T. error
                      }  
                      
                      
                      }  
                      class TestThis6{  
                      public static void main(String args[]){  
                      A a=new A();  
                      
                    }}  
                    
                    
                    
       c) to pass as an argument in the method
     
       eg.
               class S2{  
                      void m(S2 obj){  
                               System.out.println("method is invoked");  
                      }  
                       
                       void p(){  
                              m(this);  
                          }  
                      public static void main(String args[]){  
                            S2 s1 = new S2();  
                            s1.p();  
                      }  
                    }   
                     output ////method is invoked
---------------------------------------------------------------------------------------------------------------------------------

Inheritance : (IS-A relationship)
  -->> using extends keyword.
  -->> Multiple inheritance is not supported in java through class because -->>> To reduce the complexity and simplify the language  --->>> reduce ambiguity -->>> generate compile time error if someone used multiple inheritance.
  
----------------------------------------------------------------------------------------------------------------------------------
Aggregation and inheritance is used for code reusability.

Aggregation(HAS-A): One class contains another class' object as it's data member.

              eg.    -------------------------Address.java--------------
                      public class Address {  
                                 String city,state,country;  
                                 public Address(String city, String state, String country) {  
                                 this.city = city;  
                                 this.state = state;  
                                 this.country = country;  
                                }  
                       }  
      
                     ---------------Emp.java---------------------
                     
                     
                         public class Emp 
                         {  
                                          int id;  
                                          String name;  
                                          Address address;  

                                          public Emp(int id, String name,Address address) {  
                                              this.id = id;  
                                              this.name = name;  
                                              this.address=address;  
                                          }  

                                          void display(){  
                                                    System.out.println(id+" "+name);  
                                                    System.out.println(address.city+" "+address.state+" "+address.country);  
                                          }  

                                          public static void main(String[] args) {  
                                                      Address address1=new Address("gzb","UP","india");  
                                                      Address address2=new Address("gno","UP","india");  

                                                      Emp e=new Emp(111,"varun",address1);  
                                                      Emp e2=new Emp(112,"arun",address2);  

                                                      e.display();  
                                                      e2.display();  

                                          }  
                             }  


                                                  Output:111 varun
                                                         gzb UP india
                                                         112 arun
                                                         gno UP india      




-----------------------------------------------------------------------------------------------------------------------------

Method overloading : It increases the readability of the program.
                     Method Overloading is not possible by changing the return type of the method only this becauses causes ambiguity and sends CT ERROR.
		     
		   
Question :  Can we overload java main() method?
Answer : Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
         But JVM calls main() method which receives string array as arguments only.



-----------------------------------------------------------------------------------------------------------------------------

Meethod Overriding : If subclass (child class) has the same method as declared in the parent class, it is known as method overriding
                     Method overriding is used for runtime polymorphism.
		     Method must have same name and same no.of parameter and same typ of parameter.



Note: Static method cannot be overriden because the static method is bound with class whereas instance method is bound with 
      an object. Static belongs to the class area, and an instance belongs to the heap area.
      So main method cannnot be overrriden because  it is static.
   
   
   
   
 -------------------------------------------
 Method overriding new concept: 
 
 Earlier overriding with changing return type only was not possible but now it is possible with the help of covariant return type.
 
 Now it is possible to override method by changing the return type if subclass overrides any method whose return type 
 is Non-Primitive but it changes its return type to subclass type. 
 
					                      class A{  
								    		A get()
										    {return this;}  
								    }  

								    class B1 extends A{  
								   		 B1 get(){return this;}  
								    		 void message(){System.out.println("welcome to covariant return type");}
										 
							              public static void main(String args[]){  
								          	new B1().get().message();  
								    	}  
								 }  
 ----------------------------------------------------------------------------------------------------------------------------------
      
  super keyword:
		   a) super can be used to refer immediate parent class instance variable.
		   b) super can be used to invoke immediate parent class method.
		   c) super() can be used to invoke immediate parent class constructor.

  Points to Note:  a) super() is added in each constructor of class  as first statement automatically by compiler if there is no super().



      
 
 
this keyword:
 	           a) this can be used to refer current class instance variable.
		   b) this can be used to invoke current class method.(here this is implied ,no need to write explicitly)
		   c) this() can be used to invoke current class constructor.
      
     Points to Note:  a) this() should be first statement in class' constructor.

     RULES OF CALLING inside constructor:
              First constructor is called --->>> then super() --->> then instance initializer --->>then this() --->> and then rest part of constructor.
     	      SO we cannot misplace them if calling explicitly.


 ---------------------------------------------------------------------------------------------------------------------------
      
 Instance initializer block: 
			     It is used to initialize the instance data member. 
			     It run each time when object of the class is created.

    Question : Why use instance initializer block?  
    Answer : If we have to perform some extra operations while assigning value to instance data member e.g. a for loop to fill a
             complex array or error handling etc. 
      
      
      
      
      Question: Which run first constructor or instance or instance initializer block 
      Answer :  step1 : instance initializer block is place inside class' constructor after super() that is defaultly addded 
                        by compiler as first statment inside any class' constructor
                step2 : first constructor is called ==>> then super()==> and finally instance initializer block.
		
      eg.        class Bike8{  
				int speed;  
				Bike8(){System.out.println("constructor is invoked");}  
				{System.out.println("instance initializer block invoked");}  
				public static void main(String args[]){  
				Bike8 b1=new Bike8();  
				Bike8 b2=new Bike8();  
				}      
    		}  




			It seems that instance initializer block run first but actually NO.
			
	           		Output:instance initializer block invoked
				       constructor is invoked
				       instance initializer block invoked
				       constructor is invoked

      
      
      
      
      
  RULES : There are mainly three rules for the instance initializer block. They are as follows:

    The instance initializer block is created when instance of the class is created.
    The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
    The instance initializer block comes in the order in which they appear.


      
  RULES OF CALLING inside constructor:
     First constructor is called --->>> then super() --->> then instance initializer --->>then this() --->> and then rest part of constructor.
     SO we cannot misplace them if calling explicitly.
     
     
     
     
     
     
     
     
     
               eg.
	        		 class A{
					A(){
						System.out.println("parent class constructor invoked");
					}
				  }

				class B3 extends A{
					B3(){
					 System.out.println("child class constructor invoked");
					}

					B3(int a){
					   super();
					   this();
					   System.out.println("child class constructor invoked "+a);
					}

					{
					    System.out.println("instance initializer block is invoked");
					}

				        public static void main(String args[])
					{
					   B3 b1=new B3();
					   B3 b2=new B3(10);
					}
				   }

	       
	                        ///output 
		                        parent class constructor invoked
					instance initializer block is invoked
					child class constructor invoked
					parent class constructor invoked
					instance initializer block is invoked
					child class constructor invoked
					child class constructor invoked 10
 ------------------------------------------------------------------------------------------------------------------------
 
 final keyword:
  . 1) Final can be:
                 variable  :   If you make any variable as final, you cannot change the value of final variable(It will be constant).
                 method   : If you make any method as final, you cannot override it.
                 class   : If you make any class as final, you cannot extend it.
		 
		 
    
Q) Is final method inherited?
Ans) Yes, final method is inherited but you cannot override it. For Example: 
 
Q) What is blank or uninitialized final variable?
Ans) A final variable that is not initialized at the time of declaration is known as blank final variable.
     If you want to create a variable that is initialized at the time of creating object and once initialized may not 
     be changed, it is useful. 
     We can initialize  blank final variable only in constructor.
 
Q) static blank final variable:==>>> initialized in static block

Q) Can we declare a constructor final?
Answer: No becasue is never inherited.
	Constructor can not be static , final,virtual(in c++).

 ------------------------------------------------------------------------------------------------------------------------
 
 Polymorphism:(many forms => one lady acts as mother , daughter,wife,etcc... )
     1) concept by which we can perform a single action in different ways
     2) Compile time (function overloading and operator overloading(in c++ , not in java becoz no such concept in java))
     3) Run time(overriding,upcasting,downcasting,no concept of pointer in java so no base class pointer is used like c++)
     4) A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members. 
     4) Dynamic Method Dispatch is another name for runntime polymorphism.
     
	eg.
	    Java Runtime Polymorphism with Multilevel Inheritance
	    
					class Animal{  
						    void eat(){System.out.println("eating");}  
				          }  
			      
			                class Dog extends Animal{  
						    void eat(){System.out.println("eating fruits");}  
						 }  
						   
			                 class BabyDog extends Dog{  
						    void eat(){System.out.println("drinking milk");}  
						    public static void main(String args[]){  
								    Animal a1,a2,a3;  
								    a1=new Animal();   //// upcasting
								    a2=new Dog();  
								    a3=new BabyDog();  
								    a1.eat();  
								    a2.eat();  
								    a3.eat();  
						    	}  
			                     }  
 
 
     
 -------------------------------------------------------------------------------------------------------------------------
 Static binding : When type of object is determined at compile time.
                  Also  known as Early binding.
		  Compile time polymorphism.
		  Method overloading
		
Dynamic binding  : When type of object is determined at compile time.		
		   Also  known as Late binding.
		   Run time polymorphism.
                   Method overriding
 -------------------------------------------------------------------------------------------------------------------
 
 instanceof operator:(checking instance and Also can be used for and downcastng.)
 
 eg.
     class Animal{}  
    class Dog1 extends Animal{ 
      
     public static void main(String args[]){  
     Dog1 d=new Dog1(); 
     Dog1 s = NULL;
     System.out.println(d instanceof Animal);     //true  /// child's object is also an instance of parent.
     System.out.println(d instanceof Dog1);    //true  
     System.out.println(s instanceof Dog1);    //false  // if null then false 
     }  
    }  
 
 -------------------------------------------------------------------------------------------------------------------------
 Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 Abstraction tells what object does instead of how it does.
 
 eg.  sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
 
 
 Ways to achieve abstraction:
          Interface 
	  Abstract Class
	  
	  
 Abstract classes:(Points to remember)       
		    An abstract class must be declared with an abstract keyword.(Not available abstract keyword in c++)
		    It can have abstract or non-abstract methods or both(But it is compulsory to be declared with abstract keyword for becoming abstarct class).
		    (But In c++ there is no keyword abstract but we can say a class abstract only when it has atleast one was pure virtual method)
		    
		    It cannot be instantiated.(Also in c++)
		    It can have constructors and final ,static methods also.(Also in c++ but in c++ final keyword does not exists)
		    If we do not override the abstract method (pure virtual function) in derived class, then derived class also becomes abstract class.(Also in c++)
		    
		   
 
 
 eg. 
 
		   abstract class Bike{  
		             Bike(){System.out.println("bike is created");}  
		             abstract void run();  
		             void changeGear(){System.out.println("gear changed");}  
		     }  
		 
		 class Honda extends Bike{  
		          void run(){System.out.println("running safely..");}  
		 }  
		
		 class TestAbstraction2{  
		        public static void main(String args[]){
			Bike obj = new Bike();                   // abstact class cannot be instantiated so error
		        Bike obj = new Honda();                  // constructor of Honda class is called then super is called i.e. constructor of parent class that is abstract class.
		        obj.run();  
		        obj.changeGear();  
		       }  
		 }  
		    
		    
		    
		    
----------------------------------------	
Another use of abstract class(In case of interface): It gives us power to not implement all abstract methods of interface.
 -------------------------------------------------------------------------------------------------------------
 
 
 
 Interace : 
       1) can have abstract and non-method methods.
       2) If there is non-abstract method then that method should also use default keyword but now this method cannot overridden in the class that implments that interface.
       3) OR If there is non-abstract method then that method should also use static keyword and access as [ interface_name.static_method_name() ] but now this method can be overridden in the class that implments that interface.
       4) Interface also can  not be instantiated.
       5)  Interface fields are public, static and final by default, and the methods are public and abstract by default.
       6) Any class that implements interface , should implement all abstract methods.
          If this class does not do so then that class should use abstract keyword and become abstract class.
	  Now if any class extends this abstract class then that derived class should implement atleast all those abstract method that has not been implemented by parent class.  
	  
       
       
      
      
      
 Question)  Why use Java interface?
     Answer)             There are mainly three reasons to use interface. They are given below.
				    It is used to achieve abstraction.
				    By interface, we can support the functionality of multiple inheritance.
				    It can be used to achieve loose coupling.

      
      
      
       
       
       
 Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
 Answer)            	
 			  interface Printable{  
			    		void print();  
			    }  
			    
			    interface Showable{  
			    		void print();  
			    }  

			    class TestInterface3 implements Printable, Showable{  
						    public void print(){System.out.println("Hello");}  
						    public static void main(String args[]){  
						    TestInterface3 obj = new TestInterface3();  
						    obj.print();  
			     }  
			   }  







example of rule 6:) 
				    interface A{  
					    void a();  
					    void b();  
					    void c();  
					    void d();  
				    }  

				    abstract class B implements A{  
				    	public void c(){System.out.println("I am c");}  
				    }  

				    class M extends B{  
					    public void a(){System.out.println("I am a");}  
					    public void b(){System.out.println("I am b");}  
					    public void d(){System.out.println("I am d");}  
				    }  

				    class Test5{  
					    public static void main(String args[]){  
					    A a=new M();  
					    a.a();  
					    a.b();  
					    a.c();  
					    a.d();  
				    	}
				    }
				    
				    
				   
Interface inheritance:

            interface Printable{  
		    void print();  
		  }  
            interface Showable extends Printable{  
		    void show();  
		 }  
		    class TestInterface4 implements Showable{  
			    public void print(){System.out.println("Hello");}  
			    public void show(){System.out.println("Welcome");}  

			    public static void main(String args[]){  
				    TestInterface4 obj = new TestInterface4();  
				    obj.print();  
				    obj.show();  
		   	  }  
		    }  
				    
				




example) static method in interface


						     interface Drawable{  
							    void draw();  
							    static int cube(int x){return x*x*x;}  
							  }  
							    class Rectangle implements Drawable{  
							    	public void draw(){System.out.println("drawing rectangle");}  
							    }  

							    class TestInterfaceStatic{  
							    	public static void main(String args[]){  
							    		Drawable d=new Rectangle();  
							   		 d.draw();  
							    		System.out.println(Drawable.cube(3));  
				    				}
							}  



Question)  What is marker or tagged interface?
Answer) An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc.
	
	public interface Serializable{  
         }  
	 
	 
	 ---------------------------------------------------------------------------------------------------
	 
	 Abstract class	                                                                                    Interface
1) Abstract class can have abstract and non-abstract methods.	                       Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	                               Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	     Interface has only static and final variables.

--------------------------------------------------------------------------------------------------------------------------------------------

Accessing static variable: class_name.static_variable_or_method  --->> in java
                           class_name::static_variable_or_method -->> in c++

--------------------------------------------------------------------------------------------------------------------

We can inherit and overload and override static methods but they cannot be overriden to be non-static(it means when we override static method in child class then it should also be static else it cannot be overriden),in Java and c++.
Main method can also be overloaded but cannot be overidden.
Final methods can overloaded and inherited but cannot be overridden in java.
Constructors and destuctors are not members of classes and only members are inherited. You cannot inherit a constructor/destructor.
Constructor can overloaded but cannot overriden. 
Constructor cannot be final, because it can't be inherited/overridden. 
Constructor cannot be static.
Constructor cannot be abstract.
constructor can be private (concept of friend function in c++ => when we want to initiate object by only friend class and not by any other else)


Final class cannot be extended.
Destructor can not be overloaded but can be overidden---->>>>  you can have virtual destructors, and the only reason is to override them in derived classes.(in c++)
Note: A class cannot be private or protected except nested class.
---------------------------------------------------------------------------------------------------------------


Question) Can abstract class have constructor?
Answer) Yes, an abstract class can have a constructor in Java. You can either explicitly provide a constructor to abstract class
or if you don't, the compiler will add default constructor of no argument in abstract class. 
This is true for all classes and it also applies to an abstract class.
             But it's constuctor is called by child class' constructor's super() method because abstract method cannot be instantiated.

--------------------------------------------------------------------------------------------------------------------------

Package:
         A java package is a group of similar types of classes, interfaces and sub-packages.

Why package??
       Java package provides access protection.
       Java package removes naming collision.(namespace is used in c++)
      
 eg) 
			     //save as Simple.java  
			    package mypack;  
			    public class Simple{  
			     public static void main(String args[]){  
				System.out.println("Welcome to package");  
			       }  
			    }  
			    
			    
			         To Compile: javac -d . Simple.java  /// compiled and generated Simple.class file in same folder  becuase there is dot.  
                                 To Run: java mypack.Simple       so for run package_name.class_name

                                 Output:Welcome to package

       			-------------------------------------------------------------------------------------
            BUT WHAT IF WE DID NOT STORE CLASS FILE IN SAME FOLDER OF JAVA SOURCE FILE-->>> (SEE BELOW)-->consider my source java file is in folder e:/sources:
			e:\sources> javac -d c:\classes Simple.java
		
		To run this program from e:\source directory, you need to set classpath of the directory where the class file resides.
		e:\sources> set classpath=c:\classes;.;
		e:\sources> java mypack.Simple
		   -------------------------------------------------------------------------------------------------------                   


Question) How to access package from another package?

Answer) There are three ways to access the package from outside the package.
	  The import keyword is used to make the classes and interface of another package accessible to the current package.
          a) import package.* ===>>> If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages. 
	  b) import package.classname ==>> If you import package.classname then only declared class of this package will be accessible.
          c) fully qualified name>>>(in c++ we used namespace for naming collision)
	                      Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface.
                              It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.





        eg) Example of package by import fully qualified name

			    //save by A.java  
			    package pack;  
			    public class A{  
			      public void msg(){System.out.println("Hello");}  
			    }  

			    //save by B.java  
			    package mypack;  
			    class B{  
			      public static void main(String args[]){  
			       pack.A obj = new pack.A();//using fully qualified name  
			       obj.msg();  
			      }  
			    }  


                        ///// hello
			
			
			
			---------------------------------------------------------------
			Note: If you import a package, subpackages will not be imported.
			---------------------------------------------------------------
	  There can be only one public class in a java source file and that file must be saved by the public class name.
	  ----------------------------------------------------------------------------------------------------------
Subpackage in java:
	Let's take an example, Sun Microsystem has definded a package named java that contains many classes like System, 
	String, Reader, Writer, Socket etc. These classes represent a particular group e.g. Reader and Writer classes are
	for Input/Output operation, Socket and ServerSocket classes are for networking etc and so on.
	So, Sun has subcategorized the java package into subpackages such as lang, net, io etc. and put the Input/Output
	related classes in io package, Server and ServerSocket classes in net packages and so on.
	 
	 
----------------------------------------------------------------------------------------------------------------------------------

Access Modifier:
  Access Modifier	within class	within package	outside package by subclass only	outside package
    Private	               Y	       N	            N	                                N
    Default	               Y	       Y	            N	                                N
   Protected	               Y	       Y	            Y	                                N
    Public	               Y	       Y	            Y	                                Y
    
    
    
    
    eg.) private:
             class A{  
		    private int data=40;  
		    private void msg(){System.out.println("Hello java");}  
		    }  

		    public class Simple{  
		     public static void main(String args[]){  
		       A obj=new A();  
		       System.out.println(obj.data);//Compile Time Error  
		       obj.msg();//Compile Time Error  
		       }  
		    }
		    
		    
		    
		    
	eg) default:(If you don't use any modifier, it is treated as default by default.)
	
			  /// save by A.java
			       package pack;  
				    class A{  
				      void msg(){System.out.println("Hello");}  
				    }  

			    //save by B.java  
			    package mypack;  
			    import pack.*;  
			    class B{  
			      public static void main(String args[]){  
			       A obj = new A();//Compile Time Error  
			       obj.msg();//Compile Time Error  
			      }  
			    }  
			    
			    
			    
			    
			    
		eg) protected:
		   
		        //save by A.java  
			    package pack;  
			    public class A{  
			    protected void msg(){System.out.println("Hello");}  
			    }  

			    //save by B.java  
			    package mypack;  
			    import pack.*;  

			    class B extends A{  
			      public static void main(String args[]){  
			       B obj = new B();  
			       obj.msg();  
			      }  
			    }  
		
		
		
		
		
		
		
		eg) public :
		
		          //save by A.java  
			    package pack;  
			    public class A{  
			    public void msg(){System.out.println("Hello");}  
			    }  


			    //save by B.java  
			    package mypack;  
			    import pack.*;  

			    class B{  
			      public static void main(String args[]){  
			       A obj = new A();  
			       obj.msg();  
			      }  
			    }  
   ---------------------------------------------------------------------------------------------------------------------
   
   
   Encapsulation in java:
                          process of wrapping code and data together into a single unit
			  It is a way to achieve data hiding.
   			  Getter and setter ==>> read-only and write-only
			  
			  
   Abstraction vs encapsulation : Abstraction is process of hiding implementation details. It tells what object does instead of how it does and done by abstract class and inteface.
                                  Encapsulation is process of hiding data and code into single unit and done by getter and setter.
   
   ------------------------------------------------------------------------------------------------------------------------------
   
   
   Array in java:( *arr is replaced with arr[] or []arr)
       
         a) int a[]=new int[5];//declaration and instantiation 
	 
	 b)Initialization:	a[0]=10;//initialization  
				a[1]=20;  
				a[2]=70;  
				a[3]=40;  
				a[4]=50;  
				
	c) declaration, instantiation and initialization  ==>>      int a[]={33,3,4,5};
	d)  returning array from function:(return type should be int[] ,
	                                   in c++ it should be pointer as int* and if array is local to function then it should be static to be returned becoz c++ does not allow to return the address of local variable. )
	       
	       
	       example) 
	       class TestReturnArray{  
			//creating method which returns an array  
			static int[] get(){             ///// here static is used because we are accessing this method from static method.
			return new int[]{10,30,50,90,60};  
			}  

			public static void main(String args[]){  
			//calling method which returns an array  
			int arr[]=get();  
			//printing the values of an array  
			for(int i=0;i<arr.length;i++)  
			System.out.println(arr[i]);  
			}}  
	
	
	e) Multi dimensional array:
	            dataType[][] arrayRefVar; (or)  
		    dataType [][]arrayRefVar; (or)  
		    dataType arrayRefVar[][]; (or)  
		    dataType []arrayRefVar[];   
		    
		    
		
        f) jagged array:
	             When array has different number of columns for each row. 
		     eg.1 2 3
		        1 5 
			1 2 5 8 
			
			
			
------------------------------------------------------------------------------------------------------------------------

Object class:   Top most class -->> parent class of all classes in java.
                The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.





--------------------------------------------------------------------------------------------------------------------------
Object cloning: (In c++ it was copy constructor)

                Cloneable interface must be implemented by the class whose object clone we want to create. 
		If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
		Clone() is the fastest way to copy array.
		
		
		example) 
		            class Student18 implements Cloneable{  
						    int rollno;  
						    String name;  

						    Student18(int rollno,String name){  
						    this.rollno=rollno;  
						    this.name=name;  
						    }  

						    public Object clone()throws CloneNotSupportedException{  
						    return super.clone();  
						    }  

						    public static void main(String args[]){  
						    try{  
						    Student18 s1=new Student18(101,"amit");  

						    Student18 s2=(Student18)s1.clone();  

						    System.out.println(s1.rollno+" "+s1.name);  
						    System.out.println(s2.rollno+" "+s2.name);  

						    }catch(CloneNotSupportedException c){}  

						    }  
						    }  

						Test it Now

						Output:101 amit
						       101 amit

		
		
		
-----------------------------------------------------------------------------------------------------------------------------		
		
Wrapper class: (Autoboxing and  Unboxing)
                                          Primitive Type      Wrapper class
						boolean	         Boolean
						char	        Character
						byte	          Byte
						short	         Short
						int	        Integer
						long	         Long
						float	         Float
						double	        Double

Autoboxing :automatic conversion from primitive data type to wrapper class 
example) 		
		  public class WrapperExample1{  
			public static void main(String args[]){  
			//Converting int into Integer  
			int a=20;  
			Integer i=Integer.valueOf(a);                          //converting int into Integer explicitly  
			Integer j=a;                         //autoboxing, now compiler will write Integer.valueOf(a) internally  

			System.out.println(a+" "+i+" "+j);  
			}}  


		
	
Unboxing : automatic conversion from wrapper class to  primitive data type
	example)
				public class WrapperExample2{    
					public static void main(String args[]){    
					//Converting Integer to int    
					Integer a=new Integer(3);    
					int i=a.intValue();//converting Integer to int explicitly  
					int j=a;//unboxing, now compiler will write a.intValue() internally    

					System.out.println(a+" "+i+" "+j);    
				}}    
		
		
---------------------------------------------------------------------------------------------------------------------		
In java there is only call by value, not call by reference because java does not supports pointer.
-----------------------------------------------------------------------------------------------------------
strictfp keyword:
      Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable. 
      The precision may differ from platform to platform that is why java programming language have provided the strictfp keyword, so that you get same result on every platform. 
      
    ---->>>>  strictfp keyword can be applied on methods, classes and interfaces.
    ---->>>   The strictfp keyword cannot be applied on abstract methods, variables or constructors.
    
    
    
  ------------------------------------------------------------------------------------------------------------------
  
  javadoc tool:
            a) We can create document api in java by the help of javadoc tool.
	    b) In the java file, we must use the documentation comment /**... */ 
	    c) To create the document API(There is no need to compile the javafile) : 
	            -->>    On the command prompt, you need to write:
				      javadoc M.java  
				   where M.java is file name whose doc api has to created.
				   
	            --->>  Now, there will be created a lot of html files. Open the index.html file to get the information about the classes.
				      
-----------------------------------------------------------------------------------------------------------------------------

command line argument:
   
			   class A{  
					public static void main(String args[]){  

					for(int i=0;i<args.length;i++)  
					System.out.println(args[i]);  

					 }  
					}  


					     compile by > javac A.java  
					    run by > java A sonoo jaiswal 1 3 abc  

                       ///output :     sonoo
				       jaiswal
				       1
				       3
				       abc
--------------------------------------------------------------------------------------------------------------------------------
Class vs Object:

    eg.   Class: Human Object: Man, Woman
eg .     Class: Fruit Object: Apple, Banana, Mango, Guava wtc.

------------------------------------------------------------------------------------------------------------------------------

Strings in java:
      a) There are two ways to create String object:
				    i)  By string literal
				   ii)  By new keyword


            i) By string literal:  Each time you create a string literal, the JVM checks the "string constant pool" first. 
	       If the string already exists in the pool, a reference to the pooled instance is returned. 
	       If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

							   String s1="Welcome";  
							    String s2="Welcome";    //It doesn't create a new instance  
			Here s1 and s2 objects are pointing same 'Welcome' that means two objects are sharing 'Welcome'.
							
                   ---------------------------------------------------------------
		   Note: String objects are stored in a special memory area known as the "string constant pool".
		   ---------------------------------------------------------------

              Question) Why Java uses the concept of String literal?
	      Answer) To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

	      

   
            ii) By new keyword:(JVM will create a new string object in normal (non-pool) heap memory)
	    
	                 public class StringExample{  
					    public static void main(String args[]){  
							    String s1="java";                              //creating string by java string literal  
							    char ch[]={'s','t','r','i','n','g','s'};  
							    String s2=new String(ch);                          //converting char array to string  
							    String s3=new String("example");                 //creating java string by new keyword  
							   String s4=new String("example");        ///// s3 and s4 are pointing different examle that means they are not sharing same 'example' like string literal
							   System.out.println(s1);  
							    System.out.println(s2);  
							    System.out.println(s3);  
		          			}
			  }  

 				      
				      
	     
  
  
  b) STRINGS ARE IMMUTABLE: Immutable simply means unmodifiable or unchangeable.
             eg) 
	          class Testimmutablestring1{  
			     public static void main(String args[]){  
			       String s="Sachin";  
			       s.concat(" Tendulkar"); 
			       System.out.println(s);                 ////// Sachin
			       s=s.concat(" Tendulkar");  
			       System.out.println(s);               //// Sachin Tendulkar
			     }  
			    }  
  
  
   Question) Why string objects are immutable in java?
Answer) Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to one 
        object "sachin".If one reference variable changes the value of the object, it will be affected to all the reference
	variables. That is why string objects are immutable in java.

      
		
	
c) String Comparison:
     i) equals() and equalsIgnoreCase()   ==> compares values onlt not references.
     ii) ==        ===>>>> compares reference and values both.
     iii) compareTo() ==>>>> 0,1 ,-1 ===> lexicographically checking



      eg)  String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="Saurav";  
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false  



       eg) String s1="Sachin";  
	   String s2="SACHIN";  
	   System.out.println(s1.equals(s2));//false  
	   System.out.println(s1.equalsIgnoreCase(s2));//true  



       eg) String s1="Sachin";  
	   String s2="Sachin";  
	   String s3="Ratan";  
	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
	   
	   
	   
d) String concatenation: 
      Note: After a string literal(" "), all the + will be treated as string concatenation operator.
      
     
 e) String Buffer class:   used for creating mutable strings
                Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
		      So it is safe and will result in an order. i.e.it is synchronized
 
 
 f) StringBuilder class:  also used for creating mutable strings.
                    Note:  it is non-synchronized.
 
 -----------------------------------------------------------------------
 Order of effieciency and fastness -> 
         string < stringbuffer< stringbuilder
---------------------------------------------------------------------------
StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
--------------------------------------------------------------------------------------------------------------------------------------

Immutable class:    All the wrapper classes and String class is immutable.

    example)
                    public final class Employee{  
				    final String pancardNumber;  

				    public Employee(String pancardNumber){  
				            this.pancardNumber=pancardNumber;  
				    }  

				    public String getPancardNumber(){  
				          return pancardNumber;  
				    }  
			 }  

 ------>>>> The above class is immutable because:
         a)  The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
         b)  The class is final so we cannot create the subclass.
         c)  There is no setter methods i.e. we have no option to change the value of the instance variable.

             These points makes this class as immutable.
 -----------------------------------------------------------------------------------------------------------------------------
 
 
 Exception Handling:(Throwable class is parent for exceptions and error)
 a)Checked exception   -->>  The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions
                          e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.
			  
 b) unchecked exception -->> The classes which inherit RuntimeException are known as unchecked exceptions
                            e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
			   UNChecked exceptions are checked at run-time.
			    
 c) error -->> Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError,stackoverflowerror etc...
 
 d) try -catch or try - multi catch or try -finally 
 e) In multi catch --->>>> All catch blocks must be ordered from most specific to most general,
                          i.e. catch for ArithmeticException must come before catch for Exception.
 
 f) Nested try catch --> Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. 
                          try {
			       try {
			           }
			       catch(){
				 }
			    }
			    catch(){}
				 
			  
g) final block --
   ---->>>    Rule: For each try block there can be zero or more catch blocks, but max one finally block. 
   ---->> Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal 
                error that causes the process to abort). 
 
 
 h) Exception propagation : (propagating exception to backward function to be handled)
          --->> Rule1: By default Unchecked Exceptions are forwarded in calling chain (propagated).
	  --->> Rule2: By default, Checked Exceptions are not forwarded in calling chain (propagated). -->> for propagation use throws also .
 
 example)Based on rule 1
			   class TestExceptionPropagation1{  
				      void m(){  
					int data=50/0;  
				      }  
				      void n(){  
					m();  
				      }  
				      void p(){  
				       try{  
						n();  
				       }catch(Exception e){System.out.println("exception handled");}  
				      }  
			      	public static void main(String args[]){  
				       TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
				       obj.p();  
				       System.out.println("normal flow...");  
			      	}  
			    }  
			    
			    
			    ///Output:exception handled
       				normal flow...
 
 
 Explanation : In the above example exception occurs in m() method where it is not handled,so it is propagated to previous n() method 
 where it is not handled, again it is propagated to p() method where exception is handled.
 Exception can be handled in any method in call stack either in main() method,p() method,n() method or m() method.
 
  
  
  
  
  example)Based on rule 2
			class TestExceptionPropagation2{  
				      void m(){  
					throw new java.io.IOException("device error");//checked exception  
				      }  
				      void n(){  
					m();  
				      }  
				      void p(){  
				       try{  
						n();  
				       }catch(Exception e){System.out.println("exception handeled");}  
				      }  
				      public static void main(String args[]){  
					       TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
					       obj.p();  
					       System.out.println("normal flow");  
			      		}  
			      }  
 
                   //////Compilation error
		   
		   
	
i)throw keyword:
           throw new IOException("my_message");  
            
	    
	    
j) throws keyword:
             -->> The Java throws keyword is used to declare an exception.
	     --->> using throws checked exception are also propagated.
	     
	     
    Qestion) Which exception should be declared
    Ans) checked exception only,		   
		   
    RULE:  If you are calling a method that declares an exception, you must either caught or declare the exception.
    
    eg.) caught exception using try catch--
             
	          import java.io.*;  
			    class M{  
			     void method()throws IOException{  
			      throw new IOException("device error");  
			     }  
			    }  
			    public class Testthrows2{  
			       public static void main(String args[]){  
				try{  
				 M m=new M();  
				 m.method();  
				}catch(Exception e){System.out.println("exception handled");}     

				System.out.println("normal flow...");  
			      }  
			    }  
			    
			    
			    ////Output:exception handled
                                  normal flow...
				  
				  
				  
				  
				  
				  
				  
	    eg) you declare the exception and exception does not occured			  
				  class M{  
					 void method()throws IOException{  
					  System.out.println("device operation performed");  
					 }  
					}  
					class Testthrows3{  
					   public static void main(String args[])throws IOException{//declare exception  
					     M m=new M();  
					     m.method();  

					    System.out.println("normal flow...");  
					  }  
					}  

 
 
                                          
			    ////Output:exception handled
                                  normal flow...
				  
				  
				  
	eg) Program if exception occurs and not handled

				    import java.io.*;  
				    class M{  
				     void method()throws IOException{  
				      throw new IOException("device error");  
				     }  
				    }  
				    class Testthrows4{  
				       public static void main(String args[])throws IOException{//declare exception  
					 M m=new M();  
					 m.method();  

					System.out.println("normal flow...");  
				      }  
				    }  

				Output:Runtime Exception
			  
		
		
		
		

k) 
                        throw	                                                              throws
1)	Java throw keyword is used to explicitly throw an exception.	Java throws keyword is used to declare an exception.
2)	Checked exception cannot be propagated using throw only.	Checked exception can be propagated with throws.

3)	Throw is used within the method.	                              Throws is used with the method signature.
4)	You cannot throw multiple exceptions.	                              You can declare multiple exceptions e.g.
                                                                           public void method()throws IOException,SQLException.                                
 
 
 
 
 
 
 
 l) final -->> keyword   -->> with class(No inheirtance), with variable(variable value cannot be changed once assigned), with method(no overriden)
    finally ->> block -->> in exception handling -->> always executed either excepton is handled or not -->>it is not excuted only if program exits by system.exit()
    finalize -->> it is method -->> Finalize is used to perform clean up processing just before object is garbage collected. 
    
    eg)     class FinalizeExample{  
			    public void finalize(){System.out.println("finalize called");}  
			    public static void main(String[] args){  
			    FinalizeExample f1=new FinalizeExample();  
			    FinalizeExample f2=new FinalizeExample();  
			    f1=null;  
			    f2=null;  
			    System.gc();  
			    }}  
			    
			    
			  
			  
			  
			  

m) creating your own exception : (By extending Exception class)==>> If your class throw new kind of exception then that new kind of exception should extend Exception class .


             class InvalidAgeException extends Exception{  
		     InvalidAgeException(String s){  
			      super(s);  
		     }  
	      }  

	    class TestCustomException1{  
	       static void validate(int age)throws InvalidAgeException{  
		 if(age<18)  
		  throw new InvalidAgeException("not valid");  
		 else  
		  System.out.println("welcome to vote");  
	       }  
         
	       public static void main(String args[]){  
		  try{  
		  validate(13);  
		  }catch(Exception m){System.out.println("Exception occured: "+m);}  

		  System.out.println("rest of the code...");  
	      }  
	    }  
    
    
    ////output:
		    Exception occured: InvalidAgeException:not valid
		       rest of the code...
		       
		       
		       
		       
		       
		       
		       
		       
		       
n) exception handling with method overriding
------------------------------------------------------------------------------------------------------------------------

Java Multithreading: 
      -->> process of executing multiple threads simultaneously.
      -->> A thread is a lightweight sub-process, the smallest unit of processing. 
      -->> Multiprocessing and multithreading, both are used to achieve multitasking.
      -->> However, we use multithreading than multiprocessing because threads use a shared memory area. 
           They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time
	   than process. 
      --> Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
      
      
     
     
 Life cycle of a thread: --> It is controlled by JVM
       -->> New          -->> when you create an instance of Thread class but before the invocation of start() method. 
       -->> runnable     -->> The thread is in runnable state after invocation of start() method, 
                              but the thread scheduler has not selected it to be the running thread. 
       -->> running             
       -->> blocked      -->> when the thread is still alive, but is currently not eligible to run.
       -->> Terminated   -->> A thread is in terminated or dead state when its run() method exits. 





Creating thread:
		a) There are two ways to create a thread:
  			 i)  By extending Thread class
    			 ii) By implementing Runnable interface.
                
		b) Commonly used Constructors of Thread class:
				    Thread()
				    Thread(String name)
				    Thread(Runnable r)
				    Thread(Runnable r,String name)

		c) Commmonly used methods of Thread class:
		                    run() 
				    start()
				    sleep(milliseconds)
				    join()                       //// stops all other thread except the thread which invokes this method
				    join(milliseconds) 
				    getPriority()               /// gives priority of thread
				    setPriority()
				    getName()                  //// gives name of current thread
				    setName()                  /// set name of current thread
				    isAlive()
				    setDaemon()               ./// thread is set as daemon thread
				    isDaemon()


                 d) Runnable interface has only one method :
		                    run()
		 





Creating thread by extending Thread class:
		      class Multi extends Thread{  
				    public void run(){  
					    System.out.println("thread is running...");  
				    }  
				    public static void main(String args[]){  
					    Multi t1=new Multi();  
					    t1.start();  
				     }  
		      }  
 
 
 
 
 
 
 
 Creating thread by implementing Runnable Interface:
 
                     class Multi3 implements Runnable{  
					    public void run(){  
					    	System.out.println("thread is running...");  
					    }  

					    public static void main(String args[]){  
						    Multi3 m1=new Multi3();  
						    Thread t1 =new Thread(m1);  
						    t1.start();  
					     }  
			    }  







Thread Scheduler:
        -->> Thread scheduler in java is the part of the JVM that decides which thread should run.
	-->> There is no guarantee that which runnable thread will be chosen to run by the thread scheduler.
	-->> Only one thread at a time can run in a single process.
	-->> Uses preemptive scheduling and timeslicing scheduling algorithm
	
	
	
	
	
	
	
sleeping a thread: Thread.sleep(milliseconds)
     ---->>> As you know well that at a time only one thread is executed. 
             If you sleep a thread for the specified time,the thread shedular picks up another thread and so on. 








Question) Can we start a thread twice????
Answer) No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown.
example)   t1.start();  
           t1.start();      //exception occured



	
	
	
	
	

Question)  What if we call run() method directly instead start() method????
Answer)  -->>  Each thread starts in a separate call stack when we invoke start() but Invoking the run() method from main thread,
               the run() method goes onto the current call stack rather than at the beginning of a new call stack.

example)
			    class TestCallRun2 extends Thread{  
			     public void run(){  
			      for(int i=1;i<5;i++){  
				try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
				System.out.println(i);  
			      }  
			     }  
			     public static void main(String args[]){  
			      TestCallRun2 t1=new TestCallRun2();  
			      TestCallRun2 t2=new TestCallRun2();  

			      t1.run();  
			      t2.run();  
			     }  
			    }  
			    
			    
			    Output:    1
				       2
				       3
				       4
				       5
				       1
				       2
				       3
				       4
				       5
				       
As you can see in the above program that there is no context-switching because here t1 and t2 will be treated as normal object
not thread object. 		       
 
 
 
 
 
 
 
 
 
 
 Joining the thread:
     -->> The thread which invokes the join(milliseconds) method is executed alone for given time  period and after 
          that all threads can perfrom simulataneously. 






Renaming thread:
  -->>  t1.start();  
        t2.start();  
  t1.setName("nandan");  
  t2.getName();
  
  
  
  
  
 Priority of a thread:
     -->>> t1.setPriority(Thread.MIN_PRIORITY);    /// Thread.MIN_PRIORITY =0; Thread.MAX_PRIORITY =10,
     --->>Thread.currentThread().getPriority()
     -->>Thread.currentThread().getName()
     
     
     
     
     
     
     
  Daemon thread :
    -->> Daemon thread in java is a service provider thread that provides services to the user thread.
    -->> Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
    -->> There are many java daemon threads running automatically e.g. gc, finalizer etc.

     -->>first set any thread as daemon then start() else IllegalThreadStateException will occur.
          eg) t1.setDaemon(true);       
	      t1.start();    /// ok
  
		  t1.start();  
		  t1.setDaemon(true);//will throw exception here  

  
  
  
  
  
  
  
  
  Thread pool:
       -->> represents a group of worker threads that are waiting for the job and reuse many times.
       -->> A thread from the thread pool is pulled out and assigned a job by the service provider. 
            After completion of the job, thread is contained in the thread pool again.

 
 
 
 
 
 
 
 Thread group:
     -->> Java provides a convenient way to group multiple threads in a single object. 
          In such way, we can suspend, resume or interrupt group of threads by a single method call.

example)  
		public class ThreadGroupDemo implements Runnable{  
			public void run() {  
			      System.out.println(Thread.currentThread().getName());  
			}  
		       public static void main(String[] args) {  
			  ThreadGroupDemo runnable = new ThreadGroupDemo();  
			      ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  

			      Thread t1 = new Thread(tg1, runnable,"one");  
			      t1.start();  
			      Thread t2 = new Thread(tg1, runnable,"two");  
			      t2.start();  
			      Thread t3 = new Thread(tg1, runnable,"three");  
			      t3.start();  

			      System.out.println("Thread Group Name: "+tg1.getName());  
			     tg1.list();  

			}  
		       }  
		       
		       
		       
		      
		      
		      
		      
		      
		      
		      

ShutdownHook thread in java:
          --->>> used to perform cleanup resource or save the state when JVM shuts down normally or abruptly. 
          --->> So if you want to execute some code before JVM shuts down, use shutdown hook.
The JVM shuts down when:
    -->>  user presses ctrl+c on the command prompt
    -->> System.exit(int) method is invoked
    -->> user logoff
    -->> user shutdown etc.
code:
   -->> addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine. 
   -->> The object of Runtime class can be obtained by calling the static factory method getRuntime(). For example: 
                               Runtime r = Runtime.getRuntime();
    -->> Factory method:  The method that returns the instance of a class is known as factory method.	  
	  
	  
example)
				 class MyThread extends Thread{  
				public void run(){  
				    System.out.println("shut down hook task completed..");  
				}  
			    }  

			    public class TestShutdown1{  
			    public static void main(String[] args)throws Exception {  

			    Runtime r=Runtime.getRuntime();  
			    r.addShutdownHook(new MyThread());  

			    System.out.println("Now main sleeping... press ctrl+c to exit");  
			    try{Thread.sleep(3000);}catch (Exception e) {}  
			    }  
			    }
			    
			    
			
			
			    
example)same Above example by anonymous class:
						public class TestShutdown2{  
					    public static void main(String[] args)throws Exception {  

					    Runtime r=Runtime.getRuntime();  

					    r.addShutdownHook(new Thread(){  
					    public void run(){  
						System.out.println("shut down hook task completed..");  
						}  
					    }  
					    );  

					    System.out.println("Now main sleeping... press ctrl+c to exit");  
					    try{Thread.sleep(3000);}catch (Exception e) {}  
					    }  
					    }  
					    










Single task by multiple thread:
      
                class TestMultitasking1 extends Thread{  
				     public void run(){  
				       System.out.println("task one");  
				     }  
				     public static void main(String args[]){  
				      TestMultitasking1 t1=new TestMultitasking1();  
				      TestMultitasking1 t2=new TestMultitasking1();  
				      TestMultitasking1 t3=new TestMultitasking1();  

				      t1.start();  
				      t2.start();  
				      t3.start();  
				     }  
				    }  
				    
				    
				    
				    
				    
				    
Multiple task by mulyiple thread:
        
	        class Simple1 extends Thread{  
			     public void run(){  
			       System.out.println("task one");  
			     }  
			    }  

			    class Simple2 extends Thread{  
			     public void run(){  
			       System.out.println("task two");  
			     }  
			    }  

			     class TestMultitasking3{  
			     public static void main(String args[]){  
			      Simple1 t1=new Simple1();  
			      Simple2 t2=new Simple2();  

			      t1.start();  
			      t2.start();  
			     }  
			    }  















Garbage Collection(GC): --->>automatic and gc() and finalize()
     -->> garbage means unreferenced objects. 
     -->> GC is a way to destroy the unused objects.
     -->> To do so, we were using free() function in C language and delete() in C++. 
          But, in java it is performed automatically. So, java provides better memory management.

Question) How can an object be unreferenced?
Answwer) There are many ways:
			    By nulling the reference
			    By assigning a reference to another
			    By anonymous object etc.

		a) By nulling the reference:
		                  Employee e=new Employee();  
                                  e=null;
				  
				  
		b) By assigning a reference to another:
					Employee e1=new Employee();  
					Employee e2=new Employee();  
					e1=e2;


How actually it works: 
          Garbage collection is performed by a daemon thread called Garbage Collector(GC) i.e. System.gc()
	  This thread calls the finalize() method before object is garbage collected.
	  Note: The Garbage collector of JVM collects only those objects that are created by new keyword. 
	  So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).
	  
	      eg.          Employee e=new Employee();  
                                  e=null;
				  System.gc()
				  
	  Note: Neither finalization nor garbage collection is guaranteed.
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
--------------------------------------------------------------------------------------------------------------------------------	  

Synchronization in java:
        -->>  control the access of multiple threads to any shared resource.

There are two types of thread synchronization mutual exclusive and inter-thread communication.
		   a) Mutual Exclusive
			   Synchronized method-->> If you declare any method as synchronized, it is known as synchronized method.
			                      -->> When a thread invokes a synchronized method, it automatically acquires the lock for that object and
					           releases it when the thread completes its task.
						   
			   Synchronized block -->> Suppose you have 50 lines of code in your method, 
			                           but you want to synchronize only 5 lines, you can use synchronized block.
						   
			   Static synchronization -->> static + synchronized
		    b) Cooperation (Inter-thread communication in java)







interthread communnication : (All methods are of Object class that is parent of all classes in java)
		a) wait(milliseconds) : Causes current thread to release the lock and wait until either another thread invokes the 
		                      notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed. 
		
		b) notify() : Wakes up a single thread that is waiting on this object's monitor.
		c)notifyall() ; Wakes up all threads that are waiting on this object's monitor.
		
		
		
	
	
	
	
	
	wait()	                                                               sleep()
wait() method releases the lock                           	sleep() method doesn't release the lock.
is the method of Object class                                   	is the method of Thread class
is the non-static method	                                         is the static method
should be notified by notify() or notifyAll() methods	       after the specified amount of time, sleep is completed.





eg)     class Customer{  
    int amount=10000;  
      
    synchronized void withdraw(int amount){  
    System.out.println("going to withdraw...");  
      
    if(this.amount<amount){  
    System.out.println("Less balance; waiting for deposit...");  
    try{wait();}catch(Exception e){}  
    }  
    this.amount-=amount;  
    System.out.println("withdraw completed...");  
    }  
      
    synchronized void deposit(int amount){  
    System.out.println("going to deposit...");  
    this.amount+=amount;  
    System.out.println("deposit completed... ");  
    notify();  
    }  
    }  
      
    class Test{  
    public static void main(String args[]){  
    final Customer c=new Customer();  
    new Thread(){  
    public void run(){c.withdraw(15000);}  
    }.start();  
    new Thread(){  
    public void run(){c.deposit(10000);}  
    }.start();  
      
    }}  
    
    
    
    
    
    
    
    
    
  ------------------------------------------------------------------------------------------------------------------------
  
 a) Serailization -->> writing the state of an object into a byte-stream.
    Deserialization -->>  byte-stream is converted into an object.
  
 b) The serialization and deserialization process is platform-independent, 
    it means you can serialize an object in a platform and deserialize in different platform. 
  
 c) Serializable , Cloneable and Remote are marker interfaces (has no data member and method). 
  
 d) Whose class' object you want to serialize and deserialize that class must implement Serializable interface.
  
 e) Advantages of Java Serialization:-
	It is mainly used to travel object's state on the network (which is known as marshaling).
  
  f) transient keyword:  If you define any data member as transient, it will not be serialized.
  ------------------------------------------------------------------------------------------------------------------------------
  
  
  JAVA Collection:
       Iterable interface -- Collection interface  -----List interface
                                                                  ----ArrayList class
								  ----Linkedlist class
								  ----Vector class
								            -----Stack class
                                                   
						   -----Queue interface 
						                ----Priority Queue  class
								----Deque interface
								        ---- LinkedList class
									---- ArrayDeque class
						   
						   -----Set interface
                                                             ----Hash Set class
							     ----LinkedHash Set class
							     ----Sorted Set inteface
							                ----- Tree Set class
							
						   -----Map interface
                                                             ----Hash Map class
							     ----LinkedHash Map class
							     ----Sorted Map inteface
							                ----- Tree Map class
  
  
  Sample example)
       ArrayList<String> list=new ArrayList<String>(); 
	list.add("Ravi"); 
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	
	




example)
          List<String> al=new ArrayList<String>(); 
	  al.add("Ravi"); 
	  al.add("Vijay");    
	  al.add("Ravi");    
	  al.add("Ajay"); 	
	  
	  
	  

a) List--> can contain duplicate values
   Set -->> cannot contain duplicate values
   Map -->> key value pair--->> A Map contains unique keys.
   
   
   
a) ArrayList uses dynammic array vs linked list uses doubly linked list. Both are non-synchronized but maintains insertion order.
b) Hash set ->  Non- synchronized -> does not maintains insertion order -->null allowed
 LinkedHashSet -> non-ynchronized -> maintains insertion order -->> null allowed
 Tree set-->> non-synchronized -> maintains ascending order -> null not allowed
 
c) Queue -->> FIFO is followed 
   Priority Queue:  FIFO is not followed---priority is mandatory
   
   Arraydeque --->> Unlike Queue, we can add or remove elements from both sides.
               --> null not allowed



d) Hash Map ->  Non- synchronized -> does not maintains any order -->may have one null key and multiple null values.
 LinkedHashMap -> non-ynchronized -> maintains insertion order -->> may have one null key and multiple null values.
 Tree Map-->> non-synchronized -> maintains ascending order -> cannot have a null key but can have multiple null values.
  
	  
e) Hashing is the process of converting an object into an integer value. 	  
	  
