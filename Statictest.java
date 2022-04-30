public class Statictest {
	public static void main(String args[]) {
		System.out.println("the number of patient count is " + Patient.patientCount);

		Patient p1 = new Patient("Jack", "Delhi", "A", 1, "kidneyFailure", true);// has a
		Patient p2 = new Patient("Chris", "Mumbai", "B", 2, "ViralFever", true);
		Patient p3 = new Patient("Tony", "Kolkata", "C", 3, "HeartAttack", true);
		Patient p4 = new Patient("Starc", "Chennai", "D", 4, "CerebralAttack", true);
		Patient p5 = new Patient("Benedict", "Srinagar", "E", 5, "Dengue", true);

		System.out.println("the number of patient count is " + Patient.patientCount);

		p1.admission();
		p2.admission();
		p3.admission();
		p4.admission();
		p5.admission();

		p1.treatment(p2, p3, p4, p5);

		System.out.println("the number of patient count is " + Patient.patientCount);

	}

}

class Hospital {
}

class ApolloHospital extends Hospital { // is a

}

class Patient {
	private String patientName;
	private String patientAddress;
	private String PatientUnderDoctor;
	private int patientId;
	private String patientDisease;
	protected static int patientCount;
	boolean patientStatus;

	public Patient(String patientName, String patientAddress, String patientUnderDoctor, int patientId,
			String patientDisease, boolean patientStatus) {
		super();
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.PatientUnderDoctor = patientUnderDoctor;
		this.patientId = patientId;
		this.patientDisease = patientDisease;
		this.patientStatus = patientStatus;
		patientCount++;

	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientAddress=" + patientAddress + ", PatientUnderDoctor="
				+ PatientUnderDoctor + ", patientId=" + patientId + ", patientDisease=" + patientDisease + "]";
	}

	void admission() {
		System.out.println("the details of the patient admitted is Name:" + patientName + "  address  " + patientAddress
				+ "   under treatment of doctor:   " + PatientUnderDoctor + "   having patientId:  " + patientId
				+ "  suffering from:  " + patientDisease);
	}

	void treatment(Patient ref1, Patient ref2, Patient ref3, Patient ref4) {
		System.out.println("treatment of: " + patientName + " and " + ref1.patientName + " and " + ref2.patientName
				+ " and " + ref3.patientName + " and " + ref4.patientName + " started ");
		double val = Math.random() % 100;
		System.out.println("print val" + val);
		for (int i = 0; i <= 10; i++) {

			if (val > .95) {
				ref4.patientStatus = false;
				patientCount--;
				System.out.println(ref4.patientName + " Expired");
				break;

			} else if (val > .85 && val < .94) {
				ref2.patientStatus = false;
				patientCount--;
				System.out.println(ref2.patientName + " Expired");
				break;
			} else if (val > .75 && val < .85) {
				ref1.patientStatus = false;
				System.out.println(ref1.patientName + " Expired");
				patientCount--;
				break;
			} else if (val > .65 && val < .75) {
				ref3.patientStatus = false;
				patientCount--;
				System.out.println(ref3.patientName + " Expired");
				break;
			} else if (val > .55 && val < .65) {
				patientStatus = false;
				patientCount--;
				System.out.println(patientName + " Expired");
				break;
			} else if (val > .45 && val < .55) {
				ref4.patientStatus = false;
				ref3.patientStatus = false;
				patientCount = patientCount - 2;
				System.out.println(ref4.patientName + " and " + ref3.patientName + "  Expired . ");
				break;
			} else if (val > .35 && val < .45) {
				ref1.patientStatus = false;
				ref2.patientStatus = false;
				patientStatus = false;
				patientCount = patientCount - 3;
				System.out.println(
						ref1.patientName + " and " + patientName + " and " + ref2.patientName + "  Expired . ");
				break;
			} else if (val > .25 && val < .35) {
				ref1.patientStatus = false;
				ref2.patientStatus = false;
				patientStatus = false;
				ref4.patientStatus = false;
				patientCount = patientCount - 4;
				System.out.println(ref1.patientName + " and " + patientName + " and " + ref2.patientName + " and "
						+ ref4.patientName + "  Expired . ");
				break;

			} else if (val > .25 && val < .35) {
				ref1.patientStatus = false;
				ref2.patientStatus = false;
				patientStatus = false;
				ref4.patientStatus = false;
				ref3.patientStatus = false;
				patientCount = patientCount - 5;
				System.out.println("no one survived");
				break;
			} else if (val < .25) {
				System.out.println("nobody expired");
				break;
			}
		}
	}
}