# A-PERFECT-SINGLETON-CLASS--SINGLETON-DESIGN-PATTERN

SINGLETON:A java class that allow to craete only one object in any situation

There are three way to write a singleTon design pattern :
@1:-Traditional approach (Noraml class)
@2:-Nested /Static Inner class
@3:-Enum as singleton



But this is a Traditional approach ,you can review my code.
:-A singleton class should create only one  one object or same object not a new object 
so there are some posssible way to crate new object or braeking our single ton class
eg.:-1->Cloning process:--so through cloning we can also create copy of objects 
@2:->Multitharding :-using tharde also we can create objects in multitharded environment 
@3:->class loader
@4:-Reflection PAI-using reflection api we can get access to private constructor so by this we can craete new objects
@5:-Deserialization -also by this we can craete objects 

so we should resolve this issue by preventing thses to create new objects 


use case:
----------
where should we use singleton java class :-

1:-if a class is having no state 
2:-if a class is having sharebale test across all the multiple classes
3:-if a class is having ReadOnly state


conclusion:
===================
But here we can not achive 100% singleton behaviour so we can not devlope 100% perfect singleton class in java  

    using traditional approach we can devlope for 98% 
