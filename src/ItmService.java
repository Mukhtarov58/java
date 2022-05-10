public class ItmService {
    public double calculate( double mass, double height){
        double itmindex = mass/ Math.pow(height,2);
        return itmindex;
    }
}
