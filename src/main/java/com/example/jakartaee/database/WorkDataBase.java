package com.example.jakartaee.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class WorkDataBase {

    private JdbcTemplate jdbcTemplate;

    public WorkDataBase() {
        // Параметры подключения к базе данных
        //чтение конфигураций из config.properties
        String filePath = "D:\\Users\\Admin\\Desktop\\JakartaEE\\src\\main\\resources\\config.properties";
        Properties properties = new Properties();
        try {
            properties.load(Files.newBufferedReader(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //создание JdbcTemplate и его настройка
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(new DriverManagerDataSource(url, username, password));
        this.jdbcTemplate = jdbcTemplate;



    }

    public  String getText(){
        return "Text is name";
    }

    public   Account getAccountById(Long id) {
        String sql = "SELECT * FROM account WHERE id = ?";
        Account account = jdbcTemplate.queryForObject(sql, new Object[]{id}, getUserRowMapper());
        return account;
    }

    public List<Account> getAccounts() {
        String sql = "SELECT * FROM account";
        List<Account> accountList = jdbcTemplate.query(sql, getUserRowMapper());
        return accountList;
    }


    private RowMapper<Account> getUserRowMapper() {
        return new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Account user = new Account();
                user.setId(resultSet.getInt("id"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setTask(resultSet.getString("task"));
                return user;
            }
        };
    }
}
