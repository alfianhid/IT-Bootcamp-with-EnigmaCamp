import React from "react";
import { Card, Button, Col } from "react-bootstrap";
import "./BookComponent.css";

const BookComponent = (props) => {
  //export const BookComponent = ({title, description, variant}) =>
  return (
    <Col lg={4} md={6}>
      <Card className="mt-5">
        <Card.Img variant="top" className="book-img" src={props.image} />
        <Card.Body>
          <Card.Title>{props.title}</Card.Title>
          {/* <Card.Title>{title}</Card.Title> */}
          <Card.Text>{props.description}</Card.Text>
          <Button variant={props.variant}>Go somewhere</Button>
        </Card.Body>
      </Card>
    </Col>
  );
};

export default BookComponent;
