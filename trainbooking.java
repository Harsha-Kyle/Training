import java.util.*;

class Ticket {
    String from, to;
    int seats, fare, distance, time;

    Ticket(String from, String to, int seats, int distance, int fare, int time) {
        this.from = from;
        this.to = to;
        this.seats = seats;
        this.distance = distance;
        this.fare = fare;
        this.time = time;
    }

    void display() {
        System.out.println("From      : " + from);
        System.out.println("To        : " + to);
        System.out.println("Seats     : " + seats);
        System.out.println("Distance  : " + distance + " km");
        System.out.println("Time      : " + time + " minutes");
        System.out.println("Fare      : " + fare);
        System.out.println("---------------------------");
    }
}

class MetroTrain {
    String[] stations = {
        "Washermanpet", "Chennai Central", "Egmore",
        "Teynampet", "Guindy", "Airport"
    };

    int[] distance = {0, 5, 8, 10, 12, 15};

    int totalSeats = 100;
    int availableSeats = 100;
    int farePerKm = 5;
    int speed = 40;

    int sourceIndex, destIndex;

    // ✅ Normal Array
    Ticket[] tickets = new Ticket[100];
    int count = 0;

    void displayStations() {
        System.out.println("---- Chennai Metro Stations ----");
        for (int i = 0; i < stations.length; i++) {
            System.out.println((i + 1) + ". " + stations[i]);
        }
    }

    int calculateDistance() {
        return Math.abs(distance[destIndex] - distance[sourceIndex]);
    }

    int calculateFare(int seats) {
        return calculateDistance() * farePerKm * seats;
    }

    int calculateTime() {
        return (int)((double)calculateDistance() / speed * 60);
    }

    void bookTicket(int seats) {
        if (sourceIndex == destIndex) {
            System.out.println("Invalid: Same source & destination");
            return;
        }

        if (seats <= availableSeats && count < tickets.length) {
            availableSeats -= seats;

            int dist = calculateDistance();
            int fare = calculateFare(seats);
            int time = calculateTime();

            tickets[count] = new Ticket(
                stations[sourceIndex],
                stations[destIndex],
                seats,
                dist,
                fare,
                time
            );

            count++;
            System.out.println("Ticket Booked Successfully");
        } else {
            System.out.println("Not enough seats or storage full");
        }
    }

    void viewAllTickets() {
        if (count == 0) {
            System.out.println("No tickets booked yet");
            return;
        }

        System.out.println("\n====== ALL TICKETS ======");
        for (int i = 0; i < count; i++) {
            System.out.println("Ticket " + (i + 1));
            tickets[i].display();
        }
    }

    void cancelTicket(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid ticket number");
            return;
        }

        availableSeats += tickets[index].seats;

        // shift left
        for (int i = index; i < count - 1; i++) {
            tickets[i] = tickets[i + 1];
        }

        count--;
        System.out.println("Ticket Cancelled Successfully");
    }

    void displayStatus() {
        System.out.println("Available Seats: " + availableSeats);
    }
}

public class trainbooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetroTrain m = new MetroTrain();

        while (true) {
            System.out.println("\n===== Chennai Metro Menu =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Seats");
            System.out.println("4. View All Tickets");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    m.displayStations();
                    System.out.print("Select Source: ");
                    m.sourceIndex = sc.nextInt() - 1;

                    System.out.print("Select Destination: ");
                    m.destIndex = sc.nextInt() - 1;

                    System.out.print("Enter seats: ");
                    int seats = sc.nextInt();

                    m.bookTicket(seats);
                    break;

                case 2:
                    m.viewAllTickets();
                    System.out.print("Enter ticket number to cancel: ");
                    int index = sc.nextInt() - 1;
                    m.cancelTicket(index);
                    break;

                case 3:
                    m.displayStatus();
                    break;

                case 4:
                    m.viewAllTickets();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}