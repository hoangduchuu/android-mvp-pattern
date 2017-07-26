package net.hoangduchuu.demomvp.HandleLogin;

/**
 * i
 * Created by hoang on 7/26/17.
 */

public class PresenterLogicLogin implements PresenterLoginListener {
    ViewHandleLogin viewHandleLogin;

    public PresenterLogicLogin(ViewHandleLogin viewHandleLogin) {
        this.viewHandleLogin = viewHandleLogin;
    }

    @Override
    public void CheckLogin(String u, String p) {
        // goi toi model lay du lieu
        if (!u.equals("admin") || !p.equals("123")) {
            // tra ra cho view dang nhap that bai
            viewHandleLogin.LoginFailed("ThatBai");

        } else {
            // tra ra cho view dang nhap thanh cong
            viewHandleLogin.LoginSusess("Thanh cong");
        }
    }
}
