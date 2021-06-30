# Object Oriented Programming in Java
> The aim of this project is to summarize the content of the Platzi course "Object Oriented Programming in Java", We can take this document as a point of reference for the future inqueries.

# OOP in Java
## Programming paradigms 
Theory that provides us with a standardized basis and model for solving problems with our code.

## Object Oriented Programming (OOP) 
Helps us analyze and understand all these problems to solve them in the most sustainable way in the future.
### OOP Pillars
- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

### OOP elements
#### Clases

#### Propiedades
Properties or attributes are the characteristics of an objects. These attributes will always be nouns and can have different values that will refer to names, sizes, shapes, and states.

#### Métodos
Behaviors or methods will be all the operations of an objects that usually are called using verbs or nouns and verbs. For example: the methods of the session object can be login(), logout(), makeReport(), and so on.

#### Objetos
Objects are all physical or conceptual things that have properties and behaviors. For example: user, session, auto, etc.

##### Declaring an Object:

```bash
// type of object ---- Object Name
Doctor myDoctor;
```
##### Instantiating an object:

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
