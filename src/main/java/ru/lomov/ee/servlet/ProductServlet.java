package ru.lomov.ee.servlet;

import ru.lomov.ee.model.Televisor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/category")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("televisor", createProducts());
        getServletContext().getRequestDispatcher("/category.jsp")
                .forward(req,resp);
    }

    private Televisor createProducts() {
        List<Televisor> brands = List.of(
                new Televisor("Samsonite Vision", 55, null),
                new Televisor("Samsonite Black Square", 60, null),
                new Televisor("Samsonite Night", 55, null),
                new Televisor("Samsonite Lite", 36, null),
                new Televisor("Samsonite Smart", 40, null),
                new Televisor("Samsonite Integra", 43, null),
                new Televisor("Samsonite Spectre", 28, null),
                new Televisor("Samsonite Vector", 36, null),
                new Televisor("Samsonite Journey", 15, null)

        );
        return Televisor.builder()
                .brand("Samsonite")
                .diagonal(43)
                .models(brands)
                .build();
    }
}
