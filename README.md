# Desgin Pattern:

## Behavioral:

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