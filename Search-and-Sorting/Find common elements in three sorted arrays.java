/**
* we can find the common elements using a single loop and without extra space. The idea is similar to intersection of two arrays. Like two arrays loop, we run a loop and traverse three arrays.
 Let the current element traversed in ar1[] be x, in ar2[] be y and in ar3[] be z. We can have following cases inside the loop.
 1) If x, y and z are same, we can simply print any of them as common element and move ahead in all three arrays.
 2) Else If x < y, we can move ahead in ar1[] as x cannot be a common element
 3) Else If y < z, we can move ahead in ar2[] as y cannot be a common element
 4) Else (We reach here when x > y and y > z), we can simply move ahead in ar3[] as z cannot be a common element.
**/

