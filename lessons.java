int [] MadMax(int N, int [] Tele)
    {
        boolean unic;
        Random random = new Random();
        Tele[0] = random.nextInt(256);
        System.out.println(Tele[0]);
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


                }System.out.println("i = " + i);
                System.out.print(Tele[i] +" ");
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
