package oop.inheritancedemo;

public class NormalMember extends Member {
    //    If you want to call a non parameterless constructor in the parent class, you
//have to use the super keyword
    public NormalMember(String pName, int pMemberID, int
            pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee() {
        //super.calculateAnnualFee();
//        DISCOUNT HAS A PRIVATE MDIFIER, CANT BE ACCESSED DIRECTLY BY CHILD CLASS. We use its public method getDiscount from parent
        double discount = getDiscount();
        annualFee = (1-0.01*discount)*(100 + 12*30);
    }


    public static  void main(String[] args) {
        NormalMember mem1 = new NormalMember("James", 1, 2017);
        System.out.println(mem1);
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();

        Member[] clubMembers = new Member[6];
        clubMembers[0] = new NormalMember("James", 1, 2010);
        clubMembers[1] = new NormalMember("Andy", 2, 2011);
        clubMembers[2] = new NormalMember("Bill", 3, 2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] = new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] = new Member("Yvonne", 6, 2013);

        for(Member m: clubMembers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}

