package org.codespeak.twentyfortyeightj.objects;

/**
 * A class that defines a single tile in the game
 *
 * @author Vector
 */
public class Tile {
    
    private int locX;
    private int locZ;
    private int size;
    
    public Tile(int locX, int locZ, int size) {
        this.locX = locX;
        this.locZ = locZ;
        this.size = size;
    }
    
    /**
     * Gets the X location of this tile
     * @return X location of this tile
     */
    public int getLocX() {
        return locX;
    }
    
    /**
     * Sets the X location of this tile
     * @param locX X location of this tile
     */
    public void setLocX(int locX) {
        this.locX = locX;
    }
    
    /**
     * Gets the Z location of this tile
     * @return Z location of this tile
     */
    public int getLocZ() {
        return locZ;
    }
    
    /**
     * Gets the Z location of this tile
     * @param locZ Z location of this tile
     */
    public void setLocZ(int locZ) {
        this.locZ = locZ;
    }
    
    /**
     * Gets the size of this tile
     * @return size of this tile
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Sets the size of this tile
     * @param size size of this tile
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Joins the other tile to this tile
     * @param otherTile other tile to join
     */
    public void join(Tile otherTile) {
        this.size += otherTile.getSize();
    }
    
}
