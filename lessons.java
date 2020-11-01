int [] MadMax(int N, int [] Tele)
    {

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
