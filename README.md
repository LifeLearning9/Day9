# Day9: Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]   Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]  Output: [[""]]

**Intuition**
Two words are anagrams if:
1. They have the same letters
2. The letters appear the same number of times
a. Pick a word that hasn’t been grouped yet.
b. Compare it with the rest of the words.
c. If sorted letters match, put them in the same group.
d.Repeat until all words are grouped.

**Algorithm**
1. Read input → split by commas → s1[]
2. Create:
  a. A 2D array s4[][] to store groups of anagrams.
  b. A boolean array used[] to mark visited words.
3. Outer loop (i = 0 to n-1):
   If s1[i] is not used:
         Start a new group in s4.
         Add s1[i] to this group.
        Mark s1[i] as used.
4. Inner loop (j = i+1 to n-1):
   If s1[j] not used AND sorted(s1[i]) == sorted(s1[j]):
     Add s1[j] to the same group.
     Mark it as used.
5. sorted(word):
   Convert to char array.
   Sort characters manually (bubble sort, no inbuilt functions).
   Return the sorted string.
6. Print the 2D array.

**Complexity**
Time Compelxity:O(n² × k²)
Space complexity:O(n²)
