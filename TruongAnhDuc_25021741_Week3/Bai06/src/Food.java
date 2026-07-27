import java.time.LocalDate;
class Food extends Product{
    LocalDate expirationDate;
    public Food(String id, String name, double price, int year, int month, int day){
        super("F", id, name, price);
        this.expirationDate = LocalDate.of(year, month, day);
    }
    @Override
    public double getFinalPrice(){
        LocalDate a = LocalDate.now();
        if (expirationDate.getYear() >=  a.getYear()){
            if (expirationDate.getMonthValue() >= a.getMonthValue()){
                if (expirationDate.getDayOfMonth() > a.getDayOfMonth()){
                    if ((expirationDate.getDayOfMonth() - a.getDayOfMonth()) < 7){
                        price = price * 0.8;
                        return price;
                    } else {
                        price = 0.0;
                        return price;
                    }
                } else {
                    price = 0.0;
                    return price;
                }
            } else {
                price = 0.0;
                return price;
            }
        } else {
            price = 0.0;
            return price;
        }
    }
}