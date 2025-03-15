package dp_observer_02;

public class Developer implements TeamMember {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("📩 " + name + " nhận thông báo: Công việc '" + taskName + "' hiện có trạng thái '" + status + "'");
    }
}

