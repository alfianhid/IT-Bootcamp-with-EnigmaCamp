import React from "react";
import { Card, Col } from "react-bootstrap";
import "./MemberComponent.css";

const MemberComponent = (props) => {
  return (
    <Col lg={4} md={6}>
      <Card className="mt-5">
        <Card.Body>
          <Card.Title>Member ID</Card.Title>
          <Card.Text>{props.id}</Card.Text>
          <Card.Title>First Name</Card.Title>
          <Card.Text>{props.firstName}</Card.Text>
          <Card.Title>Last Name</Card.Title>
          <Card.Text>{props.lastName}</Card.Text>
          <Card.Title>Username</Card.Title>
          <Card.Text>{props.username}</Card.Text>
          <Card.Title>Email</Card.Title>
          <Card.Text>{props.email}</Card.Text>
          <Card.Title>Password</Card.Title>
          <Card.Text>{props.password}</Card.Text>
        </Card.Body>
      </Card>
    </Col>
  );
};

export default MemberComponent;
