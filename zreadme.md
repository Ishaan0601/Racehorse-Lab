IB CS SL Inheritance Lab

Week Assignment #6

Description: This lab will let you practice using inheritance.

Files for this Assignment:

Main Class: Driver, will construct Horses and RaceHorses. This class is almost complete.
Horse Class - Object class representing a single Horse. This class is complete.
RaceHorse Class -Define a RaceHorse class with all of the attributes of the Horse class but with an additional attribute for the number of races a horse has won and also the an attribute for the number of races a horse has lost. Since a race horse is-a type of horse this relationship can be represented in Java using inheritance. The diagram below illustrates this relationship.

                                  Horse

                                      ^

                                       |

                                   RaceHorse
                                  Horse

Inheritance Rules

A subclass can add new private instance variables.
A subclass can add new public or private methods.
A subclass can override (redefine) inherited methods.
A subclass must define its own constructors.
A subclass cannot access the private members of its superclass.

Make the following additions and modifications to the RaceHorse class:

1. To make inheritance happen, the subclass must extend the superclass.

- Please correct the class heading to make this happen.
 
2. Rule : A subclass can add new private instance variables.
- Add an instance variable of type int named numRacesWon.


3. Rule : A subclass can add new public or private methods.

Implement the accessor methods getRacesWon and getRacesLost
Implement the mutator methods wonRace.and lostRace

4. Rule : A subclass can override (redefine) inherited methods.

Override the toString method so that it includes the numRacesWon attribute.
Make sure you are using the toString of the Horse class in your solution.

5. Rule : A subclass must define its own constructors.
- Add a default constructor
- Add a second constructor which includes 4 parameters to initialize the

   instance variables owner, age, value, and numRacesWon. 

   Remember, super, when used,  must be your first statement
   
6. Rule : A subclass cannot access the private members of its superclass.

Make the following additions and modifications to the Main class:

1) Find the first //###. Add the code there to change the races lost as directed.

2) Find the next set of //###. Follow the directions to cause Jimmy's horse to win 2 races.

3) Add a comment at the top with your name.

Sample Data:<Sample Data here>
Expected Output:

Sample Run

Owner = John Wayne
Age = 3
Value = $250000.0
Races won = 2
Races lost = 4

after losing races
Owner = John Wayne
Age = 3
Value = $250000.0
Races won = 2
Races lost = 6

Owner = Jimmy Stewart
Age = 4
Value = $325000.0
Races won = 8
Races lost = 6

after winning races
Owner = Jimmy Stewart
Age = 4
Value = $325000.0
Races won = 10
Races lost = 6