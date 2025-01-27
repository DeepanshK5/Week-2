package singleinheritance.librarymanagement;

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("singleinheritance.librarymanagement.Author Name " + name);
        System.out.println("Bio " + bio);
    }
}
