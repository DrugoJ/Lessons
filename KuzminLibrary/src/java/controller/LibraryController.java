/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.Reader;
import entity.Renting;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.BookFacade;
import session.ReaderFacade;
import session.RentingFacade;

/**
 *
 * @author User
 */
@WebServlet(name = "LibraryController", urlPatterns = {
    "/addBook",
    "/addReader",
    "/addRenting",
    "/createBook",
    "/createReader",
    "/createRenting",
    "/addReturn",
    "/createReturn"
})
public class LibraryController extends HttpServlet {
@EJB private BookFacade bookFacade;
@EJB private ReaderFacade readerFacade;
@EJB private RentingFacade rentingFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        if(path==null){
            
        }
        switch (path) {
            case "/addBook":
                request.getRequestDispatcher("/addBook.jsp").forward(request, response);
                break;
            case "/addReader":
                request.getRequestDispatcher("/addReader.jsp").forward(request, response);
                break;
            case "/addRenting":
            {
                List<Book> listBooks = bookFacade.findAll();
                request.setAttribute("listBooks", listBooks);
                List<Reader> listReaders = readerFacade.findAll();
                request.setAttribute("listReaders", listReaders);
                request.getRequestDispatcher("/addRenting.jsp").forward(request, response);
                break;
            }
            case "/addReturn":
            {
                List<Book> listBooks = bookFacade.findAll();
                request.setAttribute("listBooks", listBooks);
                List<Reader> listReaders = readerFacade.findAll();
                request.setAttribute("listReaders", listReaders);
                request.getRequestDispatcher("/addRenting.jsp").forward(request, response);
                break;
            }
            case "/createBook":
            {
                String name = request.getParameter("name");
                String author = request.getParameter("author");
                String amount = request.getParameter("amount");
                Book book = new Book(null, name, author, new Integer(amount));
                bookFacade.create(book);
                request.setAttribute("info", book);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
              break;   
            }
            case "/createReader":
            {
                String name = request.getParameter("name");
                String surname = request.getParameter("surname");
                String phone = request.getParameter("phone");
                Reader reader = new Reader(null, phone, name, surname);
                readerFacade.create(reader);
                request.setAttribute("info", reader);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            }
            case "/createRenting":
            {
                String bookId = request.getParameter("bookId");
                Book book = bookFacade.find(Long.parseLong(bookId));
                String readerId = request.getParameter("readerId");
                Reader reader = readerFacade.find(Long.parseLong(readerId));
                Calendar c = new GregorianCalendar();
                
                book.setAmount(book.getAmount()-1);
                bookFacade.edit(book);
                
                Renting renting = new Renting(null, book, reader, c.getTime(), null);
                rentingFacade.create(renting);
                request.setAttribute("info", reader.getSurname()+" взял в аренду "+book.getName() +"  "+ renting.getRentDate());
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            }
            case "/createReturn":
            default:
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
