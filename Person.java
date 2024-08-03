package InhertanceExcersize;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        if (this.age > 12 && this.age < 20){
        return true;
        }else{
            return false;
        }
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return"";
        }else if ( firstName.isEmpty() ){
            return lastName;
        }else if  (lastName.isEmpty()){
            return firstName;
        }
        return firstName +" "+ lastName ;
    }

    public String  getFirstName(){
        return firstName;
    }
    public String  getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
    public void setFirstName(String name){
        this.firstName=name ;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }
    public void setAge(int age){
        if ( age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }

    }
}
