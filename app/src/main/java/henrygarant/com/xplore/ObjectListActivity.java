package henrygarant.com.xplore;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ObjectListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);
    }

    public void objectClicked(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        Bundle args = new Bundle();
        args.putString("object", "cat");
        intent.putExtras(args);
        startActivity(intent);
    }

}
