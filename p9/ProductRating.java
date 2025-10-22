public class ProductRating {
    public static void main(String[] args) {
             
        int[][] ratings = {
            {5, 4, 4}, 
            {3, 5, 3},  
            {4, 4, 5},  
            {1, 2, 1}   
        };

        System.out.println("Rating\tProduct\tPackaging\tDelivery");
        double productTotal = 0, packagingTotal = 0, deliveryTotal = 0;

        for (int i = 0; i < ratings.length; i++) {
            productTotal += ratings[i][0];
            packagingTotal += ratings[i][1];
            deliveryTotal += ratings[i][2];
        }

        double avgProduct = productTotal / ratings.length;
        double avgPackaging = packagingTotal / ratings.length;
        double avgDelivery = deliveryTotal / ratings.length;

        System.out.printf("Average\t%.2f\t%.2f\t%.2f\n\n", avgProduct, avgPackaging, avgDelivery);
        for (int i = 0; i < ratings.length; i++) {
            double sum = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                sum += ratings[i][j];
            }
            double avg = sum / ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f\n", (i + 1), avg);
        }
    }
}
