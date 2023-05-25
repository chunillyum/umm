
	public class Return {
		public static String getPhoneNumber() {
			String phoneNumber = "02-1234-5678";
			return phoneNumber;
					
		}
	public static String getAddress() {
		return "남양주";
		
	}
	
	public static String getPlay() {
		return "노래방, pc방, 당구장";
	}
	
	
	public static void main(String[] args) {
		
		String contactNumber = getPhoneNumber();
		System.out.println("호텔 전화번호: " + contactNumber);
		
		String address = getAddress();
		System.out.println("호텔 지역: " + address);
		
		System.out.println("이용가능 업체: " + getPlay());
	}

}
