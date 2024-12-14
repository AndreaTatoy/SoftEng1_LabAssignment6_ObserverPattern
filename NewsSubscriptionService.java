package LabAssignment6;

public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new UserSubscriber("Alice");
        Subscriber bob = new UserSubscriber("Bob");

        agency.subscribe(alice);
        agency.subscribe(bob);

        agency.publish("\nNew vaccine developed!");

        agency.unsubscribe(bob);

        agency.publish("\nGlobal markets on the rise!");
    }
}