package lang;

import java.lang.invoke.WrongMethodTypeException;

// NotExistIDException NotExistIDException 
public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (NotExistIDException | WrongMethodTypeException e) {
            e.printStackTrace();
        }
    }

    public static void login(String id, String passward) throws NotExistIDException, WrongMethodTypeException {
        // id 가 blue 가 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디 확인");
        }
        // password가 "12345" 가 아니라면NotExistIDException 발생
        if (!passward.equals("12345")) {
            throw new WrongMethodTypeException("비밀번호 확인");
        }
    }
}
