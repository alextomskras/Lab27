package ru.myitschool.lab23;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.Objects;

import ru.myitschool.lab23.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ActivityMainBinding binding;
    public boolean howChecked;
public String howCheckedChip;
    public String howCheckedCheckBox;
    public String howCheckedSwitch;
    public String howCheckedAppButton;
    public TextView mainTexts;
    public Chip mainChip;
    public MaterialCheckBox mainCheckBox;
    public SwitchMaterial mainSwitch;
    public AppCompatButton mainButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);
//        TextView mainTexts = findViewById(R.id.summary_text);
        Button showButton = findViewById(R.id.show_action);
//
//        Chip mainChip = findViewById(R.id.chip_material);
//        MaterialCheckBox mainCheckBox = findViewById(R.id.check_box_material);
//        SwitchMaterial mainSwitch = findViewById(R.id.switch_material);
        AppCompatButton mainButton = findViewById(R.id.toggle_button);
        mainButton.setOnClickListener(this);
        showButton.setOnClickListener(this);
//        String mytextChip = getResources().getString(R.string.chip);
//        String mytextCheckbox = getResources().getString(R.string.checkbox);
//        String mytextSwitch = getResources().getString(R.string.switche);
//        String mytextApcbutton = getResources().getString(R.string.apcbutton);

//        howChecked =  mainButton;
//        checkIsCheckedStatus(mainChip);
//        if(howChecked) {
//            Toast.makeText(this, "true", Toast.LENGTH_LONG).show();
//        }


//        showSummaryText(mainTexts,mainChip,mainCheckBox,mainSwitch,mainButton);


    }
//    private <checkers> void checkIsCheckedStatus(checkers checkers)
//    {
//        howChecked =  checkers.isChecked();
//    }

//    private void clickListenerFP() {
//        binding.content.showAction.setOnClickListener(new View.OnClickListener() {
//            /**
//             * Called when a view has been clicked.
//             *
//             * @param v The view that was clicked.
//             */
//            @Override
//            public void onClick(View v) {
////                tv.setText(months[rand.nextInt(12)]);
////                tv.setTextColor(Color.rgb(rand.nextInt(255)+1, rand.nextInt(255)+1, rand.nextInt(255)+1));
//            }
//        });
//        {
//            String mytextChip = getResources().getString(R.string.chip);
//            finish();
//        }
//    }

    private void showSummaryText() {
//    private void showSummaryText(TextView mainTexts,Chip mainChip,MaterialCheckBox mainCheckBox,SwitchMaterial mainSwitch,AppCompatButton mainButton) {
//        mainTexts.getText();
//        getApplicationContext().getResources();
        TextView mainTexts = findViewById(R.id.summary_text);
//        Button showButton = findViewById(R.id.show_action);

        Chip mainChip = findViewById(R.id.chip_material);
        MaterialCheckBox mainCheckBox = findViewById(R.id.check_box_material);
        SwitchMaterial mainSwitch = findViewById(R.id.switch_material);

        String mytextChip = getResources().getString(R.string.chip);
        String mytextCheckbox = getResources().getString(R.string.checkbox);
        String mytextSwitch = getResources().getString(R.string.switche);
        String mytextApcbutton = getResources().getString(R.string.apcbutton);
        howChecked =  mainChip.isChecked();
        if(howChecked){
            howCheckedChip = "true";
        }else howCheckedChip = "false";
        howChecked =  mainCheckBox.isChecked();
        if(howChecked){
            howCheckedCheckBox = "true";
        }else howCheckedCheckBox = "false";
        howChecked =  mainSwitch.isChecked();
        if(howChecked){
            howCheckedSwitch = "true";
        }else howCheckedSwitch = "false";
//        howChecked =  mainButton.bo;
//        if(howChecked){
//            howCheckedCheckBox = "true";
//        }else
//            howCheckedAppButton = "false";



        mainTexts.setText(mytextChip+":"+howCheckedChip+"\n"+mytextCheckbox+":"+howCheckedCheckBox+"\n"+mytextSwitch+":"+howCheckedSwitch+"\n"+mytextApcbutton+":"+howCheckedAppButton+"\n");
//        mainTexts.setText(getResources().getString(R.string.chip));
//        Toast.makeText(this,mytext, Toast.LENGTH_LONG).show();
//        mainTexts.setText(setText);
//                mainTexts.addText(getResources().getString(R.string.checkbox));
//                        mainTexts.setText(getResources().getString(R.string.switche));
//                                mainTexts.setText(getResources().getString(R.string.apcbutton));
//        mainTexts.setText("R.string.chip+R.string.checkbox+R.string.switche+R.string.apcbutton");

    }

    /**
     * Called when a view has been clicked.
     *
     * @param view The view that was clicked.
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.show_action:
                //action
//                Chip mainChip = binding.content.chipMaterial;
                showSummaryText();
//                showSummaryText(mainTexts,mainChip,mainCheckBox,mainSwitch,mainButton);
                break;

            case R.id.toggle_button:
                //action
                AppCompatButton mainButton = findViewById(R.id.toggle_button);
                String mainButtonText = (String) mainButton.getText();
                Log.d("TAG","___________!!!"+mainButtonText);
                if(Objects.equals(mainButtonText, "isChecked")) {
                    mainButton.setText(getResources().getString(R.string.toggle_button));
                    howCheckedAppButton= String.valueOf(false);
                }else {
                    mainButton.setText(getResources().getString(R.string._isChecked));
                    howCheckedAppButton= String.valueOf(true);
                    Log.d("TAG","___________isChecked"+howCheckedAppButton);
                }

                break;
        }
    }
}
