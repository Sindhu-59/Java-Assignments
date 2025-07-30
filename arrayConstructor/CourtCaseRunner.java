class CourtCaseRunner {
    public static void main(String[] args) {

        System.out.println("Main Started - Court Case Information Display");

        CourtCase c1 = new CourtCase("OS/123/2023", "Civil - Property Dispute", "City Civil and Sessions Court, Bengaluru","Mr. Raghavendra Rao", "Mrs. Lakshmi Devi");
        System.out.println("Case ID: " + c1.caseId);
        System.out.println("Case Type: " +c1. caseType);
        System.out.println("Court Name: " + c1.courtName);
        System.out.println("Petitioner/Plaintiff: " + c1.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + c1.respondentDefendant);
		
		CourtCase c2 = new CourtCase( "2024/1/22","2025/7/1", "2025/9/5");
        System.out.println("Filing Date: " + c2.filingDate);
        System.out.println("Last Hearing Date: " +c2.lastHearingDate);
        System.out.println("Next Hearing Date: " +c2. nextHearingDate);
		
		CourtCase c3 = new CourtCase("Notices issued, replies awaited", "Hon'ble Chief Justice & Division Bench");
        System.out.println("Current Status: " + c3.currentStatus);
        System.out.println("Presiding Judge: " +c3. presidingJudge);

    }
}
