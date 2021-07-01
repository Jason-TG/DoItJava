

package chapter12.collection.hashset;


import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId){
// HashSet는 순서가 없으므로 이터레이터로 각 항목을 확인한다. 
		Iterator<Member> ir = hashSet.iterator();
		
		while( ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId){
				hashSet.remove(member);
				// HashSet의 remove는 순서가 없어 객체 참조변수를 입력해야 하므로 리턴값은 boolean이다. 
				return true;
			}
		}
		
		System.out.println("아이디가" + memberId + "인 회원은 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		for(Member member : hashSet){
			System.out.println(member);
		}
		System.out.println();
	}
	
} // MemberHashSet
 