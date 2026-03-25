package beispielprojekt.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/beispieldb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS tasks (id INT PRIMARY KEY, title VARCHAR(255), description TEXT, completed BOOLEAN)";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveTask(Task task) {
        String sql = "INSERT INTO tasks (id, title, description, completed) VALUES (?, ?, ?, ?) ON DUPLICATE KEY UPDATE title=?, description=?, completed=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, task.getId());
            pstmt.setString(2, task.getTitle());
            pstmt.setString(3, task.getDescription());
            pstmt.setBoolean(4, task.isCompleted());
            pstmt.setString(5, task.getTitle());
            pstmt.setString(6, task.getDescription());
            pstmt.setBoolean(7, task.isCompleted());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Task task = new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"));
                task.setCompleted(rs.getBoolean("completed"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}