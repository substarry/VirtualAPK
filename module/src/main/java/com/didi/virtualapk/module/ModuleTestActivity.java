package com.didi.virtualapk.module;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.didi.virtualapk.module.databinding.ActivityModuleTestBinding;


/**
 * Created by Heling on 18/1/12.
 */
public class ModuleTestActivity extends AppCompatActivity {

    protected ActivityModuleTestBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_module_test);
        mBinding.tvTest.setText("DataBing 2222");
    }
}
