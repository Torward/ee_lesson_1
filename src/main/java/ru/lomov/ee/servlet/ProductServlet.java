package ru.lomov.ee.servlet;

import ru.lomov.ee.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", createProducts());
        getServletContext().getRequestDispatcher("/category.jsp")
                .forward(req,resp);
    }

    private Product createProducts() {
        List<Product>children = List.of(
                new Product(1,"sausages",12,null),
                new Product(2,"pasta",102,null),
                new Product(3,"sugar",250,null),
                new Product(4,"buckwheat",165,null),
                new Product(5,"rice",25,null),
                new Product(6,"butter",250,null),
                new Product(7,"bread",52,null),
                new Product(8,"oil",115,null),
                new Product(9,"potato",84,null),
                new Product(10,"tomato",168,null)
        );
        return Product.builder()
                .title("Products")
                .children(children)
                .build();
    }
}
