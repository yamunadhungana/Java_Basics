package Assignments;

public class TeamEvent extends Event {
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo){
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
    
    @Override
    public void registerEvent(){
        switch(super.getEventName()){
            case "Singing":
            setRegistrationFee(4*noOfParticipants);
            break;
            case "Dancing":
            setRegistrationFee(6*noOfParticipants);
            break;
            case "DigitalArt":
            setRegistrationFee(8*noOfParticipants);
            break;
            case "Acting":
            setRegistrationFee(10*noOfParticipants);
            break;
            default:
            setRegistrationFee(0*noOfParticipants);

        }
        
    }
    
}
