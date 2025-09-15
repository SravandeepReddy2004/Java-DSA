#### You're asking why we need two references:

ListNode sorted = new ListNode(0);
ListNode temp = sorted;


instead of just using sorted directly in the merge() function.

#### 1. Purpose of sorted

- sorted is a dummy head node — it doesn't hold any real data, it's just a placeholder to make it easy to build the merged list.
After building the list, we return sorted.next (skipping the dummy node).
- If we only had:
  - ListNode sorted = new ListNode(0);
and then did:
 ``` sorted.next = l1;  // or l2  sorted = sorted.next;```


We would lose the reference to the dummy node.
At the end of the loop, sorted would be pointing to the last node of the merged list, not the dummy head.

2. Purpose of temp

temp acts as a moving pointer that we use to build the merged list step by step.
We keep sorted pointing to the start of the list, so we can return sorted.next later.

In other words:

sorted = fixed reference to the start (dummy head)

temp = pointer we move along while merging

Example to Show the Problem

If you try to use only sorted:
```java
ListNode sorted = new ListNode(0);
while(l1!=null && l2!=null){
    if(l1.val<l2.val){
        sorted.next = l1;
        l1 = l1.next;
    } else {
        sorted.next = l2;
        l2 = l2.next;
    }
    sorted = sorted.next;  // ❌ now 'sorted' moved forward!
}
return sorted.next; // ❌ WRONG: sorted no longer points to start
```

At the end, sorted is at the tail of the merged list, so sorted.next is null, and you lose your result.

Key Takeaway

You need two pointers:

sorted (dummy head) → to remember where the list started

temp (current pointer) → to append nodes as you go

At the end, you can safely return sorted.next because sorted still points to the dummy head.

✅ So the pattern ListNode sorted = new ListNode(0); ListNode temp = sorted; is a common trick to avoid losing the start of the list.



<h2><a href="https://leetcode.com/problems/sort-list">Sort List</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given the <code>head</code> of a linked list, return <em>the list after sorting it in <strong>ascending order</strong></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/14/sort_list_1.jpg" style="width: 450px; height: 194px;" />
<pre>
<strong>Input:</strong> head = [4,2,1,3]
<strong>Output:</strong> [1,2,3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/14/sort_list_2.jpg" style="width: 550px; height: 184px;" />
<pre>
<strong>Input:</strong> head = [-1,5,3,4,0]
<strong>Output:</strong> [-1,0,3,4,5]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> head = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[0, 5 * 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you sort the linked list in <code>O(n logn)</code> time and <code>O(1)</code> memory (i.e. constant space)?</p>
