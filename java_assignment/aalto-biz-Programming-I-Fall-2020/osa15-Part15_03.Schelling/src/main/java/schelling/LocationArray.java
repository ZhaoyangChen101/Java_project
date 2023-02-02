package schelling;

public class LocationArray {

    private int[][] locations;
    private int width;
    private int height;

    public LocationArray(int width, int height) {
        this.width = width;
        this.height = height;
        this.locations = new int[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLocationValue(int x, int y, int value) {
        if (x < 0 || x >= this.width || y < 0 || y >= this.height) {
            return;
        }

        this.locations[x][y] = value;
    }

    public int getLocationValue(int x, int y) {
        if (x < 0 || x >= this.width || y < 0 || y >= this.height) {
            return -1;
        }

        return this.locations[x][y];
    }

}
