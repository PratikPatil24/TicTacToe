package com.example.pratik.tictactoe;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class game extends AppCompatActivity {
    public int matrix[][] = new int[3][3];
    public int p = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void p0Input(View view) {
        ImageView i0 = (ImageView) findViewById(R.id.p0);
        if (p == 1 && matrix[0][0] == 0) {
            i0.setImageResource(R.drawable.o);
            matrix[0][0] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[0][0] == 0) {
            i0.setImageResource(R.drawable.x);
            matrix[0][0] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p1Input(View view) {
        ImageView i0 = (ImageView) findViewById(R.id.p1);
        if (p == 1 && matrix[0][1] == 0) {
            i0.setImageResource(R.drawable.o);
            matrix[0][1] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[0][1] == 0) {
            i0.setImageResource(R.drawable.x);
            matrix[0][1] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p2Input(View view) {
        ImageView i2 = (ImageView) findViewById(R.id.p2);
        if (p == 1 && matrix[0][2] == 0) {
            i2.setImageResource(R.drawable.o);
            matrix[0][2] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[0][2] == 0) {
            i2.setImageResource(R.drawable.x);
            matrix[0][2] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p3Input(View view) {
        ImageView i3 = (ImageView) findViewById(R.id.p3);
        if (p == 1 && matrix[1][0] == 0) {
            i3.setImageResource(R.drawable.o);
            matrix[1][0] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[1][0] == 0) {
            i3.setImageResource(R.drawable.x);
            matrix[1][0] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p4Input(View view) {
        ImageView i4 = (ImageView) findViewById(R.id.p4);
        if (p == 1 && matrix[1][1] == 0) {
            i4.setImageResource(R.drawable.o);
            matrix[1][1] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[1][1] == 0) {
            i4.setImageResource(R.drawable.x);
            matrix[1][1] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p5Input(View view) {
        ImageView i5 = (ImageView) findViewById(R.id.p5);
        if (p == 1 && matrix[1][2] == 0) {
            i5.setImageResource(R.drawable.o);
            matrix[1][2] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[1][2] == 0) {
            i5.setImageResource(R.drawable.x);
            matrix[1][2] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p6Input(View view) {
        ImageView i6 = (ImageView) findViewById(R.id.p6);
        if (p == 1 && matrix[2][0] == 0) {
            i6.setImageResource(R.drawable.o);
            matrix[2][0] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[2][0] == 0) {
            i6.setImageResource(R.drawable.x);
            matrix[2][0] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p7Input(View view) {
        ImageView i7 = (ImageView) findViewById(R.id.p7);
        if (p == 1 && matrix[2][1] == 0) {
            i7.setImageResource(R.drawable.o);
            matrix[2][1] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[2][1] == 0) {
            i7.setImageResource(R.drawable.x);
            matrix[2][1] = 2;
            p = 1;
            checkResult();
        }
    }

    public void p8Input(View view) {
        ImageView i8 = (ImageView) findViewById(R.id.p8);
        if (p == 1 && matrix[2][2] == 0) {
            i8.setImageResource(R.drawable.o);
            matrix[2][2] = 1;
            p = 2;
            checkResult();
        }
        if (p == 2 && matrix[2][2] == 0) {
            i8.setImageResource(R.drawable.x);
            matrix[2][2] = 2;
            p = 1;
            checkResult();
        }
    }

    private void checkResult() {
        boolean empty = false;
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        //check horizontal lines
        for (int i = 0; i != 3; ++i) {
            if (matrix[i][0] == 1 && matrix[i][1] == 1 && matrix[i][2] == 1) {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (matrix[i][0] == 2 && matrix[i][1] == 2 && matrix[i][2] == 2) {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }
        //check vertical lines
        for (int i = 0; i != 3; ++i) {
            if (matrix[0][i] == 1 && matrix[1][i] == 1 && matrix[2][i] == 1) {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (matrix[0][i] == 2 && matrix[1][i] == 2 && matrix[2][i] == 2) {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }
        //check diagonals
        if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1) {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2) {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
    }
}