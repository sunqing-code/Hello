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
	private ArrayList communicationRecords;
	private HashMap singleRecord;
	DxFactory dxFactory=(DxFactory)XMLUtility.getBean();
	Dx dx=dxFactory.produceDx();
	public TelcomUser(String phoneNumber){
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new ArrayList();
	}
	void generateCommunicateRecord(){
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i <= recordNum; i++){
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.singleRecord = new HashMap();
			this.singleRecord.put("����",this.phoneNumber);
			this.singleRecord.put("��ʼʱ��",new Date(timeStart));
			this.singleRecord.put("����ʱ��",new Date(timeEnd));
			this.singleRecord.put("���к���", this.getCallToPhoneNumber());
			this.singleRecord.put("�Ʒ�",this.accountFee(timeStart, timeEnd));
			this.communicationRecords.add(this.singleRecord);
			
	}}
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
	void printDetails() {
		Iterator itRecords = this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("---------ͨ����¼�ָ���---------");
			this.singleRecord=((HashMap)itRecords.next());
			Set entrySet=this.singleRecord.entrySet();
			Iterator itEntry=entrySet.iterator();
			while(itEntry.hasNext()) {
				Map.Entry entry=(Map.Entry)itEntry.next();
				Object key=entry.getKey();
				Object value=entry.getValue();
				System.out.println(key+":"+value);
			}
		}
	}

}