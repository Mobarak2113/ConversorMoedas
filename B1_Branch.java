public class mobarak_branch{
  int roll;
  String name;
  int id;

  mobarak_branch(String a, int b){
  this.name = a;
  this.roll = b;
  }

  public int getRoll(){
    return roll;
  }
  public int getId(){
    return id;
  }
  public void setRoll(int roll){
    this.roll = roll;
  }
  public int getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setId(int a){
    this.id= a;
  }

}