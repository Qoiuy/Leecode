
[0,0,1,1,1,2,2,3,3,4]


进入for循环
i = 1
return = 0 <= a[i] = a[return]
[0,0,1,1,1,2,2,3,3,4]

i = 2
return = 1 <= a[i] != a[return]
[0,1,1,1,1,2,2,3,3,4] <= a[return] = a[i]

i = 3
return = 1 <= a[i] = a[return]
[0,1,1,1,1,2,2,3,3,4]

i = 4
return = 1 <= a[i] = a[return]
[0,1,1,1,1,2,2,3,3,4]

i = 5
return = 2 <= a[i] != a[return]
[0,1,2,1,1,2,2,3,3,4] <= a[return] = a[i]

i = 6
return = 2 <= a[i] = a[return]
[0,1,2,1,1,2,2,3,3,4]

i = 7
return = 3 <= a[i] != a[return]
[0,1,2,3,1,2,2,3,3,4] <= a[return] = a[i]

i = 8
return =3 <= a[i] != a[return]
[0,1,2,3,4,2,2,3,3,4] <= a[return] = a[i]


坑 没说是正序还是逆序
坑 返回值 返回长度

