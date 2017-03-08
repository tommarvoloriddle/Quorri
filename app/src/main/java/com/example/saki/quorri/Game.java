package com.example.saki.quorri;

/**
 * Created by padma on 27-01-2017.
 *
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import static com.example.saki.quorri.R.drawable.ai_pawn;

public class Game extends AppCompatActivity {
    Boolean isStarted = false;
    public static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newboard);
        ImageView startpositon1  = (ImageView) findViewById(R.id.pawn51);
        ImageView startposition2 = (ImageView) findViewById(R.id.pawn59);;
        if (startpositon1 != null) {
            startpositon1.setImageResource(R.drawable.user_pawn);
        }
        if (startposition2 != null) {
            startposition2.setImageResource(R.drawable.ai_pawn);
        }

        StartGame();

    }

    public void StartGame() {


        boolean iswhite = true;
        boolean isblack = false;;
        isStarted = true;

        Board.initializeBoard();
        }
    public void radioButtonClick(View v)
    {

        boolean iswhite ,isblack;

        if(counter%2 == 0)
        {
            iswhite = true;
            isblack = false;
        }
        else
        {
            iswhite = false;
            isblack = true;
        }
        isStarted = true;
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId())
        {

            case R.id.radioPawn:
                if(checked) {

                    boolean ispawn = true;
                    if (iswhite == true) {
                        counter++;
                        ShowPawnWhite();

                    } else {
                        counter++;
                        ShowPawnBlack();

                    }
                }
                    break;


            case R.id.radioHwall:
                if(checked)
                {
                    boolean ishv =true;

                    if(iswhite == true)
                    {
                        counter++;
                        Showhv();

                    }
                    else
                    {
                        counter++;
                        Showhv();

                    }
                }
                break;
            case R.id.radioVwall:
                if(checked)
                {
                    boolean isvw = true;
                    if(iswhite == true)
                    {
                        counter++;
                        Showvw();

                    }
                    else
                    {
                        counter++;
                        Showvw();

                    }

                }
                break;
        }
    }




    public void Showhv() {


        final ImageView p11h = (ImageView) findViewById(R.id.path11h);
        if (p11h != null) {
            p11h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(11) == true)
                    {
                        p11h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p12h = (ImageView) findViewById(R.id.path12h);
        if (p12h != null) {
            p12h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(12) == true)
                    {
                        if (p12h != null) {
                            p12h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p13h = (ImageView) findViewById(R.id.path13h);
        if (p13h != null) {
            p13h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(13) == true)
                    {
                        if (p13h != null) {
                            p13h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p14h = (ImageView) findViewById(R.id.path14h);
        if (p14h != null) {
            p14h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(14) == true)
                    {
                        if (p14h != null) {
                            p14h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p15h = (ImageView) findViewById(R.id.path15h);
        if (p15h != null) {
            p15h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(15) == true)
                    {
                        if (p15h != null) {
                            p15h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p16h = (ImageView) findViewById(R.id.path16h);
        if (p16h != null) {
            p16h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(16) == true)
                    {
                        if (p16h != null) {
                            p16h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p17h = (ImageView) findViewById(R.id.path17h);
        if (p17h != null) {
            p17h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(17) == true)
                    {
                        if (p17h != null) {
                            p17h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p18h = (ImageView) findViewById(R.id.path18h);
        if (p18h != null) {
            p18h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(18) == true)
                    {
                        if (p18h != null) {
                            p18h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }










        final ImageView p21h = (ImageView) findViewById(R.id.path21h);
        if (p21h != null) {
            p21h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(21) == true)
                    {
                        p21h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p22h = (ImageView) findViewById(R.id.path22h);
        if (p22h != null) {
            p22h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(22) == true)
                    {
                        if (p22h != null) {
                            p22h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p23h = (ImageView) findViewById(R.id.path23h);
        if (p23h != null) {
            p23h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(23) == true)
                    {
                        if (p23h != null) {
                            p23h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p24h = (ImageView) findViewById(R.id.path24h);
        if (p24h != null) {
            p24h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(24) == true)
                    {
                        if (p24h != null) {
                            p24h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p25h = (ImageView) findViewById(R.id.path25h);
        if (p25h != null) {
            p25h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(25) == true)
                    {
                        if (p25h != null) {
                            p25h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p26h = (ImageView) findViewById(R.id.path26h);
        if (p26h != null) {
            p26h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(26) == true)
                    {
                        if (p26h != null) {
                            p26h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p27h = (ImageView) findViewById(R.id.path27h);
        if (p27h != null) {
            p27h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(27) == true)
                    {
                        if (p27h != null) {
                            p27h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p28h = (ImageView) findViewById(R.id.path28h);
        if (p28h != null) {
            p28h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(28) == true)
                    {
                        if (p28h != null) {
                            p28h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }













        final ImageView p31h = (ImageView) findViewById(R.id.path31h);
        if (p31h != null) {
            p31h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(31) == true)
                    {
                        p31h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p32h = (ImageView) findViewById(R.id.path32h);
        if (p32h != null) {
            p32h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(32) == true)
                    {
                        if (p32h != null) {
                            p32h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p33h = (ImageView) findViewById(R.id.path33h);
        if (p33h != null) {
            p33h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(33) == true)
                    {
                        if (p33h != null) {
                            p33h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p34h = (ImageView) findViewById(R.id.path34h);
        if (p34h != null) {
            p34h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(34) == true)
                    {
                        if (p34h != null) {
                            p34h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p35h = (ImageView) findViewById(R.id.path35h);
        if (p35h != null) {
            p35h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(35) == true)
                    {
                        if (p35h != null) {
                            p35h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p36h = (ImageView) findViewById(R.id.path36h);
        if (p36h != null) {
            p36h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(36) == true)
                    {
                        if (p36h != null) {
                            p36h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p37h = (ImageView) findViewById(R.id.path37h);
        if (p37h != null) {
            p37h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(37) == true)
                    {
                        if (p37h != null) {
                            p37h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p38h = (ImageView) findViewById(R.id.path38h);
        if (p38h != null) {
            p38h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(38) == true)
                    {
                        if (p38h != null) {
                            p38h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }



















        final ImageView p41h = (ImageView) findViewById(R.id.path41h);
        if (p41h != null) {
            p41h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(41) == true)
                    {
                        p41h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p42h = (ImageView) findViewById(R.id.path42h);
        if (p42h != null) {
            p42h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(42) == true)
                    {
                        if (p42h != null) {
                            p42h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p43h = (ImageView) findViewById(R.id.path43h);
        if (p43h != null) {
            p43h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(43) == true)
                    {
                        if (p43h != null) {
                            p43h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p44h = (ImageView) findViewById(R.id.path44h);
        if (p44h != null) {
            p44h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(44) == true)
                    {
                        if (p44h != null) {
                            p44h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p45h = (ImageView) findViewById(R.id.path45h);
        if (p45h != null) {
            p45h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(45) == true)
                    {
                        if (p45h != null) {
                            p45h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p46h = (ImageView) findViewById(R.id.path46h);
        if (p46h != null) {
            p46h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(46) == true)
                    {
                        if (p46h != null) {
                            p46h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p47h = (ImageView) findViewById(R.id.path47h);
        if (p47h != null) {
            p47h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(47) == true)
                    {
                        if (p47h != null) {
                            p47h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p48h = (ImageView) findViewById(R.id.path48h);
        if (p48h != null) {
            p48h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(48) == true)
                    {
                        if (p48h != null) {
                            p48h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }











        final ImageView p51h = (ImageView) findViewById(R.id.path51h);
        if (p51h != null) {
            p51h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(51) == true)
                    {
                        p51h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p52h = (ImageView) findViewById(R.id.path52h);
        if (p52h != null) {
            p52h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(52) == true)
                    {
                        if (p52h != null) {
                            p52h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p53h = (ImageView) findViewById(R.id.path53h);
        if (p53h != null) {
            p53h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(53) == true)
                    {
                        if (p53h != null) {
                            p53h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p54h = (ImageView) findViewById(R.id.path54h);
        if (p54h != null) {
            p54h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(54) == true)
                    {
                        if (p54h != null) {
                            p54h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p55h = (ImageView) findViewById(R.id.path55h);
        if (p55h != null) {
            p55h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(55) == true)
                    {
                        if (p55h != null) {
                            p55h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p56h = (ImageView) findViewById(R.id.path56h);
        if (p56h != null) {
            p56h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(56) == true)
                    {
                        if (p56h != null) {
                            p56h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p57h = (ImageView) findViewById(R.id.path57h);
        if (p57h != null) {
            p57h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(57) == true)
                    {
                        if (p57h != null) {
                            p57h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p58h = (ImageView) findViewById(R.id.path58h);
        if (p58h != null) {
            p58h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(58) == true)
                    {
                        if (p58h != null) {
                            p58h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }


















        final ImageView p61h = (ImageView) findViewById(R.id.path61h);
        if (p61h != null) {
            p61h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(61) == true)
                    {
                        p61h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p62h = (ImageView) findViewById(R.id.path62h);
        if (p62h != null) {
            p62h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(62) == true)
                    {
                        if (p62h != null) {
                            p62h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p63h = (ImageView) findViewById(R.id.path63h);
        if (p63h != null) {
            p63h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(63) == true)
                    {
                        if (p63h != null) {
                            p63h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p64h = (ImageView) findViewById(R.id.path64h);
        if (p64h != null) {
            p64h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(64) == true)
                    {
                        if (p64h != null) {
                            p64h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p65h = (ImageView) findViewById(R.id.path65h);
        if (p65h != null) {
            p65h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(65) == true)
                    {
                        if (p65h != null) {
                            p65h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p66h = (ImageView) findViewById(R.id.path66h);
        if (p66h != null) {
            p66h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(66) == true)
                    {
                        if (p66h != null) {
                            p66h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p67h = (ImageView) findViewById(R.id.path67h);
        if (p67h != null) {
            p67h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(67) == true)
                    {
                        if (p67h != null) {
                            p67h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p68h = (ImageView) findViewById(R.id.path68h);
        if (p68h != null) {
            p68h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(68) == true)
                    {
                        if (p68h != null) {
                            p68h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });



        }








        final ImageView p71h = (ImageView) findViewById(R.id.path71h);
        if (p71h != null) {
            p71h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(71) == true)
                    {
                        p71h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p72h = (ImageView) findViewById(R.id.path72h);
        if (p72h != null) {
            p72h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(72) == true)
                    {
                        if (p72h != null) {
                            p72h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p73h = (ImageView) findViewById(R.id.path73h);
        if (p73h != null) {
            p73h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(73) == true)
                    {
                        if (p73h != null) {
                            p73h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p74h = (ImageView) findViewById(R.id.path74h);
        if (p74h != null) {
            p74h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(74) == true)
                    {
                        if (p74h != null) {
                            p74h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p75h = (ImageView) findViewById(R.id.path75h);
        if (p75h != null) {
            p75h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(75) == true)
                    {
                        if (p75h != null) {
                            p75h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p76h = (ImageView) findViewById(R.id.path76h);
        if (p76h != null) {
            p76h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(76) == true)
                    {
                        if (p76h != null) {
                            p76h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p77h = (ImageView) findViewById(R.id.path77h);
        if (p77h != null) {
            p77h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(77) == true)
                    {
                        if (p77h != null) {
                            p77h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p78h = (ImageView) findViewById(R.id.path78h);
        if (p78h != null) {
            p78h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(78) == true)
                    {
                        if (p78h != null) {
                            p78h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }











        final ImageView p81h = (ImageView) findViewById(R.id.path81h);
        if (p81h != null) {
            p81h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(81) == true)
                    {
                        p81h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p82h = (ImageView) findViewById(R.id.path82h);
        if (p82h != null) {
            p82h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(82) == true)
                    {
                        if (p82h != null) {
                            p82h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p83h = (ImageView) findViewById(R.id.path83h);
        if (p83h != null) {
            p83h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(83) == true)
                    {
                        if (p83h != null) {
                            p83h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p84h = (ImageView) findViewById(R.id.path84h);
        if (p84h != null) {
            p84h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(84) == true)
                    {
                        if (p84h != null) {
                            p84h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p85h = (ImageView) findViewById(R.id.path85h);
        if (p85h != null) {
            p85h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(85) == true)
                    {
                        if (p85h != null) {
                            p85h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p86h = (ImageView) findViewById(R.id.path86h);
        if (p86h != null) {
            p86h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(86) == true)
                    {
                        if (p86h != null) {
                            p86h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p87h = (ImageView) findViewById(R.id.path87h);
        if (p87h != null) {
            p87h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(87) == true)
                    {
                        if (p87h != null) {
                            p87h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p88h = (ImageView) findViewById(R.id.path88h);
        if (p88h != null) {
            p88h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(88) == true)
                    {
                        if (p88h != null) {
                            p88h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }

        final ImageView p91h = (ImageView) findViewById(R.id.path91h);
        if (p91h != null) {
            p91h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(91) == true)
                    {
                        p91h.setImageResource(R.drawable.h_wall);
                    }
                }
            });
        }


        final ImageView p92h = (ImageView) findViewById(R.id.path92h);
        if (p92h != null) {
            p92h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(92) == true)
                    {
                        if (p92h != null) {
                            p92h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p93h = (ImageView) findViewById(R.id.path93h);
        if (p93h != null) {
            p93h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(93) == true)
                    {
                        if (p93h != null) {
                            p93h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p94h = (ImageView) findViewById(R.id.path94h);
        if (p94h != null) {
            p94h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(94) == true)
                    {
                        if (p94h != null) {
                            p94h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p95h = (ImageView) findViewById(R.id.path95h);
        if (p95h != null) {
            p95h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(95) == true)
                    {
                        if (p95h != null) {
                            p95h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p96h = (ImageView) findViewById(R.id.path96h);
        if (p96h != null) {
            p96h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(96) == true)
                    {
                        if (p96h != null) {
                            p96h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p97h = (ImageView) findViewById(R.id.path97h);
        if (p97h != null) {
            p97h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(97) == true)
                    {
                        if (p97h != null) {
                            p97h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }
        final ImageView p98h = (ImageView) findViewById(R.id.path98h);
        if (p98h != null) {
            p98h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(98) == true)
                    {
                        if (p98h != null) {
                            p98h.setImageResource(R.drawable.h_wall);
                        }
                    }
                }
            });
        }














    }



    public void Showvw() {

        final ImageView p11v = (ImageView) findViewById(R.id.path11v);
        if (p11v != null) {
            p11v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(11) == true)
                    {
                        p11v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }



        final ImageView p12v = (ImageView) findViewById(R.id.path12v);
        if (p12v != null) {
            p12v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(12) == true)
                    {
                        if (p12v!= null) {
                            p12v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p13v = (ImageView) findViewById(R.id.path13v);
        if (p13v != null) {
            p13v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(13) == true)
                    {
                        if (p13v != null) {
                            p13v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p14v = (ImageView) findViewById(R.id.path14v);
        if (p14v != null) {
            p14v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(14) == true)
                    {
                        if (p14v != null) {
                            p14v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p15v = (ImageView) findViewById(R.id.path15v);
        if (p15v != null) {
            p15v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(15) == true)
                    {
                        if (p15v != null) {
                            p15v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p16v = (ImageView) findViewById(R.id.path16v);
        if (p16v != null) {
            p16v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(16) == true)
                    {
                        if (p16v != null) {
                            p16v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p17v = (ImageView) findViewById(R.id.path17v);
        if (p17v != null) {
            p17v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(17) == true)
                    {
                        if (p17v != null) {
                            p17v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p18v = (ImageView) findViewById(R.id.path18v);
        if (p18v != null) {
            p18v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(18) == true)
                    {
                        if (p18v != null) {
                            p18v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }










        final ImageView p21v = (ImageView) findViewById(R.id.path21v);
        if (p21v != null) {
            p21v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(21) == true)
                    {
                        p21v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p22v = (ImageView) findViewById(R.id.path22v);
        if (p22v != null) {
            p22v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(22) == true)
                    {
                        if (p22v != null) {
                            p22v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p23v = (ImageView) findViewById(R.id.path23v);
        if (p23v != null) {
            p23v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(23) == true)
                    {
                        if (p23v != null) {
                            p23v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p24v = (ImageView) findViewById(R.id.path24v);
        if (p24v != null) {
            p24v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(24) == true)
                    {
                        if (p24v != null) {
                            p24v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p25v = (ImageView) findViewById(R.id.path25v);
        if (p25v != null) {
            p25v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(25) == true)
                    {
                        if (p25v != null) {
                            p25v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p26v = (ImageView) findViewById(R.id.path26v);
        if (p26v != null) {
            p26v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(26) == true)
                    {
                        if (p26v != null) {
                            p26v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p27v = (ImageView) findViewById(R.id.path27v);
        if (p27v != null) {
            p27v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(27) == true)
                    {
                        if (p27v != null) {
                            p27v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p28v = (ImageView) findViewById(R.id.path28v);
        if (p28v != null) {
            p28v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(28) == true)
                    {
                        if (p28v != null) {
                            p28v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }













        final ImageView p31v = (ImageView) findViewById(R.id.path31v);
        if (p31v != null) {
            p31v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(31) == true)
                    {
                        p31v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p32v = (ImageView) findViewById(R.id.path32v);
        if (p32v != null) {
            p32v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(32) == true)
                    {
                        if (p32v != null) {
                            p32v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p33v = (ImageView) findViewById(R.id.path33v);
        if (p33v != null) {
            p33v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(33) == true)
                    {
                        if (p33v != null) {
                            p33v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p34v = (ImageView) findViewById(R.id.path34v);
        if (p34v != null) {
            p34v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(34) == true)
                    {
                        if (p34v != null) {
                            p34v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p35v = (ImageView) findViewById(R.id.path35v);
        if (p35v != null) {
            p35v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(35) == true)
                    {
                        if (p35v != null) {
                            p35v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p36v = (ImageView) findViewById(R.id.path36v);
        if (p36v != null) {
            p36v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(36) == true)
                    {
                        if (p36v != null) {
                            p36v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p37v = (ImageView) findViewById(R.id.path37v);
        if (p37v != null) {
            p37v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(37) == true)
                    {
                        if (p37v != null) {
                            p37v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p38v = (ImageView) findViewById(R.id.path38v);
        if (p38v != null) {
            p38v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(38) == true)
                    {
                        if (p38v != null) {
                            p38v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }



















        final ImageView p41v = (ImageView) findViewById(R.id.path41v);
        if (p41v != null) {
            p41v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(41) == true)
                    {
                        p41v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p42v = (ImageView) findViewById(R.id.path42v);
        if (p42v!= null) {
            p42v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(42) == true)
                    {
                        if (p42v != null) {
                            p42v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p43v = (ImageView) findViewById(R.id.path43v);
        if (p43v != null) {
            p43v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(43) == true)
                    {
                        if (p43v != null) {
                            p43v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p44v = (ImageView) findViewById(R.id.path44v);
        if (p44v != null) {
            p44v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(44) == true)
                    {
                        if (p44v != null) {
                            p44v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p45v = (ImageView) findViewById(R.id.path45v);
        if (p45v != null) {
            p45v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(45) == true)
                    {
                        if (p45v != null) {
                            p45v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p46v = (ImageView) findViewById(R.id.path46v);
        if (p46v != null) {
            p46v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(46) == true)
                    {
                        if (p46v != null) {
                            p46v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p47v = (ImageView) findViewById(R.id.path47v);
        if (p47v != null) {
            p47v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(47) == true)
                    {
                        if (p47v != null) {
                            p47v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p48v = (ImageView) findViewById(R.id.path48v);
        if (p48v != null) {
            p48v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(48) == true)
                    {
                        if (p48v != null) {
                            p48v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }











        final ImageView p51v = (ImageView) findViewById(R.id.path51v);
        if (p51v != null) {
            p51v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(51) == true)
                    {
                        p51v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p52v = (ImageView) findViewById(R.id.path52v);
        if (p52v != null) {
            p52v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(52) == true)
                    {
                        if (p52v != null) {
                            p52v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p53v = (ImageView) findViewById(R.id.path53v);
        if (p53v != null) {
            p53v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(53) == true)
                    {
                        if (p53v != null) {
                            p53v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p54v = (ImageView) findViewById(R.id.path54v);
        if (p54v != null) {
            p54v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(54) == true)
                    {
                        if (p54v != null) {
                            p54v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p55v = (ImageView) findViewById(R.id.path55v);
        if (p55v != null) {
            p55v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(55) == true)
                    {
                        if (p55v != null) {
                            p55v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p56v = (ImageView) findViewById(R.id.path56v);
        if (p56v != null) {
            p56v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(56) == true)
                    {
                        if (p56v != null) {
                            p56v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p57v = (ImageView) findViewById(R.id.path57v);
        if (p57v != null) {
            p57v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(57) == true)
                    {
                        if (p57v != null) {
                            p57v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p58v = (ImageView) findViewById(R.id.path58v);
        if (p58v != null) {
            p58v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(58) == true)
                    {
                        if (p58v != null) {
                            p58v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }


















        final ImageView p61v = (ImageView) findViewById(R.id.path61v);
        if (p61v != null) {
            p61v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(61) == true)
                    {
                        p61v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p62v = (ImageView) findViewById(R.id.path62v);
        if (p62v != null) {
            p62v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(62) == true)
                    {
                        if (p62v != null) {
                            p62v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p63v = (ImageView) findViewById(R.id.path63v);
        if (p63v != null) {
            p63v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(63) == true)
                    {
                        if (p63v != null) {
                            p63v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p64v = (ImageView) findViewById(R.id.path64v);
        if (p64v != null) {
            p64v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(64) == true)
                    {
                        if (p64v != null) {
                            p64v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p65v = (ImageView) findViewById(R.id.path65v);
        if (p65v != null) {
            p65v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(65) == true)
                    {
                        if (p65v != null) {
                            p65v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p66v = (ImageView) findViewById(R.id.path66v);
        if (p66v != null) {
            p66v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(66) == true)
                    {
                        if (p66v != null) {
                            p66v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p67v = (ImageView) findViewById(R.id.path67v);
        if (p67v != null) {
            p67v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(67) == true)
                    {
                        if (p67v != null) {
                            p67v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p68v = (ImageView) findViewById(R.id.path68v);
        if (p68v != null) {
            p68v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(68) == true)
                    {
                        if (p68v != null) {
                            p68v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });



        }








        final ImageView p71v = (ImageView) findViewById(R.id.path71v);
        if (p71v != null) {
            p71v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(71) == true)
                    {
                        p71v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p72v = (ImageView) findViewById(R.id.path72v);
        if (p72v != null) {
            p72v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(72) == true)
                    {
                        if (p72v != null) {
                            p72v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p73v = (ImageView) findViewById(R.id.path73v);
        if (p73v != null) {
            p73v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(73) == true)
                    {
                        if (p73v != null) {
                            p73v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p74v = (ImageView) findViewById(R.id.path74v);
        if (p74v != null) {
            p74v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(74) == true)
                    {
                        if (p74v != null) {
                            p74v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p75v = (ImageView) findViewById(R.id.path75v);
        if (p75v != null) {
            p75v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(75) == true)
                    {
                        if (p75v != null) {
                            p75v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p76v = (ImageView) findViewById(R.id.path76v);
        if (p76v != null) {
            p76v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(76) == true)
                    {
                        if (p76v != null) {
                            p76v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p77v= (ImageView) findViewById(R.id.path77v);
        if (p77v != null) {
            p77v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(77) == true)
                    {
                        if (p77v != null) {
                            p77v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p78v = (ImageView) findViewById(R.id.path78v);
        if (p78v != null) {
            p78v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(78) == true)
                    {
                        if (p78v != null) {
                            p78v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }











        final ImageView p81v = (ImageView) findViewById(R.id.path81v);
        if (p81v != null) {
            p81v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(81) == true)
                    {
                        p81v.setImageResource(R.drawable.v_wall);
                    }
                }
            });
        }


        final ImageView p82v = (ImageView) findViewById(R.id.path82v);
        if (p82v != null) {
            p82v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(82) == true)
                    {
                        if (p82v != null) {
                            p82v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p83v = (ImageView) findViewById(R.id.path83v);
        if (p83v != null) {
            p83v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(83) == true)
                    {
                        if (p83v != null) {
                            p83v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p84v = (ImageView) findViewById(R.id.path84v);
        if (p84v != null) {
            p84v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(84) == true)
                    {
                        if (p84v != null) {
                            p84v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p85v = (ImageView) findViewById(R.id.path85v);
        if (p85v != null) {
            p85v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(85) == true)
                    {
                        if (p85v != null) {
                            p85v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p86v = (ImageView) findViewById(R.id.path86v);
        if (p86v != null) {
            p86v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(86) == true)
                    {
                        if (p86v != null) {
                            p86v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p87v = (ImageView) findViewById(R.id.path87v);
        if (p87v != null) {
            p87v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(87) == true)
                    {
                        if (p87v != null) {
                            p87v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }
        final ImageView p88v = (ImageView) findViewById(R.id.path88v);
        if (p88v != null) {
            p88v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ValdiateMove.validatewall(88) == true)
                    {
                        if (p88v != null) {
                            p88v.setImageResource(R.drawable.v_wall);
                        }
                    }
                }
            });
        }





    }



    public void ShowPawnBlack() {

         final ImageView p11= (ImageView) findViewById(R.id.pawn11);
        if (p11 != null) {
            p11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(11) == true)
                    {
                        p11.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p12= (ImageView) findViewById(R.id.pawn12);
        if (p12 != null) {
            p12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(12) == true)
                    {
                        p12.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p13= (ImageView) findViewById(R.id.pawn13);
        if (p13 != null) {
            p13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(13) == true)
                    {
                        p13.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p14= (ImageView) findViewById(R.id.pawn14);
        if (p14 != null) {
            p14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(14) == true)
                    {
                        p14.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p15= (ImageView) findViewById(R.id.pawn15);
        if (p15 != null) {
            p15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(15) == true)
                    {
                        p15.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p16= (ImageView) findViewById(R.id.pawn16);
        if (p16 != null) {
            p16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(16) == true) {
                        p16.setImageResource(R.drawable.ai_pawn);
                    }
                    }
                });
        }
        final ImageView p17= (ImageView) findViewById(R.id.pawn17);
        if (p17 != null) {
            p17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(17) == true)
                    {
                        p17.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p18= (ImageView) findViewById(R.id.pawn18);
        if (p18 != null) {
            p18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(18) == true)
                    {
                        p18.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p19= (ImageView) findViewById(R.id.pawn19);
        if (p19 != null) {
            p19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(19) == true)
                    {
                        p19.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }



        final ImageView p21= (ImageView) findViewById(R.id.pawn21);
        if (p21 != null) {
            p21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(21) == true)
                    {
                        p21.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p22= (ImageView) findViewById(R.id.pawn22);
        if (p22 != null) {
            p22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(22) == true)
                    {
                        p22.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p23= (ImageView) findViewById(R.id.pawn23);
        if (p23 != null) {
            p23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(23) == true)
                    {
                        p23.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p24= (ImageView) findViewById(R.id.pawn24);
        if (p24 != null) {
            p24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(24) == true)
                    {
                        p24.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p25= (ImageView) findViewById(R.id.pawn25);
        if (p25 != null) {
            p25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(25) == true)
                    {
                        p25.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p26= (ImageView) findViewById(R.id.pawn26);
        if (p26 != null) {
            p26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(26) == true)
                    {
                        p26.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p27= (ImageView) findViewById(R.id.pawn27);
        if (p27 != null) {
            p27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(27) == true)
                    {
                        p27.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p28= (ImageView) findViewById(R.id.pawn28);
        if (p28 != null) {
            p28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(28) == true)
                    {
                        p28.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p29= (ImageView) findViewById(R.id.pawn29);
        if (p29 != null) {
            p29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(29) == true)
                    {
                        p29.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }


        final ImageView p31= (ImageView) findViewById(R.id.pawn31);
        if (p31 != null) {
            p31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(31) == true)
                    {
                        p31.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p32= (ImageView) findViewById(R.id.pawn32);
        if (p32 != null) {
            p32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(32) == true)
                    {
                        p32.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p33= (ImageView) findViewById(R.id.pawn33);
        if (p33 != null) {
            p33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(33) == true)
                    {
                        p33.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p34= (ImageView) findViewById(R.id.pawn34);
        if (p34 != null) {
            p34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(34) == true)
                    {
                        p34.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p35= (ImageView) findViewById(R.id.pawn35);
        if (p35 != null) {
            p35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(35) == true)
                    {
                        p35.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p36= (ImageView) findViewById(R.id.pawn36);
        if (p36 != null) {
            p36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(36) == true)
                    {
                        p36.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p37= (ImageView) findViewById(R.id.pawn37);
        if (p37 != null) {
            p37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(37) == true)
                    {
                        p37.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p38= (ImageView) findViewById(R.id.pawn38);
        if (p38 != null) {
            p38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(38) == true)
                    {
                        p38.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p39= (ImageView) findViewById(R.id.pawn39);
        if (p39 != null) {
            p39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(39) == true)
                    {
                        p39.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }

        final ImageView p41= (ImageView) findViewById(R.id.pawn41);
        if (p41 != null) {
            p41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(41) == true)
                    {
                        p41.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p42= (ImageView) findViewById(R.id.pawn42);
        if (p42 != null) {
            p42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(42) == true)
                    {
                        p42.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p43= (ImageView) findViewById(R.id.pawn43);
        if (p43 != null) {
            p43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(43) == true)
                    {
                        p43.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p44= (ImageView) findViewById(R.id.pawn44);
        if (p44 != null) {
            p44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(44) == true)
                    {
                        p44.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p45= (ImageView) findViewById(R.id.pawn45);
        if (p45 != null) {
            p45.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(45) == true)
                    {
                        p45.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p46= (ImageView) findViewById(R.id.pawn46);
        if (p46 != null) {
            p46.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(46) == true)
                    {
                        p46.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p47= (ImageView) findViewById(R.id.pawn47);
        if (p47 != null) {
            p47.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(47) == true)
                    {
                        p47.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p48= (ImageView) findViewById(R.id.pawn48);
        if (p48 != null) {
            p48.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(48) == true)
                    {
                        p48.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p49= (ImageView) findViewById(R.id.pawn49);
        if (p49 != null) {
            p49.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(49) == true)
                    {
                        p49.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }



        final ImageView p51= (ImageView) findViewById(R.id.pawn51);
        if (p51 != null) {
            p51.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(51) == true)
                    {
                        p51.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p52= (ImageView) findViewById(R.id.pawn52);
        if (p52 != null) {
            p52.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(52) == true)
                    {
                        p52.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p53= (ImageView) findViewById(R.id.pawn53);
        if (p53 != null) {
            p53.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(53) == true)
                    {
                        p53.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p54= (ImageView) findViewById(R.id.pawn54);
        if (p54 != null) {
            p54.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(54) == true)
                    {
                        p54.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p55= (ImageView) findViewById(R.id.pawn55);
        if (p55 != null) {
            p55.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(55) == true)
                    {
                        p55.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p56= (ImageView) findViewById(R.id.pawn56);
        if (p56 != null) {
            p56.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(56) == true)
                    {
                        p56.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p57= (ImageView) findViewById(R.id.pawn57);
        if (p57 != null) {
            p57.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(57) == true)
                    {
                        p57.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p58= (ImageView) findViewById(R.id.pawn58);
        if (p58 != null) {
            p58.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(58) == true)
                    {
                        p58.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p59= (ImageView) findViewById(R.id.pawn59);
        if (p59 != null) {
            p59.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(59) == true)
                    {
                        p59.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }




        final ImageView p61= (ImageView) findViewById(R.id.pawn61);
        if (p61 != null) {
            p61.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(61) == true)
                    {
                        p61.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p62= (ImageView) findViewById(R.id.pawn62);
        if (p62 != null) {
            p62.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(62) == true)
                    {
                        p62.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p63= (ImageView) findViewById(R.id.pawn63);
        if (p63 != null) {
            p63.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(63) == true)
                    {
                        p63.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p64= (ImageView) findViewById(R.id.pawn64);
        if (p64 != null) {
            p64.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(64) == true)
                    {
                        p64.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p65= (ImageView) findViewById(R.id.pawn65);
        if (p65 != null) {
            p65.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(65) == true)
                    {
                        p65.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p66= (ImageView) findViewById(R.id.pawn66);
        if (p66 != null) {
            p66.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(66) == true)
                    {
                        p66.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p67= (ImageView) findViewById(R.id.pawn67);
        if (p67 != null) {
            p67.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(67) == true)
                    {
                        p67.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p68= (ImageView) findViewById(R.id.pawn68);
        if (p68 != null) {
            p68.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(68) == true)
                    {
                        p68.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p69= (ImageView) findViewById(R.id.pawn69);
        if (p69 != null) {
            p69.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(69) == true)
                    {
                        p69.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }



        final ImageView p71= (ImageView) findViewById(R.id.pawn71);
        if (p71 != null) {
            p71.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(71) == true)
                    {
                        p71.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p72= (ImageView) findViewById(R.id.pawn72);
        if (p72 != null) {
            p72.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(72) == true)
                    {
                        p72.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p73= (ImageView) findViewById(R.id.pawn73);
        if (p73 != null) {
            p73.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(73) == true)
                    {
                        p73.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p74= (ImageView) findViewById(R.id.pawn74);
        if (p74 != null) {
            p74.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(74) == true)
                    {
                        p74.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p75= (ImageView) findViewById(R.id.pawn75);
        if (p75 != null) {
            p75.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(75) == true)
                    {
                        p75.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p76= (ImageView) findViewById(R.id.pawn76);
        if (p76 != null) {
            p76.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(76) == true)
                    {
                        p76.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p77= (ImageView) findViewById(R.id.pawn77);
        if (p77 != null) {
            p77.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(77) == true)
                    {
                        p77.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p78= (ImageView) findViewById(R.id.pawn78);
        if (p78 != null) {
            p78.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(78) == true)
                    {
                        p78.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p79= (ImageView) findViewById(R.id.pawn79);
        if (p79 != null) {
            p79.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(79) == true)
                    {
                        p79.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }


        final ImageView p81= (ImageView) findViewById(R.id.pawn81);
        if (p81 != null) {
            p81.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(81) == true)
                    {
                        p81.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p82= (ImageView) findViewById(R.id.pawn82);
        if (p82 != null) {
            p82.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(82) == true)
                    {
                        p82.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p83= (ImageView) findViewById(R.id.pawn83);
        if (p83 != null) {
            p83.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(83) == true)
                    {
                        p83.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p84= (ImageView) findViewById(R.id.pawn84);
        if (p84 != null) {
            p84.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(84) == true)
                    {
                        p84.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p85= (ImageView) findViewById(R.id.pawn85);
        if (p85 != null) {
            p85.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(85) == true)
                    {
                        p85.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p86= (ImageView) findViewById(R.id.pawn86);
        if (p86 != null) {
            p86.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(86) == true)
                    {
                        p86.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p87= (ImageView) findViewById(R.id.pawn87);
        if (p87 != null) {
            p87.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(87) == true)
                    {
                        p87.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p88= (ImageView) findViewById(R.id.pawn88);
        if (p88 != null) {
            p88.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(88) == true)
                    {
                        p88.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p89= (ImageView) findViewById(R.id.pawn89);
        if (p89 != null) {
            p89.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(89) == true)
                    {
                        p89.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }


        final ImageView p91= (ImageView) findViewById(R.id.pawn91);
        if (p91 != null) {
            p91.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(91) == true)
                    {
                        p91.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p92= (ImageView) findViewById(R.id.pawn92);
        if (p92 != null) {
            p92.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(92) == true)
                    {
                        p92.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p93= (ImageView) findViewById(R.id.pawn93);
        if (p93 != null) {
            p93.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(93) == true)
                    {
                        p93.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p94= (ImageView) findViewById(R.id.pawn94);
        if (p94 != null) {
            p94.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(94) == true)
                    {
                        p94.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p95= (ImageView) findViewById(R.id.pawn95);
        if (p95 != null) {
            p95.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(95) == true)
                    {
                        p95.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p96= (ImageView) findViewById(R.id.pawn96);
        if (p96 != null) {
            p96.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(96) == true)
                    {
                        p96.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p97= (ImageView) findViewById(R.id.pawn97);
        if (p97 != null) {
            p97.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(97) == true)
                    {
                        p97.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p98= (ImageView) findViewById(R.id.pawn98);
        if (p98 != null) {
            p98.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(98) == true)
                    {
                        p98.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        final ImageView p99= (ImageView) findViewById(R.id.pawn99);
        if (p99 != null) {
            p99.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(99) == true)
                    {
                        p99.setImageResource(R.drawable.ai_pawn);
                    }
                }
            });
        }
        }


    public void ShowPawnWhite() {

        final ImageView p11= (ImageView) findViewById(R.id.pawn11);
        if (p11 != null) {
            p11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(11) == true)
                    {
                        p11.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p12= (ImageView) findViewById(R.id.pawn12);
        if (p12 != null) {
            p12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(12) == true)
                    {
                        p12.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p13= (ImageView) findViewById(R.id.pawn13);
        if (p13 != null) {
            p13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(13) == true)
                    {
                        p13.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p14= (ImageView) findViewById(R.id.pawn14);
        if (p14 != null) {
            p14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(14) == true)
                    {
                        p14.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p15= (ImageView) findViewById(R.id.pawn15);
        if (p15 != null) {
            p15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(15) == true)
                    {
                        p15.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p16= (ImageView) findViewById(R.id.pawn16);
        if (p16 != null) {
            p16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(16) == true)
                    {
                        p16.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p17= (ImageView) findViewById(R.id.pawn17);
        if (p17 != null) {
            p17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(17) == true)
                    {
                        p17.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p18= (ImageView) findViewById(R.id.pawn18);
        if (p18 != null) {
            p18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(18) == true)
                    {
                        p18.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p19= (ImageView) findViewById(R.id.pawn19);
        if (p19 != null) {
            p19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(19) == true)
                    {
                        p19.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }



        final ImageView p21= (ImageView) findViewById(R.id.pawn21);
        if (p21 != null) {
            p21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(21) == true)
                    {
                        p21.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p22= (ImageView) findViewById(R.id.pawn22);
        if (p22 != null) {
            p22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(22) == true)
                    {
                        p22.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p23= (ImageView) findViewById(R.id.pawn23);
        if (p23 != null) {
            p23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(23) == true)
                    {
                        p23.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p24= (ImageView) findViewById(R.id.pawn24);
        if (p24 != null) {
            p24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(24) == true)
                    {
                        p24.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p25= (ImageView) findViewById(R.id.pawn25);
        if (p25 != null) {
            p25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(25) == true)
                    {
                        p25.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p26= (ImageView) findViewById(R.id.pawn26);
        if (p26 != null) {
            p26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(26) == true)
                    {
                        p26.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p27= (ImageView) findViewById(R.id.pawn27);
        if (p27 != null) {
            p27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(27) == true)
                    {
                        p27.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p28= (ImageView) findViewById(R.id.pawn28);
        if (p28 != null) {
            p28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(28) == true)
                    {
                        p28.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p29= (ImageView) findViewById(R.id.pawn29);
        if (p29 != null) {
            p29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(29) == true)
                    {
                        p29.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }


        final ImageView p31= (ImageView) findViewById(R.id.pawn31);
        if (p31 != null) {
            p31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(31) == true)
                    {
                        p31.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p32= (ImageView) findViewById(R.id.pawn32);
        if (p32 != null) {
            p32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(32) == true)
                    {
                        p32.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p33= (ImageView) findViewById(R.id.pawn33);
        if (p33 != null) {
            p33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(33) == true)
                    {
                        p33.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p34= (ImageView) findViewById(R.id.pawn34);
        if (p34 != null) {
            p34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(34) == true)
                    {
                        p34.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p35= (ImageView) findViewById(R.id.pawn35);
        if (p35 != null) {
            p35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(35) == true)
                    {
                        p35.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p36= (ImageView) findViewById(R.id.pawn36);
        if (p36 != null) {
            p36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(36) == true)
                    {
                        p36.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p37= (ImageView) findViewById(R.id.pawn37);
        if (p37 != null) {
            p37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(37) == true)
                    {
                        p37.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p38= (ImageView) findViewById(R.id.pawn38);
        if (p38 != null) {
            p38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(38) == true)
                    {
                        p38.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p39= (ImageView) findViewById(R.id.pawn39);
        if (p39 != null) {
            p39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(39) == true)
                    {
                        p39.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }

        final ImageView p41= (ImageView) findViewById(R.id.pawn41);
        if (p41 != null) {
            p41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(41) == true)
                    {
                        p41.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p42= (ImageView) findViewById(R.id.pawn42);
        if (p42 != null) {
            p42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(42) == true)
                    {
                        p42.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p43= (ImageView) findViewById(R.id.pawn43);
        if (p43 != null) {
            p43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(43) == true)
                    {
                        p43.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p44= (ImageView) findViewById(R.id.pawn44);
        if (p44 != null) {
            p44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(44) == true)
                    {
                        p44.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p45= (ImageView) findViewById(R.id.pawn45);
        if (p45 != null) {
            p45.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(45) == true)
                    {
                        p45.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p46= (ImageView) findViewById(R.id.pawn46);
        if (p46 != null) {
            p46.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(46) == true)
                    {
                        p46.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p47= (ImageView) findViewById(R.id.pawn47);
        if (p47 != null) {
            p47.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(47) == true)
                    {
                        p47.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p48= (ImageView) findViewById(R.id.pawn48);
        if (p48 != null) {
            p48.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(48) == true)
                    {
                        p48.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p49= (ImageView) findViewById(R.id.pawn49);
        if (p49 != null) {
            p49.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(49) == true)
                    {
                        p49.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }



        final ImageView p51= (ImageView) findViewById(R.id.pawn51);
        if (p51 != null) {
            p51.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(51) == true)
                    {
                        p51.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p52= (ImageView) findViewById(R.id.pawn52);
        if (p52 != null) {
            p52.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(52) == true)
                    {
                        p52.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p53= (ImageView) findViewById(R.id.pawn53);
        if (p53 != null) {
            p53.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(53) == true)
                    {
                        p53.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p54= (ImageView) findViewById(R.id.pawn54);
        if (p54 != null) {
            p54.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(54) == true)
                    {
                        p54.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p55= (ImageView) findViewById(R.id.pawn55);
        if (p55 != null) {
            p55.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(55) == true)
                    {
                        p55.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p56= (ImageView) findViewById(R.id.pawn56);
        if (p56 != null) {
            p56.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(56) == true)
                    {
                        p56.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p57= (ImageView) findViewById(R.id.pawn57);
        if (p57 != null) {
            p57.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(57) == true)
                    {
                        p57.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p58= (ImageView) findViewById(R.id.pawn58);
        if (p58 != null) {
            p58.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(58) == true)
                    {
                        p58.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p59= (ImageView) findViewById(R.id.pawn59);
        if (p59 != null) {
            p59.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(59) == true)
                    {
                        p59.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }




        final ImageView p61= (ImageView) findViewById(R.id.pawn61);
        if (p61 != null) {
            p61.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(61) == true)
                    {
                        p61.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p62= (ImageView) findViewById(R.id.pawn62);
        if (p62 != null) {
            p62.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(62) == true)
                    {
                        p62.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p63= (ImageView) findViewById(R.id.pawn63);
        if (p63 != null) {
            p63.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(63) == true)
                    {
                        p63.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p64= (ImageView) findViewById(R.id.pawn64);
        if (p64 != null) {
            p64.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(64) == true)
                    {
                        p64.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p65= (ImageView) findViewById(R.id.pawn65);
        if (p65 != null) {
            p65.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(65) == true)
                    {
                        p65.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p66= (ImageView) findViewById(R.id.pawn66);
        if (p66 != null) {
            p66.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(66) == true)
                    {
                        p66.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p67= (ImageView) findViewById(R.id.pawn67);
        if (p67 != null) {
            p67.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(67) == true)
                    {
                        p67.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p68= (ImageView) findViewById(R.id.pawn68);
        if (p68 != null) {
            p68.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(68) == true)
                    {
                        p68.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p69= (ImageView) findViewById(R.id.pawn69);
        if (p69 != null) {
            p69.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(69) == true)
                    {
                        p69.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }



        final ImageView p71= (ImageView) findViewById(R.id.pawn71);
        if (p71 != null) {
            p71.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(71) == true)
                    {
                        p71.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p72= (ImageView) findViewById(R.id.pawn72);
        if (p72 != null) {
            p72.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(72) == true)
                    {
                        p72.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p73= (ImageView) findViewById(R.id.pawn73);
        if (p73 != null) {
            p73.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(73) == true)
                    {
                        p73.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p74= (ImageView) findViewById(R.id.pawn74);
        if (p74 != null) {
            p74.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(74) == true)
                    {
                        p74.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p75= (ImageView) findViewById(R.id.pawn75);
        if (p75 != null) {
            p75.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(75) == true)
                    {
                        p75.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p76= (ImageView) findViewById(R.id.pawn76);
        if (p76 != null) {
            p76.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(76) == true)
                    {
                        p76.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p77= (ImageView) findViewById(R.id.pawn77);
        if (p77 != null) {
            p77.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(77) == true)
                    {
                        p77.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p78= (ImageView) findViewById(R.id.pawn78);
        if (p78 != null) {
            p78.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(78) == true)
                    {
                        p78.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p79= (ImageView) findViewById(R.id.pawn79);
        if (p79 != null) {
            p79.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(79) == true)
                    {
                        p79.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }


        final ImageView p81= (ImageView) findViewById(R.id.pawn81);
        if (p81 != null) {
            p81.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(81) == true)
                    {
                        p81.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p82= (ImageView) findViewById(R.id.pawn82);
        if (p82 != null) {
            p82.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(82) == true)
                    {
                        p82.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p83= (ImageView) findViewById(R.id.pawn83);
        if (p83 != null) {
            p83.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(83) == true)
                    {
                        p83.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p84= (ImageView) findViewById(R.id.pawn84);
        if (p84 != null) {
            p84.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(84) == true)
                    {
                        p84.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p85= (ImageView) findViewById(R.id.pawn85);
        if (p85 != null) {
            p85.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(85) == true)
                    {
                        p85.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p86= (ImageView) findViewById(R.id.pawn86);
        if (p86 != null) {
            p86.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(86) == true)
                    {
                        p86.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p87= (ImageView) findViewById(R.id.pawn87);
        if (p87 != null) {
            p87.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(87) == true)
                    {
                        p87.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p88= (ImageView) findViewById(R.id.pawn88);
        if (p88 != null) {
            p88.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(88) == true)
                    {
                        p88.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p89= (ImageView) findViewById(R.id.pawn89);
        if (p89 != null) {
            p89.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(89) == true)
                    {
                        p89.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }


        final ImageView p91= (ImageView) findViewById(R.id.pawn91);
        if (p91 != null) {
            p91.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(91) == true)
                    {
                        p91.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p92= (ImageView) findViewById(R.id.pawn92);
        if (p92 != null) {
            p92.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(92) == true)
                    {
                        p92.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p93= (ImageView) findViewById(R.id.pawn93);
        if (p93 != null) {
            p93.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(93) == true)
                    {
                        p93.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p94= (ImageView) findViewById(R.id.pawn94);
        if (p94 != null) {
            p94.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(94) == true)
                    {
                        p94.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p95= (ImageView) findViewById(R.id.pawn95);
        if (p95 != null) {
            p95.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(95) == true)
                    {
                        p95.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p96= (ImageView) findViewById(R.id.pawn96);
        if (p96 != null) {
            p96.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(96) == true)
                    {
                        p96.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p97= (ImageView) findViewById(R.id.pawn97);
        if (p97 != null) {
            p97.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(97) == true)
                    {
                        p97.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p98= (ImageView) findViewById(R.id.pawn98);
        if (p98 != null) {
            p98.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(ValdiateMove.Validate(98) == true)
                    {
                        p98.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }
        final ImageView p99= (ImageView) findViewById(R.id.pawn99);
        if (p99 != null) {
            p99.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ValdiateMove.Validate(99) == true)
                    {
                        p99.setImageResource(R.drawable.user_pawn);
                    }
                }
            });
        }

    }


    public static boolean getturn() {
        if(counter%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}