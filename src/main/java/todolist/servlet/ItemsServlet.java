package todolist.servlet;

import com.google.gson.Gson;
import todolist.model.Item;
import todolist.persistence.ItemDatabaseStorage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet working with items.
 *
 * @author Aleksei Sapozhnikov (vermucht@gmail.com)
 * @version 0.1
 * @since 0.1
 */
public class ItemsServlet extends HttpServlet {
    private static final int RESP_CODE_CREATED = 201;
    private final ItemDatabaseStorage storage = new ItemDatabaseStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (var writer = resp.getWriter()) {
            new Gson().toJson(this.storage.getAll(), writer);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Item item;
        try (var reader = req.getReader()) {
            item = new Gson().fromJson(reader, Item.class);
        }
        this.storage.merge(item);
        resp.setStatus(RESP_CODE_CREATED);
    }
}
