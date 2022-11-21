import React, { Component } from "react";
import { Col } from "react-bootstrap";
import CounterButton from "./CounterButton";

export default class CounterComponent extends Component {
  constructor(props) {
    super(props);
    console.log("Constructor called");
  }

  state = {
    count: 1,
  };

  handleChange = (newValue) => {
    this.setState({
      count: this.state.count + newValue,
    });
  };

  componentDidMount() {
    console.log("ComponentDidMount called");
  }

  componentDidUpdate() {
    console.log("ComponentDidUpdate called");
  }

  render() {
    console.log("Render called");

    return (
      <Col className="mt-5">
        <h3>{this.state.count}</h3>
        <CounterButton
          count={this.state.count}
          onHandleChange={(value) => this.handleChange(value)}
        />
      </Col>
    );
  }
}
