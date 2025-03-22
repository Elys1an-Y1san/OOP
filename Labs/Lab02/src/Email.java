import java.util.ArrayList;

public class Email {
    String Subject;
    String Sender;
    String Message;

    public Email(String Subject, String Sender, String Message) {
        this.Subject = Subject;
        this.Sender = Sender;
        this.Message = Message;
    }

    ArrayList<Email> myList = new ArrayList<Email>();
}
