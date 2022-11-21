import React from "react";
import { useState } from "react";
import { Form, Button } from "react-bootstrap";

import "./MemberComponent.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faEye } from "@fortawesome/free-solid-svg-icons";
//import { useFormik } from "formik";

const MemberForm = (props) => {
  const eye = <FontAwesomeIcon icon={faEye} />;

  /*   const newMember = useFormik({
    initialValue: {
      id: Math.floor(Math.random() * 100) + 1,
      firstName: firstName,
      lastName: lastName,
      email: email,
      username: username,
      password: password,
    }
  });
*/

  const [id, setId] = useState("");
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();

    const newMember = {
      id: Math.floor(Math.random() * 100) + 1,
      firstName: firstName,
      lastName: lastName,
      email: email,
      username: username,
      password: password,
    };

    props.onAddMember(newMember);

    setFirstName("");
    setLastName("");
    setEmail("");
    setUsername("");
    setPassword("");
  };

  const togglePasswordVisiblity = () => {
    setPassword(password ? true : false);
  };

  return (
    <div>
      <h3>MemberForm Component</h3>
      <Form onSubmit={handleSubmit}>
        <Form.Group className="mb-3" controlId="formBasicID">
          <Form.Label>Member ID</Form.Label>
          <Form.Control
            type="text"
            name="id"
            value={id}
            onChange={(e) => setId(e.target.value)}
            disabled
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicFirstName">
          <Form.Label>First Name</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter first name"
            name="firstName"
            value={firstName}
            onChange={(e) => setFirstName(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicLastName">
          <Form.Label>Last Name</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter last name"
            name="lastName"
            value={lastName}
            onChange={(e) => setLastName(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Email</Form.Label>
          <Form.Control
            type="email"
            placeholder="Enter email"
            name="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicUsername">
          <Form.Label>Username</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter username"
            name="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control
            className="pass-wrapper"
            type={password ? "password" : "text"}
            placeholder="Enter password"
            name="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <i onClick={togglePasswordVisiblity}>{eye}</i>
        </Form.Group>

        <Button
          variant="success"
          type="submit"
          disabled={(!firstName, !lastName, !email, !username, !password)}
        >
          Submit
        </Button>
      </Form>
    </div>
  );
};

export default MemberForm;
