package com.xijian.test1;
class Node {
    int val;
    Node left;
    Node(int x) { val = x; }
}
public class Solution {

    public Node twoTreeNum(Node n1, Node n2){

        if(n1 == null){
            return  n2;
        }
        if(n2 == null){
            return n1;
        }

        Integer tenNumber = 0;
        while (n1 != null || n2 != null){
            Integer tmp = tenNumber +
                    (n2 == null ? 0 : n2.val) +
                    (n1 == null ? 0 : n1.val);

            tenNumber = 0;
            if(tmp >= 10 ){
                tenNumber = 1;
            }
        }

        return null
                ;
    }
}
