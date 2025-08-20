package com.ruthik.www;
//Rule 5: A class can implement multiple interfaces
interface Printable {
 void print();
}

interface Showable {
 void show();
}

//Rule 6: Interface can't implement another interface (Only extend)
interface Info {
 void displayInfo();
}

//Rule 8: Interface can extend multiple interfaces
interface FullFeatures extends Printable, Showable {
 void feature();
}

//Rule 10: Interface can contain constants and method signatures
interface Constants {
 int VALUE = 10; // public static final by default
 void showConstant();
}

//Rule 9: Class can extend a class and implement an interface
class Base {
 void baseMethod() {
     System.out.println("Base method");
 }
}

//Final class implementing all concepts
class MyClass extends Base implements FullFeatures, Info, Constants {
 @Override
 public void print() {
     System.out.println("Print method from Printable");
 }

 @Override
 public void show() {
     System.out.println("Show method from Showable");
 }

 @Override
 public void feature() {
     System.out.println("Feature method from FullFeatures");
 }

 @Override
 public void displayInfo() {
     System.out.println("Info displayed");
 }

 @Override
 public void showConstant() {
     System.out.println("Constant VALUE = " + VALUE);
 }
}

//Rule 7: Polymorphism and loose coupling
public class InterfaceInheritanceDemo {
 public static void main(String[] args) {
     // Interface-type reference - loose coupling
     FullFeatures obj = new MyClass();
     obj.print();
     obj.show();
     obj.feature();

     // Accessing constant
     Constants c = new MyClass();
     c.showConstant();

     // Accessing class and interface methods
     MyClass mc = new MyClass();
     mc.baseMethod();  // From Base class
     mc.displayInfo(); // From Info interface
 }
}
