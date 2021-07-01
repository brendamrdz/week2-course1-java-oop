# Object Oriented Programming in Java
## Introduction
> The aim of this project is to summarize the content of the Platzi course "Object Oriented Programming in Java", We can take this document as a point of reference for the future inqueries.

## Programming paradigms 
Theory that provides us with a standardized basis and model for solving problems with our code.

## Object Oriented Programming (OOP) 
Helps us analyze and understand all these problems to solve them in the most sustainable way in the future.
### OOP Pillars
- #### Encapsulamiento
 Access Modifiers help us limit where we can read or modify special attributes of our classes
| Modificador | Clase | Package | Subclase | Otros |
|-------------|-------|---------|----------|-------|
| public      | ✔     | ✔       | ✔        | ✔     |
| protected   | ✔     | ✔       | ✔        | •     |
| default     | ✔     | ✔       | •        | •     |
| private     | ✔     | •       | •        | •     |
- #### Abstraction: 
Abstraction is about analyzing objects independently, their properties, characteristics and behaviors, to abstract their composition and generate a model, which we translate into code as classes.
- #### Inheritance
Don’t repeat yourself (DRY) consists of detecting when we are repeating the same code over and over again to create a method or function that helps us avoid these repetitions. 

```bash
public class SuperClass {
  // ...
}

public class SubClass extends SuperClass {
  // ...
}
```
- "Super" indicates that a variable or method is from the parent class, the superclass from which our subclasses inherit, we only use it when we apply inheritance. Also, we can call the constructor of the parent class from its different subclasses using super (); and sending the arguments that are necessary. 
- "this" allows us to specify that our variables are pointing to the same class where we are working. 
<br>
<img src="https://github.com/brendamrdz/week2-course5-java-oop/blob/main/super-this.PNG?raw=true" alt="alt text" width="30%" height="auto">

 

- #### Polimorfismo
Consists of overriding some methods of the class from which our subclasses inherit to assign different behaviors. 
- Methods marked as final or static cannot be overwritten.
- In addition to the superclass methods, it is also possible to redefine the behavior of the methods that "inherit" all our objects, as well as .toString, hashCode, finalize, notify, etc.
## Modularity
Modularity consists of dividing our program into different modules so that they can be joined or separated without breaking between them or losing any functionality. Modularity in Object-Oriented Programming helps us to: 
- Modularity 
- Reuse 
- Avoid collapses 
- Maintainable 
- Readability 
- Quick troubleshooting


## OOP Elements
### Clases
Classes are the models on which we build our objects, that is, classes are the "molds" that allow us to generate objects. Each class must have identity (with a unique class name using Upper Camel Case), status (with its attributes) and behavior (with its methods and operations).
```bash
Class Name: Doctor 
Attributes: Name, speciality 
Operations: showName()
```
```bash

####Syntax
// Clases:
public class Doctor {
  // Atributos:
  int id;
  String name;
  String speciality;

  // Comportamientos (métodos):
  public void showName() {
    // Instrucciones...
  }
}
```

### Object
Objects are all physical or conceptual things that have properties and behaviors. For example: user, session, auto, etc.

#### Properties
Properties or attributes are the characteristics of an objects. These attributes will always be nouns and can have different values that will refer to names, sizes, shapes, and states.

#### Methods
Behaviors or methods will be all the operations of an objects that usually are called using verbs or nouns and verbs. For example: the methods of the session object can be login(), logout(), makeReport(), and so on.

- #### Declaring an Object:
```bash
Doctor myDoctor;
```

- #### Instantiating an object:
The Constructor Method is the first method that is executed by default when we create a class, it allows us to create new instances of a class. We invoke it with the reserved word new followed by the name with which we initialize the class and parentheses.

```bash
myDoctor = new Doctor();
```
- #### Declaring and instantiating an object on the same line:
```bash
Doctor myDoctor = new Doctor();
```
- #### Using the Object:

```bash
Doctor myDoctor = new Doctor();
myDoctor.name = "Brenda MR";
myDoctor.showName();
```
#### Types of Memory
An object is a reference to a space in memory. When we create objects, Java saves them in memory and returns coordinates with which we can access the information we store.
There are two types of memory: Stack and Heap.
Objects use stack memory but not to save their information, it is used for save coordinates to the true location of the object in heap memory
<br>
<img src="https://github.com/brendamrdz/week2-course1-java-oop/blob/main/objects-variables.png?raw=true" alt="alt text" width="50%" height="auto">

## Nested Classes
Nested Classes or Helper Classes are classes within other classes that we group by their common logic and / or characteristics.
types of nested classes
Nested Classes can call any type of element or method.
### Nested Static classes
- No need to create instances to call them
- Only the static methods of their parent classes can be called 
```bash
class ClaseExterior{
//Clases internas
    class ClaseInterna {
    }
    
//Clases estaticas
   static class ClaseStaticaAnidada {
    }
}
```
## Enumerations
Enumerations are a data type used to declare a collection of constants. As they are constant, they must be written in capital letters 

To declare an enumeration use the enum keyword. 
```bash
public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}
```
Se puede llamar un valor de enumeration como se muestra a continuación
```bash
public enum Day {
Day.MONDAY;
Day.FRIDAY;
Day.SATURDAY
}
```
## Interfaces
It is reference type similar to a class that could contain only constants and methods definitions.
The shape of a class is set (method names, argument lists and return types, but not code blocks).
- Composition of Interfaces in Classes: abstract all the methods / behaviors of a class to modularize them (compress them, encapsulate them) in an interface and reuse their code in different classes.
Example:
```bash
public interface ISchedulable{
	schedule(Date date, String Time);
}
public class AppointmentDoctor
implements ISchedulable{

}
```
As of Java 8 they can be implemented in methods to inherit and reuse different behaviors. Not all interface methods must be abstract, now it is possible to use the default access modifier and from Java 9 also private. 
Interfaces can inherit from other interfaces using the extends keyword, the concept of inheritance will be applied as it is naturally practiced in classes, the interface will inherit and acquire the methods of the parent interface.

An interesting thing that happens in case of inheritance with interfaces is that, here multiple inheritance is allowed 

## Abstract Classes 
<br>
<img src="https://github.com/brendamrdz/week2-course5-java-oop/blob/main/abs.png?raw=true" alt="alt text" width="30%" height="auto">
They are a mix between interfaces and inheritance where not all methods are implemented no instances are created either. 

```bash
public abstract class Figura {
  abstract void dibujar(); // obligatorio
  void dibujar3D(); // no es obligatorio
}

class Triangulo extends Figura {
  void dibujar() {
    // Instrucciones para dibujar el triángulo...
  }
}
```
## Anonymous Classes 
Anonymous Classes are a way to instantiate abstract classes without using their child classes. But this type of instantiation has some restrictions: the life cycle of these instances is NOT long-lasting, we will not have them available during the entire execution of the program. 
```bash
// Abstract Class:
public abstract class Figura {
  abstract void dibujar();
}

// Anonymous Class:
User user = new User() {
  @Override
  public void showDataUser() {
    // Instrucciones...
  }
};
```
