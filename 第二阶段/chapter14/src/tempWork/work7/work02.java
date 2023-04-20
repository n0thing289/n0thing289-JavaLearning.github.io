package tempWork.work7;

public class work02 {
    public static void main(String[] args) {
        Mail mail1 = new Mail("hwk",
                "zwf","zwf是大笨蛋","zwf买了100朵花");
        System.out.println(mail1);
    }
}
class Mail{
    private String sendName;
    private String receiver;
    private String theme;
    private String bill;

    public Mail(String sendName, String receiver, String theme, String bill) {
        this.sendName = sendName;
        this.receiver = receiver;
        this.theme = theme;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sendName='" + sendName + '\'' +
                ", receiver='" + receiver + '\'' +
                ", theme='" + theme + '\'' +
                ", bill='" + bill + '\'' +
                '}';
    }
}
