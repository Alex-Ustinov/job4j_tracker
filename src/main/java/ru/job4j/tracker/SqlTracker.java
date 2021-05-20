package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {
    private Connection cn;

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) {
        String sql = "insert into items (id, name) values (?, ?)";
        Item result = null;
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            statement.setInt(1, item.getId());
            statement.setString(2, item.getName());
            if (statement.executeUpdate() > 0) {
                result = item;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean replace(int id, Item item) {
        String sql = "update items set id = ? name = ? where id = ?";
        boolean result = false;
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
                statement.setInt(1, item.getId());
                statement.setString(2, item.getName());
                statement.setInt(3, item.getId());
                result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from items where id = ?";
        boolean result = false;
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Item> findAll() throws Exception {
        String sql = "select * from items";
        List items = new ArrayList<>();
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    items.add(new Item(resultSet.getInt("id"),
                            resultSet.getString("name")
                            )
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
    
    @Override
    public List<Item> findByName(String key) {
        String sql = "select * from items where name like '%?%'";
        List result = new ArrayList<Item>();
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            try(ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    result.add(new Item(
                            resultSet.getInt("id"),
                            resultSet.getString("name")
                    ));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Item findById(int id) {
        String sql = "select * from items where id = ?";
        Item result = new Item();
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                result.setId(resultSet.getInt("id"));
                result.setName(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}