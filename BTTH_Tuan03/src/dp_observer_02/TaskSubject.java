package dp_observer_02;

public interface TaskSubject {
    void addMember(TeamMember member);
    void removeMember(TeamMember member);
    void notifyMembers();
}
