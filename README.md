Introduction

You are given a string composed of only 1s, 0s, and Xs.

Write a program that will print out every possible combination where you replace the X with both

0 and 1.

Example

$ myprogram X0

00

10

$ myprogram 10X10X0

1001000

1001010

1011000

1011010

While your program will take longer to run based on the number of possible combinations, your

program shouldn’t crash (or hang) on an input with many Xs.

What is the big O notation for your program?
Let the number of Xs be N. The program runs on O(2^N) time