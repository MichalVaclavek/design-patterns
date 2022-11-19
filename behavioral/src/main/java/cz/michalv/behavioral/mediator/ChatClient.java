package cz.michalv.behavioral.mediator;

/**
 * Mediator design pattern is used to provide a centralized communication medium between different objects in a system.
 * Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other.
 * Allows for the actions of each object set to vary independently of one another.
 *
 * Simple program where we will create mediator and add users to the group and one of the user will send a message
 *
 * Podle komentaru dost podobne napr. Visitor paternu
 */
public class ChatClient {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Michal");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Sauron");
        User user4 = new UserImpl(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }
}
