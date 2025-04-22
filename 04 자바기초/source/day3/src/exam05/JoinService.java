package exam05;

public class JoinService {

    private static JoinService instance;

    //외부에서 객체를 마음대로 생성하지 못하도록 접근을 막는다
    private JoinService(){

    }

    //회원 가입 처리 기능
    public  void process(){
        System.out.println("회원 가입 완료");
    }

    static public JoinService getInstance() {
        if(instance == null){
            instance = new JoinService();
        }
        return instance;
    }
}
