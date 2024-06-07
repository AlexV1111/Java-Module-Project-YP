public class Race {
    public static String winnerRace(Auto[] arrayAuto) {
        int maxSpeed = arrayAuto[0].speedAuto;
        String nameWinnerRace = arrayAuto[0].nameAuto;
        for (int i = 1; i < arrayAuto.length; i++) {
            if (arrayAuto[i].speedAuto > maxSpeed) {
                maxSpeed = arrayAuto[i].speedAuto;
                nameWinnerRace = arrayAuto[i].nameAuto;
            }
        }
        return nameWinnerRace;
    }
}
