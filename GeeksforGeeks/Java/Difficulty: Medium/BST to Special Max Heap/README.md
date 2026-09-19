<h2><a href="https://www.geeksforgeeks.org/problems/bst-to-max-heap/1">BST to Special Max Heap</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a Binary Search Tree, convert it into a Special Max Heap with the condition that all the values in the left subtree of a node should be less than all the values in the right subtree of the node. This condition is applied on all the nodes in the so converted Max Heap.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [4, 2, 6, 1, 3, 5, 7]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928896/Web/Other/blobid0_1787215628.png" alt="" width="235" height="171">
<strong>Output:</strong> [1, 2, 3, 4, 5, 6, 7] 
<strong>Explanation: </strong>The given BST has been transformed into a Special Max Heap while keeping the tree structure unchanged, and its postorder traversal is 1 2 3 4 5 6 7.<br>The converted tree is:
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928896/Web/Other/blobid1_1787215628.png" alt="" width="244" height="179">
</span></pre>
<pre><span style="font-size: 18px;"><span style="font-size: 14pt;"><strong>Input:</strong></span><span style="font-size: 18px;"><span style="font-size: 14pt;"> root[] = [5, 3, 8, 2, 4, 7, 9]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928896/Web/Other/blobid3_1787215628.png" alt="" width="239" height="174">
<strong>Output:</strong> [2, 3, 4, 5, 7, 8, 9]
<strong>Explanation:</strong> The given BST has been transformed into a Special Max Heap while keeping the tree structure unchanged, and its postorder traversal is 2 3 4 5 7 8 9.
The converted tree is:
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928896/Web/Other/blobid0_1787377121.png" alt="" width="241" height="177"></span></span></span></pre>
<div>&nbsp;</div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>DE Shaw</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search Tree</code>&nbsp;<code>Heap</code>&nbsp;