
class CourtCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Court Case Information Display");

        
        CourtCase case1 = new CourtCase();
        case1.caseId = "OS/123/2023"; 
        case1.caseType = "Civil - Property Dispute";
        case1.courtName = "City Civil and Sessions Court, Bengaluru";
        case1.petitionerPlaintiff = "Mr. Raghavendra Rao";
        case1.respondentDefendant = "Mrs. Lakshmi Devi";
        case1.filingDate = LocalDate.of(2023, 5, 10);
        case1.lastHearingDate = LocalDate.of(2025, 7, 15);
        case1.nextHearingDate = LocalDate.of(2025, 8, 20);
        case1.currentStatus = "Arguments in progress";
        case1.presidingJudge = "Hon'ble Judge Shri. K. S. Murthy";

        System.out.println("Case ID: " + case1.caseId);
        System.out.println("Case Type: " + case1.caseType);
        System.out.println("Court Name: " + case1.courtName);
        System.out.println("Petitioner/Plaintiff: " + case1.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case1.respondentDefendant);
        System.out.println("Filing Date: " + case1.filingDate);
        System.out.println("Last Hearing Date: " + case1.lastHearingDate);
        System.out.println("Next Hearing Date: " + case1.nextHearingDate);
        System.out.println("Current Status: " + case1.currentStatus);
        System.out.println("Presiding Judge: " + case1.presidingJudge);
        System.out.println();

        // Case 2: Divorce Petition (Family)
        CourtCase case2 = new CourtCase();
        case2.caseId = "MCD/45/2024"; // Matrimonial Case (Divorce)
        case2.caseType = "Family - Divorce";
        case2.courtName = "Family Court, Bengaluru";
        case2.petitionerPlaintiff = "Mrs. Anjali Sharma";
        case2.respondentDefendant = "Mr. Vikram Sharma";
        case2.filingDate = LocalDate.of(2024, 1, 22);
        case2.lastHearingDate = LocalDate.of(2025, 7, 1);
        case2.nextHearingDate = LocalDate.of(2025, 9, 5);
        case2.currentStatus = "Mediation recommended, awaiting report";
        case2.presidingJudge = "Hon'ble Judge Smt. P. L. Gowda";

        System.out.println("Case ID: " + case2.caseId);
        System.out.println("Case Type: " + case2.caseType);
        System.out.println("Court Name: " + case2.courtName);
        System.out.println("Petitioner/Plaintiff: " + case2.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case2.respondentDefendant);
        System.out.println("Filing Date: " + case2.filingDate);
        System.out.println("Last Hearing Date: " + case2.lastHearingDate);
        System.out.println("Next Hearing Date: " + case2.nextHearingDate);
        System.out.println("Current Status: " + case2.currentStatus);
        System.out.println("Presiding Judge: " + case2.presidingJudge);
        System.out.println();

        // Case 3: Criminal Case (Theft)
        CourtCase case3 = new CourtCase();
        case3.caseId = "CC/789/2022"; // Criminal Case
        case3.caseType = "Criminal - Theft";
        case3.courtName = "Magistrate Court, Bengaluru North";
        case3.petitionerPlaintiff = "State of Karnataka";
        case3.respondentDefendant = "Mr. Ravi Kumar";
        case3.filingDate = LocalDate.of(2022, 11, 1);
        case3.lastHearingDate = LocalDate.of(2025, 7, 10);
        case3.nextHearingDate = LocalDate.of(2025, 8, 12);
        case3.currentStatus = "Cross-examination of prosecution witness";
        case3.presidingJudge = "Chief Judicial Magistrate Smt. D. N. Reddy";

        System.out.println("Case ID: " + case3.caseId);
        System.out.println("Case Type: " + case3.caseType);
        System.out.println("Court Name: " + case3.courtName);
        System.out.println("Petitioner/Plaintiff: " + case3.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case3.respondentDefendant);
        System.out.println("Filing Date: " + case3.filingDate);
        System.out.println("Last Hearing Date: " + case3.lastHearingDate);
        System.out.println("Next Hearing Date: " + case3.nextHearingDate);
        System.out.println("Current Status: " + case3.currentStatus);
        System.out.println("Presiding Judge: " + case3.presidingJudge);
        System.out.println();

        
        CourtCase case4 = new CourtCase();
        case4.caseId = "WP(PIL)/50/2024"; 
        case4.caseType = "PIL - Environmental Protection";
        case4.courtName = "High Court of Karnataka, Principal Bench, Bengaluru";
        case4.petitionerPlaintiff = "Citizens for Clean Air Trust";
        case4.respondentDefendant = "State of Karnataka & BBMP";
        case4.filingDate = LocalDate.of(2024, 3, 15);
        case4.lastHearingDate = LocalDate.of(2025, 7, 20);
        case4.nextHearingDate = LocalDate.of(2025, 10, 1);
        case4.currentStatus = "Notices issued, replies awaited";
        case4.presidingJudge = "Hon'ble Chief Justice & Division Bench";

        System.out.println("Case ID: " + case4.caseId);
        System.out.println("Case Type: " + case4.caseType);
        System.out.println("Court Name: " + case4.courtName);
        System.out.println("Petitioner/Plaintiff: " + case4.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case4.respondentDefendant);
        System.out.println("Filing Date: " + case4.filingDate);
        System.out.println("Last Hearing Date: " + case4.lastHearingDate);
        System.out.println("Next Hearing Date: " + case4.nextHearingDate);
        System.out.println("Current Status: " + case4.currentStatus);
        System.out.println("Presiding Judge: " + case4.presidingJudge);
        System.out.println();

        // Case 5: Motor Accident Claims Tribunal (MACT)
        CourtCase case5 = new CourtCase();
        case5.caseId = "MACT/15/2023";
        case5.caseType = "MACT - Compensation Claim";
        case5.courtName = "MACT, Mysuru";
        case5.petitionerPlaintiff = "Mr. Suresh K.";
        case5.respondentDefendant = "ABC Insurance Co. & Mr. Anil Reddy";
        case5.filingDate = LocalDate.of(2023, 7, 1);
        case5.lastHearingDate = LocalDate.of(2025, 6, 25);
        case5.nextHearingDate = LocalDate.of(2025, 8, 5);
        case5.currentStatus = "Evidence led by claimant";
        case5.presidingJudge = "Member, MACT";

        System.out.println("Case ID: " + case5.caseId);
        System.out.println("Case Type: " + case5.caseType);
        System.out.println("Court Name: " + case5.courtName);
        System.out.println("Petitioner/Plaintiff: " + case5.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case5.respondentDefendant);
        System.out.println("Filing Date: " + case5.filingDate);
        System.out.println("Last Hearing Date: " + case5.lastHearingDate);
        System.out.println("Next Hearing Date: " + case5.nextHearingDate);
        System.out.println("Current Status: " + case5.currentStatus);
        System.out.println("Presiding Judge: " + case5.presidingJudge);
        System.out.println();

        // Case 6: Consumer Dispute
        CourtCase case6 = new CourtCase();
        case6.caseId = "CC/210/2023";
        case6.caseType = "Consumer - Service Deficiency";
        case6.courtName = "District Consumer Disputes Redressal Commission, Bengaluru Urban";
        case6.petitionerPlaintiff = "Mrs. Geetha Rao";
        case6.respondentDefendant = "XYZ Electronics";
        case6.filingDate = LocalDate.of(2023, 9, 1);
        case6.lastHearingDate = LocalDate.of(2025, 7, 8);
        case6.nextHearingDate = null; // Case disposed
        case6.currentStatus = "Disposed - Order for compensation issued";
        case6.presidingJudge = "President & Members";

        System.out.println("Case ID: " + case6.caseId);
        System.out.println("Case Type: " + case6.caseType);
        System.out.println("Court Name: " + case6.courtName);
        System.out.println("Petitioner/Plaintiff: " + case6.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case6.respondentDefendant);
        System.out.println("Filing Date: " + case6.filingDate);
        System.out.println("Last Hearing Date: " + case6.lastHearingDate);
        System.out.println("Next Hearing Date: " + case6.nextHearingDate);
        System.out.println("Current Status: " + case6.currentStatus);
        System.out.println("Presiding Judge: " + case6.presidingJudge);
        System.out.println();

        // Case 7: Land Acquisition Reference
        CourtCase case7 = new CourtCase();
        case7.caseId = "LAR/33/2022";
        case7.caseType = "Civil - Land Acquisition";
        case7.courtName = "Senior Civil Judge Court, Doddaballapur";
        case7.petitionerPlaintiff = "Mr. Shivaprakash B.";
        case7.respondentDefendant = "Special Land Acquisition Officer";
        case7.filingDate = LocalDate.of(2022, 4, 1);
        case7.lastHearingDate = LocalDate.of(2025, 6, 18);
        case7.nextHearingDate = LocalDate.of(2025, 9, 10);
        case7.currentStatus = "Valuation report submitted";
        case7.presidingJudge = "Senior Civil Judge Smt. A. M. Prasad";

        System.out.println("Case ID: " + case7.caseId);
        System.out.println("Case Type: " + case7.caseType);
        System.out.println("Court Name: " + case7.courtName);
        System.out.println("Petitioner/Plaintiff: " + case7.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case7.respondentDefendant);
        System.out.println("Filing Date: " + case7.filingDate);
        System.out.println("Last Hearing Date: " + case7.lastHearingDate);
        System.out.println("Next Hearing Date: " + case7.nextHearingDate);
        System.out.println("Current Status: " + case7.currentStatus);
        System.out.println("Presiding Judge: " + case7.presidingJudge);
        System.out.println();

        // Case 8: Writ Petition (Service Matter)
        CourtCase case8 = new CourtCase();
        case8.caseId = "WP/112/2024";
        case8.caseType = "Writ - Service Matter";
        case8.courtName = "High Court of Karnataka, Kalaburagi Bench";
        case8.petitionerPlaintiff = "Mr. Raghavendra Prasad";
        case8.respondentDefendant = "Karnataka Power Transmission Corporation Ltd.";
        case8.filingDate = LocalDate.of(2024, 6, 20);
        case8.lastHearingDate = LocalDate.of(2025, 7, 2);
        case8.nextHearingDate = LocalDate.of(2025, 9, 15);
        case8.currentStatus = "Reply statement filed by respondent";
        case8.presidingJudge = "Hon'ble Justice Shri. B. S. Patil";

        System.out.println("Case ID: " + case8.caseId);
        System.out.println("Case Type: " + case8.caseType);
        System.out.println("Court Name: " + case8.courtName);
        System.out.println("Petitioner/Plaintiff: " + case8.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case8.respondentDefendant);
        System.out.println("Filing Date: " + case8.filingDate);
        System.out.println("Last Hearing Date: " + case8.lastHearingDate);
        System.out.println("Next Hearing Date: " + case8.nextHearingDate);
        System.out.println("Current Status: " + case8.currentStatus);
        System.out.println("Presiding Judge: " + case8.presidingJudge);
        System.out.println();

        // Case 9: Criminal Appeal
        CourtCase case9 = new CourtCase();
        case9.caseId = "CRL.A./40/2023"; // Criminal Appeal
        case9.caseType = "Criminal - Appeal against Conviction";
        case9.courtName = "Sessions Court, Mangaluru";
        case9.petitionerPlaintiff = "Mr. Deepak Rai (Appellant)";
        case9.respondentDefendant = "State of Karnataka";
        case9.filingDate = LocalDate.of(2023, 10, 5);
        case9.lastHearingDate = LocalDate.of(2025, 7, 1);
        case9.nextHearingDate = LocalDate.of(2025, 8, 28);
        case9.currentStatus = "Arguments scheduled";
        case9.presidingJudge = "Hon'ble Principal Sessions Judge";

        System.out.println("Case ID: " + case9.caseId);
        System.out.println("Case Type: " + case9.caseType);
        System.out.println("Court Name: " + case9.courtName);
        System.out.println("Petitioner/Plaintiff: " + case9.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case9.respondentDefendant);
        System.out.println("Filing Date: " + case9.filingDate);
        System.out.println("Last Hearing Date: " + case9.lastHearingDate);
        System.out.println("Next Hearing Date: " + case9.nextHearingDate);
        System.out.println("Current Status: " + case9.currentStatus);
        System.out.println("Presiding Judge: " + case9.presidingJudge);
        System.out.println();

        // Case 10: Commercial Dispute
        CourtCase case10 = new CourtCase();
        case10.caseId = "COMM.OS/5/2024";
        case10.caseType = "Commercial - Contract Breach";
        case10.courtName = "Commercial Court, Bengaluru";
        case10.petitionerPlaintiff = "Tech Solutions Pvt Ltd";
        case10.respondentDefendant = "Global Enterprises";
        case10.filingDate = LocalDate.of(2024, 2, 1);
        case10.lastHearingDate = LocalDate.of(2025, 7, 11);
        case10.nextHearingDate = LocalDate.of(2025, 9, 25);
        case10.currentStatus = "Document discovery in progress";
        case10.presidingJudge = "Hon'ble Commercial Court Judge";

        System.out.println("Case ID: " + case10.caseId);
        System.out.println("Case Type: " + case10.caseType);
        System.out.println("Court Name: " + case10.courtName);
        System.out.println("Petitioner/Plaintiff: " + case10.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case10.respondentDefendant);
        System.out.println("Filing Date: " + case10.filingDate);
        System.out.println("Last Hearing Date: " + case10.lastHearingDate);
        System.out.println("Next Hearing Date: " + case10.nextHearingDate);
        System.out.println("Current Status: " + case10.currentStatus);
        System.out.println("Presiding Judge: " + case10.presidingJudge);
        System.out.println();

        // Case 11: Bail Application
        CourtCase case11 = new CourtCase();
        case11.caseId = "CRL.P./99/2025";
        case11.caseType = "Criminal - Bail Application";
        case11.courtName = "High Court of Karnataka, Dharwad Bench";
        case11.petitionerPlaintiff = "Mr. Kiran Gowda";
        case11.respondentDefendant = "State by Police Inspector, Hubballi";
        case11.filingDate = LocalDate.of(2025, 6, 10);
        case11.lastHearingDate = LocalDate.of(2025, 7, 18);
        case11.nextHearingDate = LocalDate.of(2025, 7, 30);
        case11.currentStatus = "Arguments partially heard";
        case11.presidingJudge = "Hon'ble Justice Shri. S. G. Hegde";

        System.out.println("Case ID: " + case11.caseId);
        System.out.println("Case Type: " + case11.caseType);
        System.out.println("Court Name: " + case11.courtName);
        System.out.println("Petitioner/Plaintiff: " + case11.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case11.respondentDefendant);
        System.out.println("Filing Date: " + case11.filingDate);
        System.out.println("Last Hearing Date: " + case11.lastHearingDate);
        System.out.println("Next Hearing Date: " + case11.nextHearingDate);
        System.out.println("Current Status: " + case11.currentStatus);
        System.out.println("Presiding Judge: " + case11.presidingJudge);
        System.out.println();

        // Case 12: Consumer Appeal
        CourtCase case12 = new CourtCase();
        case12.caseId = "FA/7/2025"; // First Appeal
        case12.caseType = "Consumer - Appeal against District Forum Order";
        case12.courtName = "Karnataka State Consumer Disputes Redressal Commission";
        case12.petitionerPlaintiff = "XYZ Telecom (Appellant)";
        case12.respondentDefendant = "Mr. Nagesh Bhat";
        case12.filingDate = LocalDate.of(2025, 3, 1);
        case12.lastHearingDate = LocalDate.of(2025, 7, 9);
        case12.nextHearingDate = LocalDate.of(2025, 9, 3);
        case12.currentStatus = "Written arguments filed";
        case12.presidingJudge = "President & Members";

        System.out.println("Case ID: " + case12.caseId);
        System.out.println("Case Type: " + case12.caseType);
        System.out.println("Court Name: " + case12.courtName);
        System.out.println("Petitioner/Plaintiff: " + case12.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case12.respondentDefendant);
        System.out.println("Filing Date: " + case12.filingDate);
        System.out.println("Last Hearing Date: " + case12.lastHearingDate);
        System.out.println("Next Hearing Date: " + case12.nextHearingDate);
        System.out.println("Current Status: " + case12.currentStatus);
        System.out.println("Presiding Judge: " + case12.presidingJudge);
        System.out.println();

        // Case 13: Labour Dispute
        CourtCase case13 = new CourtCase();
        case13.caseId = "ID/5/2024"; // Industrial Dispute
        case13.caseType = "Labour - Unfair Termination";
        case13.courtName = "Labour Court, Bengaluru";
        case13.petitionerPlaintiff = "Mr. Govindappa (Workman)";
        case13.respondentDefendant = "Garment Factory Ltd.";
        case13.filingDate = LocalDate.of(2024, 7, 15);
        case13.lastHearingDate = LocalDate.of(2025, 6, 20);
        case13.nextHearingDate = LocalDate.of(2025, 8, 1);
        case13.currentStatus = "Conciliation failed, matter referred for adjudication";
        case13.presidingJudge = "Presiding Officer, Labour Court";

        System.out.println("Case ID: " + case13.caseId);
        System.out.println("Case Type: " + case13.caseType);
        System.out.println("Court Name: " + case13.courtName);
        System.out.println("Petitioner/Plaintiff: " + case13.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case13.respondentDefendant);
        System.out.println("Filing Date: " + case13.filingDate);
        System.out.println("Last Hearing Date: " + case13.lastHearingDate);
        System.out.println("Next Hearing Date: " + case13.nextHearingDate);
        System.out.println("Current Status: " + case13.currentStatus);
        System.out.println("Presiding Judge: " + case13.presidingJudge);
        System.out.println();

        // Case 14: Contempt of Court
        CourtCase case14 = new CourtCase();
        case14.caseId = "CCC/20/2025"; // Contempt of Court Case
        case14.caseType = "Contempt - Non-compliance of Order";
        case14.courtName = "High Court of Karnataka, Bengaluru Bench";
        case14.petitionerPlaintiff = "High Court (Suo Motu)";
        case14.respondentDefendant = "District Commissioner, Mandya";
        case14.filingDate = LocalDate.of(2025, 5, 2);
        case14.lastHearingDate = LocalDate.of(2025, 7, 16);
        case14.nextHearingDate = LocalDate.of(2025, 8, 22);
        case14.currentStatus = "Explanation submitted, awaiting review";
        case14.presidingJudge = "Hon'ble Division Bench";

        System.out.println("Case ID: " + case14.caseId);
        System.out.println("Case Type: " + case14.caseType);
        System.out.println("Court Name: " + case14.courtName);
        System.out.println("Petitioner/Plaintiff: " + case14.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case14.respondentDefendant);
        System.out.println("Filing Date: " + case14.filingDate);
        System.out.println("Last Hearing Date: " + case14.lastHearingDate);
        System.out.println("Next Hearing Date: " + case14.nextHearingDate);
        System.out.println("Current Status: " + case14.currentStatus);
        System.out.println("Presiding Judge: " + case14.presidingJudge);
        System.out.println();

        // Case 15: Election Petition
        CourtCase case15 = new CourtCase();
        case15.caseId = "EP/1/2024";
        case15.caseType = "Election Petition - Disputed Election Result";
        case15.courtName = "High Court of Karnataka, Bengaluru Bench";
        case15.petitionerPlaintiff = "Mr. Chandrappa (Candidate)";
        case15.respondentDefendant = "Mr. Venkatesh & Election Commission of India";
        case15.filingDate = LocalDate.of(2024, 6, 1);
        case15.lastHearingDate = LocalDate.of(2025, 7, 17);
        case15.nextHearingDate = LocalDate.of(2025, 9, 8);
        case15.currentStatus = "Witness examination ongoing";
        case15.presidingJudge = "Hon'ble Justice Shri. S. V. Narayan";

        System.out.println("Case ID: " + case15.caseId);
        System.out.println("Case Type: " + case15.caseType);
        System.out.println("Court Name: " + case15.courtName);
        System.out.println("Petitioner/Plaintiff: " + case15.petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + case15.respondentDefendant);
        System.out.println("Filing Date: " + case15.filingDate);
        System.out.println("Last Hearing Date: " + case15.lastHearingDate);
        System.out.println("Next Hearing Date: " + case15.nextHearingDate);
        System.out.println("Current Status: " + case15.currentStatus);
        System.out.println("Presiding Judge: " + case15.presidingJudge);
        System.out.println();

        System.out.println("Main Ended - Court Case Information Display Complete");
    }
}