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
 
 Polymorphism:
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



Destructor can not be overloaded but can be overidden---->>>>  you can have virtual destructors, and the only reason is to override them in derived classes.(in c++)

---------------------------------------------------------------------------------------------------------------


Question) Can abstract class have constructor?
Answer) Yes, an abstract class can have a constructor in Java. You can either explicitly provide a constructor to abstract class
or if you don't, the compiler will add default constructor of no argument in abstract class. 
This is true for all classes and it also applies to an abstract class.
             But it's constuctor is called by child class' constructor's super() method because abstract method cannot be instantiated.

--------------------------------------------------------------------------------------------------------------------------
