public class BonusMilesService {
    public int calculate (int price) {
        int bonus = 20;
        int score_bonuse = price / bonus;
        return score_bonuse;
    }
}
