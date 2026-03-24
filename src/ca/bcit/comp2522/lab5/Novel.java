package ca.bcit.comp2522.lab5;

import java.util.Objects;


/**
 * Represents a novel with a title, author, and year of publishing
 *
 * @author Kiet Tran
 * @author Edward Liang
 *
 * @version 1.0
 */
public class Novel implements Comparable<Novel>
{
    private static final int CURRENT_YEAR = 2026;
    private static final int MINIMUM_YEAR = 0;

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * The constructor for the novel object.
     *
     * @param title Novel title
     * @param authorName Author's full name or alias
     * @param yearPublished the year of publishing
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYearPublished(yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    private static void validateTitle(final String title)
    {
        if (title == null)
        {
            throw new IllegalArgumentException("Title cannot be null");
        }

        if (title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be blank");
        }
    }

    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null)
        {
            throw new IllegalArgumentException("Author name cannot be null");
        }

        if (authorName.isBlank())
        {
            throw new IllegalArgumentException("Author name cannot be blank");
        }
    }

    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MINIMUM_YEAR)
        {
            throw new IllegalArgumentException("Year cannot be negative: " + yearPublished);
        }

        if (yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Year, " + yearPublished +  ", cannot be greater than the current year: " + CURRENT_YEAR);
        }
    }

    /**
     * Gets the novel's title.
     *
     * @return novel's title
     */
    public final String getTitle()
    {
        return this.title;
    }

    /**
     * Gets the author's name.
     *
     * @return author's name
     */
    public final String getAuthorName()
    {
        return this.authorName;
    }

    /**
     * Gets the year of publishing.
     *
     * @return year of publishing
     */
    public final int getYearPublished()
    {
        return this.yearPublished;
    }

    /**
     * Checks for equality with the titles of the novel
     *
     * @param o   the reference object with which to compare.
     *
     * @return true if titles match. False otherwise
     */
    @Override
    public final boolean equals(final Object o)
    {
        if (o == null)
        {
            return false;
        }

        if (!(o instanceof Novel))
        {
            return false;
        }

        final Novel that;

        that = (Novel) o;

        return this.title.equals(that.title);
    }

    /**
     * Creates a hashcode for the title of the novel.
     *
     * @return the hashcode
     */
    @Override
    public final int hashCode()
    {
        return Objects.hashCode(this.getTitle());
    }

    /**
     * Compares current Novel with another
     * @param that the other Novel
     * @return positive number if this.title is longer, negative number if this.title is shorter, 0 if this.title is equal length
     */
    @Override
    public int compareTo(Novel that)
    {
        return Integer.compare(this.title.length(), that.title.length());
    }

    /**
     * Creates a string with the title, author, and year of publishing.
     *
     * @return detailed string
     */
    @Override
    public String toString()
    {
        return getTitle() + " by " + getAuthorName() + ", " + getYearPublished();
    }
}
