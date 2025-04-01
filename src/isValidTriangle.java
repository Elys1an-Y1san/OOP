/// {"Amy", "Philip", "Hubert"}
///  Thank you, Amy. You have ticket number 1.
/// Thank you, Philip. You have ticket number 2.
/// Thank you, Hubert. You have ticket number 3.
/// Fill in the body of the following method such that, given an array names of names of people buying tickets, it prints a thank you message and the ticket number for each. Ticket numbers are assigned sequentially starting from 1.
void printTicketMessages(String[] names) {
    String arr[] = {"Amy", "Philip", "Hubert"};
    for (int i = 0; i < arr.length; i++ ) {
        System.out.println("Thank you, " + names[i] + " . " + "You have ticket number" + i + 1);
    }
}

public void main() {
}