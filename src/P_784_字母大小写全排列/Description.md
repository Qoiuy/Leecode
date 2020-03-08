
思路其实很简单
问题是如何能快速的生成这个list 呢？

拒绝拼装
用 System.arraycopy(); 去生成一个String;


我要用一个String数组操作。每一次生成

... 上面的想法都是无用的想法
我自己重新列了abcde 5个字母的全排列，发现规律 下面的数字为变化的位置
f(2) = f(1)自身变化 + change(2) + f(1) => 即变换位置为 121
f(3) = f(2)自身变化 + change(3) + f(2) => 121 3 121
f(4) = f(3)自身变化 + change(4) + f(3) => 1213121 4 1213121
f(5) = f(4)自身变化 + change(5) + f(4) => 1213121 4 1213121 5 1213121 4 1213121

上面这段逻辑 是核心逻辑 用递归实现 伪代码为 加号代表依次运行。不然结果应该会有问题
func(arr, 1)
= change(1)

func(arr, 2)
= func(arr, 1) + change(2), + func(arr, 1)

func(arr, 3)
= func(arr, 2) + change(3) + func(arr,2)

func(arr, 4)
= func(arr, 3) + change(4) + func(arr, 3)
