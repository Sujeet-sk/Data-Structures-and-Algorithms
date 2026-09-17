<h2><a href="https://www.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1">Flatten Binary Tree to Linked List</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given the root of a binary tree, flatten the tree into a Linked list:</span></p>
<ul>
<li><span style="font-size: 14pt;">The linked list should use the same Node class where the right child pointer points to the next node in the list and the left child pointer is always null.</span></li>
<li><span style="font-size: 14pt;">The linked list nodes should be in the same order as a preorder traversal of the binary tree.</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [1, 2, 5, 3, 4, 6]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933078/Web/Other/blobid0_1787134399.png" alt="" width="434" height="315"></span><br><span style="font-size: 14pt;"><strong>Output: </strong>[1, 2, 3, 4, 5, 6]  </span><br><span style="font-size: 14pt;"><strong>Explanation: </strong>After flattening, the tree looks like:<br>     1
      \
       2
        \
         3
          \
           4
            \ 
             5 <br>              \<br>               6<br>Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 2 3 4 5 6.</span></pre>
<div>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [1, 3, 4, 2, 5]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933078/Web/Other/blobid1_1787134399.png" alt="" width="379" height="462">
<strong>Output:</strong> [1, 3, 4, 2, 5] 
<strong>Explanation: </strong>After flattening, the tree looks like:
     1
      \
       3
        \
         4
          \
           2
            \ 
             5 
Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 3 4 2 5.</span></pre>
</div>
<div>&nbsp;</div>
<div><span style="font-size: 14pt;"><strong>Constraints :</strong></span></div>
<div><span style="font-size: 14pt;">1&lt;= number of nodes in binary tree &lt;= 10<sup>5</sup></span></div>
<div><span style="font-size: 14pt;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1&lt;= data of nodes &lt;= 10</span><sup style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">5</sup></span></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Tree</code>&nbsp;