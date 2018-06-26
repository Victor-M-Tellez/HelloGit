 public static void main(String[] args) {
        System.out.println("Hello, World");
        double time = 1122.1234;
        int hr= (int)(time/100);
        int min= (int)(time-(hr*100));
        int secs= (int)(  (((time)*10000)-(hr*1000000))-(min*10000));




        System.out.println("Hour: "+ hr);
        System.out.println("Min: "+ min);
        System.out.println("Sec: "+ secs);
    }
