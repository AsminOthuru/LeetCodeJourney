class StockSpanner {

    private List<Integer> prices;

    public StockSpanner() {
        prices = new ArrayList<>();
    }

    public int next(int price) {
        prices.add(price);
        int span = 1;
        int index = prices.size() - 2;

        while (index >= 0 && prices.get(index) <= price) {
            span++;
            index--;
        }

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */