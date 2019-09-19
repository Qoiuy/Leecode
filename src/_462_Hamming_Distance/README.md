# 思路及结题步骤
###### Hamming Distance fanyi.youdao 汉明距离

###### 百度汉明距离
汉明距离是使用在数据传输差错控制编码里面的，汉明距离是一个概念，它表示两个（相同长度）字对应位不同的数量，我们以d（x,y）表示两个字x,y之间的汉明距离。对两个字符串进行异或运算，并统计结果为1的个数，那么这个数就是汉明距离。

###### 第一次理解
两个字符串不同的地方。

###### 放在题里面就是 两个数字转成2进制之后的汉明距离

###### 思路1
将x y转成2进制数 然后计算汉明距离

###### 思路2 数字的二进制汉明距离 是否有新的计算方式  
即 先求两个数的差 然后把差除2 4 8 16 32 .. 整除则为0不整除则为1  

###### 其实 这道题的原意应该是二进制的异或运算
因为 按照我之前的思路，都是按照10进制考虑运算的 而计算机使用二进制运算的。
我可以写两个demo测试一下时间就好了。
第一个 转成2进制然后再转成str. 进行汉明计算，给出结果。代码见[Demo1](https://github.com/Qoiuy/ACLeecode/blob/master/src/_462_Hamming_Distance/Demo1.java) 18 ms -> beats 3.01 %
第二个 两个数进行异或运算，使用str计算结果。代码见[Demo2](https://github.com/Qoiuy/ACLeecode/blob/master/src/_462_Hamming_Distance/Demo2.java) 11 ms -> beats 40.05 % 

第三个 两个数进行异或运算，然后清除最右侧的1统计清除1的次数 代码见[Demo3](https://github.com/Qoiuy/ACLeecode/blob/master/src/_462_Hamming_Distance/Demo3.java) 14ms -> beats 9.39 % 
	例如8（1000）= 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）= 0（0000）
	7（0111）= 6（0110）+ 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110）
优化：代码见[Ac_code](https://github.com/Qoiuy/ACLeecode/blob/master/src/_462_Hamming_Distance/Ac_code.java) 
	if ((x ^ y) == 0) return 0; 
 