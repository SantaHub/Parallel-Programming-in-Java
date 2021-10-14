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
