import React from "react";
import { useState } from "react";
import { Container, Row } from "react-bootstrap";
import BookForm from "./BookForm";
import BookList from "./BookList";

const Books = () => {
  const [getBook, setBook] = useState([
    {
      id: 4,
      title: "Mahir Bahasa Pemrograman PHP",
      description:
        "Dengan pesatnya perkembangan teknologi saat ini, kita dituntut untuk bisa membuat dan mengembangkan sebuah sistem atau program berbasis web. Pembuatan sebuah sistem berbasis web bisa menggunakan berbagai macam bahasa pemrograman. Namun, pada umumnya orang menggunakan bahasa pemrograman PHP.",
      image:
        "https://cdn.gramedia.com/uploads/items/9786020498768_Mahir_Bahasa_.jpg",
    },
  ]);

  const eventAddBook = (book) => {
    setBook(getBook.concat(book));
    console.log(getBook);
  };

  return (
    <Container>
      <Row>
        <BookForm onAddBook={eventAddBook} />
      </Row>
      <Row>
        <BookList dataBooks={getBook} />
      </Row>
    </Container>
  );
};

export default Books;
