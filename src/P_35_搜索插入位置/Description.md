

题目表示  你可以假设数组中无重复元素。


脑袋都懵了。处理什么边界呀

直接去数组里 对比 target
比target小返回就是了



====以下为废弃部分=========
1 .边界处理
target >a[length-1] || target < a[0]


2. 处理时边界处理
判断元素大于 a[i] < a[i+1](边界判断)


if a[i] > target
    判断 a[i+1] > target
        continue
    else
        return i;

