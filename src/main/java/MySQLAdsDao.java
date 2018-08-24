import com.mysql.cj.jdbc.Driver;
        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;
    private Config config = new Config();

    public MySQLAdsDao() {

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {

        try {
            String selectAds = "SELECT * FROM ads";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAds);
            List<Ad> ads = new ArrayList<>();

            while (resultSet.next()) {
                ads.add(
                        new Ad (
                                resultSet.getInt("id"),
                                resultSet.getInt("user_id"),
                                resultSet.getString("title"),
                                resultSet.getString("description")
                        )
                );
            }
            return ads;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("problem with building ads");
        }
    }

    @Override
    public Long insert(Ad ad) {
        String insertAd = String.format("INSERT INTO ads(user_id, title, description) values ('%s', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertAd, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("problem with inserting ad");
        }
        return null;
    }
}
