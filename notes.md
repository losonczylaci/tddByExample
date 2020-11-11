# Notes

## Chapter 1

- have a todo list to keep us focused
- don't interrupt yourself, add an item to the todo list

## Chapter 2

TDD cycle:

- Write a test
- Make it run
- Make it right

> Clean code that works is out of the reach of even the best programmers some of the time, and out of the reach of most programmers most of the time. Divide and conquer, baby. First we'll solve the “that works” part of the problem. Then we'll solve the “clean code” part. 

Strategies to make a test green:

- Fake it - Return a constant and gradually replace constants with variables until you have the real code.
- Use obvious implementation. - Type in the real implementation.
- Triangulate

## Chapter 4

A risk has been introduced. If test for equality fails to accurately check that it is working, then the test for multiplication could also fail. This is the risk we actively manage in TDD.
From time to time our reasoning will fail us and a defect will slip through. We learn our lesson about the test we should have written and move on.


# Chapter 6

This guy :D

> Write the tests you wish you had. If you don't, you will eventually break something while refactoring. Then you'll get bad feelings about refactoring and stop doing it so much. Then your design will deteriorate. You'll be fired. Your dog will leave you. You will stop paying attention to your nutrition. Your teeth will go bad. So, to keep your teeth healthy, retroactively test before refactoring.
