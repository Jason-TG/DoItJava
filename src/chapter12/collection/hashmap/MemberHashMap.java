

package chapter12.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		
		hashMap.put(member.getMemberId(), member); 
		// put(key, value)
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)){
			// 키 값 존재 유무 확인
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println("아이디가" + memberId + "인 회원은 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = hashMap.keySet().iterator();
		// hashMap.keySet() => hashMap이 가진 key들을 set 으로 반환 
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
		// hashMap.get(key) 매개변수로 받는 key 값을 가진 항목을 반환
			System.out.println(member);
		}	
		System.out.println();
	}
	
	
} // MemberHashMap
