⚙️ How it Works

Histogram Building (per row):

Example matrix first 3 rows:

Row 1: ['1','0','1','0','0'] → heights = [1,0,1,0,0]
Row 2: ['1','0','1','1','1'] → heights = [2,0,2,1,1]
Row 3: ['1','1','1','1','1'] → heights = [3,1,3,2,2]


Heights keep increasing when we see consecutive '1', reset to 0 when '0'.

Largest Rectangle in Histogram:

At each row, compute max rectangle using stack:

Stack stores indexes of increasing heights.

If current height < height at top of stack:

Pop from stack → compute area with popped height.

Width = currentIndex - stackTopIndexAfterPop - 1.

Update maxArea:

Keep track of largest rectangle across all rows.

✅ Example Walkthrough

Matrix:

[ '1','0','1','0','0' ]


Heights after row 1 → [1,0,1,0,0]
Largest rectangle = 1.

Row 2:
Heights → [2,0,2,1,1]
Largest rectangle = 3 (two consecutive 1’s with height 1).

Row 3:
Heights → [3,1,3,2,2]
Largest rectangle = 6 (rectangle of width 3, height 2).

⏱️ Complexity

Building histogram: O(rows * cols)

Largest rectangle in histogram: O(cols) per row.

Total = O(rows * cols).

---
<h2><a href="https://leetcode.com/problems/maximal-rectangle">Maximal Rectangle</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><p>Given a <code>rows x cols</code>&nbsp;binary <code>matrix</code> filled with <code>0</code>&#39;s and <code>1</code>&#39;s, find the largest rectangle containing only <code>1</code>&#39;s and return <em>its area</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/14/maximal.jpg" style="width: 402px; height: 322px;" />
<pre>
<strong>Input:</strong> matrix = [[&quot;1&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;],[&quot;1&quot;,&quot;0&quot;,&quot;1&quot;,&quot;1&quot;,&quot;1&quot;],[&quot;1&quot;,&quot;1&quot;,&quot;1&quot;,&quot;1&quot;,&quot;1&quot;],[&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;]]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The maximal rectangle is shown in the above picture.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> matrix = [[&quot;0&quot;]]
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> matrix = [[&quot;1&quot;]]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>rows == matrix.length</code></li>
	<li><code>cols == matrix[i].length</code></li>
	<li><code>1 &lt;= row, cols &lt;= 200</code></li>
	<li><code>matrix[i][j]</code> is <code>&#39;0&#39;</code> or <code>&#39;1&#39;</code>.</li>
</ul>
