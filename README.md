
# Percentage calculation Test

This project's main objective is to demonstrate the importance of unit testing services with JUnit 5. \
The project is a percentage calculation backend, it was built in the Java language with Spring Boot, it serves to facilitate calculations in a practical and easy way.


## Autores

- [@MaxDevSoft](https://github.com/MaxDevSoft)


## Documentation 

#### Methods

* findPercentage _______________________________ \
`public double findPercentage(double p, double x)`

Returns the value of the calculation of the percentage p over the value of x. \
p - percentage number \
x - any number

* numberPencent __________________________________ \ 
`public double numberPencent(double x, double y)`

Returns the percentage, where given the x value, knows what percentage of the y value. \
x - any number \
y - any number

* findPercentageUp ________________________________ \ 
`public double findPercentageUp (double x, double y)`

Return how many percent increased, where given a value of x, that value increased to the value of y. \
x - any number \
y - any number

* findPercentageDown _________________________________ \ 
`public double findPercentageDown (double x, double y)`

Return how many percent decreased, where given a value of x, that value decreased to the value of y. \
x - any number \
y - any number

* findNumberUp _________________________________ \ 
`public double findNumberUp (double x, double p)`

Return the value that increased by y percent in relation to the x value. \
x - any number \
p - percentage number 

* findNumberDown ________________________________ \ 
`public double findNumberDown (double x, double p)`

Return the value that decreased by y percent in relation to the x value. \
x - any number \
p - percentage number

* findNumberInitialUp ________________________________ \ 
`public double findNumberInitialUp (double x, double p)`

Return the value where we have a number that has increased by a few percent from the initial value. \
x - any number \
p - percentage number

* findNumberInitialDown _________________________________ \ 
`public double findNumberInitialDown (double x, double p)`

Return the value where we have a number that has decreased by a few percent from the initial value. \
x - any number \
p - percentage number
## Tests 

* Test of the method that calculates the percentage of a number.
```java
@Test
@Tag("calculus:1")
void findPercentageTest(){}
```

* Test in which a value of x, we want to know what the percentage of the value of y is.
```java
@Test
@Tag("calculus:2")
void numberPencentTest(){}
```

* Test where an x ​​value, that value has increased to the y value and we want to know how many percent it has increased.
```java
@Test
@Tag("calculus:3")
void findPercentageUpTest(){}
```

* Test where a value of x, that value has increased to the value of y and we want to know how many percent it has decreased.
```java
@Test
@Tag("calculus:4")
void findPercentageDownTest(){}
```

* Test where we have a number and want to increase it by a few percent.
```java
@Test
@Tag("calculus:5")
void findNumberUpTest(){}
```

* Test where we have a number and want to decrease it by a few percent.
```java
@Test
@Tag("calculus:6")
void findNumberDownTest(){}
```

* Test in which we have a number that has increased by a few percent compared to the initial value.
```java
@Test
@Tag("calculus:7")
void findNumberInitialUpTest(){}
```

* Test in which we have a number that has decreased some percentage of the initial value.
```java
@Test
@Tag("calculus:8")
void findNumberInitialDownTest(){}
```


## Referência

 - [JUnit 5](https://junit.org/junit5/)
 - [4devs](https://www.4devs.com.br/calculadora_porcentagem)
 - [Java 19](https://docs.oracle.com/en/java/javase/19/docs/api/index.html)
