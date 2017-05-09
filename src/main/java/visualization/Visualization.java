package visualization;

import java.util.List;
import java.util.ArrayList;

public class Visualization {
    private List<Message> messagesQueue = new ArrayList<>();
    
    public void notify(Message message) {
	System.out.println("Received " + message.getTimestamp());
	messagesQueue.add(message);
    }

    public List<Message> getMessages() {
	List<Message> messages = messagesQueue;
	messagesQueue = new ArrayList<>();
	return messages;
    }
}
