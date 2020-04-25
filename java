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



    1) static method:
                  
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
                      this(5);                           /// rule followed 
                      System.out.println("hello a");  
                      }  
                      A(int x){  
                      System.out.println(x);  
                      }  
                      
                      this(5);                    ///// rule violated //// C.T. error
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






