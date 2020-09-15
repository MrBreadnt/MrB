public class Main {
    public static void main(String[] args) {
        double km = 100;
        double miles = 62.1371;
        Neyron neyron = new Neyron();
        int i = 0;
        do {
            i++;
            neyron.Train(km, miles);
            System.out.print("Итерация: "+i+" Ошибка: "+(neyron.lastError));
        }while (neyron.lastError > neyron.smoothing || neyron.lastError < -neyron.smoothing);
        System.out.print(neyron.ProcessInputData(100)+" миль в "+100+"км");
    }
}