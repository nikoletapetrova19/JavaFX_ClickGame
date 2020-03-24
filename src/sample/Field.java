package sample;

import java.util.Random;

public class Field {
    private Tile[][]tiles;


    public Field(){
        initializeField();
    }

    private void initializeField() {
        Random random=new Random();
        tiles=new Tile [2][2];
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles.length; j++){
                tiles[i][j]=new Tile();
                tiles[i][j].setValue(random.nextInt(6)+5);
            }
        }
    }

    public Tile[][] getTiles(){
        return tiles;
    }

    public void setTiles(Tile[][]tiles){
        this.tiles=tiles;
    }
}
