package ca.bcit.comp2522.lab5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents a bookstore. Contains the main method.
 *
 * @author Kiet Tran
 * @author Edward Liang
 *
 * @version 1.0
 */
public class BookStore {
    private static int DECADE_MODULUS = 10;
    private static int DECADE_RANGE = 9;

    private final String name;
    private final List<Novel> library;

    /**
     * Constructor for the bookstore object.
     *
     * @param name the bookstore's name
     */
    public BookStore(final String name) {
        validateName(name);

        this.name = name;

        library = new ArrayList<>();

        // Novels
        final Novel n1;
        final Novel n2;
        final Novel n3;
        final Novel n4;
        final Novel n5;
        final Novel n6;
        final Novel n7;
        final Novel n8;
        final Novel n9;
        final Novel n10;
        final Novel n11;
        final Novel n12;
        final Novel n13;
        final Novel n14;
        final Novel n15;
        final Novel n16;
        final Novel n17;
        final Novel n18;
        final Novel n19;
        final Novel n20;
        final Novel n21;
        final Novel n22;
        final Novel n23;
        final Novel n24;
        final Novel n25;
        final Novel n26;
        final Novel n27;
        final Novel n28;
        final Novel n29;
        final Novel n30;
        final Novel n31;
        final Novel n32;
        final Novel n33;
        final Novel n34;
        final Novel n35;
        final Novel n36;
        final Novel n37;
        final Novel n38;
        final Novel n39;
        final Novel n40;
        final Novel n41;
        final Novel n42;
        final Novel n43;
        final Novel n44;
        final Novel n45;
        final Novel n46;
        final Novel n47;
        final Novel n48;
        final Novel n49;
        final Novel n50;
        final Novel n51;
        final Novel n52;
        final Novel n53;
        final Novel n54;
        final Novel n55;
        final Novel n56;
        final Novel n57;
        final Novel n58;
        final Novel n59;
        final Novel n60;
        final Novel n61;
        final Novel n62;
        final Novel n63;
        final Novel n64;
        final Novel n65;
        final Novel n66;
        final Novel n67;
        final Novel n68;
        final Novel n69;
        final Novel n70;
        final Novel n71;
        final Novel n72;
        final Novel n73;
        final Novel n74;
        final Novel n75;
        final Novel n76;
        final Novel n77;
        final Novel n78;
        final Novel n79;
        final Novel n80;
        final Novel n81;
        final Novel n82;
        final Novel n83;
        final Novel n84;
        final Novel n85;
        final Novel n86;
        final Novel n87;
        final Novel n88;
        final Novel n89;
        final Novel n90;
        final Novel n91;
        final Novel n92;
        final Novel n93;
        final Novel n94;
        final Novel n95;
        final Novel n96;
        final Novel n97;
        final Novel n98;
        final Novel n99;
        final Novel n100;

        n1 = new Novel("The Adventures of Augie March",
                "Saul Bellow",
                1953);
        n2 = new Novel("All the King's Men",
                "Robert Penn Warren",
                1946);
        n3 = new Novel("American Pastoral",
                "Philip Roth",
                1997);
        n4 = new Novel("An American Tragedy",
                "Theodore Dreiser",
                1925);
        n5 = new Novel("Animal Farm",
                "George Orwell",
                1946);
        n6 = new Novel("Appointment in Samarra",
                "John O'Hara",
                1934);
        n7 = new Novel("Are You There God? It's Me, Margaret.",
                "Judy Blume",
                1970);
        n8 = new Novel("The Assistant",
                "Bernard Malamud",
                1957);
        n9 = new Novel("At Swim-Two-Birds",
                "Flann O'Brien",
                1938);
        n10 = new Novel("Atonement",
                "Ian McEwan",
                2002);
        n11 = new Novel("Beloved",
                "Toni Morrison",
                1987);
        n12 = new Novel("The Berlin Stories",
                "Christopher Isherwood",
                1946);
        n13 = new Novel("The Big Sleep",
                "Raymond Chandler",
                1939);
        n14 = new Novel("The Blind Assassin",
                "Margaret Atwood",
                2000);
        n15 = new Novel("Blood Meridian",
                "Cormac McCarthy",
                1986);
        n16 = new Novel("Brideshead Revisited",
                "Evelyn Waugh",
                1946);
        n17 = new Novel("The Bridge of San Luis Rey",
                "Thornton Wilder",
                1927);
        n18 = new Novel("Call It Sleep",
                "Henry Roth",
                1935);
        n19 = new Novel("Catch-22",
                "Joseph Heller",
                1961);
        n20 = new Novel("The Catcher in the Rye",
                "J.D. Salinger",
                1951);
        n21 = new Novel("A Clockwork Orange",
                "Anthony Burgess",
                1963);
        n22 = new Novel("The Confessions of Nat Turner",
                "William Styron",
                1967);
        n23 = new Novel("The Corrections",
                "Jonathan Franzen",
                2001);
        n24 = new Novel("The Crying of Lot 49",
                "Thomas Pynchon",
                1966);
        n25 = new Novel("A Dance to the Music of Time",
                "Anthony Powell",
                1951);
        n26 = new Novel("The Day of the Locust",
                "Nathanael West",
                1939);
        n27 = new Novel("Death Comes for the Archbishop",
                "Willa Cather",
                1927);
        n28 = new Novel("A Death in the Family",
                "James Agee",
                1958);
        n29 = new Novel("The Death of the Heart",
                "Elizabeth Bowen",
                1958);
        n30 = new Novel("Deliverance",
                "James Dickey",
                1970);
        n31 = new Novel("Dog Soldiers",
                "Robert Stone",
                1974);
        n32 = new Novel("Falconer",
                "John Cheever",
                1977);
        n33 = new Novel("The French Lieutenant's Woman",
                "John Fowles",
                1969);
        n34 = new Novel("The Golden Notebook",
                "Doris Lessing",
                1962);
        n35 = new Novel("Go Tell It on the Mountain",
                "James Baldwin",
                1953);
        n36 = new Novel("Gone with the Wind",
                "Margaret Mitchell",
                1936);
        n37 = new Novel("The Grapes of Wrath",
                "John Steinbeck",
                1939);
        n38 = new Novel("Gravity's Rainbow",
                "Thomas Pynchon",
                1973);
        n39 = new Novel("The Great Gatsby",
                "F. Scott Fitzgerald",
                1925);
        n40 = new Novel("A Handful of Dust",
                "Evelyn Waugh",
                1934);
        n41 = new Novel("The Heart Is a Lonely Hunter",
                "Carson McCullers",
                1940);
        n42 = new Novel("The Heart of the Matter",
                "Graham Greene",
                1948);
        n43 = new Novel("Herzog",
                "Saul Bellow",
                1964);
        n44 = new Novel("Housekeeping",
                "Marilynne Robinson",
                1981);
        n45 = new Novel("A House for Mr. Biswas",
                "V.S. Naipaul",
                1962);
        n46 = new Novel("I, Claudius",
                "Robert Graves",
                1934);
        n47 = new Novel("Infinite Jest",
                "David Foster Wallace",
                1996);
        n48 = new Novel("Invisible Man",
                "Ralph Ellison",
                1952);
        n49 = new Novel("Light in August",
                "William Faulkner",
                1932);
        n50 = new Novel("The Lion, The Witch and the Wardrobe",
                "C.S. Lewis",
                1950);
        n51 = new Novel("Lolita",
                "Vladimir Nabokov",
                1955);
        n52 = new Novel("Lord of the Flies",
                "William Golding",
                1954);
        n53 = new Novel("The Lord of the Rings",
                "J.R.R. Tolkien",
                1954);
        n54 = new Novel("Loving",
                "Henry Green",
                1945);
        n55 = new Novel("Lucky Jim",
                "Kingsley Amis",
                1954);
        n56 = new Novel("The Man Who Loved Children",
                "Christina Stead",
                1940);
        n57 = new Novel("Midnight's Children",
                "Salman Rushdie",
                1981);
        n58 = new Novel("Money",
                "Martin Amis",
                1984);
        n59 = new Novel("The Moviegoer",
                "Walker Percy",
                1961);
        n60 = new Novel("Mrs. Dalloway",
                "Virginia Woolf",
                1925);
        n61 = new Novel("Naked Lunch",
                "William Burroughs",
                1959);
        n62 = new Novel("Native Son",
                "Richard Wright",
                1940);
        n63 = new Novel("Neuromancer",
                "William Gibson",
                1984);
        n64 = new Novel("Never Let Me Go",
                "Kazuo Ishiguro",
                2005);
        n65 = new Novel("1984",
                "George Orwell",
                1948);
        n66 = new Novel("On the Road",
                "Jack Kerouac",
                1957);
        n67 = new Novel("One Flew Over the Cuckoo's Nest",
                "Ken Kesey",
                1962);
        n68 = new Novel("The Painted Bird",
                "Jerzy Kosinski",
                1965);
        n69 = new Novel("Pale Fire",
                "Vladimir Nabokov",
                1962);
        n70 = new Novel("A Passage to India",
                "E.M. Forster",
                1924);
        n71 = new Novel("Play It as It Lays",
                "Joan Didion",
                1970);
        n72 = new Novel("Portnoy's Complaint",
                "Philip Roth",
                1969);
        n73 = new Novel("Possession",
                "A.S. Byatt",
                1990);
        n74 = new Novel("The Power and the Glory",
                "Graham Greene",
                1939);
        n75 = new Novel("The Prime of Miss Jean Brodie",
                "Muriel Spark",
                1961);
        n76 = new Novel("Rabbit, Run",
                "John Updike",
                1960);
        n77 = new Novel("Ragtime",
                "E.L. Doctorow",
                1975);
        n78 = new Novel("The Recognitions",
                "William Gaddis",
                1955);
        n79 = new Novel("Red Harvest",
                "Dashiell Hammett",
                1929);
        n80 = new Novel("Revolutionary Road",
                "Richard Yates",
                1961);
        n81 = new Novel("The Sheltering Sky",
                "Paul Bowles",
                1949);
        n82 = new Novel("Slaughterhouse-Five",
                "Kurt Vonnegut",
                1969);
        n83 = new Novel("Snow Crash",
                "Neal Stephenson",
                1992);
        n84 = new Novel("The Sot-Weed Factor",
                "John Barth",
                1960);
        n85 = new Novel("The Sound and the Fury",
                "William Faulkner",
                1929);
        n86 = new Novel("The Sportswriter",
                "Richard Ford",
                1986);
        n87 = new Novel("The Spy Who Came in from the Cold",
                "John le Carré",
                1964);
        n88 = new Novel("The Sun Also Rises",
                "Ernest Hemingway",
                1926);
        n89 = new Novel("Their Eyes Were Watching God",
                "Zora Neale Hurston",
                1937);
        n90 = new Novel("Things Fall Apart",
                "Chinua Achebe",
                1959);
        n91 = new Novel("To Kill a Mockingbird",
                "Harper Lee",
                1960);
        n92 = new Novel("To the Lighthouse",
                "Virginia Woolf",
                1929);
        n93 = new Novel("Tropic of Cancer",
                "Henry Miller",
                1934);
        n94 = new Novel("Ubik",
                "Philip K. Dick",
                1969);
        n95 = new Novel("Under the Net",
                "Iris Murdoch",
                1954);
        n96 = new Novel("Under the Volcano",
                "Malcolm Lowry",
                1947);
        n97 = new Novel("Watchmen",
                "Alan Moore and Dave Gibbons",
                1986);
        n98 = new Novel("White Noise",
                "Don DeLillo",
                1985);
        n99 = new Novel("White Teeth",
                "Zadie Smith",
                2000);
        n100 = new Novel("Wide Sargasso Sea",
                "Jean Rhys",
                1966);

        library.add(n1);
        library.add(n2);
        library.add(n3);
        library.add(n4);
        library.add(n5);
        library.add(n6);
        library.add(n7);
        library.add(n8);
        library.add(n9);
        library.add(n10);
        library.add(n11);
        library.add(n12);
        library.add(n13);
        library.add(n14);
        library.add(n15);
        library.add(n16);
        library.add(n17);
        library.add(n18);
        library.add(n19);
        library.add(n20);
        library.add(n21);
        library.add(n22);
        library.add(n23);
        library.add(n24);
        library.add(n25);
        library.add(n26);
        library.add(n27);
        library.add(n28);
        library.add(n29);
        library.add(n30);
        library.add(n31);
        library.add(n32);
        library.add(n33);
        library.add(n34);
        library.add(n35);
        library.add(n36);
        library.add(n37);
        library.add(n38);
        library.add(n39);
        library.add(n40);
        library.add(n41);
        library.add(n42);
        library.add(n43);
        library.add(n44);
        library.add(n45);
        library.add(n46);
        library.add(n47);
        library.add(n48);
        library.add(n49);
        library.add(n50);
        library.add(n51);
        library.add(n52);
        library.add(n53);
        library.add(n54);
        library.add(n55);
        library.add(n56);
        library.add(n57);
        library.add(n58);
        library.add(n59);
        library.add(n60);
        library.add(n61);
        library.add(n62);
        library.add(n63);
        library.add(n64);
        library.add(n65);
        library.add(n66);
        library.add(n67);
        library.add(n68);
        library.add(n69);
        library.add(n70);
        library.add(n71);
        library.add(n72);
        library.add(n73);
        library.add(n74);
        library.add(n75);
        library.add(n76);
        library.add(n77);
        library.add(n78);
        library.add(n79);
        library.add(n80);
        library.add(n81);
        library.add(n82);
        library.add(n83);
        library.add(n84);
        library.add(n85);
        library.add(n86);
        library.add(n87);
        library.add(n88);
        library.add(n89);
        library.add(n90);
        library.add(n91);
        library.add(n92);
        library.add(n93);
        library.add(n94);
        library.add(n95);
        library.add(n96);
        library.add(n97);
        library.add(n98);
        library.add(n99);
        library.add(n100);
    }

