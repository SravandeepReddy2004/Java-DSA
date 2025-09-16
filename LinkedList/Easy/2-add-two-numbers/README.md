
Perfect, let’s zoom into that part — you want to know **where the result is actually getting stored** when we do:

`ListNode  newNode  =  new  ListNode(last_digit);
temp.next = newNode;
temp = temp.next;` 

----------

## The Setup Before This

We created:

`ListNode  dummy  =  new  ListNode(0); // a placeholder node  ListNode  temp  = dummy; // temp points to dummy initially` 

So we have:

`dummy (0) → null
 ^ temp` 

----------

## First Iteration (sum = 7)

We create a new node:

`ListNode  newNode  =  new  ListNode(7);` 

Now memory looks like:

`newNode (7) → null` 

Then:

`temp.next = newNode;` 

This means dummy’s `next` now points to the new node:

`dummy (0) → (7) → null
 ^
 temp` 

Now:

`temp = temp.next; // move temp forward` 

So `temp` now points to the `(7)` node:

`dummy (0) → (7) → null
               ^
              temp` 

----------

## Where is "Result" Stored?

-   The **result list is being built starting at `dummy.next`**.
    
-   At this moment, the result is:
    

`(7) → null` 

-   We don’t directly use a variable called `result` — instead, we always attach new nodes to `temp.next`.
    
-   Finally, after the loop ends, we return:
    

`return dummy.next;` 

This **skips the dummy node (0)** and gives us the actual result list.

----------

> ✅ So when you saw:
> 
> `Result: 7` 
> 
> That’s because after the first iteration, the linked list looks like:
> 
> `dummy (0) → (7) → null` 
> 
> and since we return `dummy.next`, the "real result" is:
> 
> `(7) → null`




<h2><a href="https://leetcode.com/problems/add-two-numbers">Add Two Numbers</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>You are given two <strong>non-empty</strong> linked lists representing two non-negative integers. The digits are stored in <strong>reverse order</strong>, and each of their nodes contains a single digit. Add the two numbers and return the sum&nbsp;as a linked list.</p>

<p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;" />
<pre>
<strong>Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
<strong>Output:</strong> [7,0,8]
<strong>Explanation:</strong> 342 + 465 = 807.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> l1 = [0], l2 = [0]
<strong>Output:</strong> [0]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
<strong>Output:</strong> [8,9,9,9,0,0,0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in each linked list is in the range <code>[1, 100]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
	<li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
</ul>
