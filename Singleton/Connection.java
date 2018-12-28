class Connection{
  // Singleton for controlling the instance
  public static boolean haveOne = false;
  public Connection() throws Exception{
    if(!haveOne){
      System.out.println("1 device connected");
      this.haveOne = true;
    }else{
      throw new Exception("There was 1 device connected already");
    }
  }
  public static Connection getConnection() throws Exception{
    return new Connection();
  }
  public static void main(String[] args){
    try{
      Connection p1 = new Connection();
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
      Connection p1 = new Connection();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
