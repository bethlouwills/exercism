class Leap {

    boolean isLeapYear(int year) {
        if (year%4 == 0 && (year%100!=0 || year%400==0)){
            return true;
        }
        else {
            return false;
        }
       // on every year that is evenly divisible by 4
       // except every year that is evenly divisible by 100
       // unless the year is also evenly divisible by 400
    }

}
