import React from "react";
import MemberComponent from "./MemberComponent";
import { members } from "../../api/MemberApi";

const MemberList = ({ dataMembers }) => {
  return (
    <>
      {dataMembers.map((member) => (
        <MemberComponent
          key={member.id}
          firstName={member.firstName}
          lastName={member.lastName}
          email={member.email}
          username={member.username}
          password={member.password}
          variant="primary"
        />
      ))}
      {members && !members.length && <h4>No Member Displayed</h4>}
    </>
  );
};

export default MemberList;
