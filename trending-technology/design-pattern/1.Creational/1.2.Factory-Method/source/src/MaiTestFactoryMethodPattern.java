import models.BankType;
import service.Bank;

public class MaiTestFactoryMethodPattern {
    public static void main(String[] args) {
        Bank TP = BankFactory.getBank(BankType.TPBANK);
        System.out.println(TP.getBankName());
		
		Bank VC = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(VC.getBankName());
    }
}