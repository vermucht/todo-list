package todolist.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * User who creates items.
 *
 * @author Aleksei Sapozhnikov (vermucht@gmail.com)
 * @version 0.1
 * @since 0.1
 */
public class User {
    /**
     * Logger.
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = LogManager.getLogger(User.class);
    /**
     * Unique id.
     */
    private long id;
    /**
     * Login.
     */
    private String login;
    /**
     * Password.
     */
    private String password;

    /////////////////////////
    // getters and setters
    /////////////////////////

    /**
     * Returns id.
     *
     * @return Value of id field.
     */
    public long getId() {
        return this.id;
    }

    /**
     * Sets id value.
     *
     * @param id Value to set.
     */
    public User setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * Returns login.
     *
     * @return Value of login field.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Sets login value.
     *
     * @param login Value to set.
     */
    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Returns password.
     *
     * @return Value of password field.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets password value.
     *
     * @param password Value to set.
     */
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

}
