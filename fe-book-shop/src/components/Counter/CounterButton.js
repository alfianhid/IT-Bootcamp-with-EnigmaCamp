import React, { Component } from "react";

export default class CounterButton extends Component {
  handleIncreaseCounter = (newValue) => {
    this.props.onHandleChange(newValue);
  };

  handleDecreaseCounter = (newValue) => {
    if (this.props.count > 0) this.props.onHandleChange(newValue);
  };

  render() {
    return (
      <div className="d-flex justify-content-between">
        <button onClick={() => this.handleDecreaseCounter(-1)} variant="danger">
          -
        </button>
        <button
          onClick={() => this.handleIncreaseCounter(1)}
          className="primary"
        >
          +
        </button>
      </div>
    );
  }
}
