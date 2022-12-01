package ru.myitschool.lab23;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.switchmaterial.SwitchMaterial;

import ru.myitschool.lab23.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    public boolean howChecked;
public String howCheckedChip;
    public String howCheckedCheckBox;
    public String howCheckedSwitch;
    public String howCheckedAppButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(R.layout.activity_main);
        TextView mainTexts = findViewById(R.id.summary_text);
        Button showButton = findViewById(R.id.show_action);

        Chip mainChip = findViewById(R.id.chip_material);
        MaterialCheckBox mainCheckBox = findViewById(R.id.check_box_material);
        SwitchMaterial mainSwitch = findViewById(R.id.switch_material);
        AppCompatButton mainButton = findViewById(R.id.toggle_button);
//        String mytextChip = getResources().getString(R.string.chip);
//        String mytextCheckbox = getResources().getString(R.string.checkbox);
//        String mytextSwitch = getResources().getString(R.string.switche);
//        String mytextApcbutton = getResources().getString(R.string.apcbutton);

//        howChecked =  mainButton;
//        checkIsCheckedStatus(mainChip);
//        if(howChecked) {
//            Toast.makeText(this, "true", Toast.LENGTH_LONG).show();
//        }


        showSummaryText(mainTexts,mainChip,mainCheckBox,mainSwitch,mainButton);


    }
//    private <checkers> void checkIsCheckedStatus(checkers checkers)
//    {
//        howChecked =  checkers.isChecked();
//    }

    private void showSummaryText(TextView mainTexts,Chip mainChip,MaterialCheckBox mainCheckBox,SwitchMaterial mainSwitch,AppCompatButton mainButton) {
        mainTexts.getText();
//        getApplicationContext().getResources();
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
            howCheckedCheckBox = "false";



        mainTexts.setText(mytextChip+":"+howCheckedChip+"\n"+mytextCheckbox+":"+howCheckedChip+"\n"+mytextSwitch+":"+howCheckedChip+"\n"+mytextApcbutton+":"+howCheckedChip+"\n");
//        mainTexts.setText(getResources().getString(R.string.chip));
//        Toast.makeText(this,mytext, Toast.LENGTH_LONG).show();
//        mainTexts.setText(setText);
//                mainTexts.addText(getResources().getString(R.string.checkbox));
//                        mainTexts.setText(getResources().getString(R.string.switche));
//                                mainTexts.setText(getResources().getString(R.string.apcbutton));
//        mainTexts.setText("R.string.chip+R.string.checkbox+R.string.switche+R.string.apcbutton");

    }
}
