

package chapter12.collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter12.collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId){
		
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("아이디가" + memberId + "인 회원은 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}

} // MemberTreeMap
