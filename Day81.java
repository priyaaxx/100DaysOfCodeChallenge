Day81
{
    public int lastStoneWeight(int[] stones) {
    if (stones.length == 1) {
        return stones[0];
    }
    Arrays.sort(stones);
    while (stones[stones.length - 2] != 0) {
        stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
        stones[stones.length - 2] = 0;
        Arrays.sort(stones);
    }
    return stones[stones.length - 1];
    }
}