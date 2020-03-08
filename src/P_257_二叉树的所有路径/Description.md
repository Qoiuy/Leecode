使用测试获得结果
["1->2->5","1->3"]
中序遍历

   1
 /   \
2     3
 \
  5

1 判断1节点是否有左右节点 有 stringBuffer .append(->1)
    2. 判断2节点是否有左右节点 有 stringBuffer .append(->2)
        3.判断 5节点是否有左右节点，没有。 返回stringBuffer .append(->5)

    3. 判断3节点是否有左右节点 没有  返回stringBuffer .append(3)
