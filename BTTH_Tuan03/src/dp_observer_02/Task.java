package dp_observer_02;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject {
    private List<TeamMember> members = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Pending"; // Mặc định là "Chưa thực hiện"
    }

    @Override
    public void addMember(TeamMember member) {
        members.add(member);
    }

    @Override
    public void removeMember(TeamMember member) {
        members.remove(member);
    }

    @Override
    public void notifyMembers() {
        for (TeamMember member : members) {
            member.update(taskName, status);
        }
    }

    public void updateStatus(String newStatus) {
        if (!this.status.equals(newStatus)) {
            System.out.println("📌 Trạng thái công việc '" + taskName + "' thay đổi: " + status + " → " + newStatus);
            this.status = newStatus;
            notifyMembers();
        }
    }
}

