class Main {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {

            if (operations[i] == "x++" || operations[i] == "++x") {
                count += 1;
            }
        }
        return count;

    }

}