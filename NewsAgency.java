package LabAssignment6;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed.");
    }
    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publish(String news) {
        System.out.println("\nBreaking News: " + news);
        notifySubscribers(news);
    }
}
