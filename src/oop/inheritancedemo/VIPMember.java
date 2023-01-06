package oop.inheritancedemo;

public class VIPMember extends Member {
    public VIPMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
    }

    @Override
    public void calculateAnnualFee() {
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }

    public static  void main(String[] args) {
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
        mem2.calculateAnnualFee();
        mem2.displayMemInfo();
    }

}
