public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phone;

    public void setName(String name){
        this.name = name ;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void register(){
    System.out.println("Nama : " +name);
    System.out.println("Phone Number "+phone);
    System.out.println("Register succes");

    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
