<h2><a href="https://www.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1">Partition a Linked List around a given value</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><div>
<div><span style="font-size: 14pt;">Given the head of a linked list and an integer <strong>x</strong>, rearrange the list such that:</span></div>
<ul>
<li><span style="font-size: 14pt;">All nodes with values <strong>less</strong> than x appear <strong>first</strong>,</span></li>
<li><span style="font-size: 14pt;">Followed by nodes with values <strong>equal</strong> to x,</span></li>
<li><span style="font-size: 14pt;">Followed by nodes with values <strong>greater</strong> than x.</span></li>
</ul>
<div><span style="font-size: 14pt;">The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed <strong>in-place</strong>.</span></div>
</div>
<div>&nbsp;</div>
<div><span style="font-size: 14pt;"><strong>Examples:</strong></span></div>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head: 1-&gt;4-&gt;2-&gt;10, x = 3<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928154/Web/Other/blobid0_1778735551.webp" width="361" height="80"> <br><strong>Output: </strong>1-&gt;2-&gt;4-&gt;10<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928154/Web/Other/blobid1_1778735572.webp" width="361" height="80"><br><strong>Explanation: </strong>Nodes with value less than 3 come first, then equal to 3 and then greater than 3.</span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input:</strong> head: 1-&gt;4-&gt;3-&gt;2-&gt;5-&gt;2-&gt;3, x = 3<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928154/Web/Other/blobid2_1778735647.webp" width="570" height="80"> <br><strong>Output:</strong> 1-&gt;2-&gt;2-&gt;3-&gt;3-&gt;4-&gt;5<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928154/Web/Other/blobid3_1778735682.webp" width="570" height="80"> <br><strong>Explanation:</strong> Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.</span><strong style="font-size: 14pt;"><br></strong></span></pre>
<div><span style="font-size: 14pt;"><strong>Constraints:</strong></span></div>
<div><span style="font-size: 14pt;">1 ≤ size of linked list ≤ 10<sup>5</sup></span></div>
<div><span style="font-size: 14pt;">1 ≤ data of node ≤ 10<sup>5</sup></span></div>
<div><span style="font-size: 12pt;"><span style="font-size: 14pt;">1 ≤ x ≤ 10</span><sup>5</sup></span></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;