package builder;

public class UserMain {

    public static void main(String[] args) {
        User user = User.UserBuilder.userBuilder()
                        .username("도현")
                        .name("하하")
                        .email("")
                        .password("")
                        .build();
    }
}
