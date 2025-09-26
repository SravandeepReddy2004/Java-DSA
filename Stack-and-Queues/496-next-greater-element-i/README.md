🔹 Step 1: Precompute next greater elements (Monotonic Stack)

We scan nums2 from right to left.

A stack is used to keep only elements that are greater than the current number (monotonic decreasing stack).

Example: nums2 = [1,3,4,2]

Process from right → left:

2: stack empty → nextGreater[2] = -1 → push(2).
Stack = [2]

4: stack top 2 ≤ 4 → pop(2). stack empty → nextGreater[4] = -1 → push(4).
Stack = [4]

3: stack top 4 > 3 → nextGreater[3] = 4 → push(3).
Stack = [4,3]

1: stack top 3 > 1 → nextGreater[1] = 3 → push(1).
Stack = [4,3,1]

✅ Final mapping:

1 → 3
2 → -1
3 → 4
4 → -1

🔹 Step 2: Answer for nums1

Now we simply lookup in nextGreater for each element of nums1.

Example nums1 = [4,1,2] → results: [-1, 3, -1]

🔹 Why is this O(n)?

Each element in nums2 is pushed and popped at most once.

So total work in the main loop is O(n).

Building the answer for nums1 is also O(n).

🔹 Key Idea

Use stack to maintain "candidates for next greater".

Use array/map (nextGreater[]) to store answers for fast lookup.

Then just lookup for nums1.

---
<h2><a href="https://leetcode.com/problems/next-greater-element-i">Next Greater Element I</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>The <strong>next greater element</strong> of some element <code>x</code> in an array is the <strong>first greater</strong> element that is <strong>to the right</strong> of <code>x</code> in the same array.</p>

<p>You are given two <strong>distinct 0-indexed</strong> integer arrays <code>nums1</code> and <code>nums2</code>, where <code>nums1</code> is a subset of <code>nums2</code>.</p>

<p>For each <code>0 &lt;= i &lt; nums1.length</code>, find the index <code>j</code> such that <code>nums1[i] == nums2[j]</code> and determine the <strong>next greater element</strong> of <code>nums2[j]</code> in <code>nums2</code>. If there is no next greater element, then the answer for this query is <code>-1</code>.</p>

<p>Return <em>an array </em><code>ans</code><em> of length </em><code>nums1.length</code><em> such that </em><code>ans[i]</code><em> is the <strong>next greater element</strong> as described above.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [4,1,2], nums2 = [1,3,4,2]
<strong>Output:</strong> [-1,3,-1]
<strong>Explanation:</strong> The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,<u>4</u>,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [<u>1</u>,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,<u>2</u>]. There is no next greater element, so the answer is -1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [2,4], nums2 = [1,2,3,4]
<strong>Output:</strong> [3,-1]
<strong>Explanation:</strong> The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,<u>2</u>,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,<u>4</u>]. There is no next greater element, so the answer is -1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length &lt;= nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 10<sup>4</sup></code></li>
	<li>All integers in <code>nums1</code> and <code>nums2</code> are <strong>unique</strong>.</li>
	<li>All the integers of <code>nums1</code> also appear in <code>nums2</code>.</li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you find an <code>O(nums1.length + nums2.length)</code> solution?
