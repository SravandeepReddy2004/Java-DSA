🔑 Key Ideas

Stack stores indices of bars

We maintain indices of bars in increasing height order.

Example: if bars are [2, 1, 5], stack helps us know when a rectangle should "end".

Why i == n is special?

At the very end (i == n), we forcefully empty the stack.

This makes sure we calculate areas for bars that never got popped during the loop.

Width Calculation

When popping a bar:

height = arr[poppedIndex] → rectangle height

width = (st.isEmpty() ? i : i - st.peek() - 1)

If stack empty → rectangle spans from 0 to i-1

Otherwise → spans between (st.peek() + 1) and (i - 1)

📊 Example Walkthrough
Input:

arr = [2,1,5,6,2,3]

Step-by-Step:

i=0: push(0) → stack = [0]

i=1: arr[1]=1 < arr[0]=2 → pop(0), height=2, width=1, area=2
push(1) → stack=[1]

i=2: push(2) → stack=[1,2]

i=3: push(3) → stack=[1,2,3]

i=4: arr[4]=2 < arr[3]=6 → pop(3), height=6, width=1, area=6
arr[4]=2 < arr[2]=5 → pop(2), height=5, width=2, area=10 ✅
push(4) → stack=[1,4]

i=5: push(5) → stack=[1,4,5]

i=6 (end): pop remaining

pop(5): height=3, width=1, area=3

pop(4): height=2, width=4, area=8

pop(1): height=1, width=6, area=6

Max Area = 10
⏱️ Complexity

Each bar pushed once, popped once → O(n) time.

Stack storage → O(n) space.

---
<h2><a href="https://leetcode.com/problems/largest-rectangle-in-histogram">Largest Rectangle in Histogram</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><p>Given an array of integers <code>heights</code> representing the histogram&#39;s bar height where the width of each bar is <code>1</code>, return <em>the area of the largest rectangle in the histogram</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/histogram.jpg" style="width: 522px; height: 242px;" />
<pre>
<strong>Input:</strong> heights = [2,1,5,6,2,3]
<strong>Output:</strong> 10
<strong>Explanation:</strong> The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/histogram-1.jpg" style="width: 202px; height: 362px;" />
<pre>
<strong>Input:</strong> heights = [2,4]
<strong>Output:</strong> 4
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= heights.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= heights[i] &lt;= 10<sup>4</sup></code></li>
</ul>
