package day3.ecommerce;

import lombok.ToString;

import java.util.Date;
@ToString
public class Client {
    private String clientId;
    private String clientInfo;
    private String clientEmail;
    private Date subscription;

    public Client( String clientId, String clientInfo, String clientEmail, Date subscription) {
        this.clientId = clientId;
        this.clientInfo = clientInfo;
        this.clientEmail = clientEmail;
        this.subscription = subscription;

    }

}
