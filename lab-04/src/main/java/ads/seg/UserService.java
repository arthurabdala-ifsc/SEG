package ads.seg;

public class UserService {
    private String algortimoHash;

    public UserService(String algortimoHash) {
        if (algortimoHash.isEmpty()){
            algortimoHash = "BCrypt";
        } else {
            this.algortimoHash = algortimoHash;
        }
    }

    public boolean register(){

    }

    public boolean updatePassword(){

    }

    public boolean authenticate(){

    }
}
