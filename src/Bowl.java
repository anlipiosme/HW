class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int portion) {
        if (portion <= 0) {
            return false;
        }
        if (food >= portion) {
            food -= portion;
            return true;
        }

        return false;
    }

    public void addFood(int moreFood) {
        if (moreFood > 0) {
            food += moreFood;
        }
    }

    public int getFood() {
        return food;
    }
}