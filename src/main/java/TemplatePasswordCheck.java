public class TemplatePasswordCheck {

    public boolean checkLogin(String name, String password){
        if (name.equals("admin") && password.equals("admin")){
            System.out.println("Login Successful");
            return true;
        } else if (name.equals("admin")){
            System.out.println("Invalid password");
            return false;
        } else if (password.equals("admin")){
            System.out.println("Invalid user");
            return false;
        } else {
            System.out.println("Invalid user and password");
            return false;
        }
    }

}
