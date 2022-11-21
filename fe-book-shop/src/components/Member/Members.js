import React from "react";
import { useState } from "react";
import { Container, Row } from "react-bootstrap";
import MemberForm from "./MemberForm";
import MemberList from "./MemberList";

const Members = () => {
  const [getMember, setMember] = useState([
    {
      id: 1,
      firstName: "Alfian",
      lastName: "Hidayatulloh",
      email: "hidayatullohalfian@gmail.com",
      username: "alfianhid",
      password: "In1P4s5w0rD",
    },
  ]);

  const eventAddMember = (member) => {
    setMember(getMember.concat(member));
    console.log(getMember);
  };

  return (
    <Container>
      <Row>
        <MemberForm onAddMember={eventAddMember} />
      </Row>
      <Row>
        <MemberList dataMembers={getMember} />
      </Row>
    </Container>
  );
};

export default Members;
