package sg.edu.np.s10207318;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



    public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView name = findViewById(R.id.name);
            TextView describe = findViewById(R.id.desc);
            Log.d("debug", "create");

            Button followBtn = findViewById(R.id.followbtn);
            User user = new User();
            user.followed = false;


            followBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!user.followed) {
                        followBtn.setText("Unfollow");
                        user.followed = true;
                    } else {
                        followBtn.setText("Follow");//Thus ask to Follow
                        user.followed = false; //Thus setting boolean to false
                    }
                }
            });
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("debug", "Start");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("debug", "Resume");
        }

        @Override
        protected void onPause() {

            super.onPause();
            Log.d("debug", "Pause");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("debug", "Stop");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("debug", "Destroy");
        }


    }
