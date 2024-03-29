package model;

public class Room implements IRoom {

    private final RoomType roomType;
    private final String roomNumber;
    private final boolean isRoomFree;
    private final double price;

    public Room(String roomNumber, RoomType roomType, boolean isRoomFree, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isRoomFree = isRoomFree;
        this.price = price;
    }

    @Override
    public final RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public final String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public final boolean isFree() {
        return this.isRoomFree;
    }

    @Override
    public final double getRoomPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Room: " +
                "roomType: " + this.getRoomType() +
                ", roomNumber: " + this.getRoomNumber() +
                ", price: " + this.getRoomPrice();
    }
}
