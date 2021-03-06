package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String topic;

	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		setTopic(topic);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "SubscribeMsg [topic=" + topic + " message: " + super.toString() + "]";
	}
	
	

	// message sent from client to subscribe on a topic 
	
	// TODO:
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
