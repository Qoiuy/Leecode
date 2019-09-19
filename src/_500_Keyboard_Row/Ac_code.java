package _500_Keyboard_Row;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ac_code {
	
//
//	Set<Character> upset = new HashSet<>();
//	Set<Character> middleset = new HashSet<>();
//	Set<Character> downset = new HashSet<>();
//
//	public Solution(){
//		Character[] up = {'q','w','e','r','t','y','u','i','o','p','q','W','E','R','T','Y','Y','I','O','P'};
//        for (Character c : up) {
//        	upset.add(c);
//		}
//        Character[] middle = {'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
//        for (Character c : middle) {
//        	middleset.add(c);
//		}
//        Character[] down = {'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};
//        for (Character c : down) {
//        	downset.add(c);
//		}
//	}
//
//	public static void main(String[] args) {
//		String[] str = {"abdfs","cccd","a","qwwewm"};
//		System.err.println(JSON.toJSON(str));
//		Solution s = new Solution();
//		System.err.println(JSON.toJSONString(s.findWords(str)));
//	}
//
//	public String[] findWords(String[] words) {
//		List<String> ret = new ArrayList<String>();
//		for (String string : words) {
//			int local = 0;
//			for( int i = 0; i < string.length(); i++ ){
//				Character c = string.charAt(i);
//				if(upset.contains(c)){
//					System.err.println(c + " " + local);
//					if(local != 1 && local != 0){
//						local = -1;
//						break;
//					}
//					local = 1;
//				}else if(middleset.contains(c)){
//					System.err.println(c + " " + local);
//					if(local != 2 && local != 0){
//						local = -1;
//						break;
//					}
//					local = 2;
//				}else if(downset.contains(c)){
//					System.err.println(c + " " + local);
//					if(local != 3 && local != 0){
//						local = -1;
//						break;
//					}
//					local = 3;
//				}else{
//					continue;
//				}
//			}
//			if(local != -1 ){
//				ret.add(string);
//			}
//		}
//		return (String[])ret.toArray(new String[ret.size()]);
//    }

}
