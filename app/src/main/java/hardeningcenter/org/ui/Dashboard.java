package hardeningcenter.org.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

import hardeningcenter.org.R;

public class Dashboard extends AppCompatActivity {

    Dialog myDialog,myDialog2;
    ImageView imageView16,imageView17,imageView001;
    TextView textView71,textView72,textView001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        myDialog=new Dialog(Dashboard.this);
        myDialog2=new Dialog(Dashboard.this);

         ShowPopup();

    }

    public void ShowPopup() {
        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.placement_basis_entry_form);
        myDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);

        imageView001=(ImageView)myDialog.findViewById(R.id.imageView001);
        textView001=(TextView)myDialog.findViewById(R.id.textView001);
        imageView001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(Dashboard.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear+1)
                                + "/" + String.valueOf(year);
                        textView001.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPopup2();
                myDialog.dismiss();
            }
        });

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.setCanceledOnTouchOutside(false);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup2() {
        TextView txtclose;
        Button btnFollow;
        myDialog2.setContentView(R.layout.preparation_of_hardening);
        myDialog2.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txtclose =(TextView) myDialog2.findViewById(R.id.txtclose);

        imageView16=(ImageView)myDialog2.findViewById(R.id.imageView16);
        textView71=(TextView)myDialog2.findViewById(R.id.textView71);
        textView72=(TextView)myDialog2.findViewById(R.id.textView72);

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(Dashboard.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear+1)
                                + "/" + String.valueOf(year);
                        textView71.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });

        imageView17=(ImageView)myDialog2.findViewById(R.id.imageView17);
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(Dashboard.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear+1)
                                + "/" + String.valueOf(year);
                        textView72.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });

        btnFollow = (Button) myDialog2.findViewById(R.id.btnfollow);
        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog2.dismiss();
            }
        });

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog2.dismiss();
            }
        });

        myDialog2.setCanceledOnTouchOutside(false);
        myDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog2.show();
    }

    public void Validation(){


    }
}
