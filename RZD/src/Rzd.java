public class Rzd {
    public static void main(String[] args) {

        RailwayStation station = new RailwayStation("UfaStation");
        station.setTrain();
        station.trainsList[1].setStop(true);
        Ticket ticket = new Ticket("Moscow", 6, 8);
        Passenger passenger1 = new Passenger("Camilla", ticket);
        Passenger passenger2 = new Passenger("Petya", null);
        Passenger passenger3 = new Passenger("Anya", null);
        Conductor conductor = new Conductor();
        Passenger[] passengers = {passenger1, passenger2, passenger3};
        for (Passenger p : passengers) {
            conductor.doSomeWork(p);
        }
        TrainDriver trainDriver = new TrainDriver();
        trainDriver.doSomeWork();
        trainDriver.getMoney();
        conductor.getMoney();
    }
}