/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?
    
    */
    
    
 
    public static long triangleNumberDivisor(int n) {
int count = 0;
long triNum = 0;
for (int i = 1; count <= n; i++) {
triNum += i;
count = 0;
for (int c = 1; c <= Math.sqrt(triNum); c++) {
if (triNum % c == 0) {
count += 2;
}
}

if (Math.sqrt(triNum) * Math.sqrt(triNum) == triNum) {
count--;
}
}
return triNum;
}
    
}




