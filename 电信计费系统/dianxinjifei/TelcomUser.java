package dianxinjifei;
import dx.*;
import factory.*;
import utility.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUser {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	DxFactory dxFactory=(DxFactory)XMLUtility.getBean();
	Dx dx=dxFactory.produceDx();
	public TelcomUser(String phoneNumber){
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
	}
	void generateCommunicateRecord(){
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i <= recordNum; i++){
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicationRecords.append(this.phoneNumber + 
					"," + timeStart + 
					"," + timeEnd + 
					"," + this.callTo+
					";");
		}
	}
	private String getCallToPhoneNumber(){
		return "1583720" + String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
			    + String.valueOf(new Random().nextInt(10));
	}
	private String accountFee(long timeStart, long timeEnd){
		
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = dx.fee() * minutes;
		return String.format("%.4f", feeTotal);
	}
	void printDetails(){
		String allRecords = this.communicationRecords.toString();
		String [] recordArray = allRecords.split(";");
		for(int i = 0;i < recordArray.length;i++){
			System.out.println("---------ͨ����¼�ָ���---------");
			String [] recordField = recordArray[i].split(",");
			System.out.println("���У�" + recordField[0]);
			System.out.println("���У�" + recordField[3]);
			Date timeStart = new Date(Long.parseLong(recordField[1]));
			Date timeEnd = new Date(Long.parseLong(recordField[2]));
			DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
			System.out.println("ͨ����ʼʱ�䣺" + simpleDateFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺" + simpleDateFormat.format(timeEnd));
			
			System.out.println("�Ʒѣ�" 
					+ accountFee(Long.parseLong(recordField[1]), Long.parseLong(recordField[2]))
					+ " Ԫ��");
		}
	}

}
