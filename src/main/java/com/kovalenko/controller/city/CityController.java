package com.kovalenko.controller.city;

import com.kovalenko.entity.city.City;
import com.kovalenko.service.city.CityService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CityController", urlPatterns = {"/cities"})
public class CityController extends HttpServlet {

    @Inject
    private CityService cityService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/html;charset=UTF-8");

        List<City> cities = Arrays.asList(new City(1L, "London", 1500000), new City(2L, "New York", 15000000));
        req.setAttribute("cities", cities);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/pages/city/cities-index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
