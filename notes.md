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

## Chapter 7

Solution is smelly a bit, since we'd like to provide a solution that makes sense in the finance domain, not in the domain of Java objects. Since we don't have the concept of currency, this will do it for the moment.

## Chapter 10

Wrote `toString()` without test in the middle of a red bar. `toString()` is
used for debugging, the risk of it failing is low.

We are about to experiment with something -> instead of careful reasoning,
since we have test that will take care of us let's make the change 
and ask the compiler.

Backed out an experiment and wrote another test. Making the test work made the experiment work.

## Chapter 11

Some of the tests are redundant with the new code structure, we got rid of them.

## Chapter 12

I guess I just realized the importance of metaphors in software development. It is much easier to name classes using metaphors and they can be really catchy.

## Chapter 13

Kent distinguishes code and data duplication. We know what code duplication is. Data duplication could be a faked return value in the production code.

## Chapter 14

- Wrote a test (`testArrayEquals) to check an assumption about the operation of Java
- Made a mistake in a refactoring and chose to forge ahead, writhing another test to isolate the problem

## Chapter 17 - Retrospective

When working on a large system:
- Parts you touch all the time should be rock solid, so we can make daily changes confidently.
- As drifting out to the periphery test tests can be spottier and the design uglier.

When all the obvious task are done, running a code critic.

### Metrics 

- Test FW metrics (wow, that is new). Minutes between runs.
- classes, functions, lines, lines/function...
- Number of changes per refactoring (I think Kent means number of changes between running the test-cases)

### Test quality 

- statement coverage
- defect insertion (change to production code, see how much test fails [see](jester.sourceforge.net))
