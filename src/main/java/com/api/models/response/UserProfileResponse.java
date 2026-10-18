package com.api.models.response;

public class UserProfileResponse {

	    private String id;
	    private String firstName;
	    private String lastName;
	    private String maidenName;
	    private String age;
	    private String gender;
	    private String email;
	    private String phone;
	    private String username;
	    private String password;
	    private String birthDate;
	    private String image;
	    private String bloodGroup;
	    private String height;
	    private String weight;
	    private String eyeColor;
	    private String hair;
	    private String ip;
	    private String address;
	    private String country;
	    private String macAddress;
	    private String university;
	    private String bank;
	    private String company;
	    private String ein;
	    private String ssn;
	    private String userAgent;
	    private String crypto;
	    private String role;
	    
	    public UserProfileResponse(String id, String firstName, String lastName, String maidenName, String age,
				String gender, String email, String phone, String username, String password, String birthDate,
				String image, String bloodGroup, String height, String weight, String eyeColor, String hair, String ip,
				String address, String country, String macAddress, String university, String bank, String company,
				String ein, String ssn, String userAgent, String crypto, String role) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.maidenName = maidenName;
			this.age = age;
			this.gender = gender;
			this.email = email;
			this.phone = phone;
			this.username = username;
			this.password = password;
			this.birthDate = birthDate;
			this.image = image;
			this.bloodGroup = bloodGroup;
			this.height = height;
			this.weight = weight;
			this.eyeColor = eyeColor;
			this.hair = hair;
			this.ip = ip;
			this.address = address;
			this.country = country;
			this.macAddress = macAddress;
			this.university = university;
			this.bank = bank;
			this.company = company;
			this.ein = ein;
			this.ssn = ssn;
			this.userAgent = userAgent;
			this.crypto = crypto;
			this.role = role;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getMaidenName() {
			return maidenName;
		}

		public void setMaidenName(String maidenName) {
			this.maidenName = maidenName;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getBloodGroup() {
			return bloodGroup;
		}

		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getEyeColor() {
			return eyeColor;
		}

		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}

		public String getHair() {
			return hair;
		}

		public void setHair(String hair) {
			this.hair = hair;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getMacAddress() {
			return macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getUniversity() {
			return university;
		}

		public void setUniversity(String university) {
			this.university = university;
		}

		public String getBank() {
			return bank;
		}

		public void setBank(String bank) {
			this.bank = bank;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getEin() {
			return ein;
		}

		public void setEin(String ein) {
			this.ein = ein;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		public String getUserAgent() {
			return userAgent;
		}

		public void setUserAgent(String userAgent) {
			this.userAgent = userAgent;
		}

		public String getCrypto() {
			return crypto;
		}

		public void setCrypto(String crypto) {
			this.crypto = crypto;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "UserProfileResponse [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", maidenName=" + maidenName + ", age=" + age + ", gender=" + gender + ", email=" + email
					+ ", phone=" + phone + ", username=" + username + ", password=" + password + ", birthDate="
					+ birthDate + ", image=" + image + ", bloodGroup=" + bloodGroup + ", height=" + height + ", weight="
					+ weight + ", eyeColor=" + eyeColor + ", hair=" + hair + ", ip=" + ip + ", address=" + address
					+ ", country=" + country + ", macAddress=" + macAddress + ", university=" + university + ", bank="
					+ bank + ", company=" + company + ", ein=" + ein + ", ssn=" + ssn + ", userAgent=" + userAgent
					+ ", crypto=" + crypto + ", role=" + role + "]";
		}
		
	
}
