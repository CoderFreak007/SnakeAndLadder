package org.example.board;

public class Ladder implements GameIem {

    private Spot source_spot;

    private Spot dest_spot;

    public Ladder(Spot source_spot, Spot dest_spot) {
        this.source_spot = source_spot;
        this.dest_spot = dest_spot;
    }

    @Override
    public Spot getDestinationSpot(){
        System.out.println("ladder found -source"+source_spot.getSpot_num()+"-> " +
                "destination->"+dest_spot.getSpot_num());
        return dest_spot;
    }
}
