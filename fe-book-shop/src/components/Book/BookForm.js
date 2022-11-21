import React from "react";
import { useState } from "react";
import { Form, Button } from "react-bootstrap";

const BookForm = (props) => {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [image, setImage] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();

    const newBook = {
      id: Math.floor(Math.random() * 100) + 1,
      title: title,
      description: description,
      image: image,
    };
    props.onAddBook(newBook);
    // setelah menambah buku, input field akan kosong
    setTitle("");
    setDescription("");
    setImage("");
  };

  return (
    <div>
      <h3>BookForm Component</h3>
      <Form onSubmit={handleSubmit}>
        <Form.Group className="mb-3" controlId="formBasicTitle">
          <Form.Label>Title</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter book title"
            name="title"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicDescription">
          <Form.Label>Description</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter book description"
            name="description"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicImage">
          <Form.Label>Book Image URL</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter book image URL"
            name="image"
            value={image}
            onChange={(e) => setImage(e.target.value)}
          />
        </Form.Group>

        <Button
          variant="success"
          type="submit"
          disabled={(!title, !description, !image)}
        >
          Submit
        </Button>
      </Form>
    </div>
  );
};

export default BookForm;
