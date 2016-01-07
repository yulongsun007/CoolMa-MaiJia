package io.github.froger.instamaterial.ui.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.froger.instamaterial.R;

/**
 * Created by yulongsun on 2016/1/6.
 */
public class ModifyPwdFragment extends BaseFragment {


    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_modifypwd, null);
        return root;
    }

    @Override
    public String getTitle() {
        return "修改密码";
    }
}
