🔑 How it works:

Double loop trick (i < 2*n):

Since the array is circular, we simulate two rounds of traversal.

Example: For [1,2,1], after reaching end, we continue from beginning.

Stack stores indexes:

Keeps track of elements whose "next greater" we haven’t found yet.

We compare with current element, and when found, update the result.

Why if (i < n) stack.push(i):

We only need to store indexes of first pass.

In the second pass, we only help resolve circular next greater elements.

Example walkthrough:

nums = [1, 2, 1]

Start: res = [-1, -1, -1], stack = []

i=0: push 0 → stack = [0]

i=1: nums[0] < 2 → res[0] = 2, pop 0 → stack = [] → push 1 → stack = [1]

i=2: push 2 → stack = [1, 2]

i=3: nums[2] < 1? no. (circular check, curr=1)

i=4: nums[2] < 2 → res[2] = 2, pop 2 → stack = [1]

i=5: end loop.

Final: [2, -1, 2]

---
<h2><a href="https://leetcode.com/problems/next-greater-element-ii">Next Greater Element II</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given a circular integer array <code>nums</code> (i.e., the next element of <code>nums[nums.length - 1]</code> is <code>nums[0]</code>), return <em>the <strong>next greater number</strong> for every element in</em> <code>nums</code>.</p>

<p>The <strong>next greater number</strong> of a number <code>x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn&#39;t exist, return <code>-1</code> for this number.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,1]
<strong>Output:</strong> [2,-1,2]
Explanation: The first 1&#39;s next greater number is 2; 
The number 2 can&#39;t find next greater number. 
The second 1&#39;s next greater number needs to search circularly, which is also 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,3]
<strong>Output:</strong> [2,3,4,-1,4]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>
