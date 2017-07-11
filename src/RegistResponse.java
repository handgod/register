public class RegistResponse {

    private String IMEI;
    private String RepeaterIpAddress;
    private String USERID;
    public RegistResponse() {
    }

    //{"regInfo":{"IMEI":"1234567890987665","RepeaterIpAddress":"118.89.48.252","uniqueId":"123456"}}
    //   {"result":{""pubKey":"QLko+wY7lfIEawdUdBNhTQ==","repeater":"120.77.81.21","sessionId":"17522","stunChangeAddress":{"ip":"121.43.164.239","port":3476},"stunServer":{"ip":"121.43.176.37","mainPort":3478,"otherPort":3479},"userId":80514086203868105},"status":true}

    public RegistResponse(String IMEI, String RepeaterIpAddress,String USERID) {
        this.IMEI = IMEI;
        this.RepeaterIpAddress = RepeaterIpAddress;
        this.USERID = USERID;

    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getRepeaterIpAddress() {
        return RepeaterIpAddress;
    }

    public void setRepeaterIpAddress(String RepeaterIpAddress) {
        this.RepeaterIpAddress = RepeaterIpAddress;
    }

}
