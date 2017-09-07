package webapp;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ExampleBean  implements Serializable {
    private Boolean logged;
    private String login;
    private  String password;

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(Boolean logged) {
        this.logged = logged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String text = "CDI Example";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void doLogin (){
        logged = true;
    }
}
