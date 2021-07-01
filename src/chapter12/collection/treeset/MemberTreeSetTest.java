package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {
	
	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
				
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberKim = new Member(1005, "김종현");
		Member memberJeon = new Member(1007, "전수호");
				
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberJeon);
		memberTreeSet.addMember(memberJeon);
		memberTreeSet.addMember(memberJeon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복 
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

} // MemberTreeSetTest
