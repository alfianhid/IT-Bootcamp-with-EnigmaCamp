import React from "react";
import BookComponent from "./BookComponent";
import { books } from "../../api/BookApi";

const BookList = ({ dataBooks }) => {
  return (
    <>
      {dataBooks.map((book) => (
        <BookComponent
          key={book.id}
          title={book.title}
          description={book.description}
          image={book.image}
          variant="primary"
        />
      ))}
      {books && !books.length && <h4>No Book Displayed</h4>}
    </>
  );
};

export default BookList;