    private static void validateName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
    }

    /**
     * Gets the name of the bookstore.
     *
     * @return bookstore's name
     */
    public final String getName() {
        return name;
    }

    /**
     * Gets the library of novels from the bookstore.
     *
     * @return library of novels
     */
    public final List<Novel> getLibrary() {
        return this.library;
    }

    /**
     * Prints the entire library of the bookstore (Only titles).
     */
    public final void printAllTitles() {
        for (final Novel n : this.library) {
            final String upperCaseTitle;

            upperCaseTitle = n.getTitle().toUpperCase();

            System.out.println(upperCaseTitle);
        }
    }

    /**
     * Prints the all the novels that contains the specified keyword.
     *
     * @param keyword the keyword to be searched
     */
    public final void printBookTitle(final String keyword) {
        for (final Novel n : this.library) {
            if (n.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(n.getTitle());
            }
        }

    }

    /**
     * Prints all the novels in alphanumerical order.
     */
    public final void printTitlesInAlphaOrder() {
        final List<String> alphaList;

        alphaList = new ArrayList<>();

        for (final Novel n : this.library) {
            alphaList.add(n.getTitle());
        }

        Collections.sort(alphaList);

        for (final String s : alphaList) {
            System.out.println(s);
        }
    }

    /**
     * Prints books based off the decade it was made.
     *
     * @param decade the decade to group
     */
    public final void printGroupByDecade(final int decade) {
        final int trueDecade;

        trueDecade = decade - (decade % DECADE_MODULUS);

        for (final Novel n : this.library) {
            if (n.getYearPublished() >= trueDecade &&
                    n.getYearPublished() <= trueDecade + DECADE_RANGE) {
                System.out.println(n.getTitle());
            }
        }
    }

    /**
     * Gets the novel with the longest title in the library.
     */
    public final void getLongest() {

        if (library.getFirst() == null) {
            return;
        }

        Novel longest;

        longest = library.getFirst();

        for (final Novel n : this.library) {
            if (longest.compareTo(n) < 0) {
                longest = n;
            }
        }

        System.out.println(longest.getTitle());
    }

    /**
     * Checks if there are any books written in a given year.
     *
     * @param year the year given
     *
     * @return True is there is at least a book in the given year. False otherwise
     */
    public final boolean isThereABookWrittenIn(final int year) {
        for (final Novel n : this.library) {
            if (n.getYearPublished() == year) {
                return true;
            }
        }

        return false;
    }

    /**
     * Counts the amount of books that contain a given word.
     *
     * @param word the given word
     *
     * @return the number of titles that contain the given word
     */
    public final int howManyBooksContain(final String word) {
        int count;

        count = 0;

        for (final Novel n : this.library) {
            if (n.getTitle().toLowerCase().contains(word.toLowerCase())) {
                ++count;
            }
        }

        return count;
    }

    /**
     * Checks the percentage of books that were written in a range of years, relative to the whole library.
     *
     * @param first start year for the range (inclusive)
     * @param last  end year for the range (inclusive)
     *
     * @return the percentage of books written in the given range of years
     */
    public final String whichPercentWrittenBetween(final int first,
                                                   final int last) {
        final DecimalFormat percentageFormatter;
        final int allBooks;
        int booksBetween;
        final float percentage;

        percentageFormatter = new DecimalFormat("##.##%");
        allBooks = library.size();
        booksBetween = 0;

        for (final Novel n : this.library) {
            if (n.getYearPublished() >= first &&
                    n.getYearPublished() <= last) {
                ++booksBetween;
            }
        }

        percentage = (float) booksBetween / allBooks;

        return percentageFormatter.format(percentage);
    }

    /**
     * Returns the oldest novel in the library.
     *
     * @return the oldest novel
     */
    public final Novel getOldestBook() {
        if (library.getFirst() == null) {
            return null;
        }

        Novel oldestNovel;

        oldestNovel = library.getFirst();

        for (final Novel n : this.library) {
            if (oldestNovel.getYearPublished() > n.getYearPublished()) {
                oldestNovel = n;
            }
        }

        return oldestNovel;
    }

    /**
     * Creates an ArrayList of novels with a specific character length.
     *
     * @param titleLength the given title length
     *
     * @return the ArrayList of novels with a specific character length
     */
    public final List<Novel> getBooksThisLength(final int titleLength) {
        final List<Novel> lengthList;

        lengthList = new ArrayList<>();

        for (final Novel n : this.library) {
            if (n.getTitle().length() == titleLength) {
                lengthList.add(n);
            }
        }

        return lengthList;
    }

    /**
     * Part 2:
     * Creates a map of all novels (title as key, Novel as value),
     * removes titles containing "the" (case-insensitive),
     * and prints the remaining novels in alphabetical order.
     */
    public final void generateKeyPairs()
    {
        final Map<String, Novel> map = new HashMap<>();

        for (final Novel n : library)
        {
            map.put(n.getTitle(), n);
        }

        System.out.println("\n[Part 2] Titles via keySet iterator:");
        final Iterator<String> it = map.keySet().iterator();

        while (it.hasNext())
        {
            final String key = it.next();
            System.out.println(key);
        }

        final Iterator<Map.Entry<String, Novel>> entryIt = map.entrySet().iterator();

        while (entryIt.hasNext())
        {
            final Map.Entry<String, Novel> entry = entryIt.next();
            final String key = entry.getKey();

            if (key.toLowerCase().contains("the"))
            {
                entryIt.remove();
            }
        }

        System.out.println(
                "\n[Part 2] Removed titles containing 'the'. Remaining count: "
                        + map.size()
        );

        final List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        System.out.println("\n[Part 2] Sorted novels (without 'the'):");

        for (final String sortedTitle : keyList)
        {
            System.out.println(map.get(sortedTitle));
        }
    }

    /**
     * Entry point method for using the bookstore.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());

        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));

        bookstore.generateKeyPairs();
    }

}


