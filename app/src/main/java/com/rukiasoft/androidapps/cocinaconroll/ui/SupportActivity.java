package com.rukiasoft.androidapps.cocinaconroll.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.rukiasoft.androidapps.cocinaconroll.R;
import com.rukiasoft.androidapps.cocinaconroll.utilities.Constants;
import com.rukiasoft.androidapps.cocinaconroll.utilities.Tools;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SupportActivity extends AppCompatActivity {

    @Nullable@Bind(R.id.support_title) TextView supportTittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        ButterKnife.bind(this);
        if(supportTittle != null) {
            supportTittle.setLinkTextColor(Color.CYAN);
            supportTittle.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }

    @OnClick(R.id.close_support_button)
    public void closeActivity(View view) {
        finish();
    }

    @OnClick(R.id.checkbox_hide_support)
    public void hideSupportDialog(View view) {
        Tools mTools = new Tools();
        mTools.savePreferences(this, Constants.PROPERTY_HIDE_SUPPORT_SCREEN, ((AppCompatCheckBox)view).isChecked());
    }
}
