package Assignments;

public class Event {
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName){
        this.eventName = eventName;
        this.participantName = participantName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
    public void registerEvent(){
        switch(this.eventName){
            case "Singing":
            this.registrationFee = 8;
            break;
            case "Dancing":
            this.registrationFee = 10;
            break;
            case "DigitalArt":
            this.registrationFee = 12;
            break;
            case "Acting":
            this.registrationFee = 15;
            break;

        }
    } 
}
