package hackerrank.ObjectOrientedDesign.repository;

import com.zaxxer.hikari.HikariDataSource;
import hackerrank.ObjectOrientedDesign.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepositoryImpl implements LibraryRepository {

    private HikariDataSource dataSource;

    public LibraryRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Book[] findAllBook() {

        String sql = "SELECT id, title, author FROM Book";
        try(
                Connection connection = dataSource.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ) {

            List<Book> list = new ArrayList<>();
            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setAuthor(resultSet.getString("author"));
                book.setTitle(resultSet.getString("title"));


                list.add(book);
            }

            return list.toArray(new Book[]{});


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void addBook(Book book) {
        String sql = "INSERT INTO Book(title, author) VALUES(?, ?)";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean isExist(Integer number){
        String sql = "SELECT id FROM Book WHERE id = ?";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
                ) {
            preparedStatement.setInt(1, number);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()){
                    return true;
                }else {
                    return false;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean removeBook(Integer number) {
        if (isExist(number)){
            String sql = "DELETE FROM Book WHERE id = ? ";
            try(
                    Connection connection = dataSource.getConnection();
                    PreparedStatement statement = connection.prepareStatement(sql);
                    ) {
                statement.setInt(1, number);
                statement.executeUpdate();
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else {
            return false;
        }

    }
}
