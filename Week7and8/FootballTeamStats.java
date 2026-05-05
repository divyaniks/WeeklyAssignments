class FootballTeamStats {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        int minHeight = 150;
        int range = 101; // 150 to 250

        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * range) + minHeight;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}