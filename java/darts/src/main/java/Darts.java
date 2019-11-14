class Darts {
    int score = 0;
    Darts(double x, double y) {
        double squaredX = Math.pow(x, 2);
        double squaredY = Math.pow(y, 2);
        double r = squaredY + squaredX;
        r = Math.sqrt(r);
        if (r<=1 && r>=0 ){
            score = 10;
        }
        else if (r<=5){
            score = 5;
        }
        else if ((r)<=10 && (r)>=0 ){
            score = 1;
        }
        else{
            score =0;
        }
    }

    int score() {
        return score;
    }

}
