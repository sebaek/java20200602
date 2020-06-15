package chap11.examples.sec110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		System.out.println(k1.equals(k2));
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		hashMap.put(k1, "홍길동");
		
		String value = hashMap.get(k2);
		System.out.println(value);
	}
}







