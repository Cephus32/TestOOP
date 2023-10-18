class StudentEmail extends Email{

  private int batchNo;

  public StudentEmail(String newFirstName, String newLastName, int newBatchNo){
    super(newFirstName, newLastName);
    this.batchNo = newBatchNo;
    setEmailAddress(generateEmail());
    setPassword(generatePassword());
    setCapacity(25);
    setMaxAttachmentSize(50);
  }
  @Override
  public String generateEmail(){
    return super.getFirstName() + "." + super.getLastName() + "_b" + batchNo + "@student." + super.getDomainName();
  }
  @Override
  public String generatePassword(){
    String passChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    String newGenPassword = "";
    for(int i = 0; i < 8;i++){
      newGenPassword += passChars.charAt((int)(Math.random()*62));
    }
    return newGenPassword;
  }
  @Override
  public String toString(){
    return "\nTYPE: Student" + "\nBATCH NO: " + batchNo + super.toString();
  }

}