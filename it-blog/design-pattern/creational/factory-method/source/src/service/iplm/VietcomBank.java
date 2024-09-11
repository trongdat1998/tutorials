package service.iplm;

import service.Bank;

public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}
