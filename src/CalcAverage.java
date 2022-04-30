public class CalcAverage {
    public String average(int input){
        int num = 0;
        int count = 0;
        for(int i=0;i<input;i++){
            if(i%3==0&&i%4==0){
                num += i;
            }
            count++;
        }
        double avrg = (double) num /count;
        return "Ortalama = " + avrg;
    }
}
