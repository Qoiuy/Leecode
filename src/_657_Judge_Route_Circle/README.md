# 思路及结题步骤
###### Judge Route Circle 
法官 路线 圆？
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place. 
最初，有一个机器人在位置(0,0)。给定一个动作序列，判断这个机器人是否做一个圆，这意味着它会回到原来的位置。
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle. 
动作序列由一个字符串表示。每一个动作都代表一个角色。有效的机器人移动是R(右)，L(左)，U(向上)和D(向下)。输出应该为真或假表示机器人是否做一个圆。

###### 计算一个字符串里面字节数量 代码见[AC_CODE](https://github.com/Qoiuy/ACLeecode/blob/master/src/_657_Judge_Route_Circle/Ac_code.java)
1判断str长度 必须是偶数 如果是基数返回false
2判断R个数，再判断L个数 相等则继续 不相等返回false
3判断U个数 ,在判断D个数 相等则返回true 不相等返回false

###### 发现一个8ms的解法 代码见[Demo](https://github.com/Qoiuy/ACLeecode/blob/master/src/_657_Judge_Route_Circle/Demo.java)
该解法思路：将string变成一个int[]


