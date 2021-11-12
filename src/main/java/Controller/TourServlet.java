package Controller;

import DAO.TourDAO;
import Entity.Tour;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/")
public class TourServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TourDAO tourDAO = new TourDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        try {
            listTour(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private void listTour(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ArrayList<Tour> listTours = tourDAO.getListTour();
        request.setAttribute("listTours", listTours);
    }
}
