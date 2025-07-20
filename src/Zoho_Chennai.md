### **Question 1:**

Given a list S that contains three words and a query word Q, find out the most similar word from S with Q. Similarity between two words is defined here as the number of commonly occurring 2-grams between them. 2-grams of a word are the list of contiguous sequence of two characters in a word.

**Example:**

S = \['hello', 'hey', 'yellow']

Q = hell

Note: If there are no commonly occurring 2-grams, the function should return ‘No similarity found’

Complete the `find_similar_word()` function definition, such that it returns the most similar word among elements in S when compared to Q.

**Sample Input:**

\['hello', 'hey', 'yellow']

hell

**Sample Output:**

hello

**Explanation:**

2-grams in "hello" = \['he', 'el', 'll', 'lo']

2-grams in "hey" = \['he', 'ey']

2-grams in "yellow" = \['ye', 'el', 'll', 'lo', 'ow']

2-grams in "hell" = \['he', 'el', 'll']

Number of commonly occurring 2-grams between "hello" and "hell"= 3  i.e., \['he', 'el', 'll']

Similarity = 3

Number of commonly occurring 2-grams between "hey" and "hell"= 1  i.e., \['he']

Similarity = 1

Number of commonly occurring 2-grams between "yellow" and "hell"= 2  i.e., \['el', 'll']

Similarity = 2

---

### **Question 2:**

Given a nested array/list S, write a program to combine the inner arrays as shown in the example.

**Example:**

S = \[\[1, 0, 3], \[2, 0, 4], \[3, 0, 5], \[4, 0, 6]]

Note: The inner arrays present in the nested array will be of the same size.

Complete the `combine()` function definition, such that it returns a combined array of the given inner arrays.

**Sample Input:**

\[\[1, 0, 3], \[2, 0, 4], \[3, 0, 5], \[4, 0, 6]]

**Sample Output:**

\[1, 2, 6, 8, 5, 6]

**Explanation:**

Input: \[\[1, 0, 3], \[2, 0, 4], \[3, 0, 5], \[4, 0, 6]]

**Window Outputs**

Step 1 : [1 0 3]

Step 2 : __[2 0 4]

Step 3 : ____[3 0 5]

Step 4 : ______[4 0 6]

Output: \[1 2 6 8 5 6]

---

### **Question 3:**

Given a string S containing only the parentheses characters "(" and ")", find the length of the longest valid substring that contain matching parentheses.

**Example:**

S = ()()()

Complete the `longest_matching_parentheses()` function definition, that returns the length of the longest valid substring that contain matching parentheses.

**Note:**

Longest valid substring is the substring with balanced parenthesis.

**Sample Input 1:**

()()()

**Sample Output 2:**

6

**Explanation:**

In the given string "()()()" there are 3 matching parentheses forming the longest valid substring of length 6.

**Sample Input 2:**

(()))((()

**Sample Output 2:**

4

**Explanation:**

The longest valid substring is "(())"

---

### **Question 4:**

An ATM machine has the following denominations Rs. 100, Rs. 200 and Rs. 500 of N notes each. Given an amount A to withdraw, return the number of possible ways the amount can be dispensed.

**Example:**

N - 5

D - \[100, 200, 500]

A - 1000

Complete the `withdraw()` function definition, that returns the number of possible ways the amount can be dispensed from ATM.

**Sample input:**

5

\[100, 200, 500]

1000

**Sample output:**

7

**Explanation:**

There are 7 possible ways to withdraw an amount of 1000 from an ATM having denominations Rs. 100, Rs. 200 and Rs. 500 of 5 notes each.

The possible ways are:

\[ \[100, 100, 100, 100, 500],

\[100, 100, 100, 100, 200, 200],

\[100, 100, 100, 200, 500],

\[100, 100, 200, 200, 200],

\[100, 200, 200, 500],

\[200, 200, 200, 200, 200],

\[500, 500] ]

---

### **Question 5:**

Get some array of intervals from users. Return the count of the minimum number of intervals to be removed to make the rest of the intervals non-overlapping.

**Sample test cases:**

**Case 1:**

**Input:**

Enter the number of intervals: 4

Interval 1: 1,2

Interval 2: 2,4

Interval 3: 4,11

Interval 4: 1,3

**Output:**

1

**Explanation:**

1,3 can be removed to make the rest of the intervals non-overlapping.

**Case 2:**

**Input:**

Enter the number of intervals: 3

Interval 1: 1,2

Interval 2: 1,2

Interval 3: 1,2

**Output:**

2

**Explanation:**

2 intervals of 1,2 should be removed.

**Case 3:**

**Input:**

Enter the number of intervals: 2

Interval 1: 1,2

Interval 2: 2,3

**Output:**

0

**Explanation:**

No intervals overlap.

---

### **Question 6:**

Given a set of non overlapping intervals, insert the new interval into given intervals in such a way that they are still non-overlapping. Existing intervals could be merged if needed.

**Sample test cases:**

**Case 1:**

**Input:**

Existing intervals: \[\[1, 3], \[6, 9]]

New interval: \[2,5]

**Output:**

\[\[1,5], \[6,9]]

**Explanation:**

\[1, 5] is merged combination of \[1, 3] and \[2, 5]

**Case 2:**

**Input:**

Existing intervals: \[\[1,2],\[3,5],\[6,7],\[8,10],\[12,16]]

New interval: \[4, 8]

**Output:**

\[\[1,2],\[3,10],\[12,16]]

**Explanation:**

Because the new interval \[4, 8] overlaps with \[3,5],\[6,7],\[8,10].

**Case 3:**

**Input:**

Existing intervals: \[\[1,5]]

New interval: \[2,7]

**Output:**

\[\[1,7]]

**Case 4:**

**Input:**

Existing intervals: \[\[1,5]]

New interval: \[8,10]

**Output:**

\[\[1,5], \[8,10]]

---

### **Question 7:**

Given the number of rows ‘n’ and a String ‘str’. Print the characters in the zig-zag manner as shown in the example below.

Input consists of ‘n’ followed by the string ‘str’

**Input:**

4

ZOHOCORPORATION

**Output:**

```
Z       R       I
O    O  P    T  O
H  C    O  A    N
O       R
```

**Input:**

6

ESTANCIACAMPUS

**Output:**

```
E          M
S        A P
T      C   U
A    A     S
N  I
C
```

**Input:**

5

NULLPOINTEREXCEPTION

**Output:**

```
N        T        T
U      N E      P I
L    I   R    E   O
L  O     E  C     N
P        X
```

---

### **Question 8:**

Given a number ‘N’, print a spiral pattern if N is odd and Square pattern if N is even.

**Sample Input1 : 13**

**Sample Output1:**

```
* * * * * * * * * * * * *
. . . . . . . . . . . . *
* * * * * * * * * * * . *
* . . . . . . . . . * . *
* . * * * * * * * . * . *
* . * . . . . . * . * . *
* . * . * * * . * . * . *
* . * . * . . . * . * . *
* . * . * * * * * . * . *
* . * . . . . . . . * . *
* . * * * * * * * * * . *
* . . . . . . . . . . . *
* * * * * * * * * * * * *
```

**Sample Input2 : 8**

**Sample Output2:**

```
* * * * * * * *
* . . . . . . *
* . * * * * . *
* . * . . * . *
* . * . . * . *
* . * * * * . *
* . . . . . . *
* * * * * * * *
```

**Sample Input3 : 23**

**Sample Output3:** *(large spiral similar to above)*

**Sample Input4 : 16**

**Sample Output4:** *(square box pattern with stars and inner dots)*
