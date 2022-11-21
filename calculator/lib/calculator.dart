import 'package:flutter/material.dart';
import 'package:calculator/widgets/single_button.dart';
//import 'package:calculator/widgets/button_area.dart';
//import 'package:calculator/widgets/output_area.dart';

// ignore: must_be_immutable
class Calculator extends StatefulWidget {
  Calculator({Key? key, required this.title}) : super(key: key);
  String title;

  @override
  _CalculatorState createState() => _CalculatorState();
}

class _CalculatorState extends State<Calculator> {
  String value1 = '0';
  String value2 = '0';
  String operator = '';
  int results = 0;
  double dResults = 0.0;
  String calScreen = '0';

  @override
  Widget build(BuildContext context) {
    seven() {
      setState(() {
        if (value1 == '0') {
          value1 = '7';
        } else {
          value2 = '7';
        }
      });
    }

    eight() {
      setState(() {
        if (value1 == '0') {
          value1 = '8';
        } else {
          value2 = '8';
        }
      });
    }

    nine() {
      setState(() {
        if (value1 == '0') {
          value1 = '9';
        } else {
          value2 = '9';
        }
      });
    }

    divide() {
      setState(() {
        operator = '/';
      });
    }

    four() {
      setState(() {
        if (value1 == '0') {
          value1 = '4';
        } else {
          value2 = '4';
        }
      });
    }

    five() {
      setState(() {
        if (value1 == '0') {
          value1 = '5';
        } else {
          value2 = '5';
        }
      });
    }

    six() {
      setState(() {
        if (value1 == '0') {
          value1 = '6';
        } else {
          value2 = '6';
        }
      });
    }

    multiply() {
      setState(() {
        operator = '*';
      });
    }

    one() {
      setState(() {
        if (value1 == '0') {
          value1 = '1';
        } else {
          value2 = '1';
        }
      });
    }

    two() {
      setState(() {
        if (value1 == '0') {
          value1 = '2';
        } else {
          value2 = '2';
        }
      });
    }

    three() {
      setState(() {
        if (value1 == '0') {
          value1 = '3';
        } else {
          value2 = '3';
        }
      });
    }

    minus() {
      setState(() {
        operator = '-';
      });
    }

    clear() {
      setState(() {
        value1 = '0';
        value2 = '0';
        operator = '';
        results = 0;
        calScreen = '0';
      });
    }

    zero() {
      setState(() {
        if (value1 == '0') {
          value1 = '0';
        } else {
          value2 = '0';
        }
      });
    }

    result() {
      if (operator == '+') {
        results = int.parse(value1) + int.parse(value2);
        calScreen = results.toString();
      } else if (operator == '-') {
        results = int.parse(value1) - int.parse(value2);
        calScreen = results.toString();
      } else if (operator == '*') {
        results = int.parse(value1) * int.parse(value2);
        calScreen = results.toString();
      } else if (operator == '/') {
        dResults = double.parse(value1) / double.parse(value2);
        calScreen = dResults.toString();
      } else {
        const Text('Error operator!');
      }
    }

    plus() {
      setState(() {
        operator = '+';
      });
    }

    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Column(
        children: [
          Row(
            children: [
              Container(
                alignment: Alignment.centerRight,
                padding: const EdgeInsets.symmetric(
                    vertical: 24.0, horizontal: 12.0),
                child: Text(
                  value1,
                  style: const TextStyle(
                      fontSize: 48.0, fontWeight: FontWeight.bold),
                ),
              ),
              Container(
                alignment: Alignment.centerRight,
                padding: const EdgeInsets.symmetric(
                    vertical: 34.0, horizontal: 12.0),
                child: Text(
                  operator,
                  style: const TextStyle(
                      fontSize: 48.0, fontWeight: FontWeight.bold),
                ),
              ),
              Container(
                alignment: Alignment.centerRight,
                padding: const EdgeInsets.symmetric(
                    vertical: 44.0, horizontal: 12.0),
                child: Text(
                  value2,
                  style: const TextStyle(
                      fontSize: 48.0, fontWeight: FontWeight.bold),
                ),
              ),
              Container(
                alignment: Alignment.centerRight,
                padding: const EdgeInsets.symmetric(
                    vertical: 54.0, horizontal: 12.0),
                child: Text(
                  calScreen,
                  style: const TextStyle(
                      fontSize: 48.0, fontWeight: FontWeight.bold),
                ),
              )
            ],
          ),
          Row(
            children: [
              Container(
                alignment: Alignment.bottomCenter,
                padding: const EdgeInsets.only(top: 110.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    Padding(
                      padding: const EdgeInsets.only(bottom: 7.0),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: [
                          SingleButton(value: '7', buttonPressed: seven),
                          SingleButton(value: '8', buttonPressed: eight),
                          SingleButton(value: '9', buttonPressed: nine),
                          SingleButton(value: '/', buttonPressed: divide),
                        ],
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(bottom: 7.0),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: [
                          SingleButton(value: '4', buttonPressed: four),
                          SingleButton(value: '5', buttonPressed: five),
                          SingleButton(value: '6', buttonPressed: six),
                          SingleButton(value: '*', buttonPressed: multiply),
                        ],
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(bottom: 7.0),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: [
                          SingleButton(value: '1', buttonPressed: one),
                          SingleButton(value: '2', buttonPressed: two),
                          SingleButton(value: '3', buttonPressed: three),
                          SingleButton(value: '-', buttonPressed: minus),
                        ],
                      ),
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        SingleButton(value: 'C', buttonPressed: clear),
                        SingleButton(value: '0', buttonPressed: zero),
                        SingleButton(value: '=', buttonPressed: result),
                        SingleButton(value: '+', buttonPressed: plus),
                      ],
                    ),
                  ],
                ),
              )
            ],
          ),
        ],
      ),
    );
  }
}
