class CourtCase {
    String caseId;
    String caseType; 
    String courtName;
    String petitionerPlaintiff;
    String respondentDefendant;
    String filingDate;
    String lastHearingDate;
    String nextHearingDate;
    String currentStatus; 
    String presidingJudge; 

    CourtCase(String caseId, String caseType, String courtName, String petitionerPlaintiff,String respondentDefendant){
		this.caseId = caseId;
        this.caseType = caseType;
        this.courtName = courtName;
        this.petitionerPlaintiff = petitionerPlaintiff;
        this.respondentDefendant = respondentDefendant;
		}						
	CourtCase(LocalDate filingDate, LocalDate lastHearingDate,LocalDate nextHearingDate){
		
		this.filingDate = filingDate;
        this.lastHearingDate = lastHearingDate;
        this.nextHearingDate = nextHearingDate;
		
	CourtCase(String currentStatus, String presidingJudge) {
        this.currentStatus = currentStatus;
        this.presidingJudge = presidingJudge;
    }

   
}
