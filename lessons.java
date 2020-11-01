import java.util.*;

public class Level1
{

public static int [] MadMax(int N, int [] Tele)
    {
       boolean unic;	
        Random random = new Random();	
        Tele[0] = random.nextInt(256);	

        for (int i = 1; i<N; i++) {	
            do {	
                unic = true;	
                int number = random.nextInt(256);	
                for (int j = 0; j < i; j++) {	
                    if (Tele[j] == number) {	
                        unic = false;	
                        break;	
                    }else {	
                        Tele [i] = number;	
                    }	
                }	
            } while (!unic);	
        }	

        for (int a = 1;a <Tele.length; a++)
        {
            for (int b=Tele.length-1; b>=a; b--)
            {
                if (Tele[b-1]>Tele[b])
                {
                    int t = Tele [b-1];
                    Tele [b-1] = Tele[b];
                    Tele[b] = t;
                }
            }
        }

        for (int a = (Tele.length+1)/2;a <Tele.length; a++)
        {
            for (int b=Tele.length-1; b>=a; b--)
            {
                if (Tele[b-1]<Tele[b])
                {
                    int t = Tele [b-1];
                    Tele [b-1] = Tele[b];
                    Tele[b] = t;
                }
            }
        }
        return Tele;
    }
}
