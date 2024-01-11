package day3;

import java.util.Arrays;

public class SimCard {
    private String phoneNumber;
    private float credit;
    private Call[] callsList;
    public SimCard(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0;
        this.callsList = new Call[5];
    }

    public void printInfoSim() {
        System.out.println(this.phoneNumber);
        System.out.println(this.credit);
        System.out.println(Arrays.toString(this.callsList));
    }

}

