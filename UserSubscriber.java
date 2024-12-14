package LabAssignment6;

public class UserSubscriber implements Subscriber {
    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }

    @Override
    public String getName() {
        return name;
    }
}
