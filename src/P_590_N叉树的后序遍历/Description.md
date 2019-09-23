递归法很简单，你可以使用迭代法完成此题吗?

先试试递归
递归是什么思路呢？ 先返回子节点的全部数据 是一个list，加当前节点，返回。
然后递归子节点，
再处理当前节点 AC 代码。
public List<Integer> postorder(Node root) {
        if (root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        root.children.forEach(node -> {
            List<Integer> nodeList = postorder(node);
            if (nodeList != null && nodeList.size() > 0){
                list.addAll(nodeList);
            }
        });

        list.add(root.val);

        return list;
    }


    迭代法。啥是迭代法来着？
    是不是非递归那种啊？
    建立一个数组 使用循环进行处理 。遍历链表，遍历之后再进行添加

    拿list 怎么弄循环？

    拿一个list 存储所以节点就好了啊

    写完之后发现不是后序。那什么是后序呢？
    将所有数据都放在list里面吧。然后倒叙 。虽然想法有点粗糙 先这样。脑袋有点混 NA了

第二次NA  错在了 [6,5,0,10,3,1]

其实就是 先处理子节点，然后处理当前节点。
如果 我先用listlist存储全部子节点。
打印子节点。然后再打印父节点呢？ 不是这样的顺序
应该是 子节点 父节点 子节点 父节点
遍历方式不对
使用一个list
如果有子节点 存储当前节点，几全部其他数据


需要用到栈  然后写一个复杂的存取逻辑

AC

