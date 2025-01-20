class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Constructor to initialize movie ticket details
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    void bookTicket(String movie, int seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully.");
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket("", 0, 0.0);

        // Booking a ticket
        ticket.bookTicket("Inception", 12, 250.0);

        // Displaying ticket details
        ticket.displayTicketDetails();
    }
}
