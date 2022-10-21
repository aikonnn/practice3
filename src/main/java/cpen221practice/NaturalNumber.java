package cpen221practice;

class NaturalNumber {
    private int num;

    public NaturalNumber (int n){
        if(n <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.num = n;
    }

    public Classification getClassification(){
        int sum = 0;

        for(int i = 1; i < Math.sqrt((double) num); i++){
            if(this.num % i == 0){
                sum += i + this.num/i;
            }
        }

        sum -= this.num;

        if(sum == num){
            return Classification.PERFECT;
        } else if( sum > num){
            return Classification.ABUNDANT;
        } else{
            return Classification.DEFICIENT;
        }
    }

}
