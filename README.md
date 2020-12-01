# SerengetiNaturalPark (Part 2)
In this document there is an explanation of the project that we have done on the PMOO subject on first grade of Computer Science Engineering at EHU/UPV university.
This projects purpose is to work on concepts that we have been working on the subject, in the first part of the project we are working on concepts such as:
– Hierarchy
– Inheritance
– Polymorphism
– Dispatching
– Incremental programming – Overrides
– Interfaces

## Designing
I have made a project diagram using the tool StarUML, organizing how we were going to implement all the project and what are the attributes, constructors, methods on each class. This tool have helped me a lot to have the main idea of the project and what is the hierarchy of Specimen. We can document each method in the StarUML tool and this will be done at the time of generating the code skeleton.
For example, 2 of 3 herbivorous make the same sound so I have decided to implement that sound() method on Herbivorous class and override the method on the other Specimen. This way we implement only 2 methods instead of making 3 different overrides on the concrete classes.
Other example is that all the felines make are carnivorous, so they have the same feeding. Is important to think and spend time on the UML, this makes us the coding task easier.
After finishing with the diagram, using an extension on StarUML I generated all the project’s code skeleton. With this last step I finished the part of the basic design of the project.
<br/><br/>
![Project Diagram](https://github.com/iyan22/Serengeti-Natural-Park-Part-2/blob/master/uml/Classes%20diagram.jpg)


## Coding
Later, I have implemented all the constructors and methods shown in the StarUML diagram for all the Specimen subclasses.
The hierarchy and inheritance concepts are very important and help us a lot to reduce the amount of repeated code, categorising the specific method in each class, and all the subclasses can use the method or override it if needed.
We have used ExtinctionDanger interface to implement in the specimens needed the ability to check the danger level of each. This can be done overriding the method in the class.
The method inheritancePath() is based on incremental programming, this makes the methods shortest and easier because each one makes the specific task at each class and calls the super method if is needed.
After finishing with the coding of Specimen subclasses, I have coded the SpecimenProof class where we can have relevant information of the specimns at the park, this class is where we are going to make the simulation later.



## Testing
After finishing the implementation of the basic Classes, we have developed some tests for all the concrete classes of Specimens. For this task we are using the tool JUnit 5, the purpose of the tests is to verify the correct functioning of all the concrete Specimens created, checking the expected values an the ones that each method returns.
The values that each method have to return have been defined as private static on the specific classes and can be returned using a static getter of the constant. This is done to ease software maintenance task.
I have found some problems at the time of thinking how to propose the the tests of some methods because they were random. In this case
I have implemented 3 types of tests classes to make the tests.
- **Default:** Tests getName(), feeding(), sound() and inheritancePath().
- **Mammal:** Tests the methods specified at default and walk().
- **Endangerd Specimens:** Tests the methods specified at default, in some cases mammal, and whatDangerLevel().

## Simulating
To finish with this part of the project we have created a SeregetiProof class. The purpose of this class is to code some static methods that will help us to check how many Specimens are in the Serengeti Natural Park of each type and the characteristics of each; or check the extinction danger of some of them. Later we are going to create an ArrayList with different types of Specimens and test the methods. Due to some tasks assigned to check what we have learnt I have printed some notes such as Runtime error or Compilation error indicating that the instruction can not be done (there is more information in the code).
