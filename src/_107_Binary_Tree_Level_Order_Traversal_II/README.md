# 思路及结题步骤
###### Binary Tree Level Order Traversal II

给定一个二叉树，返回其节点值的自底向上的层序遍历。(从左到右，从叶面到根的水平)。
给了顺序了。从做到右 ，从叶子到跟

linkedlist 之前全往first位置塞就好了

发现可以用递归 我试试递归思路

同时发现另一个问题 这demo真坑啊

没一层一个list还是没个节点 ，看样子像是每个节点。
我说的之前思路怎么混乱了

这样 没次都 返回当前节点左右节点的值，
然后添加到list里面，然后再处理左右节点
一堆nullpoint的坑

tmd还是这个坑。md。
[1,2,3,4,null,null,5]
[[4,5],[2,3],[1]]
我就猜到了。


使用list做
如果不会linkedlist的addfirst也做不出来