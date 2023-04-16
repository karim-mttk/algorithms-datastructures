/* recursion is a function that calls itself.
based on conditional and at some point when the condition is met it will stop.
the stopping condition is called the base case.
*/

recursion(int someValue)
{
    if (someValue == 10)
    {
        return;
    }
    return recursion(someValue + 1);
}

/*why and why not?
pros:
-bridges the gap between elegance and complexity
-reduces the need for loops
-reduce timecomplexity with memoization
-works well with trees and graphs

cons:
-can be slow due to a lack of computational power
-lead to memory errors / stack overflows
-can be difficult to debug if poorly designed
*/

/*Example below with a Call Stack*/

void String A()
{
    return "hello " + B();
}

void String B()
{
    return "my  " + C();
}

void String C()
{
    return "friend.";
}
/*Stack frame A, B & C.
 */
