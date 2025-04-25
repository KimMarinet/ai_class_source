package exam01;

public class LoginService {
    public void process(String userID, String userPW) throws  UserIdException, UserPwException{
        try {
            if(!userID.equals(("user01"))){
                throw new UserIdException("아이디가 일치하지 않습니다.");
            }
            if(!userPW.equals("1234")){
                throw new UserPwException("PW가 일치하지 않습니다.");
            }
            System.out.println("login complete");
        }catch (UserIdException | UserPwException e){
            System.out.println(e.getMessage());
        }
    }
}
