# 思路及结题步骤
###### Convert Sorted Array to Binary Search Tree

将数组转换成平衡二叉树；

简单的遍历  发现不行。

仔细看了看
[0,-10,5,null,-3,null,9]
发现规律

递归建立树。

建立做子树 右子树 返回root

做数组切分比较麻烦。转移到2个变量上 start end


###### 一晚上 终于想明白终止条件了
当start == end 返回root
当start + 1 == end 返回root+ root.right
