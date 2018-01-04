package com.example.innofied.mvpbasic.Login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.innofied.mvpbasic.R;
import com.example.innofied.mvpbasic.databinding.LoginBinding;

public class LoginActivity extends PresentedActivity<MainPresenter> implements MainPresenter.IMainView {
    private LoginBinding binding;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.login);
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.validate(binding.mail.getText().toString());
            }
        });
    }

    @Override
    public void validate(boolean b) {
        if (b) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public MainPresenter onCreatePresenter() {
        presenter = new MainPresenter(this);

        return presenter;
    }

    @Override
    public void injectPresenter(MainPresenterComponent component, MainPresenter presenter) {
//        MainPresenterComponent mainPresenterComponent = DaggerMainPresenterComponent.builder()
//                .loginApplicationModule(new LoginApplicationModule()).build();
        component.inject(presenter);
    }
}
