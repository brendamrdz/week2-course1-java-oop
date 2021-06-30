# Object Oriented Programming in Java
## Introduction
> The aim of this project is to summarize the content of the Platzi course "Object Oriented Programming in Java", We can take this document as a point of reference for the future inqueries.

## Programming paradigms 
Theory that provides us with a standardized basis and model for solving problems with our code.

## Object Oriented Programming (OOP) 
Helps us analyze and understand all these problems to solve them in the most sustainable way in the future.
### OOP Pillars
- #### Encapsulamiento

- #### Abstracción: 
Abstraction is about analyzing objects independently, their properties, characteristics and behaviors, to abstract their composition and generate a model, which we translate into code as classes.
- #### Herencia

- #### Polimorfismo

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
##### Static Variables and Methods
Static Variables and Methods help us to execute or get some code from classes that have not been instantiated, since their values are saved in the memory of our program, not in different objects instantiated through a class.
#### Declaring an Object:

```bash
// type of object ---- Object Name
Doctor myDoctor;
```
#### Instantiating an object:
The Constructor Method is the first method that is executed by default when we create a class, it allows us to create new instances of a class. We invoke it with the reserved word new followed by the name with which we initialize the class and parentheses.

```bash
// Object Name---- Class based
myDoctor = new Doctor();
```
#### Declaring and instantiating an object on the same line:
```bash
// Declares the object ---- Instanciar el objeto
Doctor myDoctor = new Doctor();
```
#### Using the Object:

```bash
// Declares the object ---- Instanciar el objeto
Doctor myDoctor = new Doctor();
myDoctor.name = "Brenda MR";
myDoctor.showName();
```






