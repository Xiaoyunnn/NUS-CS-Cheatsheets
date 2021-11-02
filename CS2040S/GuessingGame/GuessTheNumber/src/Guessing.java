public class Guessing {

    // Your local variables here
    private int low = 0;
    private int high = 1000;

    /**
     * Implement how your algorithm should make a guess here
     */
    public int guess() {
        return this.low + (this.high - this.low) / 2;
    }

    /**
     * Implement how your algorithm should update its guess here
     */
    public void update(int answer) {
        int mid = this.low + (this.high - this.low) / 2;
        if (answer < 0) {
            this.low = mid + 1;
        } else {
            this.high = mid;
        }
    }
}
