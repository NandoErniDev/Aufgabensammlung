void main(String[]args) {
    for (int i = 1; i <= 30; i++){
        if (i % 3 == 0 || i % 5 == 0){
            if(i == 30){
                System.out.print(i);
            }else System.out.print(i + ", ");
        }
    }
}