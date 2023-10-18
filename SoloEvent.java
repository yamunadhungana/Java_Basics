package Assignments;

public class SoloEvent extends Event {
    private int participantNo;
    
    public SoloEvent(String eventName, String participantName, int participantNo){
        super(eventName, participantName);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
    @Override
    public void registerEvent(){
        super.registerEvent();
    }
    
}
