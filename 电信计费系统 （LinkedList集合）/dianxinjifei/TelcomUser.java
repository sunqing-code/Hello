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
	private LinkedList communicationRecords;
	DxFactory dxFactory=(DxFactory)XMLUtility.getBean();
	Dx dx=dxFactory.produceDx();
	public TelcomUser(String phoneNumber){
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new LinkedList();
	}
	void generateCommunicateRecord(){
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i <= recordNum; i++){
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicationRecords.add(this.phoneNumber + 
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
		//int arrayListSize = this.communicationRecords.size();
		Iterator it = this.communicationRecords.iterator();
		//for(int i = 0;i < arrayListSize - 1;i++){
		while(it.hasNext()){
	        System.out.println("---------ͨ����¼�ָ���---------");
			String [] recordField = ((String)/*this.communicationRecords.get(i)*/it.next()).split(";");
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
