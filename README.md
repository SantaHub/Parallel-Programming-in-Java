# Parallel-Programming-in-Java
https://www.coursera.org/specializations/pcdp#courses


## Week 1

Pseudo-code : Async and Finish
```
Async : Specify that a task is running on Async mode.
Finish : Specify the scope of the parallism. implemented as join() in java.
```

## Week 2

Future Objects : Used to store a handle to access values of functions that will return values in future. They are single assign only, like a final variable.

.get() method : gets the value of the future tasks. It will stop the execution flow for the task to be completed and returned the value. Any statement after .get() will only be excuted once the task is completed. It helps to avoid race conditions

Memoization : the futures are stored in a datastructure and called when required again. On the lookup, we use .get().

Determinism : 
    Functional Determinism : Always computes the same answer when given the same input
    Structual Determinism : Computes same computational graph when given the same input.
To avoid data race, a program should be functionally and structually deterministic.
Benign nondeterminim : for same inpu may generate different outputs. But all the outputs maybe acceptable. Eg. search pattern match locations in a string.

