/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
public class Renting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @OneToOne
    private Book book;
    @OneToOne
    private Reader reader;
    @Temporal(TemporalType.TIMESTAMP)
    private Date rentDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDate;

    public Renting(Long ID, Book book, Reader reader, Date rentDate, Date returnDate) {
        this.ID = ID;
        this.book = book;
        this.reader = reader;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public Renting() {
    }
    

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.ID);
        hash = 29 * hash + Objects.hashCode(this.book);
        hash = 29 * hash + Objects.hashCode(this.reader);
        hash = 29 * hash + Objects.hashCode(this.rentDate);
        hash = 29 * hash + Objects.hashCode(this.returnDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Renting other = (Renting) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.rentDate, other.rentDate)) {
            return false;
        }
        if (!Objects.equals(this.returnDate, other.returnDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Renting{" + "ID=" + ID + ", book=" + book + ", reader=" + reader + ", rentDate=" + rentDate + ", returnDate=" + returnDate + '}';
    }
    
}
