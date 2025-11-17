package quiz_3.views;

import quiz_3.controllers.StatisticList;
import quiz_3.models.EmptyListException;
import quiz_3.models.InvalidInputException;
import quiz_3.utils.CLIUtil;

public class Menu {
    private StatisticList statisticList;

    public Menu(){
        statisticList = new StatisticList<>();
    }

    public void render() throws InvalidInputException, EmptyListException{
        this.printMenu();
        int menu = CLIUtil.getInt();
        while (menu != 0) {
            switch (menu) {
                case 1:
                    handleAddAngka();
                    break;
                case 2:
                    System.out.println(statisticList.getAverage());
                    break;
                case 3:
                    System.out.println(statisticList.getMin());
                    break;
                case 4:
                    System.out.println(statisticList.getMax());
                    break;
                case 5:
                    System.out.println(statisticList.getMedian());
                    break;
                case 0:
                    return;
            }
            this.printMenu();
            menu = CLIUtil.getInt();
        }
    }

    private void printMenu() {
        System.out.println("======= Menu Nilai Positif ========");
        System.out.println("1. Tambah Angka");
        System.out.println("2. Tampilkan Rata-Rata");
        System.out.println("3. Tampilkan Nilai Maksimum");
        System.out.println("4. Tampilkan Nilai Minimum");
        System.out.println("5. Tampilkan Median");
        System.out.println("6. Keluarkan Daftar (Sorted)");
        System.out.println("0. Keluar");
    }

    private void handleAddAngka() throws InvalidInputException{
        double number = CLIUtil.askForDouble("  Masukkan Angka: ");
        statisticList.add(number);
    }
}
