package id.ac.polinema.colorchangernormal;

import android.app.Application;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AndroidViewModel;

public class ColorViewModel extends AndroidViewModel {

    ConstraintLayout rootView;
    Button btnChangeColor;


        private int color = 0xfff;

        public ColorViewModel(@NonNull Application application) {
            super(application);
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }
    }
