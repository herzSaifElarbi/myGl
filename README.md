# Software Design Priciples:
### DRY: Don't Reapeat Yourself:
Avoid duplication logic.

### COI: Composition Over Inheritance:
Prefer unsing composition over complexe inheritance trees

### POLA: Principle Of least Astonishement:
Code should behave in a simple and intuitive way(codes implemented should do what their name is saying nothing weird)

### KISS: Keep It Simple Stupid:
write simple and understandaple code avoid complexity

### YAGNI: You aren't Gonna Need It:
Don't implement something until it's accutually needed

## SOLID:

### S: Single Responsability Principle:
a class has one and only one reason to change

### O: Open Closed Principle:
a sotfware is open for extension closed for modification

### L: Liskov sibstitution Principle:
Objcts of superclass should be replacebale with objects of subclass

### I: Interface segregation Priciple:
Don't force a class to implement unused interface

### D: Dependency Inversion Principle:
Depend on abstraction not concrete class



# Desgin Pattern:

## Behavioral:

### Iterator:
#### Exemple 1:
creating an iterator over 3 elements

### State:
##### Exemple 1:
Traffic Ligth changing we have 3 states (red, orange, green)

### Chain of responsability:
#### Exemple 1:
we have 3 handlers and each has responsability of handling range number.


### Observer:
#### Exemple 1:
This is a weather station notifying users if state changes it notify them, we use publisher subscriber here.

## Structural:

### Decorator:
#### Exemple 1:
we have text to render but it can be adjusted by bold, italic

## Creational:

### Singleton:
#### Exemple 1:
We try to create a unique logger and test if 2 created are the same.

### Builder:
##### Exemple 1:
we make vehicules cars, motocycles same carracteristiques but different values.

## Full Exemples:

#### Exemple1(Observer + Strategy):
A news agency notify users via sms, emails.

#### Exemple2(Observer + Strategy + Decorator):
A file upload notifier when a file is uploaded it notifies the users, note that file can be watermarcked or encrypted and it's sent via SMS or email.