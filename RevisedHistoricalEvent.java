public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription, citation;

    // Constructors
    public RevisedHistoricalEvent() {
        super();

        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedHistoricalEvent(String description, Date date, String revisedDescription, String citationString) {
        super(description, date);

        this.revisedDescription = revisedDescription;
        this.citation = citationString;
    }

    // Setters
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    // Getters
    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }

    public String toString() {
        String superString = super.toString();

        return superString + '\n' + this.revisedDescription + '\n' + this.citation;
    }

    public int compareTo(Object object) {
        HistoricalEvent event = (HistoricalEvent) object;

        if (this.date.equals(event.date))
            return -1;
        if (this.date.equals(event.date))
            return 0;

        return 1;
    }

    public void teach() {
        System.out.println("\n====================================================");
        System.out.println("REVISED HISTORICAL EVENT EXAMPLE: ");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}
