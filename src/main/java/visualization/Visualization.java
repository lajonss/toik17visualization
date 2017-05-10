package visualization;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class Visualization {
    private List<Message> messagesQueue = new ArrayList<>();

    @Autowired
    private SimpMessagingTemplate template;

    public void notify(Message message) {
	System.out.println("Received " + message.getTimestamp());
	messagesQueue.add(message);
	template.convertAndSend("/fitness", message);
    }

    public List<Message> getMessages() {
	List<Message> messages = messagesQueue;
	messagesQueue = new ArrayList<>();
	return messages;
    }
}
