# Wizards

## Class Hierarchy
There is an abstract cclass [Wizard](src/wizards/Wizard.java) on the top  
Successors: [Teacher](src/wizards/Teacher.java) and [Student](src/wizards/Student.java)  
Every Wizard can cast spells and introduce  

`Teacher` and `Student` have a defined abstract method `performMainActivity`  
`Teacher` stays with default behaviour  
Bat `Student` has overloaded method `flyOnABroomstick`.

Package `spells` consist spells that `Wizzards` can use

Interfaces:
1. [BroomstickFlyable](src/wizards/BroomstickFlyable.java) with abstract method `flyOnABroomstick` and default method `broomstickFlyingTime`

2. [PotionMakeable](src/wizards/PotionMakeable.java) with abstract method `makePotion` and default method `potionMakingTime`  

Class `Wizard` extends interfaces

Class [Test](src/wizards/Test.java) tests whole hierarchy and all methods  
`ArrayList` collection `wizzards1` sorted by `natural ordering`  
and `wizzards2` sorted by `Wizard` age  
