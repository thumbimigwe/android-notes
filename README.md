# android-notes

###Constructors
- They allow you to initialize objects as soon as you create them. It has the same name as its class. Each object has its own data.

###Nested if
-This is where you put if statements inside another if statement. 
- You can also use else if statements where instead of having two alternatives you can have many.
- When the first condition is false then the second condition is tested and so on until the final else statement.

###conditional operators
This is another way of using ```if - else``` statements but really compact and really small.

syntax:

```system.out.println(condition ? "statement if true":"statement if false")```

it can be used instead of a simple if else statement.

###```for loops```
- They are a type of loop.

syntax:

```for( "where the loop start"; "the condition statement of the loop"; "the increment or decrement of the loop")```

- Enhaced for loops only have a type of data and an identifier followed by the array looped through.
- ```Do while``` loops are like ```while loop```. The difference is that the ```do while``` will always execute at least one, since it executes before checking the condition.
- It only keeps executing once the condition is found to be true.
- There are several Math methods such as;
    - ```pow``` --- (power of ...)
    - ```abs``` --- (absolute value),
    - ```ceil``` --- (rounding up numbers),
    - ```floor``` --- (rounding down numbers),
    - ```max``` --- (finding the bigger number out of two numbers)
    - ```min``` --- (finding the lesser of two numbers)
    - ```sqrt``` --- (for finding the square root of a number)

###```Math.random```
- ```Math.random``` generates "random" doubles. 

Random class can be used to generate "random" integers. You can specify the range of those random integers.

###Arrays
Arrays are like variables but they can store more than a single value. Each value has an index and those indexes go from 0 up to the array's length

1. <strong><em>Arrays have a static length.</em></strong> You can't change that.
Array can be used as method parameters and for that brackets must be added to the parameter declaration in the method definition to specify that it is an array that will be used as a parameter.

+ <strong><em>Arrays can be multi-dimensional.</em></strong>
Multidimensional arrays are declared with multiple sets of brackets, one pair per dimension. Multi-dimensioanl arrays are not always square. Basically, <em>a multi-dimensional array is like an array of arrays and those inside arrays (or rows) can have diverse lengths.</em>

###Variable
Variable length parameters can be used by declaring the type followed by three dots and the name of the array that will be used to store the parameters.<br>
Java favors local variables when different variables share the same name. That can be avoided through the use of ```"this"``` keyword attached to the variable name. <br>Best practice is not to use the same name twice.

Constructors can be overloaded. ie. you can define the constructor method many times and each one has a different number of parameters.

```Getters``` and ```Setters``` are used to read or write data into private variables.
