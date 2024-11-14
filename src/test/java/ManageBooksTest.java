import org.example.ManageBooks.BookManager;
import org.example.ManageBooks.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManageBooksTest {

    @Test
    void testEmptyFieldsDataBookGuard() {
        // Arrange
        InMemoryBookRepository testInMemoryRepository = new InMemoryBookRepository();
        BookManager testManager = new BookManager(testInMemoryRepository);
        // Act
        testManager.addBook("", "Some Author", "A123");
        testManager.addBook("Some Title", "", "A123");
        testManager.addBook("Some Title", "Some Author", "");
        // Assert
        assertEquals(0, testInMemoryRepository.findAll().size());
    }
}