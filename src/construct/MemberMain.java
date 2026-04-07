package construct;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("Kim", 16);
        Member member2 = new Member("Lee", 18, 95);
        Member member3 = new Member("Park", 17, 75);
        
        Member[] members = new Member[] {member1, member2, member3};
        for (Member member : members) {
            System.out.println("이름: " + member.name);
            System.out.println("나이: " + member.age);
            System.out.println("점수: " + member.grade);
        }
    }
}
